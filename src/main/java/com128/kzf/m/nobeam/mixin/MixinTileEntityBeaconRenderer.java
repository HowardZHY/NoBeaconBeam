package com128.kzf.m.nobeam.mixin;

import net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntityBeacon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TileEntityBeaconRenderer.class)
public abstract class MixinTileEntityBeaconRenderer extends TileEntitySpecialRenderer<TileEntityBeacon> {
    /**
     * @author HowardZHY
     * @reason no fps reduce
     */
    @Overwrite
    public void renderTileEntityAt(TileEntityBeacon te, double x, double y, double z, float partialTicks, int destroyStage) {
    }
    /**
     * @author HowardZHY
     * @reason no fps reduce
     */
    @Overwrite
    public boolean forceTileEntityRender()
    {
        return false;
    }
}
