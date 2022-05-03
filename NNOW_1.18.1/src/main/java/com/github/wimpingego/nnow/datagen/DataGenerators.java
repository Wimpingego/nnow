package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = NNOW.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new NNOWRecipes(generator));
            generator.addProvider(new NNOWLootTables(generator));
            NNOWBlockTags blockTags = new NNOWBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new NNOWItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new NNOWBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new NNOWItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new NNOWLanguageProvider(generator, "en_us"));
        }
    }
}
