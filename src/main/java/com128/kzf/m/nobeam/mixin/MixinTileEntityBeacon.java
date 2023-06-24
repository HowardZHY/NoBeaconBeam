package com128.kzf.m.nobeam.mixin;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TileEntityBeacon.class)
public class MixinTileEntityBeacon {
    @Overwrite
    public double getMaxRenderDistanceSquared()
    {
        return 4096.0D;
    }
}
