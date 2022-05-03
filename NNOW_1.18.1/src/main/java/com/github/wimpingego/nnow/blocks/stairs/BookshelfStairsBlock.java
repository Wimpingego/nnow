package com.github.wimpingego.nnow.blocks.stairs;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BookshelfStairsBlock extends StairBlock
{
    int value = Configs.ENCHANT_POWER_STAIRS.get();

    @SuppressWarnings("deprecation")
    public BookshelfStairsBlock(BlockState state, Properties properties)
    {
        super(state, properties.requiresCorrectToolForDrops());
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos)
    {
        return value;
    }

}
