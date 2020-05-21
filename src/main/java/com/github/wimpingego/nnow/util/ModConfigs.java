package com.github.wimpingego.nnow.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class ModConfigs {
	
    public static final String MAGNET = "Magnet";
    public static final String VIAGRE = "Viagre";
    public static final String BOOKSHELF = "Bookshelf";
    public static final String POKING = "Poking Stick";
    public static final String BERRYS = "Berrys";

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
    
    static {
        initConfig();
      }
    
    private static void initConfig()  {       
        COMMON_BUILDER.push(BOOKSHELF);
        ENCHANT_POWER = COMMON_BUILDER.comment("Enchant power level modifier.").defineInRange("Enchant Level", 8, 1,60);
        COMMON_BUILDER.pop();        
        
        COMMON_BUILDER.push(VIAGRE);
        VIAGRA_RADIUS = COMMON_BUILDER.comment("Growth radius size modifier.").defineInRange("Growth Radius", 8, 1,16);
        VIAGRA_TICK_DELAY = COMMON_BUILDER.comment("Tick Delay modifier.").defineInRange("Tick Delay", 2, 1, 20);
        COMMON_BUILDER.pop();
        
        COMMON_BUILDER.push(BERRYS);      
        COAL_NUGGETS = COMMON_BUILDER.comment().define("Coal Nuggets", 1);
        DIAMOND_NUGGETS = COMMON_BUILDER.comment().define("Diamond Nuggets", 1);
        EMERALD_NUGGETS = COMMON_BUILDER.comment().define("Emerald Nuggets", 1);
        GOLD_NUGGETS = COMMON_BUILDER.comment().define("Gold Nuggets", 1);
        IRON_NUGGETS = COMMON_BUILDER.comment().define("Iron Nuggets", 1);
        LAPIS_NUGGETS = COMMON_BUILDER.comment().define("Lapis Nuggets", 1);
        QUARTZ_NUGGETS = COMMON_BUILDER.comment("Base number of nuggets/orbs dropped").define("Quartz Nuggets", 1);
        REDSTONE_NUGGETS = COMMON_BUILDER.comment().define("Redstone Nuggets", 1);
        ICE_NUGGETS = COMMON_BUILDER.comment().define("Ice Nuggets", 1); 
        FIRE_NUGGETS = COMMON_BUILDER.comment().define("Fire Nuggets", 1);
        WOODEN_NUGGETS = COMMON_BUILDER.comment().define("Wooden Nuggets", 1); 
        XP_POINTS = COMMON_BUILDER.comment().define("XP Orbs", 64);
        COMMON_BUILDER.pop();  
        
        COMMON_BUILDER.push(POKING);
        MAX_USES = COMMON_BUILDER.comment().define("Poking Stick max use modifier", 64);
        COMMON_BUILDER.pop(); 
        
        COMMON_BUILDER.push(MAGNET);
        PICKUP_RANGE = COMMON_BUILDER.comment("Magnet max pickup range modifier.").defineInRange("Pickup Range", 8, 1, 16);
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