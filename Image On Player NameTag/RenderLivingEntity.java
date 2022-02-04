
protected boolean canRenderName(T entity)
    // delete "&& entity != this.renderManager.livingPlayer"
    return Minecraft.isGuiEnabled() && entity != this.renderManager.livingPlayer && !entity.isInvisibleToPlayer(entityplayersp) && entity.riddenByEntity == null;
}
// If there's any errors with method,field not found see in mappings mcp/conf/
public void renderName(T entity, double x, double y, double z){
    if (!Reflector.RenderLivingEvent_Specials_Pre_Constructor.exists() || !Reflector.postForgeBusEvent(Reflector.RenderLivingEvent_Specials_Pre_Constructor, new Object[] {entity, this, Double.valueOf(x), Double.valueOf(y), Double.valueOf(z)}))
        {
            if (this.canRenderName(entity))
            {
                double d0 = entity.getDistanceSqToEntity(this.renderManager.livingPlayer);
                float f = entity.isSneaking() ? NAME_TAG_RANGE_SNEAK : NAME_TAG_RANGE;

                if (d0 < (double)(f * f))
                {
                    String s = entity.getDisplayName().getFormattedText();
                    float f1 = 0.02666667F;
                    GlStateManager.alphaFunc(516, 0.1F);

                    if (entity.isSneaking())
                    {
                        FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
                        GlStateManager.pushMatrix();
                        GlStateManager.translate((float)x, (float)y + entity.height + 0.5F - (entity.isChild() ? entity.height / 2.0F : 0.0F), (float)z);
                        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
                        GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
                        GlStateManager.scale(-0.02666667F, -0.02666667F, 0.02666667F);
                        GlStateManager.translate(0.0F, 9.374999F, 0.0F);
                        GlStateManager.disableLighting();
                        GlStateManager.depthMask(false);
                        GlStateManager.enableBlend();
                        GlStateManager.disableTexture2D();
                        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                        int i = fontrenderer.getStringWidth(s) / 2;
                        Tessellator tessellator = Tessellator.getInstance();
                        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
                        if(entity instanceof EntityPlayer) {
                            worldrenderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
                            worldrenderer.pos((double) (-i - 1) - 12, -1.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (-i - 1) - 12, 8.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (i + 1), 8.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (i + 1), -1.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            tessellator.draw();
                        } else {
                            worldrenderer.begin(7, DefaultVertexFormats.field_181706_f);
                            worldrenderer.pos((double) (-i - 1) , -1.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (-i - 1) , 8.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (i + 1), 8.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            worldrenderer.pos((double) (i + 1), -1.0D, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
                            tessellator.draw();
                        }
                        GlStateManager.enableTexture2D();
                        GlStateManager.depthMask(true);
                        fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, 0, 553648127);
                        if(entity instanceof EntityPlayerSP){

                            Minecraft mc = Minecraft.getMinecraft();
                            mc.getTextureManager().bindTexture(new ResourceLocation("dotmod/icons/turtle.png"));
                            Gui.drawModalRectWithCustomSizedTexture(-fontrenderer.getStringWidth(entity.getDisplayName().getFormattedText()) / 2 - 12, -2,10,10,10,10,10,10);
                        }
                        GlStateManager.enableLighting();
                        GlStateManager.disableBlend();
                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                        GlStateManager.popMatrix();
                    }
                    else
                    {
                        this.renderOffsetLivingLabel(entity, x, y - (entity.isChild() ? (double)(entity.height / 2.0F) : 0.0D), z, s, 0.02666667F, d0);
                    }
                }
            }

            if (Reflector.RenderLivingEvent_Specials_Post_Constructor.exists())
            {
                Reflector.postForgeBusEvent(Reflector.RenderLivingEvent_Specials_Post_Constructor, new Object[] {entity, this, Double.valueOf(x), Double.valueOf(y), Double.valueOf(z)});
            }
        }
}
