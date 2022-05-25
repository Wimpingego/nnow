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
    public static final Traps TRAPS;
    public static final CobbleGens COBBLEGEN;
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
        //GENERAL = new General(builder);
        TRAPS = new Traps(builder);
        COBBLEGEN = new CobbleGens(builder);
        //TOOLS = new Tools(builder);
        BERRYS = new Berrys(builder);
        SHEARS = new Shears(builder);
        BOWLS = new Bowls(builder);

        ALL = builder.build();
    }

    public static IntValue PICKUP_RANGE;

    public static IntValue VIAGRA_RADIUS;
    public static IntValue VIAGRA_TICK_DELAY;
    public static ConfigValue<Integer> VIAGRA_MAX_USES;

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
    public static ConfigValue<Integer> TIERE_DROPS;
    public static ConfigValue<Integer> TIER1_DROPS;
    public static ConfigValue<Integer> TIER2_DROPS;
    public static ConfigValue<Integer> TIER3_DROPS;
    public static ConfigValue<Integer> TIER4_DROPS;
    public static ConfigValue<Integer> TIER5_DROPS;


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
            builder.comment("Configuration related to the Mood Enhancer items").push("Mood Enhancer");
            VIAGRA_MAX_USES = builder.define("Derpy Mood Enhancer durability modifier", 2342);
            VIAGRA_RADIUS = builder.comment("Growth radius size modifier, Number is doubled for the Ultra version.").defineInRange("Growth Radius", 8, 1,16);
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
            builder.comment("Cobblestone return amount").push("Pickaxes");
            W_RETURN = builder.define("Wooden Pickaxe cobblestone return amount", 8);
            S_RETURN = builder.define("Stone Pickaxe cobblestone return amount", 16);
            I_RETURN = builder.define("Iron Pickaxe cobblestone return amount", 32);
            G_RETURN = builder.define("Golden Pickaxe cobblestone return amount", 32);
            D_RETURN = builder.define("Diamond Pickaxe cobblestone return amount", 64);
            N_RETURN = builder.define("Netherite Pickaxe cobblestone return amount", 64);
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
            builder.push("Bush Tier Drop Settings");
            XP_POINTS = builder.define("XP Orbs", 64);
            TIERE_DROPS = builder.define("Elements Nuggets H Amount", 8);
            TIER1_DROPS = builder.define("Tier 1 Nuggets H Amount", 16);
            TIER2_DROPS = builder.define("Tier 2 Nuggets H Amount", 8);
            TIER3_DROPS = builder.define("Tier 3 Nuggets H Amount", 8);
            TIER4_DROPS = builder.define("Tier 4 Nuggets H Amount", 8);
            TIER5_DROPS = builder.define("Tier 5 Nuggets H Amount", 4);
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
