package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.client.gui.BookshelfChestScreen;
import com.github.wimpingego.nnow.container.ModContainerTypes;

import net.minecraft.client.gui.ScreenManager;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ModContainerTypes.BOOKSHELF_CHEST.get(), BookshelfChestScreen::new);
	}

}
