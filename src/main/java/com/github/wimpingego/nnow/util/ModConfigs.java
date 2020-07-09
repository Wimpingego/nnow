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
public class ModConfigs {
	
    public static final String MAGNET = "Magnet";
    public static final String VIAGRE = "Viagre";
    public static final String BOOKSHELF = "Bookshelf";
    public static final String POKING = "Poking_Stick";
    public static final String TROLL = "Troll_Item";
    public static final String SKYBLOCK = "Skyblock_Mode";
    public static final String TRAP = "Traps";
    public static final String GENS = "Cobblestone_Generator";
    public static final String GENSCOST = "Tool_Durability_Cost";
    public static final String GENSRETURN = "Item_Return_Rate";
    public static final String TOOLS = "3x3_Tools";
    public static final String TOOLSDROPS = "Drops";
    public static final String TOOLSPEED = "Speed";
    public static final String TOOLMAXUSE = "Durability";
    public static final String BERRYS = "Berry_Bush";
    public static final String BDROP = "Drop_Rates";
    public static final String BDAMAGE = "Damage_Setting";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    public static IntValue PICKUP_RANGE;
    
    public static IntValue VIAGRA_RADIUS;
    public static IntValue VIAGRA_TICK_DELAY;
    
    public static IntValue ENCHANT_POWER;
    
    public static ConfigValue<Integer> MAX_USES;
    
    public static ConfigValue<Integer> XP_POINTS;
    public static ConfigValue<Integer> COAL_NUGGETS;
    public static ConfigValue<Integer> DIAMOND_NUGGETS;
    public static ConfigValue<Integer> EMERALD_NUGGETS;
    public static ConfigValue<Integer> GOLD_NUGGETS;
    public static ConfigValue<Integer> IRON_NUGGETS;
    public static ConfigValue<Integer> LAPIS_NUGGETS;
    public static ConfigValue<Integer> QUARTZ_NUGGETS;
    public static ConfigValue<Integer> REDSTONE_NUGGETS;
    public static ConfigValue<Integer> ICE_NUGGETS;
    public static ConfigValue<Integer> FIRE_NUGGETS;
    public static ConfigValue<Integer> WOODEN_NUGGETS;
    
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
    
    public static BooleanValue GIVEONLOGIN;
    
    public static BooleanValue SKYBLOCK_MODE;    
	
    public static DoubleValue DROP_CHANCE;
	public static DoubleValue SECOND_CHANCE;
	public static DoubleValue EGG_CHANCE;
	
    public static DoubleValue STONE_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue IRON_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue GOLDEN_TIER_TOOL_SPEED_MODIFIER;
    public static DoubleValue DIAMOND_TIER_TOOL_SPEED_MODIFIER;
	
    public static ConfigValue<Integer> STONE_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> IRON_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> GOLDEN_TIER_TOOL_DURABILITY_MODIFIER;
    public static ConfigValue<Integer> DIAMOND_TIER_TOOL_DURABILITY_MODIFIER;
    
    public static ConfigValue<Integer> IRON_ATTACK_POWER;
    public static ConfigValue<Integer> GOLDERN_ATTACK_POWER;
    public static ConfigValue<Integer> DIAMOND_ATTACK_POWER;
    public static ConfigValue<Integer> WITHER_ATTACK_POWER;
    
    static {
        initConfig();
      }
    
    private static void initConfig()  { 
        COMMON_BUILDER.push(SKYBLOCK);	
        SKYBLOCK_MODE = COMMON_BUILDER.comment().define("SkyBlock mode", true);
		COMMON_BUILDER.pop();
    	
        COMMON_BUILDER.push(BOOKSHELF);
        ENCHANT_POWER = COMMON_BUILDER.comment("Enchant power level modifier.").defineInRange("Enchant Level", 1, 1,16);
        COMMON_BUILDER.pop();        
        
        COMMON_BUILDER.push(VIAGRE);
        VIAGRA_RADIUS = COMMON_BUILDER.comment("Growth radius size modifier.").defineInRange("Growth Radius", 8, 1,16);
        VIAGRA_TICK_DELAY = COMMON_BUILDER.comment("Tick Delay modifier.").defineInRange("Tick Delay", 2, 1, 20);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(MAGNET);
        PICKUP_RANGE = COMMON_BUILDER.comment("Magnet max pickup range modifier.").defineInRange("Pickup Range", 8, 1, 16);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(POKING);
        MAX_USES = COMMON_BUILDER.comment().define("Poking Stick max use modifier", 64);
        COMMON_BUILDER.pop(); 
        
        COMMON_BUILDER.push(TROLL);
        GIVEONLOGIN = COMMON_BUILDER.comment().define("Gives the player the Troll item(s) when loading into a world", true);
        COMMON_BUILDER.pop(); 
        
        COMMON_BUILDER.push(TRAP);
        IRON_ATTACK_POWER = COMMON_BUILDER.comment().define("Iron monster trap attack power modifier", 6);
        GOLDERN_ATTACK_POWER = COMMON_BUILDER.comment().define("Goldern monster trap attack power modifier", 4);
        DIAMOND_ATTACK_POWER = COMMON_BUILDER.comment().define("Diamond monster trap attack power modifier", 7);
        WITHER_ATTACK_POWER = COMMON_BUILDER.comment().define("Wither monster trap attack power modifier", 320);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(GENS);     
        COMMON_BUILDER.push(GENSCOST);
        W_COST = COMMON_BUILDER.comment().define("Wooden Pickaxe durability cost", 8);
        S_COST = COMMON_BUILDER.comment().define("Stone Pickaxe durability cost", 16);
        I_COST = COMMON_BUILDER.comment().define("Iron Pickaxe durability cost", 32);
        G_COST = COMMON_BUILDER.comment().define("Golden Pickaxe durability cost", 32);
        D_COST = COMMON_BUILDER.comment().define("Diamond Pickaxe durability cost", 64);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push(GENSRETURN);
        W_RETURN = COMMON_BUILDER.comment().define("Wooden Pickaxe cobblestone return amount", 8);
        S_RETURN = COMMON_BUILDER.comment().define("Stone Pickaxe cobblestone return amount", 16);
        I_RETURN = COMMON_BUILDER.comment().define("Iron Pickaxe cobblestone return amount", 32);
        G_RETURN = COMMON_BUILDER.comment().define("Golden Pickaxe cobblestone return amount", 32);
        D_RETURN = COMMON_BUILDER.comment().define("Diamond Pickaxe cobblestone return amount", 64); 
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(BERRYS);  
        COMMON_BUILDER.push(BDROP); 
        COAL_NUGGETS = COMMON_BUILDER.comment().define("Coal Nuggets", 1);
        DIAMOND_NUGGETS = COMMON_BUILDER.comment().define("Diamond Nuggets", 1);
        EMERALD_NUGGETS = COMMON_BUILDER.comment().define("Emerald Nuggets", 1);
        GOLD_NUGGETS = COMMON_BUILDER.comment().define("Gold Nuggets", 1);
        IRON_NUGGETS = COMMON_BUILDER.comment().define("Iron Nuggets", 1);
        LAPIS_NUGGETS = COMMON_BUILDER.comment().define("Lapis Nuggets", 1);
        QUARTZ_NUGGETS = COMMON_BUILDER.comment().define("Quartz Nuggets", 1);
        REDSTONE_NUGGETS = COMMON_BUILDER.comment().define("Redstone Nuggets", 1);
        ICE_NUGGETS = COMMON_BUILDER.comment().define("Ice Nuggets", 1); 
        FIRE_NUGGETS = COMMON_BUILDER.comment().define("Fire Nuggets", 1);
        WOODEN_NUGGETS = COMMON_BUILDER.comment().define("Wooden Nuggets", 1); 
        XP_POINTS = COMMON_BUILDER.comment().define("XP Orbs", 64);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push(BDAMAGE);
        BERRY_DO_DAMAGE = COMMON_BUILDER.comment().define("Berry Bushes do damage", true);
        BERRY_DAMAGE = COMMON_BUILDER.comment().define("Berry Bushes attack power modifier", 1);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(TOOLS);  
        COMMON_BUILDER.push(TOOLSDROPS);
		DROP_CHANCE = COMMON_BUILDER.comment().defineInRange("Dust drop chance modifier", 0.5, 0.00, 1.0);
		SECOND_CHANCE = COMMON_BUILDER.comment().defineInRange("Second item drop chance modifier (Suger cane & Cactus)",0.05, 0.00, 1.0);
		EGG_CHANCE = COMMON_BUILDER.comment().defineInRange("Spawn egg drop chance modifier (If Skyblock is set to TRUE)",0.005, 0.00, 1.0);	
		COMMON_BUILDER.pop();
        COMMON_BUILDER.push(TOOLSPEED);	
		STONE_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Stone Tier speed modifier",4.5, 1.0, 10.0);	
		IRON_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Iron Tier speed modifier",3.5, 1.0, 10.0);	
		GOLDEN_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Golden Tier speed modifier",2.0, 1.0, 10.0);	
		DIAMOND_TIER_TOOL_SPEED_MODIFIER = COMMON_BUILDER.comment().defineInRange("Diamond Tier speed modifier",2.0, 1.0, 10.0);	
		COMMON_BUILDER.pop();
        COMMON_BUILDER.push(TOOLMAXUSE);	
		STONE_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Stone Tier durability modifier",197);	
		IRON_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Iron Tier durability modifier",375);	
		GOLDEN_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Golden Tier durability modifier",48);	
		DIAMOND_TIER_TOOL_DURABILITY_MODIFIER = COMMON_BUILDER.comment().define("Diamond Tier durability modifier",2342);	
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