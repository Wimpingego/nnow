package com.github.wimpingego.nnow.util.config;

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
public class ModConfigs {

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
    
    public static ConfigValue<Integer> WOODEN_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> GOLDEN_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> DIAMOND_SHEARS_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> NETHERITE_SHEARS_DURABILITY_MODIFIER;
    
    public static ConfigValue<Integer> GOLDERN_ATTACK_POWER;
    public static ConfigValue<Integer> DIAMOND_ATTACK_POWER;
    public static ConfigValue<Integer> WITHER_ATTACK_POWER;    
    
    private static class Bookshelf
    {
    	Bookshelf(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to the Booshelf Stairs and Slab").push("Bookshelf");
        ENCHANT_POWER = builder.comment("Enchant power level modifier.").defineInRange("Enchant Level", 1, 1,16);
        builder.pop();
        }
    }
    
    private static class Viagre
    {
    	Viagre(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to the Viagre item").push("Viagre");
	    VIAGRA_MAX_USES = builder.comment().define("VIAGRA durability modifier", 2342);
	    VIAGRA_TAKES_USES = builder.comment().define("VIAGRA has a durability cost when in main hand", true);
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
	        BASE_MAX_USES = builder.comment().define("Base Poking Stick durability  modifier", 59);
	        STONE_MAX_USES = builder.comment().define("Stone Poking Stick durability  modifier", 131);
	        IRON_MAX_USES = builder.comment().define("Iron Poking Stick durability  modifier", 250);
			SAPLING_DROP_CHANCE = builder.comment().defineInRange("Sapling drop chance modifier", 0.5, 0.00, 1.0);
			CACTUS_DROP_CHANCE = builder.comment().defineInRange("Cactus drop chance modifier", 0.25, 0.00, 1.0);
        builder.pop();
        }
    }

    private static class General
    {
    	General(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to general settings").push("General");
	        METALS_ITEMS_LOADED = builder.comment().define("Metal blocks, items and berrys are loaded", true);
	        LAVA_BLOCK_LOADED = builder.comment().define("Lava Well block is loaded", true);
	        WATER_BLOCK_LOADED = builder.comment().define("Water Well block is loaded", true);
	        COBBLE_GEN_LOADED = builder.comment().define("Cobblestone Generator block is loaded", true);
	        GIVEONLOGIN = builder.comment().define("Gives the player the Troll item(s) when loading into a world", true);
        builder.pop();
        }
    }
    
    private static class Traps
    {
    	Traps(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to the Traps blocks ").push("Traps");
	        GOLDERN_ATTACK_POWER = builder.comment().define("Goldern monster trap attack power modifier", 6);
	        DIAMOND_ATTACK_POWER = builder.comment().define("Diamond monster trap attack power modifier", 10);
	        WITHER_ATTACK_POWER = builder.comment().define("Wither monster trap attack power modifier", 320);
        builder.pop();
        }
    }
    
    private static class CobbleGens
    {
    	CobbleGens(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to Cobblestone Generator").push("Cobblestone Generator");
			builder.comment("Durability cost").push("Costs");
	        W_COST = builder.comment().define("Wooden Pickaxe durability cost", 8);
	        S_COST = builder.comment().define("Stone Pickaxe durability cost", 16);
	        I_COST = builder.comment().define("Iron Pickaxe durability cost", 32);
	        G_COST = builder.comment().define("Golden Pickaxe durability cost", 32);
	        D_COST = builder.comment().define("Diamond Pickaxe durability cost", 64);
	        N_COST = builder.comment().define("Netherite Pickaxe durability cost", 64);
	        E_COST = builder.comment().define("Emerald Hammer durability cost", 64);
	        builder.pop();
			builder.comment("Cobblestone return amount").push("Returns");
	        W_RETURN = builder.comment().define("Wooden Pickaxe cobblestone return amount", 8);
	        S_RETURN = builder.comment().define("Stone Pickaxe cobblestone return amount", 16);
	        I_RETURN = builder.comment().define("Iron Pickaxe cobblestone return amount", 32);
	        G_RETURN = builder.comment().define("Golden Pickaxe cobblestone return amount", 32);
	        D_RETURN = builder.comment().define("Diamond Pickaxe cobblestone return amount", 64); 
	        N_RETURN = builder.comment().define("Netherite Pickaxe cobblestone return amount", 64); 
	        E_RETURN = builder.comment().define("Emerald Hammer cobblestone return amount", 64); 
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
			STONE_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Stone Tier speed modifier",4.5, 1.0, 10.0);	
			IRON_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Iron Tier speed modifier",3.5, 1.0, 10.0);	
			GOLDEN_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Golden Tier speed modifier",2.0, 1.0, 10.0);	
			DIAMOND_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Diamond Tier speed modifier",2.0, 1.0, 10.0);
			NETHERITE_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Netherite Tier speed modifier",1.0, 1.0, 10.0);
			EMERALD_TIER_TOOL_SPEED_MODIFIER = builder.comment().defineInRange("Emerald Tier speed modifier",2.0, 1.0, 10.0);	
	        builder.pop();
			builder.comment("Tier durability modifier").push("Durability");
			STONE_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Stone Tier durability modifier",197);	
			IRON_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Iron Tier durability modifier",375);	
			GOLDEN_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Golden Tier durability modifier",48);	
			DIAMOND_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Diamond Tier durability modifier",2732);	
			NETHERITE_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Netherite Tier durability modifier",3047);	
			EMERALD_TIER_TOOL_DURABILITY_MODIFIER = builder.comment().define("Emerald Tier durability modifier",2732);
	        builder.pop();
	    builder.pop();
        }
    }
    
    private static class Berrys
    {
    	Berrys(ForgeConfigSpec.Builder builder)
    	{
			builder.comment("Configuration related to the Berry Bushes in world drops").push("Berrys");
			builder.comment().push("Damage Settings");
	        BERRY_DO_DAMAGE = builder.comment().define("Berry Bushes do damage", true);
	        BERRY_DAMAGE = builder.comment().define("Berry Bushes attack power modifier", 1);	
	        builder.pop();
			builder.comment().push("Dusts");
	        STONE_DUST = builder.comment().define("Stone dust", 8);
	        GRAVEL_DUST = builder.comment().define("Gravel dust", 8);
	        SAND_DUST = builder.comment().define("Sand dust", 8);
	        DIRT_DUST = builder.comment().define("Dirt dust", 8);
	        CLAY_BALL = builder.comment().define("Clay balls", 8); 	
	        builder.pop();
			builder.comment().push("Nuggets");
	        ICE_NUGGETS = builder.comment().define("Ice Nuggets", 2); 
	        FIRE_NUGGETS = builder.comment().define("Fire Nuggets", 2);
	        WOODEN_NUGGETS = builder.comment().define("Wooden Nuggets",16 ); 
	        COAL_NUGGETS = builder.comment().define("Coal Nuggets", 2);
	        IRON_NUGGETS = builder.comment().define("Iron Nuggets", 2);
	        GOLD_NUGGETS = builder.comment().define("Gold Nuggets", 2);
	        REDSTONE_NUGGETS = builder.comment().define("Redstone Nuggets", 2);
	        GLOWSTONE_NUGGETS = builder.comment().define("Glowstone Nuggets", 2);
	        LAPIS_NUGGETS = builder.comment().define("Lapis Nuggets", 2);
	        QUARTZ_NUGGETS = builder.comment().define("Quartz Nuggets", 2);
	        DIAMOND_NUGGETS = builder.comment().define("Diamond Nuggets", 2);
	        NETHERITE_NUGGETS = builder.comment().define("Netherite Nuggets", 2);
	        EMERALD_NUGGETS = builder.comment().define("Emerald Nuggets", 2);
	        XP_POINTS = builder.comment().define("XP Orbs", 64);
	        builder.pop();
			builder.comment().push("Metal Berrys Bush Nuggets");
	        COPPER_NUGGETS = builder.comment().define("Copper Nuggets", 2);
	        NICKEL_NUGGETS = builder.comment().define("Nickel Nuggets", 2);
	        SILVER_NUGGETS = builder.comment().define("Sliver Nuggets", 2);
	        URANIUM_NUGGETS = builder.comment().define("Uranium Nuggets", 2);
	        LEAD_NUGGETS = builder.comment().define("Lead Nuggets", 2);
	        ALUMINUM_NUGGETS = builder.comment().define("Aluminum Nuggets", 2);
	        TIN_NUGGETS = builder.comment().define("Tin Nuggets", 2);
	        OSMIUM_NUGGETS = builder.comment().define("Osmium Nuggets", 2);
	        BISMUTH_NUGGETS = builder.comment().define("Bismuth Nuggets", 2);
	        ZINC_NUGGETS = builder.comment().define("Zinc Nuggets", 2);
	        PLATINUM_NUGGETS = builder.comment().define("Platinum Nuggets", 2);
	        IRIDIUM_NUGGETS = builder.comment().define("Iridium Nuggets", 2);
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
			WOODEN_SHEARS_DURABILITY_MODIFIER = builder.comment().define("Wooden shears durability modifier",119);
			GOLDEN_SHEARS_DURABILITY_MODIFIER = builder.comment().define("Golden shears durability modifier",357);	
			DIAMOND_SHEARS_DURABILITY_MODIFIER = builder.comment().define("Diamond shears durability modifier",476);	
			NETHERITE_SHEARS_DURABILITY_MODIFIER = builder.comment().define("Netherite shears durability modifier",952);	
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