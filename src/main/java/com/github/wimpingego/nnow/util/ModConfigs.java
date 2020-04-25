package com.github.wimpingego.nnow.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class ModConfigs {

    public static final String VIAGRE = "Viagre";
    public static final String MAGNET = "Magnet";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    //private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;
    //public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue PICKUP_RANGE;
    public static ForgeConfigSpec.IntValue VIAGRA_RADIUS;
    public static ForgeConfigSpec.IntValue VIAGRA_TICK_DELAY;
    
    static {
        COMMON_BUILDER.push(VIAGRE);
        
        VIAGRA_RADIUS = COMMON_BUILDER.comment("Growth radius size modifier.").defineInRange("Growth_Radius", 8, 1,16);

        VIAGRA_TICK_DELAY = COMMON_BUILDER.comment("Tick Delay modifier.").defineInRange("Tick_Delay", 2, 1, 20);
        
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Never Needed Or Wanted Configs").push(MAGNET);

        PICKUP_RANGE = COMMON_BUILDER.comment("Magnet max pickup range modifier.").defineInRange("Pickup_Range", 8, 1, 16);
        
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
        //CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    public static void load(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }
}