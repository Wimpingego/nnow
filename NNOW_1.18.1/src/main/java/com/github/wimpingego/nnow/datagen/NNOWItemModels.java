package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class NNOWItemModels extends ItemModelProvider {

    public NNOWItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, NNOW.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.NICKEL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/nickel_block"));
        withExistingParent(Registration.SILVER_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/silver_block"));
        withExistingParent(Registration.URANIUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/uranium_block"));
        withExistingParent(Registration.LEAD_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/lead_block"));
        withExistingParent(Registration.ALUMINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/aluminum_block"));
        withExistingParent(Registration.TIN_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/tin_block"));
        withExistingParent(Registration.OSMIUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/osmium_block"));
        withExistingParent(Registration.BISMUTH_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/bismuth_block"));
        withExistingParent(Registration.ZINC_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/zinc_block"));
        withExistingParent(Registration.PLATINUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/platinum_block"));
        withExistingParent(Registration.IRIDIUM_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/iridium_block"));

        withExistingParent(Registration.AGG_BLOCK_ITEM.get().getRegistryName().getPath(),("block/gravel"));
        withExistingParent(Registration.AGS_BLOCK_ITEM.get().getRegistryName().getPath(),("block/sand"));
        withExistingParent(Registration.AGRS_BLOCK_ITEM.get().getRegistryName().getPath(),("block/red_sand"));
        withExistingParent(Registration.DARK_GLASS_ITEM.get().getRegistryName().getPath(),modLoc("block/dark_glass"));
        withExistingParent(Registration.SUPER_OBSIDIAN_ITEM.get().getRegistryName().getPath(),modLoc("block/super_obsidian"));
        withExistingParent(Registration.SUPER_OBSIDIAN_BARS_ITEM.get().getRegistryName().getPath(),modLoc("block/super_obsidian_bars"));
        withExistingParent(Registration.HYDROTANK_ITEM.get().getRegistryName().getPath(),modLoc("block/hydrotank"));
        withExistingParent(Registration.HYDROTANK_LIGHT_ITEM.get().getRegistryName().getPath(),modLoc("block/hydrotank"));
        withExistingParent(Registration.COBBLEGEN_ITEM.get().getRegistryName().getPath(),modLoc("block/cobblegen"));
        withExistingParent(Registration.WATERWELL_ITEM.get().getRegistryName().getPath(),modLoc("block/waterwell"));
        withExistingParent(Registration.LAVAWELL_ITEM.get().getRegistryName().getPath(),modLoc("block/lavawell"));

        withExistingParent(Registration.GRAVEL_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/gravel_slab"));
        withExistingParent(Registration.SAND_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/sand_slab"));
        withExistingParent(Registration.REDSAND_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/redsand_slab"));
        withExistingParent(Registration.COARSE_DIRT_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/coarse_dirt_slab"));
        withExistingParent(Registration.DIRT_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/dirt_slab"));
        withExistingParent(Registration.CRACKED_STONE_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/cracked_stone_bricks_slab"));
        withExistingParent(Registration.BOOKSHELF_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/bookshelf_slab"));

        withExistingParent(Registration.GRAVEL_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/gravel_stairs"));
        withExistingParent(Registration.SAND_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/sand_stairs"));
        withExistingParent(Registration.REDSAND_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/redsand_stairs"));
        withExistingParent(Registration.COARSE_DIRT_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/coarse_dirt_stairs"));
        withExistingParent(Registration.DIRT_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/dirt_stairs"));
        withExistingParent(Registration.CRACKED_STONE_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/cracked_stone_bricks_stairs"));
        withExistingParent(Registration.BOOKSHELF_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/bookshelf_stairs"));

        withExistingParent(Registration.GRASS_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/grass_slab"));
        withExistingParent(Registration.OAK_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/oak_leaves_slab"));
        withExistingParent(Registration.DARK_OAK_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/dark_oak_leaves_slab"));
        withExistingParent(Registration.JUNGLE_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/jungle_leaves_slab"));
        withExistingParent(Registration.ACACIA_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/acacia_leaves_slab"));
        withExistingParent(Registration.SPRUCE_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/spruce_leaves_slab"));
        withExistingParent(Registration.BIRCH_LEAVES_SLAB_ITEM.get().getRegistryName().getPath(),modLoc("block/birch_leaves_slab"));

        withExistingParent(Registration.OAK_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/oak_leaves_stairs"));
        withExistingParent(Registration.DARK_OAK_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/dark_oak_leaves_stairs"));
        withExistingParent(Registration.JUNGLE_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/jungle_leaves_stairs"));
        withExistingParent(Registration.ACACIA_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/acacia_leaves_stairs"));
        withExistingParent(Registration.SPRUCE_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/spruce_leaves_stairs"));
        withExistingParent(Registration.BIRCH_LEAVES_STAIRS_ITEM.get().getRegistryName().getPath(),modLoc("block/birch_leaves_stairs"));

        withExistingParent(Registration.IRON_TRAP_ITEM.get().getRegistryName().getPath(),modLoc("block/iron_trap"));
        withExistingParent(Registration.GOLDEN_TRAP_ITEM.get().getRegistryName().getPath(),modLoc("block/golden_trap"));
        withExistingParent(Registration.DIAMOND_TRAP_ITEM.get().getRegistryName().getPath(),modLoc("block/diamond_trap"));
        withExistingParent(Registration.WITHER_TRAP_ITEM.get().getRegistryName().getPath(),modLoc("block/wither_trap"));

        //Items
        singleTexture(Registration.ENDER_BAG.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ender_bag"));

        singleTexture(Registration.BITO_EGG.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/bun_in_the_oven"));

        singleTexture(Registration.MAGNET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magnet"));

        singleTexture(Registration.BUNDLE_LEAVES.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/bundle_of_leaves"));

        singleTexture(Registration.LEAF_ROPE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/leaf_hemp_rope"));

        singleTexture(Registration.VIAGRA.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/viagra"));

        singleTexture(Registration.VIAGRA_ULTRA.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/viagra_ultra"));

        //Bowls
        singleTexture(Registration. BOWL_OF_WATER.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/bowl_of_water"));
        singleTexture(Registration. STONE_LINED_BOWL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/stone_lined_bowl"));
        singleTexture(Registration. BOWL_OF_RAW_LAVA.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/bowl_of_raw_lava"));
        singleTexture(Registration. BOWL_OF_LAVA.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/bowl_of_lava"));

        //Shears
        singleTexture(Registration. WOODEN_SHEAR.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/shears/wooden_shears"));
        singleTexture(Registration. GOLDEN_SHEAR.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/shears/golden_shears"));
        singleTexture(Registration. DIAMOND_SHEAR.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/shears/diamond_shears"));
        singleTexture(Registration. NETHERITE_SHEAR.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/shears/netherite_shears"));
        //Armour
        singleTexture(Registration. CL_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_leather_helmet"));
        singleTexture(Registration. CC_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_chain_helmet"));
        singleTexture(Registration. CI_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_iron_helmet"));
        singleTexture(Registration. CG_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_golden_helmet"));
        singleTexture(Registration. CD_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_diamond_helmet"));
        singleTexture(Registration. CN_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_netherite_helmet"));
        singleTexture(Registration. CT_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/armour/clear_turtle_helmet"));
        //Nuggets
        singleTexture(Registration.COAL_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/coal_nugget"));
        singleTexture(Registration.COPPER_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/copper_nugget"));
        singleTexture(Registration.REDSTONE_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/redstone_nugget"));
        singleTexture(Registration.GLOWSTONE_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/glowstone_nugget"));
        singleTexture(Registration.QUARTZ_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/quartz_nugget"));
        singleTexture(Registration.DIAMOND_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/diamond_nugget"));
        singleTexture(Registration.EMERALD_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/emerald_nugget"));
        singleTexture(Registration.LAPIS_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/lapis_nugget"));
        singleTexture(Registration.NETHERITE_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/netherite_nugget"));
        //Elements Nuggets
        singleTexture(Registration.ICE_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/ice_nugget"));
        singleTexture(Registration.FIRE_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/fire_nugget"));
        singleTexture(Registration.WOODEN_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/wooden_nugget"));
        //Metal Nuggets
        singleTexture(Registration.NICKEL_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/nickel_nugget"));
        singleTexture(Registration.SILVER_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/silver_nugget"));
        singleTexture(Registration.URANIUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/uranium_nugget"));
        singleTexture(Registration.LEAD_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/lead_nugget"));
        singleTexture(Registration.ALUMINUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/aluminum_nugget"));
        singleTexture(Registration.TIN_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/tin_nugget"));
        singleTexture(Registration.OSMIUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/osmium_nugget"));
        singleTexture(Registration.BISMUTH_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/bismuth_nugget"));
        singleTexture(Registration.ZINC_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/zinc_nugget"));
        singleTexture(Registration.PLATINUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/platinum_nugget"));
        singleTexture(Registration.IRIDIUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nuggets/iridium_nugget"));
        //Metal Ingots
        singleTexture(Registration.NICKEL_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/nickel_ingot"));
        singleTexture(Registration.SILVER_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/silver_ingot"));
        singleTexture(Registration.URANIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/uranium_ingot"));
        singleTexture(Registration.LEAD_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/lead_ingot"));
        singleTexture(Registration.ALUMINUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/aluminum_ingot"));
        singleTexture(Registration.TIN_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/tin_ingot"));
        singleTexture(Registration.OSMIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/osmium_ingot"));
        singleTexture(Registration.BISMUTH_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/bismuth_ingot"));
        singleTexture(Registration.ZINC_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/zinc_ingot"));
        singleTexture(Registration.PLATINUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/platinum_ingot"));
        singleTexture(Registration.IRIDIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/ingots/iridium_ingot"));

        //Base Berries
        singleTexture(Registration.STONE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/stone_berry"));
        singleTexture(Registration.GRAVEL_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/gravel_berry"));
        singleTexture(Registration.SAND_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/sand_berry"));
        singleTexture(Registration.DIRT_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/dirt_berry"));
        singleTexture(Registration.CLAY_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/clay_berry"));
        singleTexture(Registration.WOODEN_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/wooden_berry"));
        //Ore Berries
        singleTexture(Registration.XP_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/xp_berry"));
        singleTexture(Registration.IRON_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/iron_berry"));
        singleTexture(Registration.COPPER_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/copper_berry"));
        singleTexture(Registration.GOLD_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/gold_berry"));
        singleTexture(Registration.COAL_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/coal_berry"));
        singleTexture(Registration.REDSTONE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/redstone_berry"));
        singleTexture(Registration.GLOWSTONE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/glowstone_berry"));
        singleTexture(Registration.QUARTZ_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/quartz_berry"));
        singleTexture(Registration.DIAMOND_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/diamond_berry"));
        singleTexture(Registration.EMERALD_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/emerald_berry"));
        singleTexture(Registration.LAPIS_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/lapis_berry"));
        singleTexture(Registration.NETHERITE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/netherite_berry"));
        //Elements Berries
        singleTexture(Registration.ICE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/ice_berry"));
        singleTexture(Registration.FIRE_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/fire_berry"));
        //Metal Berries
        singleTexture(Registration.NICKEL_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/nickel_berry"));
        singleTexture(Registration.SILVER_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/silver_berry"));
        singleTexture(Registration.URANIUM_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/uranium_berry"));
        singleTexture(Registration.LEAD_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/lead_berry"));
        singleTexture(Registration.ALUMINUM_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/aluminum_berry"));
        singleTexture(Registration.TIN_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/tin_berry"));
        singleTexture(Registration.OSMIUM_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/osmium_berry"));
        singleTexture(Registration.BISMUTH_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/bismuth_berry"));
        singleTexture(Registration.ZINC_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/zinc_berry"));
        singleTexture(Registration.PLATINUM_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/platinum_berry"));
        singleTexture(Registration.IRIDIUM_BERRY.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/berries/iridium_berry"));

        //Poking Sticks
        singleTexture(Registration.POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/base"));
        singleTexture(Registration.STONE_POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/stone"));
        singleTexture(Registration.IRON_POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/iron"));
        singleTexture(Registration.GOLD_POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/gold"));
        singleTexture(Registration.DIAMOND_POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/diamond"));
        singleTexture(Registration.NETHERITE_POKING_STICK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/pokingsticks/netherite"));

        //Dusts
        singleTexture(Registration.STONE_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/dusts/stone_dust"));
        singleTexture(Registration.SAND_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/dusts/sand_dust"));
        singleTexture(Registration.DIRT_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/dusts/dirt_dust"));
        singleTexture(Registration.GRAVEL_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/dusts/gravel_dust"));
        singleTexture(Registration.CLAY_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/dusts/clay_dust"));

//        singleTexture(Registration.TEST_BERRY.get().getRegistryName().getPath(),
//                mcLoc("item/generated"),
//                "layer0", modLoc("item/berries/xp_berry"));

//        singleTexture(Registration.TEST_BERRY_BUSH2_ITEM.get().getRegistryName().getPath(),
//                mcLoc("item/generated"),
//                "layer0", modLoc("item/berries/silver_berry"));

    }
}