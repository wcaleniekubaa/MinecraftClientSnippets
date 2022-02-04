
protected boolean canRenderName(T entity)
    // delete "&& entity != this.renderManager.livingPlayer"
    return Minecraft.isGuiEnabled() && entity != this.renderManager.livingPlayer && !entity.isInvisibleToPlayer(entityplayersp) && entity.riddenByEntity == null;
}
public void renderName(T entity, double x, double y, double z){
    // replace world renderer function wait for it

}
