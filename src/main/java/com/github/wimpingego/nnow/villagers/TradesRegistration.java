package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;
import net.minecraft.item.Items;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class TradesRegistration {
	
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event){

        if (event.getType() == VillagerProfessions.BANKER)
        {
        	event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.COAL, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.COAL_ORE, 1, 2).build()));
        	
        	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.IRON_INGOT, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.IRON_ORE, 1, 2).build()));
        	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.GOLD_INGOT, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.GOLD_ORE, 1, 2).build()));
        	
        	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.REDSTONE, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.REDSTONE_ORE, 1, 2).build()));
        	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.LAPIS_LAZULI, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.LAPIS_ORE, 1, 2).build()));
        	
        	event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.QUARTZ, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.NETHER_QUARTZ_ORE, 1, 2).build()));
        	event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.DIAMOND, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.DIAMOND_ORE, 1, 2).build()));
        	
        	event.getTrades().get(5).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.EMERALD, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.EMERALD_ORE, 1, 2).build()));    
        	event.getTrades().get(5).add((new RandomTradeBuilder(16, 50, 0.05F).setEmeraldPrice(64,128).setForSale(Items.NETHER_STAR, 1, 1).build()));    
        } 
        
        if (event.getType() == VillagerProfessions.BEEKEEPER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BEE_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BEEHIVE, 1, 1).build()));
           	
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.HONEYCOMB, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.HONEY_BOTTLE, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            
           	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(16,32).setForSale(Items.BEE_NEST, 1, 1).build()));
           	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.HONEY_BLOCK, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            
           	event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(1,8).setForSale(Items.BONE_MEAL, 1, 32).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(16).setForSale(Items.CAMPFIRE, 1, 1).build()));
        }
    	
        if (event.getType() == VillagerProfessions.OLD_DERPY)
        {
        	event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.OAK_LOG, 1,16).setForSale(Items.EMERALD, 1, 8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build()));         
            
           	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));
            
           	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));     
           	event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
           	
           	event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 2).build())); 
           	event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 2).build())); 
           	
           	event.getTrades().get(5).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 2).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 2).build()));  
        }  
        
        if (event.getType() == VillagerProfessions.MONSTER_TRAPPER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 50, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SPAWNER, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.SKELETON_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.SPIDER_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.CREEPER_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.ZOMBIE_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.WITCH_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.SLIME_SPAWN_EGG, 1, 1).build()));        
        } 
        
        if (event.getType() == VillagerProfessions.END_TRADER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.ENDERMAN_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(32,64).setForSale(Items.END_PORTAL_FRAME, 1, 1).build()));
           	
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.END_STONE, 8,64).setForSale(Items.EMERALD, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.ENDER_PEARL,16,16).setForSale(Items.EMERALD, 1, 4).build()));
            
           	event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(1,64).setForSale(Items.SHULKER_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(1,32).setForSale(Items.END_ROD, 1, 16).build()));
           	
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setPrice(Items.CHORUS_FRUIT, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,16).setForSale(Items.CHORUS_FLOWER, 1, 1).build()));         
        } 
        
        if (event.getType() == VillagerProfessions.SEA_TRADER)
        {            	
        	
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL_BLOCK, 8, 32).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL_BLOCK, 8, 32).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL_BLOCK, 8, 32).build()));  
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL_BLOCK, 8, 32).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL_BLOCK, 8, 32).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,64).setForSale(Items.PRISMARINE_SHARD, 4, 64).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,64).setForSale(Items.PRISMARINE_CRYSTALS, 4, 64).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SEA_PICKLE, 4, 32).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SEAGRASS, 8, 64).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL, 8, 64).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL, 8, 64).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL, 8, 64).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL, 8, 64).build())); 
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL, 8, 64).build())); 
            
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL_FAN, 8, 64).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL_FAN, 8, 64).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL_FAN, 8, 64).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL_FAN, 8, 64).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL_FAN, 8, 64).build())); 
            
            event.getTrades().get(5).add((new RandomTradeBuilder(16, 50, 0.05F).setEmeraldPrice(32,32).setForSale(Items.TRIDENT, 1, 1).build()));       
        } 
        
        if (event.getType() == VillagerProfessions.SEA_FISHERMAN)
        {            	
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SQUID_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.COD_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SALMON_SPAWN_EGG, 1, 1).build()));         
        
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.TROPICAL_FISH_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.PUFFERFISH_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SQUID_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.COD_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SALMON_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.GUARDIAN_SPAWN_EGG, 1, 1).build())); 
            
            event.getTrades().get(4).add((new RandomTradeBuilder(16, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.GUARDIAN_SPAWN_EGG, 1, 1).build())); 
            
            event.getTrades().get(5).add((new RandomTradeBuilder(16, 50, 0.05F).setEmeraldPrice(32,64).setForSale(Items.TRIDENT, 1, 1).build())); 
        }     
    }
}
