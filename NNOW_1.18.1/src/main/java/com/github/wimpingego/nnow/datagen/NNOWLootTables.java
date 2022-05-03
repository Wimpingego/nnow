package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.data.DataGenerator;

public class NNOWLootTables extends BaseLootTableProvider {

    public NNOWLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

//        lootTables.put(Registration.GENERATOR.get(), createStandardTable("generator", Registration.GENERATOR.get(), Registration.GENERATOR_BE.get()));
//        lootTables.put(Registration.POWERGEN.get(), createStandardTable("powergen", Registration.POWERGEN.get(), Registration.POWERGEN_BE.get()));

//        lootTables.put(Registration.AGG_BLOCK.get(), createSilkTouchTable("agg_block", Registration.AGG_BLOCK.get(), Registration.AGG_BLOCK_ITEM.get(), 1, 1));

        lootTables.put(Registration.AGG_BLOCK.get(), createSimpleTable("agg_block", Registration.AGG_BLOCK.get()));
        lootTables.put(Registration.AGS_BLOCK.get(), createSimpleTable("ags_block", Registration.AGS_BLOCK.get()));
        lootTables.put(Registration.AGRS_BLOCK.get(), createSimpleTable("agrs_block", Registration.AGRS_BLOCK.get()));
        lootTables.put(Registration.DARK_GLASS.get(), createSimpleTable("dark_glass_block", Registration.DARK_GLASS.get()));
        lootTables.put(Registration.SUPER_OBSIDIAN.get(), createSimpleTable("super_obsidian", Registration.SUPER_OBSIDIAN.get()));
        lootTables.put(Registration.SUPER_OBSIDIAN_BARS.get(), createSimpleTable("super_obsidian_bars", Registration.SUPER_OBSIDIAN_BARS.get()));
        lootTables.put(Registration.HYDROTANK.get(), createSimpleTable("super_obsidian_bars", Registration.HYDROTANK.get()));
        lootTables.put(Registration.HYDROTANK_LIGHT.get(), createSimpleTable("super_obsidian_bars", Registration.HYDROTANK_LIGHT.get()));
        lootTables.put(Registration.COBBLEGEN.get(), createSimpleTable("super_obsidian_bars", Registration.COBBLEGEN.get()));
        lootTables.put(Registration.WATERWELL.get(), createSimpleTable("super_obsidian_bars", Registration.WATERWELL.get()));
        lootTables.put(Registration.LAVAWELL.get(), createSimpleTable("super_obsidian_bars", Registration.LAVAWELL.get()));
        //Metal Storage Blocks
        lootTables.put(Registration.NICKEL_BLOCK.get(),createSimpleTable("nickel_block", Registration.NICKEL_BLOCK.get()));
        lootTables.put(Registration.SILVER_BLOCK.get(),createSimpleTable("silver_block", Registration.SILVER_BLOCK.get()));
        lootTables.put(Registration.URANIUM_BLOCK.get(),createSimpleTable("uranium_block", Registration.URANIUM_BLOCK.get()));
        lootTables.put(Registration.LEAD_BLOCK.get(),createSimpleTable("lead_block", Registration.LEAD_BLOCK.get()));
        lootTables.put(Registration.ALUMINUM_BLOCK.get(),createSimpleTable("aluminum_block", Registration.ALUMINUM_BLOCK.get()));
        lootTables.put(Registration.TIN_BLOCK.get(),createSimpleTable("tin_block", Registration.TIN_BLOCK.get()));
        lootTables.put(Registration.OSMIUM_BLOCK.get(),createSimpleTable("osmium_block", Registration.OSMIUM_BLOCK.get()));
        lootTables.put(Registration.BISMUTH_BLOCK.get(),createSimpleTable("bismuth_block", Registration.BISMUTH_BLOCK.get()));
        lootTables.put(Registration.ZINC_BLOCK.get(),createSimpleTable("zinc_block", Registration.ZINC_BLOCK.get()));
        lootTables.put(Registration.PLATINUM_BLOCK.get(),createSimpleTable("platinum_block", Registration.PLATINUM_BLOCK.get()));
        lootTables.put(Registration.IRIDIUM_BLOCK.get(),createSimpleTable("iridium_block", Registration.IRIDIUM_BLOCK.get()));
        //Slabs
        lootTables.put(Registration.GRAVEL_SLAB.get(),createSlabItemTable("gravel_slab",Registration.GRAVEL_SLAB.get()));
        lootTables.put(Registration.SAND_SLAB.get(),createSlabItemTable("sand_slab",Registration.SAND_SLAB.get()));
        lootTables.put(Registration.REDSAND_SLAB.get(),createSlabItemTable("redsand_slab",Registration.REDSAND_SLAB.get()));
        lootTables.put(Registration.COARSE_DIRT_SLAB.get(),createSlabItemTable("coarse_dirt_slab",Registration.COARSE_DIRT_SLAB.get()));
        lootTables.put(Registration.DIRT_SLAB.get(),createSlabItemTable("dirt_slab",Registration.DIRT_SLAB.get()));
        lootTables.put(Registration.CRACKED_STONE_SLAB.get(),createSlabItemTable("cracked_stone_bricks_slab",Registration.CRACKED_STONE_SLAB.get()));
        lootTables.put(Registration.BOOKSHELF_SLAB.get(),createSlabItemTable("bookshelf_slab",Registration.BOOKSHELF_SLAB.get()));

        lootTables.put(Registration.GRASS_SLAB.get(),createSlabItemTable("grass_slab",Registration.GRASS_SLAB.get()));
        lootTables.put(Registration.OAK_LEAVES_SLAB.get(),createSlabItemTable("oak_leaves_slab",Registration.OAK_LEAVES_SLAB.get()));
        lootTables.put(Registration.DARK_OAK_LEAVES_SLAB.get(),createSlabItemTable("dark_oak_leaves_slab",Registration.DARK_OAK_LEAVES_SLAB.get()));
        lootTables.put(Registration.JUNGLE_LEAVES_SLAB.get(),createSlabItemTable("jungle_leaves_slab",Registration.JUNGLE_LEAVES_SLAB.get()));
        lootTables.put(Registration.ACACIA_LEAVES_SLAB.get(),createSlabItemTable("acacia_leaves_slab",Registration.ACACIA_LEAVES_SLAB.get()));
        lootTables.put(Registration.SPRUCE_LEAVES_SLAB.get(),createSlabItemTable("spruce_leaves_slab",Registration.SPRUCE_LEAVES_SLAB.get()));
        lootTables.put(Registration.BIRCH_LEAVES_SLAB.get(),createSlabItemTable("birch_leaves_slab",Registration.BIRCH_LEAVES_SLAB.get()));
        //Stairs
        lootTables.put(Registration.GRAVEL_STAIRS.get(),createSimpleTable("gravel_stairs",Registration.GRAVEL_STAIRS.get()));
        lootTables.put(Registration.SAND_STAIRS.get(),createSimpleTable("sand_stairs",Registration.SAND_STAIRS.get()));
        lootTables.put(Registration.REDSAND_STAIRS.get(),createSimpleTable("redsand_stairs",Registration.REDSAND_STAIRS.get()));
        lootTables.put(Registration.COARSE_DIRT_STAIRS.get(),createSimpleTable("coarse_dirt_stairs",Registration.COARSE_DIRT_STAIRS.get()));
        lootTables.put(Registration.DIRT_STAIRS.get(),createSimpleTable("dirt_slab",Registration.DIRT_STAIRS.get()));
        lootTables.put(Registration.CRACKED_STONE_STAIRS.get(),createSimpleTable("cracked_stone_bricks_stairs",Registration.CRACKED_STONE_STAIRS.get()));
        lootTables.put(Registration.BOOKSHELF_STAIRS.get(),createSimpleTable("bookshelf_stairs",Registration.BOOKSHELF_STAIRS.get()));

        lootTables.put(Registration.OAK_LEAVES_STAIRS.get(), createSimpleTable("oak_leaves_stairs",Registration.OAK_LEAVES_STAIRS.get()));
        lootTables.put(Registration.DARK_OAK_LEAVES_STAIRS.get(), createSimpleTable("dark_oak_leaves_stairs",Registration.DARK_OAK_LEAVES_STAIRS.get()));
        lootTables.put(Registration.JUNGLE_LEAVES_STAIRS.get(), createSimpleTable("jungle_leaves_stairs",Registration.JUNGLE_LEAVES_STAIRS.get()));
        lootTables.put(Registration.ACACIA_LEAVES_STAIRS.get(), createSimpleTable("acacia_leaves_stairs",Registration.ACACIA_LEAVES_STAIRS.get()));
        lootTables.put(Registration.SPRUCE_LEAVES_STAIRS.get(), createSimpleTable("spruce_leaves_stairs",Registration.SPRUCE_LEAVES_STAIRS.get()));
        lootTables.put(Registration.BIRCH_LEAVES_STAIRS.get(), createSimpleTable("birch_leaves_stairs",Registration.BIRCH_LEAVES_STAIRS.get()));

        lootTables.put(Registration.IRON_TRAP.get(), createSimpleTable("iron_tap",Registration.IRON_TRAP.get()));
        lootTables.put(Registration.GOLDEN_TRAP.get(), createSimpleTable("golden_tap",Registration.GOLDEN_TRAP.get()));
        lootTables.put(Registration.DIAMOND_TRAP.get(), createSimpleTable("diamond_tap",Registration.DIAMOND_TRAP.get()));
        lootTables.put(Registration.WITHER_TRAP.get(), createSimpleTable("wither_tap",Registration.WITHER_TRAP.get()));
    }
}