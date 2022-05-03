package com.github.wimpingego.nnow.blocks.stairs;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class LeafStairsBlock extends StairBlock
{

    @SuppressWarnings("deprecation")
    public LeafStairsBlock(BlockState state, Properties properties)
    {
        super(state, properties.requiresCorrectToolForDrops());
    }

    public static class ColorHandler implements BlockColor
    {
        public int getColor(BlockState state, @Nullable BlockAndTintGetter reader , @Nullable BlockPos blockPos, int tintIndex)
        {

            if(reader != null && blockPos != null)
            {
                return BiomeColors.getAverageFoliageColor(reader , blockPos);
            }
            return getDefault();
        }
    }

    public static int getDefault() {
        return 4764952;
    }
}
