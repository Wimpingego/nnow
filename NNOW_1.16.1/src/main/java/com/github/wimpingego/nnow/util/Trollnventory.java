package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.ItemList;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class Trollnventory {
			
//	@SubscribeEvent
//	public static void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event){
//		if(ModConfigs.GIVEONLOGIN.get()){
//			if(!event.getPlayer().inventory.hasItemStack(new ItemStack(ItemList.DEATH_POTATO.get()))) {
//				event.getPlayer().inventory.addItemStackToInventory(new ItemStack(ItemList.DEATH_POTATO.get(), 1));
//        	}
//        }
//	}
	
//	@SubscribeEvent
//	public static void onJoin(PlayerEvent.PlayerChangedDimensionEvent event) {
//		if(ModConfigs.GIVEONLOGIN.get()){
//			if(!event.getPlayer().inventory.hasItemStack(new ItemStack(ItemList.DEATH_POTATO.get()))) {
//				event.getPlayer().inventory.addItemStackToInventory(new ItemStack(ItemList.DEATH_POTATO.get(), 1));
//			}	
//		}
//	}

	@SubscribeEvent
    public static void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
		if(ModConfigs.GIVEONLOGIN.get()){
            if (event.getPlayer() instanceof PlayerEntity) {
            	PlayerEntity player = (PlayerEntity) event.getPlayer();
                    ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
                    potato.addEnchantment(Enchantments.UNBREAKING, 1);
                    if (!player.inventory.hasItemStack(potato)) {
                        player.inventory.addItemStackToInventory(potato);
                    }
            	}
        	}
	}
	
	@SubscribeEvent
    public static void onPlayerDimChange(final PlayerEvent.PlayerChangedDimensionEvent event) {
		if(ModConfigs.GIVEONLOGIN.get()){
            if (event.getPlayer() instanceof PlayerEntity) {
            	PlayerEntity player = (PlayerEntity) event.getPlayer();
                    ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
                    potato.addEnchantment(Enchantments.UNBREAKING, 1);
                    if (!player.inventory.hasItemStack(potato)) {
                        player.inventory.addItemStackToInventory(potato);
                    }
            }
        }
	}
}