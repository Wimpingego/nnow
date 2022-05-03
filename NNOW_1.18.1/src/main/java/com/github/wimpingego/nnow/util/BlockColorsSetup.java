package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.blocks.HydroTank;
import com.github.wimpingego.nnow.blocks.slabs.BirchSlab;
import com.github.wimpingego.nnow.blocks.slabs.GrassSlab;
import com.github.wimpingego.nnow.blocks.slabs.LeafSlab;
import com.github.wimpingego.nnow.blocks.slabs.SpruceSlab;
import com.github.wimpingego.nnow.blocks.stairs.BirchStairsBlock;
import com.github.wimpingego.nnow.blocks.stairs.LeafStairsBlock;
import com.github.wimpingego.nnow.blocks.stairs.SpruceStairsBlock;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid=NNOW.MODID, bus=Bus.MOD, value=Dist.CLIENT)
public class BlockColorsSetup
{
    @SubscribeEvent
    public static void registerBlockColorHandler(final ColorHandlerEvent.Block event)
    {
        final BlockColors blockColors = event.getBlockColors();

        blockColors.register(new GrassSlab.ColorHandler(), Registration.GRASS_SLAB.get());
        blockColors.register(new LeafSlab.ColorHandler(), Registration.OAK_LEAVES_SLAB.get());
        blockColors.register(new LeafSlab.ColorHandler(), Registration.DARK_OAK_LEAVES_SLAB.get());
        blockColors.register(new LeafSlab.ColorHandler(), Registration.JUNGLE_LEAVES_SLAB.get());
        blockColors.register(new LeafSlab.ColorHandler(), Registration.ACACIA_LEAVES_SLAB.get());
        blockColors.register(new SpruceSlab.ColorHandler(), Registration.SPRUCE_LEAVES_SLAB.get());
        blockColors.register(new BirchSlab.ColorHandler(), Registration.BIRCH_LEAVES_SLAB.get());

        blockColors.register(new LeafStairsBlock.ColorHandler(), Registration.OAK_LEAVES_STAIRS.get());
        blockColors.register(new LeafStairsBlock.ColorHandler(), Registration.DARK_OAK_LEAVES_STAIRS.get());
        blockColors.register(new LeafStairsBlock.ColorHandler(), Registration.JUNGLE_LEAVES_STAIRS.get());
        blockColors.register(new LeafStairsBlock.ColorHandler(), Registration.ACACIA_LEAVES_STAIRS.get());
        blockColors.register(new SpruceStairsBlock.ColorHandler(), Registration.SPRUCE_LEAVES_STAIRS.get());
        blockColors.register(new BirchStairsBlock.ColorHandler(), Registration.BIRCH_LEAVES_STAIRS.get());

        blockColors.register(new HydroTank.ColorHandler(), Registration.HYDROTANK.get());
        blockColors.register(new HydroTank.ColorHandler(), Registration.HYDROTANK_LIGHT.get());

    }

    @SubscribeEvent
    public static void registerItemColorHandler(final ColorHandlerEvent.Item event)
    {
        BlockColors blockColors = event.getBlockColors();
        ItemColors itemColors = event.getItemColors();

        final ItemColor itemBlockColourHandler = (stack, tintIndex) -> {
            final BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return  blockColors.getColor(state, null, null, tintIndex);
        };

        itemColors.register(itemBlockColourHandler, Registration.GRASS_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.OAK_LEAVES_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.DARK_OAK_LEAVES_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.JUNGLE_LEAVES_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.ACACIA_LEAVES_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.SPRUCE_LEAVES_SLAB.get());
        itemColors.register(itemBlockColourHandler, Registration.BIRCH_LEAVES_SLAB.get());

        itemColors.register(itemBlockColourHandler, Registration.OAK_LEAVES_STAIRS.get());
        itemColors.register(itemBlockColourHandler, Registration.DARK_OAK_LEAVES_STAIRS.get());
        itemColors.register(itemBlockColourHandler, Registration.JUNGLE_LEAVES_STAIRS.get());
        itemColors.register(itemBlockColourHandler, Registration.ACACIA_LEAVES_STAIRS.get());
        itemColors.register(itemBlockColourHandler, Registration.SPRUCE_LEAVES_STAIRS.get());
        itemColors.register(itemBlockColourHandler, Registration.BIRCH_LEAVES_STAIRS.get());

        itemColors.register(itemBlockColourHandler, Registration.HYDROTANK.get());
        itemColors.register(itemBlockColourHandler, Registration.HYDROTANK_LIGHT.get());

    }
}
