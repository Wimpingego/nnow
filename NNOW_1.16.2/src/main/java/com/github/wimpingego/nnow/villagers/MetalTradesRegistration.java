package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.MetalItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class MetalTradesRegistration {
	
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event){

        if (event.getType() == VillagerProfessions.INGOT_TRADER)
        {
    		if(ModConfigs.METALS_ITEMS_LOADED.get() == true) {
    			
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,12).setForSale(MetalItemList.COPPER_INGOT.get(), 1,4).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,12).setForSale(MetalItemList.TIN_INGOT.get(), 1,4).build())); 
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,12).setForSale(MetalItemList.ZINC_INGOT.get(), 1,4).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,16).setForSale(MetalItemList.SILVER_INGOT.get(),1,4).build())); 
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,16).setForSale(MetalItemList.LEAD_INGOT.get(),1,4).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,24).setForSale(MetalItemList.NICKEL_INGOT.get(),1,4).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,24).setForSale(MetalItemList.ALUMINUM_INGOT.get(),1,4).build()));  
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,24).setForSale(MetalItemList.OSMIUM_INGOT .get(),1,4).build()));
            
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(MetalItemList.URANIUM_INGOT.get(), 1,4).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(MetalItemList.BISMUTH_INGOT.get(),1,4).build())); 
            
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(16,64).setForSale(MetalItemList.PLATINUM_INGOT.get(),1,4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(16,64).setForSale(MetalItemList.IRIDIUM_INGOT.get(),1,4).build())); 
    		}
        }
    }
}
