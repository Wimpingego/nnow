package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.ItemList;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class TradesRegistration {
	
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event){

        if (event.getType() == VillagerProfessions.BANKER)
        {
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(ItemList.COIN_1.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_1.get(), 1), new ItemStack(ItemList.COIN_0.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_1.get(), 1), new ItemStack(ItemList.COIN_2.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_2.get(), 1), new ItemStack(ItemList.COIN_1.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_2.get(), 1), new ItemStack(ItemList.COIN_3.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_3.get(), 1), new ItemStack(ItemList.COIN_2.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_3.get(), 1), new ItemStack(ItemList.COIN_4.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_4.get(), 1), new ItemStack(ItemList.COIN_3.get(), 1), 99999, 50, 0.05F)); 
        	//event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.REDSTONE, 1), 99999, 50, 0.05F)); 
        	//event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.GLOWSTONE, 1), 99999, 50, 0.05F));
        } 
        
        if (event.getType() == VillagerProfessions.BEEKEEPER)
        {
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.BEE_SPAWN_EGG, 1), 99999, 50, 0.05F));
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.BEEHIVE,1), 99999, 50, 0.05F));
        	event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.HONEYCOMB,1), new ItemStack(ItemList.COIN_0.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.HONEY_BOTTLE, 1), new ItemStack(ItemList.COIN_0.get(), 50), 99999, 50, 0.05F));
        	event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.BEE_NEST,1), 99999, 50, 0.05F));
        	event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(Items.HONEY_BLOCK, 1), new ItemStack(ItemList.COIN_0.get(), 1), 99999, 50, 0.05F));
        	event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.BONE_MEAL, 1), 99999, 50, 0.05F));
        	event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.CAMPFIRE, 1), 99999, 50, 0.05F));     
        	//event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.REDSTONE, 1), 99999, 50, 0.05F)); 
        	//event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.GLOWSTONE, 1), 99999, 50, 0.05F));
        }
    	
        if (event.getType() == VillagerProfessions.OLD_DERPY)
        {
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.COOKED_MUTTON, 5), 99999, 50, 0.05F));
            //event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.COOKED_BEEF, 6), 99999, 50, 0.05F));
            //event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.WHEAT, 5), 99999, 50, 0.05F));
            //event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.POTATO, 6), 99999, 50, 0.05F));
            //event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(Items.POTATO, 1), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(Items.WHEAT, 16), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.WHEAT, 1), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));            
        }  
        
        if (event.getType() == VillagerProfessions.MONSTER_TRAPPER)
        {
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.SPAWNER, 1), 99999, 50, 0.05F));
            event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.SKELETON_SPAWN_EGG, 1), 99999, 50, 0.05F));
            event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.SPIDER_SPAWN_EGG, 1), 99999, 50, 0.05F));
            event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.CREEPER_SPAWN_EGG, 1), 99999, 50, 0.05F));
            event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.ZOMBIE_SPAWN_EGG), 99999, 50, 0.5F));
            event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.WITCH_SPAWN_EGG), 99999, 50, 0.5F));
            event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.SLIME_SPAWN_EGG), 99999, 50, 0.5F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.WHEAT, 1), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));            
        } 
        
        if (event.getType() == VillagerProfessions.END_TRADER)
        {
            event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.ENDERMAN_SPAWN_EGG, 1), 99999, 50, 0.05F));
        	event.getTrades().get(1).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.END_PORTAL_FRAME, 1), 99999, 50, 0.05F));
            event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.END_STONE, 64), new ItemStack(ItemList.COIN_0.get(),1), 99999, 50, 0.5F));
            event.getTrades().get(2).add((entity, add) -> new MerchantOffer(new ItemStack(Items.ENDER_PEARL, 16), new ItemStack(ItemList.COIN_0.get(), 1), 99999, 50, 0.5F));
            event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.SHULKER_SPAWN_EGG, 1), 99999, 50, 0.05F));
            event.getTrades().get(3).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.END_ROD, 1), 99999, 50, 0.05F));
            event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(Items.CHORUS_FRUIT, 1), new ItemStack(ItemList.COIN_0.get(), 1), 99999, 50, 0.5F));
            event.getTrades().get(4).add((entity, add) -> new MerchantOffer(new ItemStack(ItemList.COIN_0.get(), 1), new ItemStack(Items.CHORUS_FLOWER, 1), 99999, 50, 0.05F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));
            //event.getTrades().get(5).add((entity, add) -> new MerchantOffer(new ItemStack(Items.WHEAT, 1), new ItemStack(Items.REDSTONE), 99999, 50, 0.5F));            
        } 
    }
}
