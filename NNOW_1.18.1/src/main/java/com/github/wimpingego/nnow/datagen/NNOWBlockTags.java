package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NNOWBlockTags extends BlockTagsProvider {

    public NNOWBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, NNOW.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.DARK_GLASS.get())
                .add(Registration.SUPER_OBSIDIAN.get())
                .add(Registration.SUPER_OBSIDIAN_BARS.get())
                .add(Registration.HYDROTANK.get())
                .add(Registration.HYDROTANK_LIGHT.get())
                .add(Registration.COBBLEGEN.get())
                .add(Registration.WATERWELL.get())
                .add(Registration.LAVAWELL.get())
                .add(Registration.ALUMINUM_BLOCK.get())
                .add(Registration.BISMUTH_BLOCK.get())
                .add(Registration.IRIDIUM_BLOCK.get())
                .add(Registration.LEAD_BLOCK.get())
                .add(Registration.NICKEL_BLOCK.get())
                .add(Registration.OSMIUM_BLOCK.get())
                .add(Registration.PLATINUM_BLOCK.get())
                .add(Registration.SILVER_BLOCK.get())
                .add(Registration.TIN_BLOCK.get())
                .add(Registration.URANIUM_BLOCK.get())
                .add(Registration.ZINC_BLOCK.get())
                .add(Registration.CRACKED_STONE_SLAB.get())
                .add(Registration.CRACKED_STONE_STAIRS.get())
                .add(Registration.IRON_TRAP.get())
                .add(Registration.GOLDEN_TRAP.get())
                .add(Registration.DIAMOND_TRAP.get())
                .add(Registration.WITHER_TRAP.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(Registration.AGG_BLOCK.get())
                .add(Registration.AGS_BLOCK.get())
                .add(Registration.AGRS_BLOCK.get())
                .add(Registration.GRAVEL_SLAB.get())
                .add(Registration.SAND_SLAB.get())
                .add(Registration.REDSAND_SLAB.get())
                .add(Registration.COARSE_DIRT_SLAB.get())
                .add(Registration.DIRT_SLAB.get())
                .add(Registration.GRAVEL_STAIRS.get())
                .add(Registration.SAND_STAIRS.get())
                .add(Registration.REDSAND_STAIRS.get())
                .add(Registration.COARSE_DIRT_STAIRS.get())
                .add(Registration.DIRT_STAIRS.get())
                .add(Registration.GRASS_SLAB.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Registration.BOOKSHELF_SLAB.get())
                .add(Registration.BOOKSHELF_STAIRS.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(Registration.OAK_LEAVES_SLAB.get())
                .add(Registration.DARK_OAK_LEAVES_SLAB.get())
                .add(Registration.JUNGLE_LEAVES_SLAB.get())
                .add(Registration.ACACIA_LEAVES_SLAB.get())
                .add(Registration.SPRUCE_LEAVES_SLAB.get())
                .add(Registration.BIRCH_LEAVES_SLAB.get())
                .add(Registration.OAK_LEAVES_STAIRS.get())
                .add(Registration.DARK_OAK_LEAVES_STAIRS.get())
                .add(Registration.JUNGLE_LEAVES_STAIRS.get())
                .add(Registration.ACACIA_LEAVES_STAIRS.get())
                .add(Registration.SPRUCE_LEAVES_STAIRS.get())
                .add(Registration.BIRCH_LEAVES_STAIRS.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(Registration.HYDROTANK.get())
                .add(Registration.HYDROTANK_LIGHT.get())
                .add(Registration.COBBLEGEN.get())
                .add(Registration.WATERWELL.get())
                .add(Registration.LAVAWELL.get())
                .add(Registration.ALUMINUM_BLOCK.get())
                .add(Registration.BISMUTH_BLOCK.get())
                .add(Registration.IRIDIUM_BLOCK.get())
                .add(Registration.LEAD_BLOCK.get())
                .add(Registration.NICKEL_BLOCK.get())
                .add(Registration.OSMIUM_BLOCK.get())
                .add(Registration.PLATINUM_BLOCK.get())
                .add(Registration.SILVER_BLOCK.get())
                .add(Registration.TIN_BLOCK.get())
                .add(Registration.URANIUM_BLOCK.get())
                .add(Registration.ZINC_BLOCK.get())
                .add(Registration.IRON_TRAP.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.GOLDEN_TRAP.get())
                .add(Registration.DIAMOND_TRAP.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(Registration.SUPER_OBSIDIAN.get())
                .add(Registration.SUPER_OBSIDIAN_BARS.get())
                .add(Registration.WITHER_TRAP.get());

        //Storage Blocks
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(Registration.ALUMINUM_BLOCK.get())
                .add(Registration.BISMUTH_BLOCK.get())
                .add(Registration.IRIDIUM_BLOCK.get())
                .add(Registration.LEAD_BLOCK.get())
                .add(Registration.NICKEL_BLOCK.get())
                .add(Registration.OSMIUM_BLOCK.get())
                .add(Registration.PLATINUM_BLOCK.get())
                .add(Registration.SILVER_BLOCK.get())
                .add(Registration.TIN_BLOCK.get())
                .add(Registration.URANIUM_BLOCK.get())
                .add(Registration.ZINC_BLOCK.get());

        tag(Registration.TAGS_ALUMINUM_BLOCK)
                .add(Registration.ALUMINUM_BLOCK.get());

        tag(Registration.TAGS_BISMUTH_BLOCK)
                .add(Registration.BISMUTH_BLOCK.get());

        tag(Registration.TAGS_IRIDIUM_BLOCK)
                .add(Registration.IRIDIUM_BLOCK.get());

        tag(Registration.TAGS_LEAD_BLOCK)
                .add(Registration.LEAD_BLOCK.get());

        tag(Registration.TAGS_NICKEL_BLOCK)
                .add(Registration.NICKEL_BLOCK.get());

        tag(Registration.TAGS_OSMIUM_BLOCK)
                .add(Registration.OSMIUM_BLOCK.get());

        tag(Registration.TAGS_PLATINUM_BLOCK)
                .add(Registration.PLATINUM_BLOCK.get());

        tag(Registration.TAGS_SILVER_BLOCK)
                .add(Registration.SILVER_BLOCK.get());

        tag(Registration.TAGS_TIN_BLOCK)
                .add(Registration.TIN_BLOCK.get());

        tag(Registration.TAGS_URANIUM_BLOCK)
                .add(Registration.URANIUM_BLOCK.get());

        tag(Registration.TAGS_ZINC_BLOCK)
                .add(Registration.ZINC_BLOCK.get());

        tag(Registration.WITHER_IMMUNE_BLOCK)
                .add(Registration.DARK_GLASS.get())
                .add(Registration.SUPER_OBSIDIAN.get())
                .add(Registration.SUPER_OBSIDIAN_BARS.get());
    }

    @Override
    public String getName() {
        return "NNOW Tags";
    }
}
