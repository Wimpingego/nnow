package com.github.wimpingego.nnow.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.DoubleValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Configs {

    public static final ForgeConfigSpec ALL;
    public static final Bookshelf BOOKSHELF;
    public static final Viagre VIAGRE;
    public static final Magnet MAGNET;
    public static final Poking_Stick POKING_STICK;
    public static final General GENERAL;
    public static final Traps TRAPS;
    public static final CobbleGens COBBLEGEN;
    public static final Tools TOOLS;
    public static final Berrys BERRYS;
    public static final Shears SHEARS;
    public static final Bowls BOWLS;

    static
    {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        BOOKSHELF = new Bookshelf(builder);
        VIAGRE = new Viagre(builder);
        MAGNET = new Magnet(builder);
        POKING_STICK = new Poking_Stick(builder);
        GENERAL = new General(builder);
        TRAPS = new Traps(builder);
        COBBLEGEN = new CobbleGens(builder);
        TOOLS = new Tools(builder);
        BERRYS = new Berrys(builder);
        SHEARS = new Shears(builder);
        BOWLS = new Bowls(builder);

        ALL = builder.build();
    }

    public static IntValue PICKUP_RANGE;

    public static IntValue VIAGRA_RADIUS;
    public static IntValue VIAGRA_TICK_DELAY;
    public static ConfigValue<Integer> VIAGRA_MAX_USES;
    public static BooleanValue VIAGRA_TAKES_USES;

    public static BooleanValue METALS_ITEMS_LOADED;
    public static BooleanValue LAVA_BLOCK_LOADED;
    public static BooleanValue WATER_BLOCK_LOADED;
    public static BooleanValue COBBLE_GEN_LOADED;

    public static IntValue ENCHANT_POWER_STAIRS;
    public static IntValue ENCHANT_POWER_SLABS;

    public static ConfigValue<Integer> BASE_MAX_USES;
    public static ConfigValue<Integer> STONE_MAX_USES;
    public static ConfigValue<Integer> IRON_MAX_USES;
    public static ConfigValue<Integer> GOLD_MAX_USES;
    public static ConfigValue<Integer> DIAMOND_MAX_USES;
    public static ConfigValue<Integer> NETHERITE_MAX_USES;

    //public static ConfigValue<Integer> DUST_DROP;
    public static ConfigValue<Integer> STONE_DUST_DROP;
    public static ConfigValue<Integer> GRAVEL_DUST_DROP;
    public static ConfigValue<Integer> SAND_DUST_DROP;
    public static ConfigValue<Integer> DIRT_DUST_DROP;
    public static ConfigValue<Integer> CLAY_DUST_DROP;

    public static ConfigValue<Integer> SAPLING_DROP_AMOUNT;
    public static DoubleValue SAPLING_DROP_CHANCE;
    public static ConfigValue<Integer> CACTUS_DROP_AMOUNT;
    public static DoubleValue CACTUS_DROP_CHANCE;
    public static ConfigValue<Integer> SUGAR_CANE_DROP_AMOUNT;
    public static DoubleValue SUGAR_CANE_DROP_CHANCE;

    public static ConfigValue<Integer> XP_POINTS;
    public static ConfigValue<Integer> COAL_NUGGETS;
    public static ConfigValue<Integer> GOLD_NUGGETS;
    public static ConfigValue<Integer> IRON_NUGGETS;
    public static ConfigValue<Integer> LAPIS_NUGGETS;
    public static ConfigValue<Integer> QUARTZ_NUGGETS;
    public static ConfigValue<Integer> REDSTONE_NUGGETS;
    public static ConfigValue<Integer> GLOWSTONE_NUGGETS;
    public static ConfigValue<Integer> DIAMOND_NUGGETS;
    public static ConfigValue<Integer> EMERALD_NUGGETS;
    public static ConfigValue<Integer> NETHERITE_NUGGETS;

    public static ConfigValue<Integer> ICE_NUGGETS;
    public static ConfigValue<Integer> FIRE_NUGGETS;
    public static ConfigValue<Integer> WOODEN_NUGGETS;

    public static ConfigValue<Integer> STONE_DUST;
    public static ConfigValue<Integer> SAND_DUST;
    public static ConfigValue<Integer> CLAY_BALL;
    public static ConfigValue<Integer> DIRT_DUST;
    public static ConfigValue<Integer> GRAVEL_DUST;

    public static ConfigValue<Integer> COPPER_NUGGETS;
    public static ConfigValue<Integer> NICKEL_NUGGETS;
    public static ConfigValue<Integer> SILVER_NUGGETS;
    public static ConfigValue<Integer> URANIUM_NUGGETS;
    public static ConfigValue<Integer> LEAD_NUGGETS;
    public static ConfigValue<Integer> ALUMINUM_NUGGETS;
    public static ConfigValue<Integer> TIN_NUGGETS;
    public static ConfigValue<Integer> OSMIUM_NUGGETS;
    public static ConfigValue<Integer> BISMUTH_NUGGETS;
    public static ConfigValue<Integer> ZINC_NUGGETS;
    public static ConfigValue<Integer> PLATINUM_NUGGETS;
    public static ConfigValue<Integer> IRIDIUM_NUGGETS;

    public static BooleanValue BERRY_DO_DAMAGE;
    public static ConfigValue<Integer> BERRY_DAMAGE;

    public static ConfigValue<Integer> W_COST;
    public static ConfigValue<Integer> W_RETURN;
    public static ConfigValue<Integer> S_COST;
    public static ConfigValue<Integer> S_RETURN;
    public static ConfigValue<Integer> I_COST;
    public static ConfigValue<Integer> I_RETURN;
    public static ConfigValue<Integer> G_COST;
    public static ConfigValue<Integer> G_RETURN;
    public static ConfigValue<Integer> D_COST;
    public static ConfigValue<Integer> D_RETURN;
    public static ConfigValue<Integer> N_COST;
    public static ConfigValue<Integer> N_RETURN;

    public static ConfigValue<Integer> SH_COST;
    public static ConfigValue<Integer> SH_RETURN;
    public static ConfigValue<Integer> IH_COST;
    public static ConfigValue<Integer> IH_RETURN;
    public static ConfigValue<Integer> GH_COST;
    public static ConfigValue<Integer> GH_RETURN;
    public static ConfigValue<Integer> DH_COST;
    public static ConfigValue<Integer> DH_RETURN;
    public static ConfigValue<Integer> NH_COST;
    public static ConfigValue<Integer> NH_RETURN;
    public static ConfigValue<Integer> EH_COST;
    public static ConfigValue<Integer> EH_RETURN;

    //public static BooleanValue GIVEONLOGIN;

    public static DoubleValue STONE_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue IRON_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue GOLDEN_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue DIAMOND_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue NETHERITE_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue EMERALD_TIER_TOOL_SPEED_MODIFIER;

    public static ConfigValue<Integer> STONE_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> IRON_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> GOLDEN_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> DIAMOND_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> NETHERITE_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> EMERALD_TIER_TOOL_DURABILITY_MODIFIER;

    public static ConfigValue<Integer> WOODEN_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> GOLDEN_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> DIAMOND_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> NETHERITE_SHEARS_DURABILITY_MODIFIER;

    public static ConfigValue<Integer> GOLDERN_ATTACK_POWER;
    public static ConfigValue<Integer> DIAMOND_ATTACK_POWER;
    public static ConfigValue<Integer> WITHER_ATTACK_POWER;

    public static ConfigValue<Integer> WATER_BOWL_MAX_USES;
    public static ConfigValue<Integer> LAVA_BOWL_MAX_USES;

    private static class Bookshelf
    {
        Bookshelf(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Booshelf Stairs and Slab").push("Bookshelf");
            ENCHANT_POWER_STAIRS = builder.comment("Enchant power level modifier for the bookshelf stairs block.").defineInRange("Stair Enchant Level", 1, 0,30);
            ENCHANT_POWER_SLABS = builder.comment("Enchant power level modifier for the bookshelf slabs block.").defineInRange("Slab Enchant Level", 0, 0,30);
            builder.pop();
        }
    }

    private static class Viagre
    {
        Viagre(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Viagre item").push("Viagre");
            VIAGRA_MAX_USES = builder.define("VIAGRA durability modifier", 2342);
            VIAGRA_TAKES_USES = builder.define("VIAGRA has a durability cost when in main hand", true);
            VIAGRA_RADIUS = builder.comment("Growth radius size modifier.").defineInRange("Growth Radius", 8, 1,16);
            VIAGRA_TICK_DELAY = builder.comment("Tick Delay modifier. (Lower is faster)").defineInRange("Tick Delay", 5, 1, 20);
            builder.pop();
        }
    }

    private static class Magnet
    {
        Magnet(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Magnet item").push("Magnet");
            PICKUP_RANGE = builder.comment("Magnet max pickup range modifier.").defineInRange("Pickup Range", 8, 1, 16);
            builder.pop();
        }
    }

    private static class Poking_Stick
    {
        Poking_Stick(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Poking Sticks").push("Poking Stick");
            BASE_MAX_USES = builder.define("Base Poking Stick durability  modifier", 59);
            STONE_MAX_USES = builder.define("Stone Poking Stick durability  modifier", 131);
            IRON_MAX_USES = builder.define("Iron Poking Stick durability  modifier", 250);
            GOLD_MAX_USES = builder.define("Gold Poking Stick durability  modifier", 32);
            DIAMOND_MAX_USES = builder.define("Diamond Poking Stick durability  modifier", 1561);
            NETHERITE_MAX_USES = builder.define("Nertherite Poking Stick durability  modifier", 2031);
            STONE_DUST_DROP = builder.define("Stone Dust drop from poking blocks amount modifier", 3);
            GRAVEL_DUST_DROP = builder.define("Gravel Dust drop from poking blocks amount modifier", 3);
            SAND_DUST_DROP = builder.define("Sand Dust drop from poking blocks amount modifier", 3);
            DIRT_DUST_DROP = builder.define("Dirt Dust drop from poking blocks amount modifier", 3);
            CLAY_DUST_DROP = builder.define("Clay Dust drop from poking blocks amount modifier", 3);
            SAPLING_DROP_AMOUNT = builder.define("Sapling drop amount modifier", 2);
            SAPLING_DROP_CHANCE = builder.defineInRange("Sapling drop chance modifier", 0.5, 0.00, 1.0);
            CACTUS_DROP_AMOUNT = builder.define("Cactus drop amount modifier", 1);
            CACTUS_DROP_CHANCE = builder.defineInRange("Cactus drop chance modifier", 0.25, 0.00, 1.0);
            SUGAR_CANE_DROP_AMOUNT = builder.define("Sugar Cane drop amount modifier", 1);
            SUGAR_CANE_DROP_CHANCE = builder.defineInRange("Sugar Cane drop chance modifier", 0.05, 0.00, 1.0);
            builder.pop();
        }
    }

    private static class General
    {
        General(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to general settings").push("General");
            METALS_ITEMS_LOADED = builder.define("Metal blocks, items and berrys are loaded", true);
            LAVA_BLOCK_LOADED = builder.define("Lava Well block is loaded", true);
            WATER_BLOCK_LOADED = builder.define("Water Well block is loaded", true);
            COBBLE_GEN_LOADED = builder.define("Cobblestone Generator block is loaded", true);
            //GIVEONLOGIN = builder.define("Gives the player the Troll item(s) when loading into a world", true);
            builder.pop();
        }
    }

    private static class Bowls
    {
        Bowls(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Poking Sticks").push("Bowls");
            WATER_BOWL_MAX_USES = builder.define("Water bowl durability  modifier", 2);
            LAVA_BOWL_MAX_USES = builder.define("Lava bowl durability  modifier", 1);
            builder.pop();
        }
    }

    private static class Traps
    {
        Traps(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Traps blocks ").push("Traps");
            GOLDERN_ATTACK_POWER = builder.define("Goldern monster trap attack power modifier", 6);
            DIAMOND_ATTACK_POWER = builder.define("Diamond monster trap attack power modifier", 10);
            WITHER_ATTACK_POWER = builder.define("Wither monster trap attack power modifier", 320);
            builder.pop();
        }
    }

    private static class CobbleGens
    {
        CobbleGens(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to Cobblestone Generator").push("Cobblestone Generator");
            builder.comment("Durability cost").push("Pickaxes");
            W_COST = builder.define("Wooden Pickaxe durability cost", 8);
            S_COST = builder.define("Stone Pickaxe durability cost", 16);
            I_COST = builder.define("Iron Pickaxe durability cost", 32);
            G_COST = builder.define("Golden Pickaxe durability cost", 32);
            D_COST = builder.define("Diamond Pickaxe durability cost", 64);
            N_COST = builder.define("Netherite Pickaxe durability cost", 64);
            builder.pop();
            builder.comment("Durability cost").push("Hammers");
            SH_COST = builder.define("Stone Hammer durability cost", 16);
            IH_COST = builder.define("Iron Hammer durability cost", 32);
            GH_COST = builder.define("Golden Hammer durability cost", 32);
            DH_COST = builder.define("Diamond Hammer durability cost", 64);
            NH_COST = builder.define("Netherite Hammer durability cost", 64);
            EH_COST = builder.define("Emerald Hammer durability cost", 64);
            builder.pop();
            builder.comment("Cobblestone return amount").push("Pickaxes");
            W_RETURN = builder.define("Wooden Pickaxe cobblestone return amount", 8);
            S_RETURN = builder.define("Stone Pickaxe cobblestone return amount", 16);
            I_RETURN = builder.define("Iron Pickaxe cobblestone return amount", 32);
            G_RETURN = builder.define("Golden Pickaxe cobblestone return amount", 32);
            D_RETURN = builder.define("Diamond Pickaxe cobblestone return amount", 64);
            N_RETURN = builder.define("Netherite Pickaxe cobblestone return amount", 64);
            builder.pop();
            builder.comment("Cobblestone return amount").push("Hammers");
            SH_RETURN = builder.define("Stone Hammer cobblestone return amount", 32);
            IH_RETURN = builder.define("Iron Hammer cobblestone return amount", 64);
            GH_RETURN = builder.define("Golden Hammer cobblestone return amount", 64);
            DH_RETURN = builder.define("Diamond Hammer cobblestone return amount", 128);
            NH_RETURN = builder.define("Netherite Hammer cobblestone return amount", 128);
            EH_RETURN = builder.define("Emerald Hammer cobblestone return amount", 64);
            builder.pop();
            builder.pop();
        }
    }

    private static class Tools
    {
        Tools(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the 3x3 mining tools").push("3x3 Tools");
            builder.comment("Tier speed modifier").push("Speed");
            STONE_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Stone Tier speed modifier",4.5, 1.0, 10.0);
            IRON_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Iron Tier speed modifier",3.5, 1.0, 10.0);
            GOLDEN_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Golden Tier speed modifier",2.0, 1.0, 10.0);
            DIAMOND_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Diamond Tier speed modifier",2.0, 1.0, 10.0);
            NETHERITE_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Netherite Tier speed modifier",1.0, 1.0, 10.0);
            EMERALD_TIER_TOOL_SPEED_MODIFIER = builder.defineInRange("Emerald Tier speed modifier",2.0, 1.0, 10.0);
            builder.pop();
            builder.comment("Tier durability modifier").push("Durability");
            STONE_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Stone Tier durability modifier",197);
            IRON_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Iron Tier durability modifier",375);
            GOLDEN_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Golden Tier durability modifier",48);
            DIAMOND_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Diamond Tier durability modifier",2732);
            NETHERITE_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Netherite Tier durability modifier",3047);
            EMERALD_TIER_TOOL_DURABILITY_MODIFIER = builder.define("Emerald Tier durability modifier",2732);
            builder.pop();
            builder.pop();
        }
    }

    private static class Berrys
    {
        Berrys(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the Berry Bushes in world drops").push("Berrys");
            builder.push("Damage Settings");
            BERRY_DO_DAMAGE = builder.define("Berry Bushes do damage", true);
            BERRY_DAMAGE = builder.define("Berry Bushes attack power modifier", 1);
            builder.pop();
            builder.push("Dusts");
            STONE_DUST = builder.define("Stone dust", 8);
            GRAVEL_DUST = builder.define("Gravel dust", 8);
            SAND_DUST = builder.define("Sand dust", 8);
            DIRT_DUST = builder.define("Dirt dust", 8);
            CLAY_BALL = builder.define("Clay balls", 8);
            builder.pop();
            builder.push("Nuggets");
            ICE_NUGGETS = builder.define("Ice Nuggets", 2);
            FIRE_NUGGETS = builder.define("Fire Nuggets", 2);
            WOODEN_NUGGETS = builder.define("Wooden Nuggets",16 );
            COAL_NUGGETS = builder.define("Coal Nuggets", 2);
            IRON_NUGGETS = builder.define("Iron Nuggets", 2);
            COPPER_NUGGETS = builder.define("Copper Nuggets", 2);
            GOLD_NUGGETS = builder.define("Gold Nuggets", 2);
            REDSTONE_NUGGETS = builder.define("Redstone Nuggets", 2);
            GLOWSTONE_NUGGETS = builder.define("Glowstone Nuggets", 2);
            LAPIS_NUGGETS = builder.define("Lapis Nuggets", 2);
            QUARTZ_NUGGETS = builder.define("Quartz Nuggets", 2);
            DIAMOND_NUGGETS = builder.define("Diamond Nuggets", 2);
            NETHERITE_NUGGETS = builder.define("Netherite Nuggets", 2);
            EMERALD_NUGGETS = builder.define("Emerald Nuggets", 2);
            XP_POINTS = builder.define("XP Orbs", 64);
            builder.pop();
            builder.push("Metal Berrys Bush Nuggets");
            NICKEL_NUGGETS = builder.define("Nickel Nuggets", 2);
            SILVER_NUGGETS = builder.define("Sliver Nuggets", 2);
            URANIUM_NUGGETS = builder.define("Uranium Nuggets", 2);
            LEAD_NUGGETS = builder.define("Lead Nuggets", 2);
            ALUMINUM_NUGGETS = builder.define("Aluminum Nuggets", 2);
            TIN_NUGGETS = builder.define("Tin Nuggets", 2);
            OSMIUM_NUGGETS = builder.define("Osmium Nuggets", 2);
            BISMUTH_NUGGETS = builder.define("Bismuth Nuggets", 2);
            ZINC_NUGGETS = builder.define("Zinc Nuggets", 2);
            PLATINUM_NUGGETS = builder.define("Platinum Nuggets", 2);
            IRIDIUM_NUGGETS = builder.define("Iridium Nuggets", 2);
            builder.pop();
            builder.pop();
        }
    }

    private static class Shears
    {
        Shears(ForgeConfigSpec.Builder builder)
        {
            builder.comment("Configuration related to the shears").push("Shears");
            builder.comment("Shear's durability modifier").push("Durability");
            WOODEN_SHEARS_DURABILITY_MODIFIER = builder.define("Wooden shears durability modifier",119);
            GOLDEN_SHEARS_DURABILITY_MODIFIER = builder.define("Golden shears durability modifier",357);
            DIAMOND_SHEARS_DURABILITY_MODIFIER = builder.define("Diamond shears durability modifier",476);
            NETHERITE_SHEARS_DURABILITY_MODIFIER = builder.define("Netherite shears durability modifier",952);
            builder.pop();
            builder.pop();
        }
    }

    public static void load(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave()
                .writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }
}
