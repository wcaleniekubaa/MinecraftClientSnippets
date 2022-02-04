/* file: net/minecraft/client/renderer/entity/Render.java */


/* for 1.8.9 */
public void renderLivingLabel(T entityIn, String str, double x, double y, double z, int maxDistance){
    // replace world renderer functions with this 
    // add this to centered and resize rect above head
    worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
    worldrenderer.func_181662_b((double)(-j - 1) - 12 + 6, (double)(-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
    worldrenderer.func_181662_b((double)(-j - 1) -12 + 6, (double)(8 + i) , 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
    worldrenderer.func_181662_b((double)(j + 1) + 6 , (double)(8 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
    worldrenderer.func_181662_b((double)(j + 1) + 6, (double)(-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
    // add this after last fontrenderer drawstring
    if(entityIn instanceof EntityPlayerSP){
        Minecraft mc = Minecraft.getMinecraft();
        mc.getTextureManager().bindTexture(new ResourceLocation("clientname/icons/nametag.png" /* There should be your icon to render also it should be a square */));
        Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(entityIn.getDisplayName().getFormattedText()) / 2 - 12 + 6, -2,10,10,10,10,10,10);
    }
}

/* for 1.8.8 */
/* in 1.8.8 mappings have more not obfuscated fields, methods, parameters names */
public void renderLivingLabel(T entityIn, String str, double x, double y, double z, int maxDistance){
    // replace world renderer functions with this 
    // add this to centered and resize rect above head
    worldrenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
    worldrenderer.pos((double)(-j - 1) - 12 + 6, (double)(-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
    worldrenderer.pos((double)(-j - 1) -12 + 6, (double)(8 + i) , 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
    worldrenderer.pos((double)(j + 1) + 6 , (double)(8 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
    worldrenderer.pos((double)(j + 1) + 6, (double)(-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
    // add this after last fontrenderer drawstring
    if(entityIn instanceof EntityPlayerSP){
        Minecraft mc = Minecraft.getMinecraft();
        mc.getTextureManager().bindTexture(new ResourceLocation("clientname/icons/nametag.png" /* There should be your icon to render also it should be a square */));
        Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(entityIn.getDisplayName().getFormattedText()) / 2 - 12 + 6, -2,10,10,10,10,10,10);
    }
}

