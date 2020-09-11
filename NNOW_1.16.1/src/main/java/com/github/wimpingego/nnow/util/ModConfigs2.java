package com.github.wimpingego.nnow.util;

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
public class ModConfigs2 {
	
    public static final String MAGNET = "Magnet";
    
    public static final String VIAGRE = "Viagre";
    
    public static final String BOOKSHELF = "Bookshelf";
    
    public static final String POKING = "Poking Stick";
    
    public static final String TROLL = "Troll Item";
    
    public static final String TRAP = "Traps";
    
    public static final String GENS = "Cobblestone Generator";
    public static final String GENSCOST = "Durability Cost";
    public static final String GENSRETURN = "Return Rate";
    
    public static final String TOOLS = "3x3 Tools";
    public static final String TOOLSPEED = "Mining Speed";
    public static final String TOOLMAXUSE = "Max Durability";
    
    public static final String BERRYS = "Berry Bush";
    public static final String ODROP = "Ore Bush Drop Rates";
    public static final String DDROP = "Dust Bush Drop Rates";
    public static final String MDROP = "Metal Bush Drop Rates";
    public static final String BDAMAGE = "Damage Setting";
    
    public static final String METALS = "Metal Items Loaded";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    public static IntValue PICKUP_RANGE;
    
    public static IntValue VIAGRA_RADIUS;
    public static IntValue VIAGRA_TICK_DELAY;
    public static ConfigValue<Integer> VIAGRA_MAX_USES;   
    public static BooleanValue VIAGRA_TAKES_USES;  
    
    public static BooleanValue METALS_ITEMS_LOADED;     
    
    public static IntValue ENCHANT_POWER;
    
    public static ConfigValue<Integer> BASE_MAX_USES;
    public static ConfigValue<Integer> STONE_MAX_USES;
    public static ConfigValue<Integer> IRON_MAX_USES;
    public static DoubleValue SAPLING_DROP_CHANCE;
    public static DoubleValue CACTUS_DROP_CHANCE;
    
    public static ConfigValue<Integer> XP_POINTS;
    public static ConfigValue<Integer> COAL_NUGGETS;
    public static ConfigValue<Integer> GOLD_NUGGETS;
    public static ConfigValue<Integer> IRON_NUGGETS;
    public static ConfigValue<Integer> LAPIS_NUGGETS;
    public static ConfigValue<Integer> QUARTZ_NUGGETS;
    public static ConfigValue<Integer> REDSTONE_NUGGETS;
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
    public static ConfigValue<Integer> E_COST;
    public static ConfigValue<Integer> E_RETURN;
    
    public static BooleanValue GIVEONLOGIN;   
	
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
    
    public static ConfigValue<Integer> GOLDERN_ATTACK_POWER;
    public static ConfigValue<Integer> DIAMOND_ATTACK_POWER;
    public static ConfigValue<Integer> WITHER_ATTACK_POWER;    
    
    static {
        initConfig();
      }
    
    private static void initConfig()  { 
    	
        COMMON_BUILDER.push(BOOKSHELF);
        ENCHANT_POWER = COMMON_BUILDER.comment("Enchant power level modifier.").defineInRange("Enchant Level", 1, 1,16);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(METALS);
        METALS_ITEMS_LOADED = COMMON_BUILDER.comment().define("Metal blocks items and berrys are loaded", true);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(VIAGRE);
        VIAGRA_MAX_USES = COMMON_BUILDER.comment().define("VIAGRA durability modifier", 2342);
        VIAGRA_TAKES_USES = COMMON_BUILDER.comment().define("VIAGRA has a durability cost when in main hand", true);
        VIAGRA_RADIUS = COMMON_BUILDER.comment("Growth radius size modifier.").defineInRange("Growth Radius", 8, 1,16);
        VIAGRA_TICK_DELAY = COMMON_BUILDER.comment("Tick Delay modifier. (Lower is faster)").defineInRange("Tick Delay", 5, 1, 20);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(MAGNET);
        PICKUP_RANGE = COMMON_BUILDER.comment("Magnet max pickup range modifier.").defineInRange("Pickup Range", 8, 1, 16);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(POKING);
        BASE_MAX_USES = COMMON_BUILDER.comment().define("Base Poking Stick durability  modifier", 59);
        STONE_MAX_USES = COMMON_BUILDER.comment().define("Stone Poking Stick durability  modifier", 131);
        IRON_MAX_USES = COMMON_BUILDER.comment().define("Iron Poking Stick durability  modifier", 250);
		SAPLING_DROP_CHANCE = COMMON_BUILDER.comment().defineInRange("Sapling drop chance modifier", 0.5, 0.00, 1.0);
		CACTUS_DROP_CHANCE = COMMON_BUILDER.comment().defineInRange("Cactus drop chance modifier", 0.25, 0.00, 1.0);
        COMMON_BUILDER.pop(); 
        
        COMMON_BUILDER.push(TROLL);
        GIVEONLOGIN = COMMON_BUILDER.comment().define("Gives the player the Troll item(s) when loading into a world", true);
        COMMON_BUILDER.pop(); 
        
        COMMON_BUILDER.push(TRAP);
        GOLDERN_ATTACK_POWER = COMMON_BUILDER.comment().define("Goldern monster trap attack power modifier", 6);
        DIAMOND_ATTACK_POWER = COMMON_BUILDER.comment().define("Diamond monster trap attack power modifier", 10);
        WITHER_ATTACK_POWER = COMMON_BUILDER.comment().define("Wither monster trap attack power modifier", 320);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(GENS);     
        COMMON_BUILDER.comment("Hammers use the same durability cost value").push(GENSCOST);
        W_COST = COMMON_BUILDER.comment().define("Wooden Pickaxe durability cost", 8);
        S_COST = COMMON_BUILDER.comment().define("Stone Pickaxe durability cost", 16);
        I_COST = COMMON_BUILDER.comment().define("Iron Pickaxe durability cost", 32);
        G_COST = COMMON_BUILDER.comment().define("Golden Pickaxe durability cost", 32);
        D_COST = COMMON_BUILDER.comment().define("Diamond Pickaxe durability cost", 64);
        N_COST = COMMON_BUILDER.comment().define("Netherite Pickaxe durability cost", 64);
        E_COST = COMMON_BUILDER.comment().define("Emerald Hammer durability cost", 64);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Hammers return double the set amount value").push(GENSRETURN);
        W_RETURN = COMMON_BUILDER.comment().define("Wooden Pickaxe cobblestone return amount", 8);
        S_RETURN = COMMON_BUILDER.comment().define("Stone Pickaxe cobblestone return amount", 16);
        I_RETURN = COMMON_BUILDER.comment().define("Iron Pickaxe cobblestone return amount", 32);
        G_RETURN = COMMON_BUILDER.comment().define("Golden Pickaxe cobblestone return amount", 32);
        D_RETURN = COMMON_BUILDER.comment().define("Diamond Pickaxe cobblestone return amount", 64); 
        N_RETURN = COMMON_BUILDER.comment().define("Netherite Pickaxe cobblestone return amount", 64); 
        E_RETURN = COMMON_BUILDER.comment().define("Emerald Hammer cobblestone return amount", 64); 
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(BERRYS);  
        COMMON_BUILDER.push(DDROP); 
        STONE_DUST = COMMON_BUILDER.comment().define("Stone dust", 4);
        GRAVEL_DUST = COMMON_BUILDER.comment().define("Gravel dust", 4);
        SAND_DUST = COMMON_BUILDER.comment().define("Sand dust", 4);
        DIRT_DUST = COMMON_BUILDER.comment().define("Dirt dust", 4);
        CLAY_BALL = COMMON_BUILDER.comment().define("Clay balls", 4); 
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push(ODROP); 
        ICE_NUGGETS = COMMON_BUILDER.comment().define("Ice Nuggets", 1); 
        FIRE_NUGGETS = COMMON_BUILDER.comment().define("Fire Nuggets", 1);
        WOODEN_NUGGETS = COMMON_BUILDER.comment().define("Wooden Nuggets", 1); 
        COAL_NUGGETS = COMMON_BUILDER.comment().define("Coal Nuggets", 1);
        IRON_NUGGETS = COMMON_BUILDER.comment().define("Iron Nuggets", 1);
        GOLD_NUGGETS = COMMON_BUILDER.comment().define("Gold Nuggets", 1);
        REDSTONE_NUGGETS = COMMON_BUILDER.comment().define("Redstone Nuggets", 1);
        LAPIS_NUGGETS = COMMON_BUILDER.comment().define("Lapis Nuggets", 1);
        QUARTZ_NUGGETS = COMMON_BUILDER.comment().define("Quartz Nuggets", 1);
        DIAMOND_NUGGETS = COMMON_BUILDER.comment().define("Diamond Nuggets", 1);
        NETHERITE_NUGGETS = COMMON_BUILDER.comment().define("Netherite Nuggets", 1);
        EMERALD_NUGGETS = COMMON_BUILDER.comment().define("Emerald Nuggets", 1);
        XP_POINTS = COMMON_BUILDER.comment().define("XP Orbs", 64);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push(MDROP); 
        COPPER_NUGGETS = COMMON_BUILDER.comment().define("Copper Nuggets", 1);
        NICKEL_NUGGETS = COMMON_BUILDER.comment().define("Nickel Nuggets", 1);
        SILVER_NUGGETS = COMMON_BUILDER.comment().define("Sliver Nuggets", 1);
        URANIUM_NUGGETS = COMMON_BUILDER.comment().define("Uranium Nuggets", 1);
        LEAD_NUGGETS = COMMON_BUILDER.comment().define("Lead Nuggets", 1);
        ALUMINUM_NUGGETS = COMMON_BUILDER.comment().define("Aluminum Nuggets", 1);
        TIN_NUGGETS = COMMON_BUILDER.comment().define("Tin Nuggets", 1);
        OSMIUM_NUGGETS = COMMON_BUILDER.comment().define("Osmium Nuggets", 1);
        BISMUTH_NUGGETS = COMMON_BUILDER.comment().define("Bismuth Nuggets", 1);
        ZINC_NUGGETS = COMMON_BUILDER.comment().define("Zinc Nuggets", 1);
        PLATINUM_NUGGETS = COMMON_BUILDER.comment().define("Platinum Nuggets", 1);
        IRIDIUM_NUGGETS = COMMON_BUILDER.comment().define("Iridium Nuggets", 1);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push(BDAMAGE);
        BERRY_DO_DAMAGE = COMMON_BUILDER.comment().define("Berry Bushes do damage", true);
        BERRY_DAMAGE = COMMON_BUILDER.comment().define("Berry Bushes attack power modifier", 1);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(TOOLS);  
        COMMON_BUILDER.push(TOOLSPEED);	
		STONE_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Stone Tier speed modifier",4.5, 1.0, 10.0);	
		IRON_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Iron Tier speed modifier",3.5, 1.0, 10.0);	
		GOLDEN_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Golden Tier speed modifier",2.0, 1.0, 10.0);	
		DIAMOND_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Diamond Tier speed modifier",2.0, 1.0, 10.0);
		NETHERITE_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Netherite Tier speed modifier",1.0, 1.0, 10.0);
		EMERALD_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Emerald Tier speed modifier",2.0, 1.0, 10.0);	
		COMMON_BUILDER.pop();
        COMMON_BUILDER.push(TOOLMAXUSE);	
		STONE_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Stone Tier durability modifier",197);	
		IRON_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Iron Tier durability modifier",375);	
		GOLDEN_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Golden Tier durability modifier",48);	
		DIAMOND_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Diamond Tier durability modifier",2732);	
		NETHERITE_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Netherite Tier durability modifier",3047);	
		EMERALD_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Emerald Tier durability modifier",2732);	
		COMMON_BUILDER.pop();
		COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

	public static void load(ForgeConfigSpec spec, Path path) {
		final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		configData.load();
		spec.setConfig(configData);
	}
}