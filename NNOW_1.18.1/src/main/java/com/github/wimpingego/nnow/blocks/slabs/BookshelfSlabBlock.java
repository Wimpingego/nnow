package com.github.wimpingego.nnow.blocks.slabs;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.lang.constant.Constable;

public class BookshelfSlabBlock extends SlabBlock
{
    int value = Configs.ENCHANT_POWER_STAIRS.get();

    public BookshelfSlabBlock(Properties properties)
    {
        super(properties.requiresCorrectToolForDrops());
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos)
    {
        return value;
    }

}