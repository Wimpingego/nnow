package com.github.wimpingego.nnow.setup;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.util.BlockRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NNOW.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {

        BlockRenderer.registerBlocks();

    }
}
