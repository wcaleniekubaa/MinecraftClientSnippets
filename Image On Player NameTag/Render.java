/* file: net/minecraft/client/renderer/entity/Render.java */


/* for 1.8.9 */
    protected void renderLivingLabel(T entityIn, String str, double x, double y, double z, int maxDistance)
    {
        double d0 = entityIn.getDistanceSqToEntity(this.renderManager.livingPlayer);

        if (d0 <= (double)(maxDistance * maxDistance))
        {
            FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
            float f = 1.6F;
            float f1 = 0.016666668F * f;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x + 0.0F, (float)y + entityIn.height + 0.5F, (float)z);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(-f1, -f1, f1);
            GlStateManager.disableLighting();
            GlStateManager.depthMask(false);
            GlStateManager.disableDepth();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            Tessellator tessellator = Tessellator.getInstance();
            WorldRenderer worldrenderer = tessellator.getWorldRenderer();
            int i = 0;


            if (str.equals("deadmau5"))
            {
                i = -10;
            }

            int j = fontrenderer.getStringWidth(str) / 2;
            GlStateManager.disableTexture2D();
            if(entityIn instanceof EntityPlayerSP) {
                worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                worldrenderer.func_181662_b((double) (-j - 1) - 12 + 6, (double) (-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (-j - 1) - 12 + 6, (double) (8 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (j + 1) + 6, (double) (8 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (j + 1) + 6, (double) (-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();

                tessellator.draw();
                GlStateManager.enableTexture2D();
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, 553648127);
                GlStateManager.enableDepth();
                GlStateManager.depthMask(true);
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, -1);
            } else {
                worldrenderer.func_181668_a(7, DefaultVertexFormats.field_181706_f);
                worldrenderer.func_181662_b((double) (-j - 1) , (double) (-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (-j - 1), (double) (8 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (j + 1), (double) (8 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                worldrenderer.func_181662_b((double) (j + 1), (double) (-1 + i), 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.25F).func_181675_d();
                tessellator.draw();
                GlStateManager.enableTexture2D();
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 , i, 553648127);
                GlStateManager.enableDepth();
                GlStateManager.depthMask(true);
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 , i, -1);
            }
           // GlStateManager.enableTexture2D();
            //fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, 553648127);

            //GlStateManager.enableDepth();
            //GlStateManager.depthMask(true);
            //fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, -1);
            if(entityIn instanceof EntityPlayer){

                Minecraft mc = Minecraft.getMinecraft();
                mc.getTextureManager().bindTexture(new ResourceLocation("clientname/icons/nametag_icon.png"));
                Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(entityIn.getDisplayName().getFormattedText()) / 2 - 12 + 6, -2,10,10,10,10,10,10);
            }
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.popMatrix();

        }
    }
/* for 1.8.8 */
// if theres method, field not found see mappings in mcp/conf
    protected void renderLivingLabel(T entityIn, String str, double x, double y, double z, int maxDistance)
    {
        double d0 = entityIn.getDistanceSqToEntity(this.renderManager.livingPlayer);

        if (d0 <= (double)(maxDistance * maxDistance))
        {
            FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
            float f = 1.6F;
            float f1 = 0.016666668F * f;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x + 0.0F, (float)y + entityIn.height + 0.5F, (float)z);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(-f1, -f1, f1);
            GlStateManager.disableLighting();
            GlStateManager.depthMask(false);
            GlStateManager.disableDepth();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            Tessellator tessellator = Tessellator.getInstance();
            WorldRenderer worldrenderer = tessellator.getWorldRenderer();
            int i = 0;


            if (str.equals("deadmau5"))
            {
                i = -10;
            }

            int j = fontrenderer.getStringWidth(str) / 2;
            GlStateManager.disableTexture2D();
            if(entityIn instanceof EntityPlayerSP) {
                worldrenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
                worldrenderer.pos((double) (-j - 1) - 12 + 6, (double) (-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (-j - 1) - 12 + 6, (double) (8 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (j + 1) + 6, (double) (8 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (j + 1) + 6, (double) (-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();

                tessellator.draw();
                GlStateManager.enableTexture2D();
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, 553648127);
                GlStateManager.enableDepth();
                GlStateManager.depthMask(true);
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, -1);
            } else {
                worldrenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
                worldrenderer.pos((double) (-j - 1) , (double) (-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (-j - 1), (double) (8 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (j + 1), (double) (8 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                worldrenderer.pos((double) (j + 1), (double) (-1 + i), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                tessellator.draw();
                GlStateManager.enableTexture2D();
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 , i, 553648127);
                GlStateManager.enableDepth();
                GlStateManager.depthMask(true);
                fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 , i, -1);
            }
           // GlStateManager.enableTexture2D();
            //fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, 553648127);

            //GlStateManager.enableDepth();
            //GlStateManager.depthMask(true);
            //fontrenderer.drawString(str, -fontrenderer.getStringWidth(str) / 2 + 6, i, -1);
            if(entityIn instanceof EntityPlayer){

                Minecraft mc = Minecraft.getMinecraft();
                mc.getTextureManager().bindTexture(new ResourceLocation("clientname/icons/nametag_icon.png"));
                Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(entityIn.getDisplayName().getFormattedText()) / 2 - 12 + 6, -2,10,10,10,10,10,10);
            }
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.popMatrix();

        }
    }



