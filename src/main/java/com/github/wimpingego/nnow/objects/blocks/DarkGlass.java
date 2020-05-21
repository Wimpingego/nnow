package com.github.wimpingego.nnow.objects.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;


public class DarkGlass extends StainedGlassBlock{

	public DarkGlass() {
		super(DyeColor.BLACK, Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid());
	}
    
	@Override
    public int getOpacity (BlockState state, IBlockReader world, BlockPos pos) {
        
        return world.getMaxLightLevel();
    }
    
}
