package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;
//import com.github.wimpingego.nnow.init.ItemList;
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
        	event.getTrades().get(1).add((new RandomTradeBuilder(64, 25, 0.05F).setPrice(Items.COAL, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.COAL_ORE, 1, 2).build()));
        	
        	event.getTrades().get(2).add((new RandomTradeBuilder(64, 25, 0.2F).setPrice(Items.IRON_INGOT, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.IRON_ORE, 1, 2).build()));
        	event.getTrades().get(2).add((new RandomTradeBuilder(64, 25, 0.2F).setPrice(Items.GOLD_INGOT, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.GOLD_ORE, 1, 2).build()));
        	
        	event.getTrades().get(3).add((new RandomTradeBuilder(64, 25, 0.05F).setPrice(Items.REDSTONE, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.REDSTONE_ORE, 1, 2).build()));
        	event.getTrades().get(3).add((new RandomTradeBuilder(64, 25, 0.05F).setPrice(Items.LAPIS_LAZULI, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.LAPIS_ORE, 1, 2).build()));
        	
        	event.getTrades().get(4).add((new RandomTradeBuilder(64, 25, 0.2F).setPrice(Items.QUARTZ, 1,1).setPrice2(Items.NETHERRACK, 8,8).setForSale(Items.NETHER_QUARTZ_ORE, 1, 2).build()));
        	event.getTrades().get(4).add((new RandomTradeBuilder(64, 25, 0.2F).setPrice(Items.DIAMOND, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.DIAMOND_ORE, 1, 2).build()));
        	
        	event.getTrades().get(5).add((new RandomTradeBuilder(64, 25, 0.2F).setPrice(Items.EMERALD, 1,1).setPrice2(Items.STONE, 8,8).setForSale(Items.EMERALD_ORE, 1, 2).build()));    
        	event.getTrades().get(5).add((new RandomTradeBuilder(64, 50, 0.05F).setPrice(Items.WITHER_SKELETON_SKULL, 3,6).setPrice2(Items.SOUL_SAND, 4,4).setForSale(Items.NETHER_STAR, 1, 1).build()));    
        } 
        
        if (event.getType() == VillagerProfessions.BEEKEEPER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 25, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BEE_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 25, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BEEHIVE, 1, 1).build()));
           	event.getTrades().get(1).add((new RandomTradeBuilder(64, 25, 0.05F).setEmeraldPrice(1,8).setForSale(Items.BONE_MEAL, 1, 32).build()));
           	
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 15, 0.05F).setPrice(Items.HONEYCOMB, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(64, 15, 0.05F).setPrice(Items.HONEY_BOTTLE, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            
           	event.getTrades().get(3).add((new RandomTradeBuilder(64, 25, 0.05F).setEmeraldPrice(16,32).setForSale(Items.BEE_NEST, 1, 1).build()));
           	event.getTrades().get(3).add((new RandomTradeBuilder(64, 15, 0.05F).setPrice(Items.HONEY_BLOCK, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 25, 0.05F).setEmeraldPrice(16).setForSale(Items.CAMPFIRE, 1, 1).build()));
        }
    	
        if (event.getType() == VillagerProfessions.OLD_DERPY)
        {
        	event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_LOG, 8,16).setForSale(Items.EMERALD, 1, 4).build()));
        	event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.APPLE, 4,8).setForSale(Items.EMERALD, 1, 2).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SWEET_BERRIES, 1,4).build())); 
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,4).setForSale(Items.WHEAT_SEEDS, 2,8).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,2).setForSale(Items.APPLE, 4,8).build())); 
            
        	event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.ROTTEN_FLESH, 16,32).setForSale(Items.EMERALD, 1, 3).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(2,8).setForSale(Items.DIRT, 2,8).build())); 
           	event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.COAL, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.ICE, 1, 8).build()));
            
           	event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.IRON_INGOT, 1, 2).build()));     
           	event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GOLD_INGOT, 1, 2).build()));
        	event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setPrice(Items.OAK_SAPLING, 16,32).setForSale(Items.EMERALD, 1, 2).build()));

           	
           	event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.REDSTONE, 1, 16).build())); 
           	event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.LAPIS_LAZULI, 1, 8).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.DIRT, 1,1).setPrice2(Items.WHEAT_SEEDS, 4,8).setForSale(Items.GRASS_BLOCK, 1, 1).build()));
           	
           	event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 1, 4).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND, 1, 3).build()));  
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.DIAMOND_PICKAXE, 1,1).build())); 
        }  
        
        if (event.getType() == VillagerProfessions.MONSTER_TRAPPER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 50, 0.05F).setEmeraldPrice(32,64).setForSale(Items.SPAWNER, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.SKELETON_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.ZOMBIE_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.SPIDER_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.CREEPER_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.ENDERMAN_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.WITCH_SPAWN_EGG, 1, 1).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BLAZE_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(1,16).setForSale(Items.PILLAGER_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.ZOMBIE_PIGMAN_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(4,16).setForSale(Items.GUARDIAN_SPAWN_EGG, 1, 1).build()));  
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.SLIME_SPAWN_EGG, 1, 1).build()));  
            
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.GHAST_SPAWN_EGG, 1, 1).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.MAGMA_CUBE_SPAWN_EGG, 1, 1).build()));   
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.SHULKER_SPAWN_EGG, 1, 1).build()));   
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(1,8).setForSale(Items.RAVAGER_SPAWN_EGG, 1, 1).build()));  
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(1,64).setForSale(Items.VINDICATOR_SPAWN_EGG, 1, 1).build())); 
            
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(16,64).setForSale(Items.EVOKER_SPAWN_EGG, 1, 1).build()));   
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(16,64).setForSale(Items.WITHER_SKELETON_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(16,64).setForSale(Items.ELDER_GUARDIAN_SPAWN_EGG, 1, 1).build())); 
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,32).setForSale(Items.PHANTOM_SPAWN_EGG, 1, 1).build())); 
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(16,64).setForSale(Items.VEX_SPAWN_EGG, 1, 1).build())); 
        } 
        
        if (event.getType() == VillagerProfessions.END_TRADER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.END_STONE, 8, 64).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(2,8).setForSale(Items.ENDER_PEARL, 16,1).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,16).setForSale(Items.PURPLE_STAINED_GLASS, 4,16).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,32).setForSale(Items.OBSIDIAN, 8, 16).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setPrice(Items.END_STONE, 8,64).setForSale(Items.EMERALD, 1, 8).build()));
           	event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setPrice(Items.ENDER_PEARL,16,1).setForSale(Items.EMERALD, 1,1).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(1,16).setForSale(Items.CHORUS_FRUIT, 1, 8).build()));
           	event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(1,32).setForSale(Items.SHULKER_SHELL, 2, 8).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(1,32).setForSale(Items.END_ROD, 1, 8).build()));
           	
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setPrice(Items.CHORUS_FRUIT, 8,16).setForSale(Items.EMERALD, 1, 8).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,16).setForSale(Items.CHORUS_FLOWER, 1, 4).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setPrice(Items.PURPUR_BLOCK, 16,32).setForSale(Items.EMERALD, 4, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,16).setForSale(Items.END_STONE, 32, 64).build()));
            
            event.getTrades().get(5).add((new RandomTradeBuilder(16, 64, 0.05F).setEmeraldPrice(32,64).setForSale(Items.ELYTRA, 1, 1).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(32,64).setForSale(Items.END_PORTAL_FRAME, 1, 1).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(32,64).setForSale(Items.DRAGON_HEAD, 1, 1).build()));
        } 
        
        if (event.getType() == VillagerProfessions.SEA_TRADER)
        {            	
        	
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL_BLOCK, 8, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL_BLOCK, 8, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL_BLOCK, 8, 16).build()));  
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL_BLOCK, 8, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL_BLOCK, 8, 16).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,32).setForSale(Items.PRISMARINE_SHARD, 4, 16).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(8,32).setForSale(Items.PRISMARINE_CRYSTALS, 4, 16).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,16).setForSale(Items.SEA_PICKLE, 4, 32).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,16).setForSale(Items.SEAGRASS, 8, 64).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(2,8).setForSale(Items.KELP, 8, 16).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(1,8).setForSale(Items.TURTLE_EGG, 1, 4).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL, 8, 16).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL, 8, 16).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL, 8, 16).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL, 8, 16).build())); 
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL, 8, 16).build())); 
            
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.TUBE_CORAL_FAN, 8, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.FIRE_CORAL_FAN, 8, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.HORN_CORAL_FAN, 8, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BRAIN_CORAL_FAN, 8, 16).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 10, 0.05F).setEmeraldPrice(4,32).setForSale(Items.BUBBLE_CORAL_FAN, 8, 16).build())); 
            
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.HEART_OF_THE_SEA, 1, 1).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 50, 0.05F).setEmeraldPrice(32,32).setForSale(Items.TRIDENT, 1, 1).build()));       
        } 
        
        if (event.getType() == VillagerProfessions.SEA_FISHERMAN)
        {      
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.INK_SAC, 1, 10).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.COD, 1, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SALMON, 1, 16).build())); 
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(4,32).setForSale(Items.LILY_PAD, 4, 16).build()));  
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SQUID_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.TROPICAL_FISH, 1, 16).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.PUFFERFISH, 1, 16).build())); 
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.STRING, 1, 16).build())); 
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,16).setForSale(Items.BOOK, 1, 16).build())); 
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.NAME_TAG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(1,8).setForSale(Items.SADDLE, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.COD_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SALMON_SPAWN_EGG, 1, 1).build()));     
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.NAUTILUS_SHELL, 1, 4).build()));   
        
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.TROPICAL_FISH_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.PUFFERFISH_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.BAMBOO, 1, 16).build()));
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,32).setForSale(Items.COCOA_BEANS, 16, 64).build()));
            
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.TURTLE_SPAWN_EGG, 1, 1).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 20, 0.05F).setEmeraldPrice(8,64).setForSale(Items.SPONGE, 1, 8).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 50, 0.05F).setEmeraldPrice(32,64).setForSale(Items.TRIDENT, 1, 1).build())); 
        }     
        
        if (event.getType() == VillagerProfessions.NETHER_TRADER)
        {
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 30, 0.02F).setEmeraldPrice(1,16).setForSale(Items.NETHERRACK, 8, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(1,16).setForSale(Items.SOUL_SAND, 8, 16).build()));
            event.getTrades().get(1).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.BUCKET, 1,1).setPrice2(Items.COBBLESTONE, 8,16).setForSale(Items.LAVA_BUCKET, 1, 1).build()));
            
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(4,16).setForSale(Items.NETHER_WART, 16, 32).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(1,16).setForSale(Items.GRAVEL, 8, 16).build()));
            event.getTrades().get(2).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.BONE_BLOCK, 4,8).setForSale(Items.EMERALD, 4, 16).build()));
            
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.QUARTZ, 4, 8).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(4,16).setForSale(Items.MAGMA_BLOCK, 8, 16).build()));
            event.getTrades().get(3).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GLOWSTONE_DUST, 16, 32).build())); 
            
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.BLAZE_ROD, 1, 4).build())); 
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(2,16).setForSale(Items.MAGMA_CREAM, 4, 16).build()));   
            event.getTrades().get(4).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.BLAZE_POWDER, 1, 8).build()));   
            
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(4,32).setForSale(Items.GHAST_TEAR, 1, 4).build()));   
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setEmeraldPrice(8,16).setForSale(Items.GLOWSTONE, 1, 16).build()));
            event.getTrades().get(5).add((new RandomTradeBuilder(64, 30, 0.05F).setPrice(Items.EMERALD, 32,64).setPrice2(Items.WITHER_SKELETON_SPAWN_EGG, 1,1).setForSale(Items.WITHER_SKELETON_SKULL, 1, 3).build()));
        } 
    }
}
