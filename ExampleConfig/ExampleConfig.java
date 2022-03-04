
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exampleClient.ExampleClient;
import exampleClient.hud.Position;
import exampleClient.mod.ExampleModBase;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleConfig {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final ArrayList<ExampleModBase> mods = ExampleClient.INSTANCE.mods;

    private static final File file = new File(/* use here if you want mc data dir, im not in mcp*/ "mods.json");


    public static void save() throws IOException {
        Map<String,Object> tosave = new HashMap<>();
        List<Map<String,Object>> modsave = new ArrayList<>();
        mods.forEach(mod -> {

            String modName = mod.getName();
            Position pos = mod.getPos();
            boolean enabled = mod.isEnabled();

            Map<String, Object> map = new HashMap<>();

            Map<String,Object> posMap = new HashMap<>();

            posMap.put("x", pos.getX());
            posMap.put("y", pos.getY());


            map.put("name", modName);
            map.put("position", posMap);
            map.put("enabled", enabled);

            modsave.add(map);
        });

        tosave.put("mods", modsave);

        FileWriter writer = new FileWriter(file);
        writer.write(gson.toJson(tosave));
        writer.close();

    }
    public static void load() throws IOException {
        FileReader reader = new FileReader(file);
        Map map = gson.fromJson(reader, Map.class);
        List<Map<String,Object>> readMods = (List<Map<String, Object>>) map.get("mods");

        mods.forEach(mod -> {
            readMods.forEach(readed -> {
                if(String.valueOf(readed.get("name")).equalsIgnoreCase(mod.getName())) {
                    Map<String,Object> readedPosition = (Map<String, Object>) readed.get("position");

                    int x = (int) Math.floor(Double.parseDouble(String.valueOf(readedPosition.get("x"))));
                    int y = (int) Math.floor(Double.parseDouble(String.valueOf(readedPosition.get("y"))));

                    boolean enabled = (boolean) readed.get("enabled");

                    mod.setPosition(x,y);
                    mod.setEnabled(enabled);
                }
            });
        });
    }

}
