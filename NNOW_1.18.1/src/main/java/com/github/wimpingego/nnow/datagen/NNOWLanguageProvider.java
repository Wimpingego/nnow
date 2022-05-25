package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.github.wimpingego.nnow.blocks.CobbleGen.MESSAGE_COBBLEGEN_1;
import static com.github.wimpingego.nnow.blocks.HydroTank.*;
import static com.github.wimpingego.nnow.blocks.HydroTank.MESSAGE_MORE_INFO_SHIFT;
import static com.github.wimpingego.nnow.blocks.WaterWell.MESSAGE_WATERWELL_1;
import static com.github.wimpingego.nnow.blocks.LavaWell.MESSAGE_LAVAWELL_1;
import static com.github.wimpingego.nnow.blocks.HydroTankLight.MESSAGE_HYDROTANK_2;
import static com.github.wimpingego.nnow.blocks.DarkGlass.MESSAGE_WITHER_PROOF;
import static com.github.wimpingego.nnow.blocks.traps.DiamondTrap.*;
import static com.github.wimpingego.nnow.blocks.traps.GoldTrap.*;
import static com.github.wimpingego.nnow.blocks.traps.IronTrap.*;
import static com.github.wimpingego.nnow.blocks.traps.WitherTrap.*;
import static com.github.wimpingego.nnow.integration.jei.NNOWJEIPlugin.*;
import static com.github.wimpingego.nnow.items.Magnet.*;
import static com.github.wimpingego.nnow.items.Viagra.*;
import static com.github.wimpingego.nnow.items.Viagra.MESSAGE_MORE_INFO_VIAGRA_1;
import static com.github.wimpingego.nnow.items.Viagra_Ultra.*;
import static com.github.wimpingego.nnow.items.pokingsticks.PS_Base_Info.MESSAGE_POKING_STICK_1;
import static com.github.wimpingego.nnow.items.EnderBag.SCREEN_ENDER_BAG_TITLE;
import static com.github.wimpingego.nnow.setup.ModSetup.TAB_NAME;

public class NNOWLanguageProvider extends LanguageProvider {

    public NNOWLanguageProvider(DataGenerator gen, String locale) {
        super(gen, NNOW.MODID, locale);
    }

    @Override
    protected void addTranslations() {
//Others
        add("itemGroup." + TAB_NAME, "Never Needed Or Wanted");
        add(SCREEN_ENDER_BAG_TITLE , "Ender Chest Bag");
        add(MESSAGE_POKING_STICK_1, "Try poking things with it");
        add(MESSAGE_WITHER_PROOF, "Wither Proof");

        add(MESSAGE_MORE_INFO_SHIFT, "Hold Shift");

        add(MESSAGE_HYDROTANK_1, "An water source for your farmland without the need to have a block under it.");
        add(MESSAGE_HYDROTANK_2, "Same as the Hydro Tank but with a light level of 15");

        add(MESSAGE_COBBLEGEN_1, "A source of endless cobblestone, Right-click on block with mining tool");
        add(MESSAGE_WATERWELL_1, "A source of endless water, Right-click on block with bucket");
        add(MESSAGE_LAVAWELL_1, "A source of endless lava, Right-click on block with bucket");

        add(MESSAGE_IRON_TRAP, "This trap leaves entities at half a heart");
        add(MESSAGE_DEATH_ATTACK_IRON_TRAP, "%1$s wes pierced to death by a Iron trap");

        add(MESSAGE_GOLDEN_TRAP, "This trap kills entities");
        add(MESSAGE_GOLDEN_TRAP_NO_XP, "Will NOT drop Xp");
        add(MESSAGE_GOLDEN_TRAP_NO_PLAYER_DROPS, "Will NOT drop player kill loot");
        add(MESSAGE_GOLDEN_TRAP_DMG, "Damage done by the trap per tick is set to: %s");
        add(MESSAGE_DEATH_ATTACK_GOLDEN_TRAP, "%1$s wes pierced to death by a Golden trap");

        add(MESSAGE_DIAMOND_TRAP, "This trap kills entities");
        add(MESSAGE_DIAMOND_TRAP_XP, "Will drop Xp");
        add(MESSAGE_DIAMOND_TRAP_PLAYER_DROPS, "Will drop player kill loot");
        add(MESSAGE_DIAMOND_TRAP_DMG, "Damage done by the trap per tick is set to: %s");
        add(MESSAGE_DEATH_ATTACK_DIAMOND_TRAP, "%1$s wes pierced to death by a Diamond trap");
        add(MESSAGE_DEATH_ATTACK_DIAMOND_TRAP_PLAYER, "%1$s wes pierced to death by a Diamond trap");

        add(MESSAGE_WITHER_TRAP, "This trap kills entities");
        add(MESSAGE_WITHER_TRAP_XP, "Will drop Xp");
        add(MESSAGE_WITHER_TRAP_PLAYER_DROPS, "Will drop player kill loot");
        add(MESSAGE_WITHER_TRAP_DMG, "Damage done by the trap per tick is set to: %s");
        add(MESSAGE_DEATH_ATTACK_WITHER_TRAP, "%1$s wes pierced to death by a Wither trap");
        add(MESSAGE_DEATH_ATTACK_WITHER_TRAP_PLAYER, "%1$s wes pierced to death by a Wither trap");

        add(MESSAGE_MORE_INFO_MAGNET_1, "Attraction range set to: %s");
        add(MESSAGE_MAGNET_IS, "Magnet is active: %s");

        add(MESSAGE_MORE_INFO_VIAGRA_1, "Effect range is: %s");
        add(MESSAGE_VIAGRA_IS, "Mood Enhancer is active: %s");
        add(MESSAGE_VIAGRA_ULTRA_IS, "Ultra Mood Enhancer is active: %s");

//JEI Info Tab

        add(MESSAGE_INFO_POKING_STICK, "A §3magic stick §0with many uses. Right-clicking on blocks to beat the dust out of it, and mining with it may even give you extra drops. With all the §3magic §0that surrounds the Poking Stick who really knows if there is anything else it can do.");
        add(MESSAGE_INFO_VIAGRA, "This Magical item has the power to §3“enhance” §0the §3“mood” §0of most crops within its range, Rumour has it that villager scientists have even found a way to make an ever lasting version.");
        add(MESSAGE_INFO_VIAGRA_ULTRA, "Well they did it, The villager scientists after years of trying have made the §2Ultra Mood Enhancer §0the ever lasting & better version of the §3Derpy Mood Enhancer §0.");

//Items
        add(Registration.ENDER_BAG.get(), "Ender Chest Bag");
        add(Registration.BITO_EGG.get(),"Bun In The Oven");
        add(Registration.MAGNET.get(), "Derpy Magnet");
        add(Registration.VIAGRA.get(), "§3Derpy Mood Enhancer");
        add(Registration.VIAGRA_ULTRA.get(), "§2Ultra Mood Enhancer");
        add(Registration.POKING_STICK.get(), "Poking Stick");
        add(Registration.STONE_POKING_STICK.get(), "Stone Poking Stick");
        add(Registration.IRON_POKING_STICK.get(), "Iron Poking Stick");
        add(Registration.GOLD_POKING_STICK.get(), "Gold Poking Stick");
        add(Registration.DIAMOND_POKING_STICK.get(), "Diamond Poking Stick");
        add(Registration.NETHERITE_POKING_STICK.get(), "Netherite Poking Stick");

        add(Registration.BUNDLE_LEAVES.get(), "Bundle Of Leaves");
        add(Registration.LEAF_ROPE.get(), "Leaf Hemp Rope");
        add(Registration.BOWL_OF_WATER.get(), "Bowl of Water");
        add(Registration.STONE_LINED_BOWL.get(), "Stone lined Bowl");
        add(Registration.BOWL_OF_RAW_LAVA.get(), "Bowl Of Raw Lava");
        add(Registration.BOWL_OF_LAVA.get(), "Bowl of Lava");

        add(Registration.WOODEN_SHEAR.get(), "Wooden Shears");
        add(Registration.GOLDEN_SHEAR.get(), "Golden Shears");
        add(Registration.DIAMOND_SHEAR.get(), "Diamond Shears");
        add(Registration.NETHERITE_SHEAR.get(), "Netherite Shears");

        add(Registration.STONE_DUST.get(), "Stone Dust");
        add(Registration.SAND_DUST.get(), "Sand Dust");
        add(Registration.DIRT_DUST.get(), "Dirt Dust");
        add(Registration.GRAVEL_DUST.get(), "Gravel Dust");
        add(Registration.CLAY_DUST.get(), "Clay Dust");

        add(Registration.COAL_NUGGET.get(), "Coal Nugget");
        add(Registration.COPPER_NUGGET.get(), "Copper Nugget");
        add(Registration.REDSTONE_NUGGET.get(), "Redstone Nugget");
        add(Registration.GLOWSTONE_NUGGET.get(), "Glowstone Nugget");
        add(Registration.QUARTZ_NUGGET.get(), "Quartz Nugget");
        add(Registration.DIAMOND_NUGGET.get(), "Diamond Nugget");
        add(Registration.EMERALD_NUGGET.get(), "Emerald Nugget");
        add(Registration.LAPIS_NUGGET.get(), "Lapis Nugget");
        add(Registration.NETHERITE_NUGGET.get(), "Netherite Nugget");
        add(Registration.ICE_NUGGET.get(), "Ice Nugget");
        add(Registration.FIRE_NUGGET.get(), "Fire Nugget");
        add(Registration.WOODEN_NUGGET.get(), "Wooden Nugget");

        add(Registration.NICKEL_NUGGET.get(), "Nickel Nugget");
        add(Registration.SILVER_NUGGET.get(), "Silver Nugget");
        add(Registration.URANIUM_NUGGET.get(), "Uranium Nugget");
        add(Registration.LEAD_NUGGET.get(), "Lead Nugget");
        add(Registration.ALUMINUM_NUGGET.get(), "Aluminum Nugget");
        add(Registration.TIN_NUGGET.get(), "Tin Nugget");
        add(Registration.OSMIUM_NUGGET.get(), "Osmium Nugget");
        add(Registration.BISMUTH_NUGGET.get(), "Bismuth Nugget");
        add(Registration.ZINC_NUGGET.get(), "Zinc Nugget");
        add(Registration.PLATINUM_NUGGET.get(), "Platinum Nugget");
        add(Registration.IRIDIUM_NUGGET.get(), "Iridium Nugget");

        add(Registration.NICKEL_INGOT.get(), "Nickel Ingot");
        add(Registration.SILVER_INGOT.get(), "Silver Ingot");
        add(Registration.URANIUM_INGOT.get(), "Uranium Ingot");
        add(Registration.LEAD_INGOT.get(), "Lead Ingot");
        add(Registration.ALUMINUM_INGOT.get(), "Aluminum Ingot");
        add(Registration.TIN_INGOT.get(), "Tin Ingot");
        add(Registration.OSMIUM_INGOT.get(), "Osmium Ingot");
        add(Registration.BISMUTH_INGOT.get(), "Bismuth Ingot");
        add(Registration.ZINC_INGOT.get(), "Zinc Ingot");
        add(Registration.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(Registration.IRIDIUM_INGOT.get(), "Iridium Ingot");

        add(Registration.NICKEL_BLOCK.get(), "Nickel Block");
        add(Registration.SILVER_BLOCK.get(), "Silver Block");
        add(Registration.URANIUM_BLOCK.get(), "Uranium Block");
        add(Registration.LEAD_BLOCK.get(), "Lead Block");
        add(Registration.ALUMINUM_BLOCK.get(), "Aluminum Block");
        add(Registration.TIN_BLOCK.get(), "Tin Block");
        add(Registration.OSMIUM_BLOCK.get(), "Osmium Block");
        add(Registration.BISMUTH_BLOCK.get(), "Bismuth Block");
        add(Registration.ZINC_BLOCK.get(), "Zinc Block");
        add(Registration.PLATINUM_BLOCK.get(), "Platinum Block");
        add(Registration.IRIDIUM_BLOCK.get(), "Iridium Block");

        add(Registration.STONE_BERRY.get(), "Stone Berry");
        add(Registration.GRAVEL_BERRY.get(), "Gravel Berry");
        add(Registration.SAND_BERRY.get(), "Sand Berry");
        add(Registration.DIRT_BERRY.get(), "Dirt Berry");
        add(Registration.CLAY_BERRY.get(), "Clay Berry");
        add(Registration.XP_BERRY.get(), "XP Berry");
        add(Registration.IRON_BERRY.get(), "Iron Berry");
        add(Registration.COPPER_BERRY.get(), "Copper Berry");
        add(Registration.GOLD_BERRY.get(), "Gold Berry");
        add(Registration.COAL_BERRY.get(), "Coal Berry");
        add(Registration.REDSTONE_BERRY.get(), "Redstone Berry");
        add(Registration.GLOWSTONE_BERRY.get(), "Glowstone Berry");
        add(Registration.QUARTZ_BERRY.get(), "Quartz Berry");
        add(Registration.DIAMOND_BERRY.get(), "Diamond Berry");
        add(Registration.EMERALD_BERRY.get(), "Emerald Berry");
        add(Registration.LAPIS_BERRY.get(), "Lapis Berry");
        add(Registration.ICE_BERRY.get(), "Ice Berry");
        add(Registration.FIRE_BERRY.get(), "Fire Berry");
        add(Registration.WOODEN_BERRY.get(), "Wooden Berry");
        add(Registration.NETHERITE_BERRY.get(), "Netherite Berry");
        add(Registration.NICKEL_BERRY.get(), "Nickel Berry");
        add(Registration.SILVER_BERRY.get(), "Silver Berry");
        add(Registration.URANIUM_BERRY.get(), "Uranium Berry");
        add(Registration.LEAD_BERRY.get(), "Lead Berry");
        add(Registration.ALUMINUM_BERRY.get(), "Aluminum Berry");
        add(Registration.TIN_BERRY.get(), "Tin Berry");
        add(Registration.OSMIUM_BERRY.get(), "Osmium Berry");
        add(Registration.BISMUTH_BERRY.get(), "Bismuth Berry");
        add(Registration.ZINC_BERRY.get(), "Zinc Berry");
        add(Registration.PLATINUM_BERRY.get(), "Platinum Berry");
        add(Registration.IRIDIUM_BERRY.get(), "Iridium Berry");

        add(Registration.CL_HELMET.get(), "Clear Leather Cap");
        add(Registration.CC_HELMET.get(), "Clear Chainmail Helmet");
        add(Registration.CI_HELMET.get(), "Clear Iron Helmet");
        add(Registration.CD_HELMET.get(), "Clear Diamond Helmet");
        add(Registration.CN_HELMET.get(), "Clear Netherite Helmet");
        add(Registration.CT_HELMET.get(), "Clear Turtle Shell");

//Blocks
        add(Registration.AGG_BLOCK.get(), "Anti Gravity Gravel");
        add(Registration.AGS_BLOCK.get(), "Anti Gravity Sand");
        add(Registration.AGRS_BLOCK.get(), "Anti Gravity Red Sand");
        add(Registration.DARK_GLASS.get(), "Dark Glass");
        add(Registration.SUPER_OBSIDIAN.get(), "Super Obsidian");
        add(Registration.SUPER_OBSIDIAN_BARS.get(), "Super Obsidian Bar");
        add(Registration.COBBLEGEN.get(), "Cobblestone Generator");
        add(Registration.WATERWELL.get(), "Water Well");
        add(Registration.LAVAWELL.get(), "Lava Well");

        add(Registration.HYDROTANK.get(), "Hydro Tank");
        add(Registration.HYDROTANK_LIGHT.get(), "Hydro Tank With Light");

        add(Registration.GRAVEL_SLAB.get(), "Gravel Slab");
        add(Registration.SAND_SLAB.get(), "Sand Slab");
        add(Registration.REDSAND_SLAB.get(), "Red Sand Slab");
        add(Registration.COARSE_DIRT_SLAB.get(), "Coarse Dirt Slab");
        add(Registration.DIRT_SLAB.get(), "Dirt Slab");
        add(Registration.CRACKED_STONE_SLAB.get(), "Cracked Stone Bricks Slab");
        add(Registration.BOOKSHELF_SLAB.get(), "Bookshelf Slab");
        
        add(Registration.GRASS_SLAB.get(), "Grass Slab");
        add(Registration.OAK_LEAVES_SLAB.get(), "Oak Leaves Slab");
        add(Registration.DARK_OAK_LEAVES_SLAB.get(), "Dark Oak Leaves Slab");
        add(Registration.JUNGLE_LEAVES_SLAB.get(), "Jungle Leaves Slab");
        add(Registration.ACACIA_LEAVES_SLAB.get(), "Acacia Leaves Slab");
        add(Registration.SPRUCE_LEAVES_SLAB.get(), "Spruce Leaves Slab");
        add(Registration.BIRCH_LEAVES_SLAB.get(), "Birch Leaves Slab");

        add(Registration.GRAVEL_STAIRS.get(), "Gravel Stairs");
        add(Registration.SAND_STAIRS.get(), "Sand Stairs");
        add(Registration.REDSAND_STAIRS.get(), "Red Sand Stairs");
        add(Registration.COARSE_DIRT_STAIRS.get(), "Coarse Dirt Stairs");
        add(Registration.DIRT_STAIRS.get(), "Dirt Stairs");
        add(Registration.CRACKED_STONE_STAIRS.get(), "Cracked Stone Bricks Stairs");
        add(Registration.BOOKSHELF_STAIRS.get(), "Bookshelf Stairs");

        add(Registration.OAK_LEAVES_STAIRS.get(), "Oak Leaves Stairs");
        add(Registration.DARK_OAK_LEAVES_STAIRS.get(), "Dark Oak Leaves Stairs");
        add(Registration.JUNGLE_LEAVES_STAIRS.get(), "Jungle Leaves Stairs");
        add(Registration.ACACIA_LEAVES_STAIRS.get(), "Acacia Leaves Stairs");
        add(Registration.SPRUCE_LEAVES_STAIRS.get(), "Spruce Leaves Stairs");
        add(Registration.BIRCH_LEAVES_STAIRS.get(), "Birch Leaves Stairs");

        add(Registration.IRON_TRAP.get(), "Iron Trap");
        add(Registration.GOLDEN_TRAP.get(), "Golden Trap");
        add(Registration.DIAMOND_TRAP.get(), "Diamond Trap");
        add(Registration.WITHER_TRAP.get(), "Wither Killer Trap");

        //add(Registration.TEST_BERRY.get(),"Test Berry");

    }
}
