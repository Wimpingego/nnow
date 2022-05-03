package com.github.wimpingego.nnow.blocks.slabs;

import com.github.wimpingego.nnow.NNOW;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import javax.annotation.Nullable;

@EventBusSubscriber(modid=NNOW.MODID, bus=Bus.MOD, value=Dist.CLIENT)
public class LeafSlab extends SlabBlock
{
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public LeafSlab(Properties properties)
    {
        super(properties.requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(SlabBlock.TYPE, WATERLOGGED);
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(SlabBlock.TYPE) != SlabType.DOUBLE;
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
