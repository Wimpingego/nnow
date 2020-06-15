package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Author: CAS_ual_TY
 */

@EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
@ObjectHolder(NNOW.MOD_ID)
public class PointOfInterestTypes
{
    public static final PointOfInterestType OLD_DERPY = null;
    public static final PointOfInterestType BANKER = null;
    public static final PointOfInterestType BEEKEEPER = null;
    public static final PointOfInterestType MONSTER_TRAPPER = null;
    public static final PointOfInterestType END_TRADER = null;
    public static final PointOfInterestType SEA_TRADER = null;
    public static final PointOfInterestType SEA_FISHERMAN = null;
    
    @SubscribeEvent
    public static void registerPointOfInterestTypes(Register<PointOfInterestType> event)
    {
        IForgeRegistry<PointOfInterestType> registry = event.getRegistry();
        
        registry.register(VillagerUtil.pointOfInterestType("old_derpy", VillagerUtil.getAllStates(BlockList.SWORD_IN_STONE.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "old_derpy"));
        registry.register(VillagerUtil.pointOfInterestType("beekeeper", VillagerUtil.getAllStates(BlockList.BEEKEEPER_BLOCK.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "beekeeper"));
        registry.register(VillagerUtil.pointOfInterestType("end_trader", VillagerUtil.getAllStates(BlockList.END_LANTERN.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "end_trader"));
        registry.register(VillagerUtil.pointOfInterestType("sea_trader", VillagerUtil.getAllStates(BlockList.SEA_TRADER_POI.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "sea_trader"));
        registry.register(VillagerUtil.pointOfInterestType("sea_fisherman", VillagerUtil.getAllStates(BlockList.SEA_FISHERMAN_POI.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "sea_fisherman"));
        
        registry.register(VillagerUtil.pointOfInterestType("banker", VillagerUtil.getAllStates(BlockList.SAFE_CHEST.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "banker"));
        registry.register(VillagerUtil.pointOfInterestType("monster_trapper", VillagerUtil.getAllStates(BlockList.TRAP_BLOCK.get()), 1, 1).setRegistryName(NNOW.MOD_ID, "monster_trapper"));
    }
}