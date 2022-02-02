package clientname.gui.buttons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.*;
/**
 * Just image buttons
 * 
 * I would like to get credited :)
 * @author wcaleniekubaa#4196
 * If there is any problem write to me :) 
 * or to the Eric Golde discord server
 * you can also create issue on github
 */
public class ImageButton extends GuiButton {
    private final ResourceLocation img;
    private final int scale;
    private final Minecraft mc = Minecraft.getMinecraft();

    /**
     * Constructor
     * @param Button id
     * @param Button x
     * @param Button y
     * @param Button scale
     * @param Button image
     */
    public ImageButton(int buttonId, int x, int y, int scale, ResourceLocation img) {
        super(buttonId, x, y, scale, scale,"no text lol");
        this.img= img;
        this.scale = scale;
    }


    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if(visible){
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = this.getHoverState(this.hovered);


            if(hovered){

                drawScaledImage((int) (xPosition / 1.05),(int) (yPosition / 1.05), (int) (scale * 1.25), img);
            } else {
                drawScaledImage(xPosition,yPosition, scale, img);
            }
        }
    }

    public ResourceLocation getImage() {
        return img;
    }

    /**
     * Draws scaled image
     * Make sure that you binded texture :)
     * @param x
     * @param y
     * @param scale
     */
    private final void drawScaledImage(int x,int y, int scale, ResourceLocation img){
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(img);
        GlStateManager.enableAlpha();
        Gui.drawModalRectWithCustomSizedTexture(x,y,scale,scale,scale,scale,scale,scale);
        GlStateManager.disableAlpha();
    }
}
