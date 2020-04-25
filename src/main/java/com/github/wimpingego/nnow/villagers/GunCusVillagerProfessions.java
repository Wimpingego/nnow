package com.github.wimpingego.nnow.villagers;


import com.github.wimpingego.nnow.NNOW;
import com.google.common.collect.ImmutableSet;

import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
@ObjectHolder(NNOW.MOD_ID)
public class GunCusVillagerProfessions
{
    public static final VillagerProfession ARMS_DEALER = null;
    
    @SubscribeEvent
    public static void registerVillagerProfessions(Register<VillagerProfession> event)
    {
        IForgeRegistry<VillagerProfession> registry = event.getRegistry();
        
        registry.register(GunCusUtility.villagerProfession("arms_dealer", GunCusPointOfInterestTypes.ARMS_DEALER, ImmutableSet.of(), ImmutableSet.of(), null).setRegistryName(NNOW.MOD_ID, "arms_dealer"));
    }
}
