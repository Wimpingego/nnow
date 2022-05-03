package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TrollInventory {
			
	@SubscribeEvent
    public static void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
		if (ModConfigs.GIVEONLOGIN.get()) {
			if (event.getPlayer() != null) {
				Player player = (Player) event.getPlayer();
				ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
				potato.enchant(Enchantments.UNBREAKING, 1);
				if (!player.addItem(potato)) {
					player.addItem(potato);
                  }
				}
			}
		}

	@SubscribeEvent
    public static void onPlayerDimChange(final PlayerEvent.PlayerChangedDimensionEvent event) {
		if(ModConfigs.GIVEONLOGIN.get()){
            if (event.getPlayer() != null) {
            	Player player = (Player) event.getPlayer();
                    ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
                    potato.enchant(Enchantments.UNBREAKING, 1);
                    if (!player.addItem(potato)) {
                        player.addItem(potato);
                    }
            }
        }
	}

//	OLD CODE
//	@SubscribeEvent
//    public static void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
//		if(ModConfigs.GIVEONLOGIN.get()){
//            if (event.getPlayer() instanceof Player) {
//            	Player player = (Player) event.getPlayer();
//                    ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
//                    potato.enchant(Enchantments.UNBREAKING, 1);
//                    if (!player.inventory.contains(potato)) {
//                        player.inventory.add(potato);
//                    }
//            	}
//        	}
//	}
//
//	@SubscribeEvent
//    public static void onPlayerDimChange(final PlayerEvent.PlayerChangedDimensionEvent event) {
//		if(ModConfigs.GIVEONLOGIN.get()){
//            if (event.getPlayer() instanceof Player) {
//            	Player player = (Player) event.getPlayer();
//                    ItemStack potato = new ItemStack(ItemList.DEATH_POTATO.get());
//                    potato.enchant(Enchantments.UNBREAKING, 1);
//                    if (!player.inventory.contains(potato)) {
//                        player.inventory.add(potato);
//                    }
//            }
//        }
//	}

}