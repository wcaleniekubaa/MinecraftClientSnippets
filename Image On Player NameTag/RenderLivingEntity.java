
protected boolean canRenderName(T entity)
    // delete "&& entity != this.renderManager.livingPlayer"
    return Minecraft.isGuiEnabled() && entity != this.renderManager.livingPlayer && !entity.isInvisibleToPlayer(entityplayersp) && entity.riddenByEntity == null;
}
