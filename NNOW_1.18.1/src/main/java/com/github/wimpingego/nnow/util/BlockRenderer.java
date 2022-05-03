package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class BlockRenderer {

    public static void registerBlocks() {

        Block[] bushes = {Registration.XP_BERRY_BUSH.get(),Registration.IRON_BERRY_BUSH.get(),Registration.COPPER_BERRY_BUSH.get(),Registration.GOLD_BERRY_BUSH.get(),
                Registration.COAL_BERRY_BUSH.get(),Registration.REDSTONE_BERRY_BUSH.get(), Registration.GLOWSTONE_BERRY_BUSH.get(),Registration.QUARTZ_BERRY_BUSH.get(),
                Registration.DIAMOND_BERRY_BUSH.get(),Registration.EMERALD_BERRY_BUSH.get(),Registration.LAPIS_BERRY_BUSH.get(),Registration.NETHERITE_BERRY_BUSH.get()};

        Block[] element_bushes = {Registration.ICE_BERRY_BUSH.get(),Registration.FIRE_BERRY_BUSH.get(),Registration.WOODEN_BERRY_BUSH.get()};

        Block[] metal_bushes = {Registration.NICKEL_BERRY_BUSH.get(),Registration.SILVER_BERRY_BUSH.get(),Registration.URANIUM_BERRY_BUSH.get(),
                Registration.LEAD_BERRY_BUSH.get(),Registration.ALUMINUM_BERRY_BUSH.get(),Registration.TIN_BERRY_BUSH.get(),Registration.OSMIUM_BERRY_BUSH.get(),
                Registration.BISMUTH_BERRY_BUSH.get(),Registration.ZINC_BERRY_BUSH.get(),Registration.PLATINUM_BERRY_BUSH.get(),Registration.IRIDIUM_BERRY_BUSH.get()};

        Block[] base_bushes = {Registration.STONE_BERRY_BUSH.get(),Registration.GRAVEL_BERRY_BUSH.get(),Registration.SAND_BERRY_BUSH.get(),
                Registration.DIRT_BERRY_BUSH.get(),Registration.CLAY_BERRY_BUSH.get()};

        Block[] glass = {Registration.DARK_GLASS.get(), Registration.HYDROTANK.get(),Registration.HYDROTANK_LIGHT.get(),Registration.COBBLEGEN.get()};

        Block[] slabs = {Registration.GRASS_SLAB.get(),Registration.OAK_LEAVES_SLAB.get(),Registration.DARK_OAK_LEAVES_SLAB.get(),Registration.JUNGLE_LEAVES_SLAB.get(),
                Registration.ACACIA_LEAVES_SLAB.get(),Registration.SPRUCE_LEAVES_SLAB.get(),Registration.BIRCH_LEAVES_SLAB.get()};

        Block[] stairs = {Registration.OAK_LEAVES_STAIRS.get(),Registration.DARK_OAK_LEAVES_STAIRS.get(),Registration.JUNGLE_LEAVES_STAIRS.get(),
                Registration.ACACIA_LEAVES_STAIRS.get(), Registration.SPRUCE_LEAVES_STAIRS.get(),Registration.BIRCH_LEAVES_STAIRS.get()};

        Block[] traps = {Registration.IRON_TRAP.get(), Registration.GOLDEN_TRAP.get(),Registration.DIAMOND_TRAP.get(),Registration.WITHER_TRAP.get()};

        for (Block block : bushes) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : element_bushes) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : metal_bushes) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : base_bushes) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : glass) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.translucent());
        }
        for (Block block : slabs) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : stairs) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }
        for (Block block : traps) {
            ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
        }

    }
}
