package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.ItemList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class Trollnventory {
		
	@SubscribeEvent
	public static void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event){
		if(ModConfigs.GIVEONLOGIN.get()){
			if(!event.getPlayer().inventory.hasItemStack(new ItemStack(ItemList.DEATH_POTATO.get()))) {
				event.getPlayer().inventory.addItemStackToInventory(new ItemStack(ItemList.DEATH_POTATO.get(), 1));
        	}
        }
	}
	
	@SubscribeEvent
	public static void onJoin(PlayerEvent.PlayerChangedDimensionEvent event) {
		if(ModConfigs.GIVEONLOGIN.get()){
			if(!event.getPlayer().inventory.hasItemStack(new ItemStack(ItemList.DEATH_POTATO.get()))) {
				event.getPlayer().inventory.addItemStackToInventory(new ItemStack(ItemList.DEATH_POTATO.get(), 1));
			}	
		}
	}

}