package com.github.wimpingego.nnow.villagers;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.block.Blocks;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
@ObjectHolder(NNOW.MOD_ID)
public class GunCusPointOfInterestTypes
{
    public static final PointOfInterestType ARMS_DEALER = null;
    
    @SubscribeEvent
    public static void registerPointOfInterestTypes(Register<PointOfInterestType> event)
    {
        IForgeRegistry<PointOfInterestType> registry = event.getRegistry();
        
        registry.register(GunCusUtility.pointOfInterestType("arms_dealer", GunCusUtility.getAllStates(Blocks.REDSTONE_BLOCK), 1, 1).setRegistryName(NNOW.MOD_ID, "arms_dealer"));
    }
}