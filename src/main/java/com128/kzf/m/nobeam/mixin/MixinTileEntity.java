package com128.kzf.m.nobeam.mixin;

import net.minecraft.tileentity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TileEntity.class)
public class MixinTileEntity {
    @Overwrite
    public double getMaxRenderDistanceSquared(){
        return 1024.0D;
    }
}