package com.github.wimpingego.nnow.blocks.stairs;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CustomStairsBlock extends StairBlock
{

    @SuppressWarnings("deprecation")
    public CustomStairsBlock(BlockState state, Properties properties)
    {
        super(state, properties.requiresCorrectToolForDrops());
    }

}
