package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class NNOWRecipes extends RecipeProvider {

    public NNOWRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
    //NNOW Blocks
        ShapelessRecipeBuilder.shapeless(Registration.AGG_BLOCK.get(), 3)
                .requires(Tags.Items.GRAVEL)
                .requires(Tags.Items.GRAVEL)
                .requires(Tags.Items.GRAVEL)
                .requires(Tags.Items.FEATHERS)
                .group("ag_gravel")
                .unlockedBy("has_gravel", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRAVEL))
                .unlockedBy("has_feathers", InventoryChangeTrigger.TriggerInstance.hasItems(Items.FEATHER))
                .save(consumer,toRL("nnow_blocks/agg_block"));

        ShapelessRecipeBuilder.shapeless(Registration.AGS_BLOCK.get(), 3)
                .requires(Tags.Items.SAND_COLORLESS)
                .requires(Tags.Items.SAND_COLORLESS)
                .requires(Tags.Items.SAND_COLORLESS)
                .requires(Tags.Items.FEATHERS)
                .group("ag_sand")
                .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SAND))
                .unlockedBy("has_feathers", InventoryChangeTrigger.TriggerInstance.hasItems(Items.FEATHER))
                .save(consumer,toRL("nnow_blocks/ags_block"));

        ShapelessRecipeBuilder.shapeless(Registration.AGRS_BLOCK.get(), 3)
                .requires(Tags.Items.SAND_RED)
                .requires(Tags.Items.SAND_RED)
                .requires(Tags.Items.SAND_RED)
                .requires(Tags.Items.FEATHERS)
                .group("agr_sand")
                .unlockedBy("has_red_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.RED_SAND))
                .unlockedBy("has_feathers", InventoryChangeTrigger.TriggerInstance.hasItems(Items.FEATHER))
                .save(consumer,toRL("nnow_blocks/agrs_block"));

        ShapedRecipeBuilder.shaped(Registration.SUPER_OBSIDIAN.get())
                .pattern("# #")
                .pattern(" O ")
                .pattern("# #")
                .define('#', Items.IRON_BARS)
                .define('O', Items.OBSIDIAN)
                .group("super_obsidian")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OBSIDIAN))
                .save(consumer,toRL("nnow_blocks/super_obsidian"));

        ShapelessRecipeBuilder.shapeless(Registration.SUPER_OBSIDIAN.get(), 1)
                .requires(Registration.SUPER_OBSIDIAN_BARS.get())
                .group("super_obsidian")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OBSIDIAN))
                .save(consumer, toRL("nnow_blocks/super_obsidian" + "_alt"));

        ShapedRecipeBuilder.shaped(Registration.SUPER_OBSIDIAN_BARS.get())
                .pattern(" # ")
                .pattern("#O#")
                .pattern(" # ")
                .define('#', Items.IRON_BARS)
                .define('O', Items.OBSIDIAN)
                .group("super_obsidian_bars")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OBSIDIAN))
                .save(consumer,toRL("nnow_blocks/super_obsidian_bars"));

        ShapelessRecipeBuilder.shapeless(Registration.SUPER_OBSIDIAN_BARS.get(), 1)
                .requires(Registration.SUPER_OBSIDIAN.get())
                .group("super_obsidian_bars")
                .unlockedBy("has_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OBSIDIAN))
                .save(consumer, toRL("nnow_bloxks/super_obsidian_bars" + "_alt"));

        ShapedRecipeBuilder.shaped(Registration.DARK_GLASS.get(),8)
                .pattern("GGG")
                .pattern("GBG")
                .pattern("GGG")
                .define('B', Tags.Items.DYES_BLACK)
                .define('G', Tags.Items.GLASS)
                .group("dark_glass")
                .unlockedBy("has_glass", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLASS))
                .save(consumer,toRL("nnow_blocks/dark_glass"));

        ShapedRecipeBuilder.shaped(Registration.HYDROTANK.get(),1)
                .pattern("IGI")
                .pattern("GBG")
                .pattern("IGI")
                .define('B', Items.WATER_BUCKET)
                .define('G', Tags.Items.GLASS_PANES)
                .define('I', Tags.Items.INGOTS_IRON)
                .group("hydrotank")
                .unlockedBy("has_water_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.WATER_BUCKET))
                .save(consumer,toRL("nnow_blocks/hydrotank"));

        ShapelessRecipeBuilder.shapeless(Registration.HYDROTANK_LIGHT.get(), 1)
                .requires(Registration.HYDROTANK.get())
                .requires(Items.TORCH)
                .group("hydrotank")
                .unlockedBy("has_hydrotank", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.HYDROTANK.get()))
                .save(consumer,toRL("nnow_blocks/hydrotank_light"));

        ShapedRecipeBuilder.shaped(Registration.COBBLEGEN.get(),1)
                .pattern("III")
                .pattern("LCW")
                .pattern("III")
                .define('W', Items.WATER_BUCKET)
                .define('L', Items.LAVA_BUCKET)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('C', Tags.Items.COBBLESTONE)
                .group("cobblegen")
                .unlockedBy("has_water_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.WATER_BUCKET))
                .unlockedBy("has_lava_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAVA_BUCKET))
                .save(consumer,toRL("nnow_blocks/cobblegen"));

        ShapedRecipeBuilder.shaped(Registration.WATERWELL.get(),1)
                .pattern("III")
                .pattern("W W")
                .pattern("III")
                .define('W', Items.WATER_BUCKET)
                .define('I', Tags.Items.INGOTS_IRON)
                .group("waterwell")
                .unlockedBy("has_water_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.WATER_BUCKET))
                .save(consumer,toRL("nnow_blocks/waterwell"));

        ShapedRecipeBuilder.shaped(Registration.LAVAWELL.get(),1)
                .pattern("III")
                .pattern("L L")
                .pattern("III")
                .define('L', Items.LAVA_BUCKET)
                .define('I', Tags.Items.INGOTS_IRON)
                .group("lavawell")
                .unlockedBy("has_lava_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAVA_BUCKET))
                .save(consumer,toRL("nnow_blocks/lavawell"));

        //Slabs
        ShapedRecipeBuilder.shaped(Registration.GRAVEL_SLAB.get(),6)
                .pattern("###")
                .define('#', Tags.Items.GRAVEL)
                .group("gravel_slabs")
                .unlockedBy("has_gravel", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRAVEL))
                .save(consumer,toRL("slabs/gravel_slabs"));

        ShapedRecipeBuilder.shaped(Registration.SAND_SLAB.get(),6)
                .pattern("###")
                .define('#', Tags.Items.SAND_COLORLESS)
                .group("sand_slabs")
                .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SAND))
                .save(consumer,toRL("slabs/sand_slabs"));

        ShapedRecipeBuilder.shaped(Registration.REDSAND_SLAB.get(),6)
                .pattern("###")
                .define('#', Tags.Items.SAND_RED)
                .group("red_sand_slabs")
                .unlockedBy("has_red_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.RED_SAND))
                .save(consumer,toRL("slabs/redsand_slabs"));

        ShapedRecipeBuilder.shaped(Registration.COARSE_DIRT_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.COARSE_DIRT)
                .group("coarse_dirt_slabs")
                .unlockedBy("has_coarse_dirt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COARSE_DIRT))
                .save(consumer,toRL("slabs/coarse_dirt_slabs"));

        ShapedRecipeBuilder.shaped(Registration.GRASS_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.GRASS_BLOCK)
                .group("grass_block")
                .unlockedBy("has_grass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRASS_BLOCK))
                .save(consumer,toRL("slabs/grass_slabs"));

        ShapedRecipeBuilder.shaped(Registration.DIRT_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.DIRT)
                .group("dirt_slabs")
                .unlockedBy("has_dirt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIRT))
                .save(consumer,toRL("slabs/dirt_slabs"));

        ShapedRecipeBuilder.shaped(Registration.CRACKED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.CRACKED_STONE_BRICKS)
                .group("cracked_stone_bricks_slabs")
                .unlockedBy("has_cracked_stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CRACKED_STONE_BRICKS))
                .save(consumer,toRL("slabs/cracked_stone_bricks_slabs"));

        ShapedRecipeBuilder.shaped(Registration.BOOKSHELF_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.BOOKSHELF)
                .group("bookshelf_slabs")
                .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BOOKSHELF))
                .save(consumer,toRL("slabs/bookshelf_slabs"));

        ShapedRecipeBuilder.shaped(Registration.OAK_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.OAK_LEAVES)
                .group("oak_leaves_slabs")
                .unlockedBy("has_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LEAVES))
                .save(consumer,toRL("slabs/oak_leaves_slabs"));

        ShapedRecipeBuilder.shaped(Registration.DARK_OAK_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.DARK_OAK_LEAVES)
                .group("dark_oak_leaves_slabs")
                .unlockedBy("has_dark_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LEAVES))
                .save(consumer,toRL("slabs/dark_oak_leaves_slabs"));

        ShapedRecipeBuilder.shaped(Registration.JUNGLE_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.JUNGLE_LEAVES)
                .group("jungle_leaves_slabs")
                .unlockedBy("has_jungle_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LEAVES))
                .save(consumer,toRL("slabs/jungle_leaves_slabs"));

        ShapedRecipeBuilder.shaped(Registration.ACACIA_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.ACACIA_LEAVES)
                .group("acacia_leaves_slabs")
                .unlockedBy("has_acacia_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LEAVES))
                .save(consumer,toRL("slabs/acacia_leaves_slabs"));

        ShapedRecipeBuilder.shaped(Registration.SPRUCE_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.SPRUCE_LEAVES)
                .group("spruce_leaves_slabs")
                .unlockedBy("has_spruce_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LEAVES))
                .save(consumer,toRL("slabs/spruce_leaves_slabs"));

        ShapedRecipeBuilder.shaped(Registration.BIRCH_LEAVES_SLAB.get(),6)
                .pattern("###")
                .define('#', Items.BIRCH_LEAVES)
                .group("birch_leaves_slabs")
                .unlockedBy("has_birch_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LEAVES))
                .save(consumer,toRL("slabs/birch_leaves_slabs"));

        //Stairs
        ShapedRecipeBuilder.shaped(Registration.GRAVEL_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Tags.Items.GRAVEL)
                .group("gravel_stairs")
                .unlockedBy("has_gravel", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRAVEL))
                .save(consumer,toRL("stairs/gravel_stairs"));

        ShapedRecipeBuilder.shaped(Registration.SAND_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Tags.Items.SAND_COLORLESS)
                .group("sand_stairs")
                .unlockedBy("has_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SAND))
                .save(consumer,toRL("stairs/sand_stairs"));

        ShapedRecipeBuilder.shaped(Registration.REDSAND_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Tags.Items.SAND_RED)
                .group("red_sand_stairs")
                .unlockedBy("has_red_sand", InventoryChangeTrigger.TriggerInstance.hasItems(Items.RED_SAND))
                .save(consumer,toRL("stairs/redsand_stairs"));

        ShapedRecipeBuilder.shaped(Registration.COARSE_DIRT_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.COARSE_DIRT)
                .group("coarse_dirt_stairs")
                .unlockedBy("has_coarse_dirt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COARSE_DIRT))
                .save(consumer,toRL("stairs/coarse_dirt_stairs"));

        ShapedRecipeBuilder.shaped(Registration.DIRT_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.DIRT)
                .group("dirt_stairs")
                .unlockedBy("has_dirt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIRT))
                .save(consumer,toRL("stairs/dirt_stairs"));

        ShapedRecipeBuilder.shaped(Registration.CRACKED_STONE_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.CRACKED_STONE_BRICKS)
                .group("cracked_stone_bricks_stairs")
                .unlockedBy("has_cracked_stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CRACKED_STONE_BRICKS))
                .save(consumer,toRL("stairs/cracked_stone_bricks_stairs"));

        ShapedRecipeBuilder.shaped(Registration.BOOKSHELF_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.BOOKSHELF)
                .group("bookshelf_stairs")
                .unlockedBy("has_bookshelf", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BOOKSHELF))
                .save(consumer,toRL("stairs/bookshelf_stairs"));

        ShapedRecipeBuilder.shaped(Registration.OAK_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.OAK_LEAVES)
                .group("oak_leaves_stairs")
                .unlockedBy("has_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LEAVES))
                .save(consumer,toRL("stairs/oak_leaves_stairs"));

        ShapedRecipeBuilder.shaped(Registration.DARK_OAK_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.DARK_OAK_LEAVES)
                .group("dark_oak_leaves_stairs")
                .unlockedBy("has_dark_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LEAVES))
                .save(consumer,toRL("stairs/dark_oak_leaves_stairs"));

        ShapedRecipeBuilder.shaped(Registration.JUNGLE_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.JUNGLE_LEAVES)
                .group("jungle_leaves_stairs")
                .unlockedBy("has_jungle_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LEAVES))
                .save(consumer,toRL("stairs/jungle_leaves_stairs"));

        ShapedRecipeBuilder.shaped(Registration.ACACIA_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.ACACIA_LEAVES)
                .group("acacia_leaves_stairs")
                .unlockedBy("has_acacia_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LEAVES))
                .save(consumer,toRL("stairs/acacia_leaves_stairs"));

        ShapedRecipeBuilder.shaped(Registration.SPRUCE_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.SPRUCE_LEAVES)
                .group("spruce_leaves_stairs")
                .unlockedBy("has_spruce_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LEAVES))
                .save(consumer,toRL("stairs/spruce_leaves_stairs"));

        ShapedRecipeBuilder.shaped(Registration.BIRCH_LEAVES_STAIRS.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Items.BIRCH_LEAVES)
                .group("birch_leaves_stairs")
                .unlockedBy("has_birch_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LEAVES))
                .save(consumer,toRL("stairs/birch_leaves_stairs"));

        //Items
        ShapedRecipeBuilder.shaped(Registration.ENDER_BAG.get(), 1)
                .pattern("#E#")
                .pattern("OCO")
                .pattern("#E#")
                .define('#', Tags.Items.STRING)
                .define('E', Items.ENDER_PEARL)
                .define('O', Items.OBSIDIAN)
                .define('C', Tags.Items.CHESTS)
                .group("ender_bag")
                .unlockedBy("has_ender_pearl", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ENDER_PEARL))
                .save(consumer,toRL("nnow_items/ender_bag"));

        ShapedRecipeBuilder.shaped(Registration.BITO_EGG.get(), 1)
                .pattern("#B#")
                .pattern("RGR")
                .pattern("RQR")
                .define('#', Tags.Items.STRING)
                .define('B', Items.PHANTOM_MEMBRANE)
                .define('R', Items.ROTTEN_FLESH)
                .define('G', Items.GUNPOWDER)
                .define('Q', Items.BONE_BLOCK)
                .group("bun_in_the_oven")
                .unlockedBy("has_bone_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BONE_BLOCK))
                .save(consumer,toRL("nnow_items/bun_in_the_oven"));

        ShapedRecipeBuilder.shaped(Registration.POKING_STICK.get(), 1)
                .pattern("SSS")
                .pattern("  B")
                .define('B', ItemTags.PLANKS)
                .define('S', Tags.Items.RODS_WOODEN)
                .group("pokingstick")
                .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer,toRL("poking_stick/poking_stick"));

        ShapedRecipeBuilder.shaped(Registration.STONE_POKING_STICK.get(), 1)
                .pattern("SSS")
                .pattern("  B")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('B', Tags.Items.COBBLESTONE)
                .group("pokingstick")
                .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer,toRL("poking_stick/stone_poking_stick"));

        ShapedRecipeBuilder.shaped(Registration.IRON_POKING_STICK.get(), 1)
                .pattern("SSS")
                .pattern("  B")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('B', Tags.Items.INGOTS_IRON)
                .group("pokingstick")
                .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer,toRL("poking_stick/iron_poking_stick"));

        ShapedRecipeBuilder.shaped(Registration.GOLD_POKING_STICK.get(), 1)
                .pattern("SSS")
                .pattern("  B")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('B', Tags.Items.INGOTS_GOLD)
                .group("pokingstick")
                .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer,toRL("poking_stick/golden_poking_stick"));

        ShapedRecipeBuilder.shaped(Registration.DIAMOND_POKING_STICK.get(), 1)
                .pattern("SSS")
                .pattern("  B")
                .define('S', Tags.Items.RODS_WOODEN)
                .define('B', Tags.Items.GEMS_DIAMOND)
                .group("pokingstick")
                .unlockedBy("has_stick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STICK))
                .save(consumer,toRL("poking_stick/diamond_poking_stick"));

        ShapedRecipeBuilder.shaped(Registration.MAGNET.get(), 1)
                .pattern(" #L")
                .pattern("#C#")
                .pattern("R# ")
                .define('#', Tags.Items.SLIMEBALLS)
                .define('L', Tags.Items.GEMS_LAPIS)
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('R', Tags.Items.DUSTS_REDSTONE)
                .group("magnet")
                .unlockedBy("has_copper_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .save(consumer,toRL("nnow_items/magnet"));

        ShapelessRecipeBuilder.shapeless(Registration.BUNDLE_LEAVES.get(), 3)
                .requires(ItemTags.LEAVES)
                .requires(ItemTags.LEAVES)
                .requires(ItemTags.LEAVES)
                .group("bundle_of_leaves")
                .unlockedBy("has_acacia_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LEAVES))
                .unlockedBy("has_birch_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LEAVES))
                .unlockedBy("has_dark_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LEAVES))
                .unlockedBy("has_jungle_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LEAVES))
                .unlockedBy("has_oak_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LEAVES))
                .unlockedBy("has_spruce_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LEAVES))
                .save(consumer,toRL("nnow_items/bundle_of_leaves"));

        ShapelessRecipeBuilder.shapeless(Registration.LEAF_ROPE.get(), 2)
                .requires(Registration.BUNDLE_LEAVES.get())
                .requires(Registration.BUNDLE_LEAVES.get())
                .group("leaf_rope")
                .unlockedBy("has_bundle_of_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BUNDLE_LEAVES.get()))
                .save(consumer,toRL("nnow_items/leaf_hemp_rope"));

        ShapelessRecipeBuilder.shapeless(Items.GREEN_WOOL, 1)
                .requires(Registration.LEAF_ROPE.get())
                .requires(Registration.LEAF_ROPE.get())
                .requires(Registration.LEAF_ROPE.get())
                .requires(Registration.LEAF_ROPE.get())
                .group("green_wool")
                .unlockedBy("has_leaf_hemp_rope", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAF_ROPE.get()))
                .save(consumer,toRL("nnow_items/green_wool" + "_from_leaf_hemp_rope"));

        //Bowls
        ShapelessRecipeBuilder.shapeless(Registration.BOWL_OF_WATER.get(), 1)
                .requires(Items.BOWL)
                .requires(Registration.BUNDLE_LEAVES.get())
                .group("bowl_of_water")
                .unlockedBy("has_bundle_of_leaves", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BUNDLE_LEAVES.get()))
                .save(consumer,toRL("nnow_items/bowl_of_water"));

        ShapedRecipeBuilder.shaped(Registration.STONE_LINED_BOWL.get())
                .pattern("#B#")
                .pattern(" # ")
                .define('#', Items.STONE)
                .define('B', Items.BOWL)
                .group("stone_lined_bowl")
                .unlockedBy("has_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BOWL))
                .save(consumer,toRL("nnow_items/stone_lined_bowl"));

        ShapedRecipeBuilder.shaped(Registration.BOWL_OF_RAW_LAVA.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', Tags.Items.COBBLESTONE)
                .define('B', Registration.STONE_LINED_BOWL.get())
                .group("raw_lava")
                .unlockedBy("has_stone_lined_bowl", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.STONE_LINED_BOWL.get()))
                .save(consumer,toRL("nnow_items/bowl_of_raw_lava"));

        //Shears
        ShapedRecipeBuilder.shaped(Registration.WOODEN_SHEAR.get())
                .pattern(" #")
                .pattern("# ")
                .define('#', (ItemTags.PLANKS))
                .group("wooden_shear")
                .unlockedBy("has_acacia_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_PLANKS))
                .unlockedBy("has_birch_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_PLANKS))
                .unlockedBy("has_dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_PLANKS))
                .unlockedBy("has_jungle_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_PLANKS))
                .unlockedBy("has_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS))
                .unlockedBy("has_spruce_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_PLANKS))
                .save(consumer,toRL("shears/wooden_shear"));

        ShapedRecipeBuilder.shaped(Registration.GOLDEN_SHEAR.get())
                .pattern(" #")
                .pattern("# ")
                .define('#', (Tags.Items.INGOTS_GOLD))
                .group("golden_shear")
                .unlockedBy("has_gold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLD_INGOT))
                .save(consumer,toRL("shears/golden_shear"));

        ShapedRecipeBuilder.shaped(Registration.DIAMOND_SHEAR.get())
                .pattern(" #")
                .pattern("# ")
                .define('#', (Tags.Items.GEMS_DIAMOND))
                .group("diamond_shear")
                .unlockedBy("has_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .save(consumer,toRL("shears/diamond_shear"));

        //Dusts
        ShapelessRecipeBuilder.shapeless(Items.COBBLESTONE, 1)
                .requires(Registration.TAGS_STONE_DUST)
                .requires(Registration.TAGS_STONE_DUST)
                .requires(Registration.TAGS_STONE_DUST)
                .requires(Registration.TAGS_STONE_DUST)
                .group("stone_dust")
                .unlockedBy("has_stone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.STONE_DUST.get()))
                .save(consumer,toRL("dust/cobblestone" + "_from_dust"));

        ShapelessRecipeBuilder.shapeless(Items.SAND, 1)
                .requires(Registration.TAGS_SAND_DUST)
                .requires(Registration.TAGS_SAND_DUST)
                .requires(Registration.TAGS_SAND_DUST)
                .requires(Registration.TAGS_SAND_DUST)
                .group("sand_dust")
                .unlockedBy("has_sand_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SAND_DUST.get()))
                .save(consumer,toRL("dust/sand" + "_from_dust"));

        ShapedRecipeBuilder.shaped(Items.RED_SAND, 1)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .define('#', Registration.TAGS_SAND_DUST)
                .group("sand_dust")
                .unlockedBy("has_sand_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SAND_DUST.get()))
                .save(consumer,toRL("dust/red_sand" + "_from_dust"));

        ShapelessRecipeBuilder.shapeless(Items.DIRT, 1)
                .requires(Registration.TAGS_DIRT_DUST)
                .requires(Registration.TAGS_DIRT_DUST)
                .requires(Registration.TAGS_DIRT_DUST)
                .requires(Registration.TAGS_DIRT_DUST)
                .group("dirt_dust")
                .unlockedBy("has_dirt_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.DIRT_DUST.get()))
                .save(consumer,toRL("dust/dirt" + "_from_dust"));

        ShapelessRecipeBuilder.shapeless(Items.GRAVEL, 1)
                .requires(Registration.TAGS_GRAVEL_DUST)
                .requires(Registration.TAGS_GRAVEL_DUST)
                .requires(Registration.TAGS_GRAVEL_DUST)
                .requires(Registration.TAGS_GRAVEL_DUST)
                .group("gravel_dust")
                .unlockedBy("has_gravel_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GRAVEL_DUST.get()))
                .save(consumer,toRL("dust/gravel" + "_from_dust"));

        ShapelessRecipeBuilder.shapeless(Items.CLAY, 1)
                .requires(Registration.TAGS_CLAY_DUST)
                .requires(Registration.TAGS_CLAY_DUST)
                .requires(Registration.TAGS_CLAY_DUST)
                .requires(Registration.TAGS_CLAY_DUST)
                .group("clay_dust")
                .unlockedBy("has_clay_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.CLAY_DUST.get()))
                .save(consumer,toRL("dust/clay" + "_from_clay_dust"));

        //Berries
        ShapedRecipeBuilder.shaped(Registration.XP_BERRY.get())
                .pattern("ICG")
                .pattern("XBR")
                .pattern("QDE")
                .define('B', Items.SWEET_BERRIES)
                .define('I', (Tags.Items.STORAGE_BLOCKS_IRON))
                .define('C', (Tags.Items.STORAGE_BLOCKS_COPPER))
                .define('G', (Tags.Items.STORAGE_BLOCKS_GOLD))
                .define('X', (Tags.Items.STORAGE_BLOCKS_COAL))
                .define('R', (Tags.Items.STORAGE_BLOCKS_REDSTONE))
                .define('Q', (Tags.Items.STORAGE_BLOCKS_QUARTZ))
                .define('D', (Tags.Items.STORAGE_BLOCKS_DIAMOND))
                .define('E', (Tags.Items.STORAGE_BLOCKS_EMERALD))
                .group("xp_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/xp_berry"));

        ShapedRecipeBuilder.shaped(Registration.IRON_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.INGOTS_IRON))
                .group("iron_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/iron_berry"));

        ShapedRecipeBuilder.shaped(Registration.COPPER_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.INGOTS_COPPER))
                .group("copper_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/copper_berry"));

        ShapedRecipeBuilder.shaped(Registration.GOLD_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.INGOTS_GOLD))
                .group("gold_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/gold_berry"));

        ShapedRecipeBuilder.shaped(Registration.COAL_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Items.COAL))
                .group("coal_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/coal_berry"));

        ShapedRecipeBuilder.shaped(Registration.REDSTONE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.DUSTS_REDSTONE))
                .group("redstone_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/redstone_berry"));

        ShapedRecipeBuilder.shaped(Registration.GLOWSTONE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.DUSTS_GLOWSTONE))
                .group("glowstone_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/glowstone_berry"));

        ShapedRecipeBuilder.shaped(Registration.QUARTZ_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.GEMS_QUARTZ))
                .group("quartz_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/quartz_berry"));

        ShapedRecipeBuilder.shaped(Registration.DIAMOND_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.GEMS_DIAMOND))
                .group("diamond_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/diamond_berry"));

        ShapedRecipeBuilder.shaped(Registration.EMERALD_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.GEMS_EMERALD))
                .group("emerald_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/emerald_berry"));

        ShapedRecipeBuilder.shaped(Registration.LAPIS_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.GEMS_LAPIS))
                .group("lapis_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/lapis_berry"));

        ShapedRecipeBuilder.shaped(Registration.ICE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Items.ICE))
                .group("ice_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/ice_berry"));

        ShapedRecipeBuilder.shaped(Registration.FIRE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Items.MAGMA_BLOCK))
                .group("fire_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/fire_berry"));

        ShapedRecipeBuilder.shaped(Registration.WOODEN_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (ItemTags.LOGS))
                .group("wooden_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/wooden_berry"));

        ShapedRecipeBuilder.shaped(Registration.NETHERITE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', (Tags.Items.INGOTS_NETHERITE))
                .group("netherite_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/netherite_berry"));

        ShapedRecipeBuilder.shaped(Registration.NICKEL_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_NICKEL_INGOT)
                .group("nickel_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/nickel_berry"));

        ShapedRecipeBuilder.shaped(Registration.SILVER_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_SILVER_INGOT)
                .group("silver_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/silver_berry"));

        ShapedRecipeBuilder.shaped(Registration.URANIUM_BERRY_BUSH.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_URANIUM_INGOT)
                .group("uranium_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/uranium_berry"));

        ShapedRecipeBuilder.shaped(Registration.LEAD_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_LEAD_INGOT)
                .group("lead_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/lead_berry"));

        ShapedRecipeBuilder.shaped(Registration.ALUMINUM_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_ALUMINUM_INGOT)
                .group("aluminum_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/aluminum_berry"));

        ShapedRecipeBuilder.shaped(Registration.TIN_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_TIN_INGOT)
                .group("tin_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/tin_berry"));

        ShapedRecipeBuilder.shaped(Registration.OSMIUM_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_OSMIUM_INGOT)
                .group("osmium_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/osmium_berry"));

        ShapedRecipeBuilder.shaped(Registration.BISMUTH_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_BISMUTH_INGOT)
                .group("bismuth_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/bismuth_berry"));

        ShapedRecipeBuilder.shaped(Registration.ZINC_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_ZINC_INGOT)
                .group("zinc_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/zinc_berry"));

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_PLATINUM_INGOT)
                .group("platinum_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/platinum_berry"));

        ShapedRecipeBuilder.shaped(Registration.IRIDIUM_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Registration.TAGS_IRIDIUM_INGOT)
                .group("iridium_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/iridium_berry"));

        ShapedRecipeBuilder.shaped(Registration.STONE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Tags.Items.COBBLESTONE)
                .group("stone_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/stone_berry"));

        ShapedRecipeBuilder.shaped(Registration.STONE_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Tags.Items.SAND)
                .group("sand_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/sand_berry"));

        ShapedRecipeBuilder.shaped(Registration.DIRT_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', ItemTags.DIRT)
                .group("dirt_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/dirt_berry"));

        ShapedRecipeBuilder.shaped(Registration.GRAVEL_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Tags.Items.GRAVEL)
                .group("gravel_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/gravel_berry"));

        ShapedRecipeBuilder.shaped(Registration.CLAY_BERRY.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Items.SWEET_BERRIES)
                .define('#', Items.CLAY)
                .group("clay_berry")
                .unlockedBy("has_sweet_berry", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SWEET_BERRIES))
                .save(consumer, toRL("berries/clay_berry"));

        //Vanilla Nuggets to Ingots/Dust
        ShapedRecipeBuilder.shaped(Items.COAL)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_COAL_NUGGET)
                .group("coal")
                .unlockedBy("has_coal", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .unlockedBy("has_coal_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COAL_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/coal"));

        ShapedRecipeBuilder.shaped(Items.COPPER_INGOT)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_COPPER_NUGGET)
                .group("cooper_ingot")
                .unlockedBy("has_copper_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .unlockedBy("has_copper_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COPPER_NUGGET.get()))
                .save(consumer, toRL("ingots/copper_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Items.REDSTONE,1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_REDSTONE_NUGGET)
                .group("redstone")
                .unlockedBy("has_redstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
                .unlockedBy("has_redstone_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.REDSTONE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/redstone"));

        ShapedRecipeBuilder.shaped(Items.GLOWSTONE_DUST, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_GLOWSTONE_NUGGET)
                .group("glowstone_dust")
                .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLOWSTONE_DUST))
                .unlockedBy("has_glowstone_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GLOWSTONE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/glowstone_dust"));

        ShapedRecipeBuilder.shaped(Items.QUARTZ)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_QUARTZ_NUGGET)
                .group("quartz")
                .unlockedBy("has_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(Items.QUARTZ))
                .unlockedBy("has_quartz_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.QUARTZ_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/quartz"));

        ShapedRecipeBuilder.shaped(Items.LAPIS_LAZULI)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_LAPIS_NUGGET)
                .group("lapis")
                .unlockedBy("has_lapis_lazuli", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAPIS_LAZULI))
                .unlockedBy("has_lapis_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAPIS_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/lapis_lazuli"));

        ShapedRecipeBuilder.shaped(Items.DIAMOND)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_DIAMOND_NUGGET)
                .group("diamond")
                .unlockedBy("has_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .unlockedBy("has_diamond_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.DIAMOND_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/diamond"));

        ShapedRecipeBuilder.shaped(Items.EMERALD)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_EMERALD_NUGGET)
                .group("nnow")
                .unlockedBy("has_emerald", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .unlockedBy("has_emerald_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EMERALD_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/emerald"));

        ShapedRecipeBuilder.shaped(Items.NETHERITE_INGOT)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_NETHERITE_NUGGET)
                .group("netherite_ingot")
                .unlockedBy("has_netherite_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERITE_INGOT))
                .unlockedBy("has_netherite_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NETHERITE_NUGGET.get()))
                .save(consumer, toRL("ingots/netherite_ingot" + "_from_nuggets"));

        //Elements Nuggets to Items/Blocks
        ShapedRecipeBuilder.shaped(Items.ICE)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_ICE_NUGGET)
                .group("ice")
                .unlockedBy("has_ice_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ICE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/ice"));

        ShapelessRecipeBuilder.shapeless(Items.SNOW_BLOCK, 1)
                .requires(Registration.TAGS_ICE_NUGGET)
                .requires(Registration.TAGS_ICE_NUGGET)
                .requires(Registration.TAGS_ICE_NUGGET)
                .requires(Registration.TAGS_ICE_NUGGET)
                .group("snow")
                .unlockedBy("has_ice_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ICE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/snow_block"));

        ShapedRecipeBuilder.shaped(Items.WATER_BUCKET)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', Registration.TAGS_ICE_NUGGET)
                .define('B', Items.BUCKET)
                .group("water_bucket")
                .unlockedBy("has_ice_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ICE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/water_bucket"));

        ShapedRecipeBuilder.shaped(Items.MAGMA_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_FIRE_NUGGET)
                .group("magma")
                .unlockedBy("has_fire_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FIRE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/magma_block"));

        ShapedRecipeBuilder.shaped(Items.LAVA_BUCKET)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', Registration.TAGS_FIRE_NUGGET)
                .define('B', Items.BUCKET)
                .group("lava_bucket")
                .unlockedBy("has_fire_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FIRE_NUGGET.get()))
                .save(consumer, toRL("other_vanilla/lava_bucket"));

        ShapedRecipeBuilder.shaped(Items.ACACIA_LOG, 1)
                .pattern("###")
                .pattern("#  ")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG))
                .save(consumer, toRL("logs/acacia_log"));

        ShapedRecipeBuilder.shaped(Items.BIRCH_LOG, 1)
                .pattern("###")
                .pattern("  #")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_birch_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG))
                .save(consumer, toRL("logs/birch_log"));

        ShapedRecipeBuilder.shaped(Items.DARK_OAK_LOG, 1)
                .pattern("#  ")
                .pattern("###")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_dark_oak_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG))
                .save(consumer, toRL("logs/dark_oak_log"));

        ShapedRecipeBuilder.shaped(Items.JUNGLE_LOG, 1)
                .pattern("#  ")
                .pattern("###")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_jungle_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG))
                .save(consumer, toRL("logs/jungle_log"));

        ShapelessRecipeBuilder.shapeless(Items.OAK_LOG, 1)
                .requires(Registration.TAGS_WOODEN_NUGGET)
                .requires(Registration.TAGS_WOODEN_NUGGET)
                .requires(Registration.TAGS_WOODEN_NUGGET)
                .requires(Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_oak_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG))
                .save(consumer, toRL("logs/oak_log"));

        ShapedRecipeBuilder.shaped(Items.SPRUCE_LOG, 1)
                .pattern("# #")
                .pattern("# #")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .group("log")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG))
                .save(consumer, toRL("logs/spruce_log"));

        ShapedRecipeBuilder.shaped(Items.ACACIA_SAPLING, 1)
                .pattern("###")
                .pattern("#S ")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/acacia_sapling"));

        ShapedRecipeBuilder.shaped(Items.BIRCH_SAPLING, 1)
                .pattern("###")
                .pattern(" S#")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/birch_sapling"));

        ShapedRecipeBuilder.shaped(Items.DARK_OAK_SAPLING, 1)
                .pattern("#S ")
                .pattern("###")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/dark_oak_sapling"));

        ShapedRecipeBuilder.shaped(Items.JUNGLE_SAPLING, 1)
                .pattern(" S#")
                .pattern("###")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/jungle_sapling"));

        ShapedRecipeBuilder.shaped(Items.OAK_SAPLING, 1)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" # ")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/oak_sapling"));

        ShapedRecipeBuilder.shaped(Items.SPRUCE_SAPLING, 1)
                .pattern("# #")
                .pattern(" S ")
                .pattern("# #")
                .define('#', Registration.TAGS_WOODEN_NUGGET)
                .define('S', (ItemTags.SAPLINGS))
                .group("sapling")
                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
                .unlockedBy("has_acacia_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_SAPLING))
                .unlockedBy("has_birch_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_SAPLING))
                .unlockedBy("has_dark_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_SAPLING))
                .unlockedBy("has_jungle_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_SAPLING))
                .unlockedBy("has_oak_sapling", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_SAPLING))
                .unlockedBy("has_spruce_logs", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_SAPLING))
                .save(consumer, toRL("saplings/spruce_sapling"));

        //Metal Nuggets to Ingots
        ShapedRecipeBuilder.shaped(Registration.NICKEL_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_NICKEL_NUGGET)
                .group("nickel_ingot")
                .unlockedBy("has_nickel_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_BLOCK_ITEM.get()))
                .unlockedBy("has_nickel_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_INGOT.get()))
                .unlockedBy("has_nickel_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_NUGGET.get()))
                .save(consumer, toRL("ingots/nickel_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.SILVER_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_SILVER_NUGGET)
                .group("silver_ingot")
                .unlockedBy("has_silver_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_BLOCK_ITEM.get()))
                .unlockedBy("has_silver_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_INGOT.get()))
                .unlockedBy("has_silver_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_NUGGET.get()))
                .save(consumer, toRL("ingots/silver_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.URANIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_URANIUM_NUGGET)
                .group("uranium_ingot")
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_uranium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_INGOT.get()))
                .unlockedBy("has_uranium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/uranium_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.LEAD_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_LEAD_NUGGET)
                .group("lead_ingot")
                .unlockedBy("has_lead_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_BLOCK_ITEM.get()))
                .unlockedBy("has_lead_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_INGOT.get()))
                .unlockedBy("has_lead_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_NUGGET.get()))
                .save(consumer, toRL("ingots/lead_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.ALUMINUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_ALUMINUM_NUGGET)
                .group("aluminum_ingot")
                .unlockedBy("has_aluminum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_aluminum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_INGOT.get()))
                .unlockedBy("has_aluminum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_NUGGET.get()))
                .save(consumer, toRL("ingots/aluminum_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.TIN_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_TIN_NUGGET)
                .group("tin_ingot")
                .unlockedBy("has_tin_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_BLOCK_ITEM.get()))
                .unlockedBy("has_tin_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_INGOT.get()))
                .unlockedBy("has_tin_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_NUGGET.get()))
                .save(consumer, toRL("ingots/tin_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.OSMIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_OSMIUM_NUGGET)
                .group("osmium_ingot")
                .unlockedBy("has_osmium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_osmium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_INGOT.get()))
                .unlockedBy("has_osmium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/osmium_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.BISMUTH_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_BISMUTH_NUGGET)
                .group("bismuth_ingot")
                .unlockedBy("has_bismuth_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_BLOCK_ITEM.get()))
                .unlockedBy("has_bismuth_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_INGOT.get()))
                .unlockedBy("has_bismuth_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_NUGGET.get()))
                .save(consumer, toRL("ingots/bismuth_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.ZINC_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_ZINC_NUGGET)
                .group("zinc_ingot")
                .unlockedBy("has_zinc_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_BLOCK_ITEM.get()))
                .unlockedBy("has_zinc_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_INGOT.get()))
                .unlockedBy("has_zinc_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_NUGGET.get()))
                .save(consumer, toRL("ingots/zinc_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_PLATINUM_NUGGET)
                .group("platinum_ingot")
                .unlockedBy("has_platinum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .unlockedBy("has_platinum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, toRL("ingots/platinum_ingot" + "_from_nuggets"));

        ShapedRecipeBuilder.shaped(Registration.IRIDIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_IRIDIUM_NUGGET)
                .group("iridium_ingot")
                .unlockedBy("has_iridium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_iridium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_INGOT.get()))
                .unlockedBy("has_iridium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/iridium_ingot" + "_from_nuggets"));

        //Metal Ingots to Storage Blocks
        ShapedRecipeBuilder.shaped(Registration.NICKEL_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_NICKEL_INGOT)
                .group("nickel_block")
                .unlockedBy("has_nickel_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_BLOCK_ITEM.get()))
                .unlockedBy("has_nickel_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_INGOT.get()))
                .unlockedBy("has_nickel_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_NUGGET.get()))
                .save(consumer, toRL("storage_block/nickel_block"));

        ShapedRecipeBuilder.shaped(Registration.SILVER_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_SILVER_INGOT)
                .group("silver_block")
                .unlockedBy("has_silver_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_BLOCK_ITEM.get()))
                .unlockedBy("has_silver_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_INGOT.get()))
                .unlockedBy("has_silver_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_NUGGET.get()))
                .save(consumer, toRL("storage_block/silver_block"));

        ShapedRecipeBuilder.shaped(Registration.URANIUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_URANIUM_INGOT)
                .group("uranium_block")
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_uranium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_INGOT.get()))
                .unlockedBy("has_uranium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_NUGGET.get()))
                .save(consumer, toRL("storage_block/uranium_block"));

        ShapedRecipeBuilder.shaped(Registration.LEAD_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_LEAD_INGOT)
                .group("lead_block")
                .unlockedBy("has_lead_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_BLOCK_ITEM.get()))
                .unlockedBy("has_lead_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_INGOT.get()))
                .unlockedBy("has_lead_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_NUGGET.get()))
                .save(consumer, toRL("storage_block/lead_block"));

        ShapedRecipeBuilder.shaped(Registration.ALUMINUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_ALUMINUM_INGOT)
                .group("aluminum_block")
                .unlockedBy("has_aluminum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_aluminum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_INGOT.get()))
                .unlockedBy("has_aluminum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_NUGGET.get()))
                .save(consumer, toRL("storage_block/aluminum_block"));

        ShapedRecipeBuilder.shaped(Registration.TIN_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_TIN_INGOT)
                .group("tin_block")
                .unlockedBy("has_tin_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_BLOCK_ITEM.get()))
                .unlockedBy("has_tin_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_INGOT.get()))
                .unlockedBy("has_tin_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_NUGGET.get()))
                .save(consumer, toRL("storage_block/tin_block"));

        ShapedRecipeBuilder.shaped(Registration.OSMIUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_OSMIUM_INGOT)
                .group("osmium_block")
                .unlockedBy("has_osmium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_osmium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_INGOT.get()))
                .unlockedBy("has_osmium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_NUGGET.get()))
                .save(consumer, toRL("storage_block/osmium_block"));

        ShapedRecipeBuilder.shaped(Registration.BISMUTH_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_BISMUTH_INGOT)
                .group("bismuth_block")
                .unlockedBy("has_bismuth_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_BLOCK_ITEM.get()))
                .unlockedBy("has_bismuth_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_INGOT.get()))
                .unlockedBy("has_bismuth_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_NUGGET.get()))
                .save(consumer, toRL("storage_block/bismuth_block"));

        ShapedRecipeBuilder.shaped(Registration.ZINC_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_ZINC_INGOT)
                .group("zinc_block")
                .unlockedBy("has_zinc_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_BLOCK_ITEM.get()))
                .unlockedBy("has_zinc_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_INGOT.get()))
                .unlockedBy("has_zinc_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_NUGGET.get()))
                .save(consumer, toRL("storage_block/zinc_block"));

        ShapedRecipeBuilder.shaped(Registration.PLATINUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_PLATINUM_INGOT)
                .group("platinum_blocK")
                .unlockedBy("has_platinum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .unlockedBy("has_platinum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, toRL("storage_block/platinum_block"));

        ShapedRecipeBuilder.shaped(Registration.IRIDIUM_BLOCK_ITEM.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Registration.TAGS_IRIDIUM_INGOT)
                .group("iridium_block")
                .unlockedBy("has_iridium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_iridium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_INGOT.get()))
                .unlockedBy("has_iridium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_NUGGET.get()))
                .save(consumer, toRL("storage_block/iridium_block"));

        //Nuggets From Ingots/Dust
        ShapelessRecipeBuilder.shapeless(Registration.COAL_NUGGET.get(), 9)
                .requires(Items.COAL)
                .group("coal_nugget")
                .unlockedBy("has_coal", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .unlockedBy("has_coal_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COAL_NUGGET.get()))
                .save(consumer, toRL("nuggets/coal_nuggets" + "_from_coal"));

        ShapelessRecipeBuilder.shapeless(Registration.COPPER_NUGGET.get(), 9)
                .requires(Tags.Items.INGOTS_COPPER)
                .group("copper_nugget")
                .unlockedBy("has_copper_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COPPER_INGOT))
                .unlockedBy("has_copper_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.COPPER_NUGGET.get()))
                .save(consumer, toRL("nuggets/copper_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.REDSTONE_NUGGET.get(), 9)
                .requires(Tags.Items.DUSTS_REDSTONE)
                .group("redstone_nugget")
                .unlockedBy("has_redstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
                .unlockedBy("has_redstone_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.REDSTONE_NUGGET.get()))
                .save(consumer, toRL("nuggets/redstone_nuggets" + "_from_redstone"));

        ShapelessRecipeBuilder.shapeless(Registration.GLOWSTONE_NUGGET.get(), 9)
                .requires(Tags.Items.DUSTS_GLOWSTONE)
                .group("glowstone_nugget")
                .unlockedBy("has_glowstone_dust", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLOWSTONE_DUST))
                .unlockedBy("has_glowstone_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GLOWSTONE_NUGGET.get()))
                .save(consumer, toRL("nuggets/glowstone_nuggets" + "_from_glowstone_dust"));

        ShapelessRecipeBuilder.shapeless(Registration.QUARTZ_NUGGET.get(), 9)
                .requires(Tags.Items.GEMS_QUARTZ)
                .group("quartz_nugget")
                .unlockedBy("has_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(Items.QUARTZ))
                .unlockedBy("has_quartz_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.QUARTZ_NUGGET.get()))
                .save(consumer, toRL("nuggets/quartz_nuggets" + "_from_quartz"));

        ShapedRecipeBuilder.shaped(Registration.LAPIS_NUGGET.get(), 18)
                .pattern(" #")
                .pattern("# ")
                .define('#', (Tags.Items.GEMS_LAPIS))
                .group("lapis_nugget")
                .unlockedBy("has_lapis_lazuli", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LAPIS_LAZULI))
                .unlockedBy("has_lapis_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAPIS_NUGGET.get()))
                .save(consumer, toRL("nuggets/lapis_nuggets" + "_from_lapis"));

        ShapelessRecipeBuilder.shapeless(Registration.DIAMOND_NUGGET.get(), 9)
                .requires(Tags.Items.GEMS_DIAMOND)
                .group("diamond_nugget")
                .unlockedBy("has_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .unlockedBy("has_diamond_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.DIAMOND_NUGGET.get()))
                .save(consumer, toRL("nuggets/diamond_nuggets" + "_from_diamond"));

        ShapelessRecipeBuilder.shapeless(Registration.EMERALD_NUGGET.get(), 9)
                .requires(Tags.Items.GEMS_EMERALD)
                .group("emerald_nugget")
                .unlockedBy("has_emerald", InventoryChangeTrigger.TriggerInstance.hasItems(Items.EMERALD))
                .unlockedBy("has_emerald_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EMERALD_NUGGET.get()))
                .save(consumer, toRL("nuggets/emerald_nuggets" + "_from_emerald"));

        ShapelessRecipeBuilder.shapeless(Registration.NETHERITE_NUGGET.get(), 9)
                .requires(Tags.Items.INGOTS_NETHERITE)
                .group("netherite_nugget")
                .unlockedBy("has_netherite_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERITE_INGOT))
                .unlockedBy("has_netherite_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NETHERITE_NUGGET.get()))
                .save(consumer, toRL("nuggets/netherite_nuggets" + "_from_ingot"));

        //Elements Nuggets from Items/Blocks
        ShapelessRecipeBuilder.shapeless(Registration.ICE_NUGGET.get(), 9)
                .requires(Items.ICE)
                .group("ice_nugget")
                .unlockedBy("has_ice_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ICE_NUGGET.get()))
                .unlockedBy("has_ice", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ICE))
                .save(consumer, toRL("nuggets/ice_nuggets" + "_from_ice"));

        ShapelessRecipeBuilder.shapeless(Registration.FIRE_NUGGET.get(), 9)
                .requires(Items.MAGMA_BLOCK)
                .group("fire_nugget")
                .unlockedBy("has_fire_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FIRE_NUGGET.get()))
                .unlockedBy("has_magma_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.MAGMA_BLOCK))
                .save(consumer, toRL("nuggets/fire_nuggets" + "_from_magma"));

//        ShapelessRecipeBuilder.shapeless(Registration.WOODEN_NUGGET.get(), 4)
//                .requires(ItemTags.LOGS)
//                .group("wooden_nugget")
//                .unlockedBy("has_wooden_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.WOODEN_NUGGET.get()))
//                .unlockedBy("has_acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG))
//                .unlockedBy("has_birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG))
//                .unlockedBy("has_dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG))
//                .unlockedBy("has_jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG))
//                .unlockedBy("has_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG))
//                .unlockedBy("has_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG))
//                .save(consumer, toRL("nuggets/wooden_nuggets" + "_from_logs"));

        //Metal Nuggets from Ingots
        ShapelessRecipeBuilder.shapeless(Registration.NICKEL_NUGGET.get(), 9)
                .requires(Registration.TAGS_NICKEL_INGOT)
                .group("nickel_nugget")
                .unlockedBy("has_nickel_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_BLOCK_ITEM.get()))
                .unlockedBy("has_nickel_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_INGOT.get()))
                .unlockedBy("has_nickel_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_NUGGET.get()))
                .save(consumer, toRL("nuggets/nickel_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.SILVER_NUGGET.get(), 9)
                .requires(Registration.TAGS_SILVER_INGOT)
                .group("silver_nugget")
                .unlockedBy("has_silver_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_BLOCK_ITEM.get()))
                .unlockedBy("has_silver_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_INGOT.get()))
                .unlockedBy("has_silver_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_NUGGET.get()))
                .save(consumer, toRL("nuggets/silver_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.URANIUM_NUGGET.get(), 9)
                .requires(Registration.TAGS_URANIUM_INGOT)
                .group("uranium_nugget")
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_uranium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_INGOT.get()))
                .unlockedBy("has_uranium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_NUGGET.get()))
                .save(consumer, toRL("nuggets/uranium_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.LEAD_NUGGET.get(), 9)
                .requires(Registration.TAGS_LEAD_INGOT)
                .group("lead_nugget")
                .unlockedBy("has_lead_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_BLOCK_ITEM.get()))
                .unlockedBy("has_lead_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_INGOT.get()))
                .unlockedBy("has_lead_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_NUGGET.get()))
                .save(consumer, toRL("nuggets/lead_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.ALUMINUM_NUGGET.get(), 9)
                .requires(Registration.TAGS_ALUMINUM_INGOT)
                .group("aluminum_nugget")
                .unlockedBy("has_aluminum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_aluminum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_INGOT.get()))
                .unlockedBy("has_aluminum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_NUGGET.get()))
                .save(consumer, toRL("nuggets/aluminum_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.TIN_NUGGET.get(), 9)
                .requires(Registration.TAGS_TIN_INGOT)
                .group("tin_nugget")
                .unlockedBy("has_tin_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_BLOCK_ITEM.get()))
                .unlockedBy("has_tin_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_INGOT.get()))
                .unlockedBy("has_tin_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_NUGGET.get()))
                .save(consumer, toRL("nuggets/tin_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.OSMIUM_NUGGET.get(), 9)
                .requires(Registration.TAGS_OSMIUM_INGOT)
                .group("osmium_nugget")
                .unlockedBy("has_osmium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_osmium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_INGOT.get()))
                .unlockedBy("has_osmium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_NUGGET.get()))
                .save(consumer, toRL("nuggets/osmium_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.BISMUTH_NUGGET.get(), 9)
                .requires(Registration.TAGS_BISMUTH_INGOT)
                .group("bismuth_nugget")
                .unlockedBy("has_bismuth_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_BLOCK_ITEM.get()))
                .unlockedBy("has_bismuth_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_INGOT.get()))
                .unlockedBy("has_bismuth_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_NUGGET.get()))
                .save(consumer, toRL("nuggets/bismuth_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.ZINC_NUGGET.get(), 9)
                .requires(Registration.TAGS_ZINC_INGOT)
                .group("zinc_nugget")
                .unlockedBy("has_zinc_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_BLOCK_ITEM.get()))
                .unlockedBy("has_zinc_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_INGOT.get()))
                .unlockedBy("has_zinc_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_NUGGET.get()))
                .save(consumer, toRL("nuggets/zinc_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.PLATINUM_NUGGET.get(), 9)
                .requires(Registration.TAGS_PLATINUM_INGOT)
                .group("platinum_nugget")
                .unlockedBy("has_platinum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .unlockedBy("has_platinum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, toRL("nuggets/platinum_nuggets" + "_from_ingot"));

        ShapelessRecipeBuilder.shapeless(Registration.IRIDIUM_NUGGET.get(), 9)
                .requires(Registration.TAGS_IRIDIUM_INGOT)
                .group("iridium_nugget")
                .unlockedBy("has_iridium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_iridium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_INGOT.get()))
                .unlockedBy("has_iridium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_NUGGET.get()))
                .save(consumer, toRL("nuggets/iridium_nuggets" + "_from_ingot"));

        //Metal Ingots from Storage Blocks
        ShapelessRecipeBuilder.shapeless(Registration.NICKEL_INGOT.get(), 9)
                .requires(Registration.TAGS_NICKEL_BLOCK_ITEM)
                .group("nickel_ingot")
                .unlockedBy("has_nickel_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_BLOCK_ITEM.get()))
                .unlockedBy("has_nickel_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_INGOT.get()))
                .unlockedBy("has_nickel_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NICKEL_NUGGET.get()))
                .save(consumer, toRL("ingots/nickel_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.SILVER_INGOT.get(), 9)
                .requires(Registration.TAGS_SILVER_BLOCK_ITEM)
                .group("silver_ingot")
                .unlockedBy("has_silver_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_BLOCK_ITEM.get()))
                .unlockedBy("has_silver_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_INGOT.get()))
                .unlockedBy("has_silver_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SILVER_NUGGET.get()))
                .save(consumer, toRL("ingots/silver_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.URANIUM_INGOT.get(), 9)
                .requires(Registration.TAGS_URANIUM_BLOCK_ITEM)
                .group("uranium_ingot")
                .unlockedBy("has_uranium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_uranium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_INGOT.get()))
                .unlockedBy("has_uranium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.URANIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/uranium_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.LEAD_INGOT.get(), 9)
                .requires(Registration.TAGS_LEAD_BLOCK_ITEM)
                .group("lead_ingot")
                .unlockedBy("has_lead_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_BLOCK_ITEM.get()))
                .unlockedBy("has_lead_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_INGOT.get()))
                .unlockedBy("has_lead_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LEAD_NUGGET.get()))
                .save(consumer, toRL("ingots/lead_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.ALUMINUM_INGOT.get(), 9)
                .requires(Registration.TAGS_ALUMINUM_BLOCK_ITEM)
                .group("aluminum_ingot")
                .unlockedBy("has_aluminum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_aluminum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_INGOT.get()))
                .unlockedBy("has_aluminum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ALUMINUM_NUGGET.get()))
                .save(consumer, toRL("ingots/aluminum_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.TIN_INGOT.get(), 9)
                .requires(Registration.TAGS_TIN_BLOCK_ITEM)
                .group("tin_ingot")
                .unlockedBy("has_tin_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_BLOCK_ITEM.get()))
                .unlockedBy("has_tin_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_INGOT.get()))
                .unlockedBy("has_tin_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_NUGGET.get()))
                .save(consumer, toRL("ingots/tin_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.OSMIUM_INGOT.get(), 9)
                .requires(Registration.TAGS_OSMIUM_BLOCK_ITEM)
                .group("osmium_ingot")
                .unlockedBy("has_osmium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_osmium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_INGOT.get()))
                .unlockedBy("has_osmium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.OSMIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/osmium_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.BISMUTH_INGOT.get(), 9)
                .requires(Registration.TAGS_BISMUTH_BLOCK_ITEM)
                .group("bismuth_ingot")
                .unlockedBy("has_bismuth_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_BLOCK_ITEM.get()))
                .unlockedBy("has_bismuth_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_INGOT.get()))
                .unlockedBy("has_bismuth_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BISMUTH_NUGGET.get()))
                .save(consumer, toRL("ingots/bismuth_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.ZINC_INGOT.get(), 9)
                .requires(Registration.TAGS_ZINC_BLOCK_ITEM)
                .group("zinc_ingot")
                .unlockedBy("has_zinc_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_BLOCK_ITEM.get()))
                .unlockedBy("has_zinc_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_INGOT.get()))
                .unlockedBy("has_zinc_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.ZINC_NUGGET.get()))
                .save(consumer, toRL("ingots/zinc_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.PLATINUM_INGOT.get(), 9)
                .requires(Registration.TAGS_PLATINUM_BLOCK_ITEM)
                .group("platinum_ingot")
                .unlockedBy("has_platinum_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_BLOCK_ITEM.get()))
                .unlockedBy("has_platinum_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_INGOT.get()))
                .unlockedBy("has_platinum_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PLATINUM_NUGGET.get()))
                .save(consumer, toRL("ingots/platinum_ingot" + "_from_storage_blocks"));

        ShapelessRecipeBuilder.shapeless(Registration.IRIDIUM_INGOT.get(), 9)
                .requires(Registration.TAGS_IRIDIUM_BLOCK_ITEM)
                .group("iridium_ingot")
                .unlockedBy("has_iridium_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_BLOCK_ITEM.get()))
                .unlockedBy("has_iridium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_INGOT.get()))
                .unlockedBy("has_iridium_nugget", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.IRIDIUM_NUGGET.get()))
                .save(consumer, toRL("ingots/iridium_ingot" + "_from_storage_blocks"));

        //Traps
        ShapedRecipeBuilder.shaped(Registration.IRON_TRAP.get())
                .pattern("S S")
                .pattern("IBI")
                .pattern("III")
                .define('S', Items.IRON_SWORD)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('B', Tags.Items.STORAGE_BLOCKS_IRON)
                .group("iron_trap")
                .unlockedBy("has_iron_sword", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_SWORD))
                .unlockedBy("has_iron_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_INGOT))
                .unlockedBy("has_iron_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_BLOCK))
                .save(consumer, toRL("traps/iron_trap"));

        ShapedRecipeBuilder.shaped(Registration.GOLDEN_TRAP.get())
                .pattern("S S")
                .pattern("IBI")
                .pattern("III")
                .define('S', Items.GOLDEN_SWORD)
                .define('I', Tags.Items.INGOTS_GOLD)
                .define('B', Tags.Items.STORAGE_BLOCKS_GOLD)
                .group("golden_trap")
                .unlockedBy("has_gold_sword", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLDEN_SWORD))
                .unlockedBy("has_gold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLD_INGOT))
                .unlockedBy("has_gold_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLD_BLOCK))
                .save(consumer, toRL("traps/golden_trap"));

        ShapedRecipeBuilder.shaped(Registration.DIAMOND_TRAP.get())
                .pattern("S S")
                .pattern("IBI")
                .pattern("III")
                .define('S', Items.DIAMOND_SWORD)
                .define('I', Tags.Items.GEMS_DIAMOND)
                .define('B', Tags.Items.STORAGE_BLOCKS_DIAMOND)
                .group("diamond_trap")
                .unlockedBy("has_diamond_sword", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND_SWORD))
                .unlockedBy("has_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND))
                .unlockedBy("has_diamond_block", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND_BLOCK))
                .save(consumer, toRL("traps/diamond_trap"));

        ShapedRecipeBuilder.shaped(Registration.WITHER_TRAP.get())
                .pattern("S S")
                .pattern("IBI")
                .pattern("III")
                .define('S', Items.DIAMOND_SWORD)
                .define('I', Registration.TAGS_SUPER_OBSIDIAN_ITEM)
                .define('B', Items.NETHER_STAR)
                .group("wither_trap")
                .unlockedBy("has_diamond_sword", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_SWORD))
                .unlockedBy("has_super_obsidian", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SUPER_OBSIDIAN_ITEM.get()))
                .unlockedBy("has_super_obsidian_bar", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.SUPER_OBSIDIAN_BARS_ITEM.get()))
                .unlockedBy("has_nether_star", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHER_STAR))
                .save(consumer, toRL("traps/wither_trap"));

        //Helmets
        ShapelessRecipeBuilder.shapeless(Registration.CL_HELMET.get(), 1)
                .requires(Items.LEATHER_HELMET)
                .group("cl_helmet")
                .unlockedBy("has_leather_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.LEATHER_HELMET))
                .save(consumer, toRL("clear_helmets/clear_leather_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CC_HELMET.get(), 1)
                .requires(Items.CHAINMAIL_HELMET)
                .group("cc_helmet")
                .unlockedBy("has_chainmail_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CHAINMAIL_HELMET))
                .save(consumer, toRL("clear_helmets/clear_chainmail_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CI_HELMET.get(), 1)
                .requires(Items.IRON_HELMET)
                .group("ci_helmet")
                .unlockedBy("has_iron_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_HELMET))
                .save(consumer, toRL("clear_helmets/clear_iron_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CG_HELMET.get(), 1)
                .requires(Items.GOLDEN_HELMET)
                .group("cg_helmet")
                .unlockedBy("has_golden_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GOLDEN_HELMET))
                .save(consumer, toRL("clear_helmets/clear_golden_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CD_HELMET.get(), 1)
                .requires(Items.DIAMOND_HELMET)
                .group("cd_helmet")
                .unlockedBy("has_diamond_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIAMOND_HELMET))
                .save(consumer, toRL("clear_helmets/clear_diamond_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CN_HELMET.get(), 1)
                .requires(Items.NETHERITE_HELMET)
                .group("cn_helmet")
                .unlockedBy("has_netherite_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERITE_HELMET))
                .save(consumer, toRL("clear_helmets/clear_netherite_helmet"));

        ShapelessRecipeBuilder.shapeless(Registration.CT_HELMET.get(), 1)
                .requires(Items.TURTLE_HELMET)
                .group("ct_helmet")
                .unlockedBy("has_turtle_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(Items.TURTLE_HELMET))
                .save(consumer, toRL("clear_helmets/clear_turtle_helmet"));

        //Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.BOWL_OF_RAW_LAVA.get()),
                        Registration.BOWL_OF_LAVA.get(), 1.0f, 200)
                .group("bowl_of_lava")
                .unlockedBy("has_bowl_of_raw_lava", has(Registration.BOWL_OF_RAW_LAVA.get()))
                .save(consumer, toRL("nnow_items/bowl_of_lava" + "_from_smelting"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.BITO_EGG.get()),
                        Items.VILLAGER_SPAWN_EGG, 1.0f, 3200)
                .group("villager_spawn_egg")
                .unlockedBy("has_bun_in_the_oven", has(Registration.BOWL_OF_RAW_LAVA.get()))
                .save(consumer, toRL("nnow_items/villager_spawn_egg" + "_from_smelting"));

        //Smiting //
        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.DIAMOND_SHEAR.get()),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),Registration.NETHERITE_SHEAR.get())
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(consumer, toRL("shears/netherite_shear" + "_from_smiting"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.DIAMOND_POKING_STICK.get()),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),Registration.NETHERITE_POKING_STICK.get())
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(consumer, toRL("poking_stick/netherite_poking_stick" + "_from_smiting"));

        UpgradeRecipeBuilder.smithing(Ingredient.of(Registration.CD_HELMET.get()),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),Registration.CN_HELMET.get())
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(consumer, toRL("clear_helmets/clear_netherite_helmet" + "_from_smiting"));

    }

    private ResourceLocation toRL(String pPath)
    {
        return new ResourceLocation(NNOW.MODID, pPath);
    }

}
