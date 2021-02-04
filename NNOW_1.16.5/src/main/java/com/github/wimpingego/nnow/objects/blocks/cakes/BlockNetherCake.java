package com.github.wimpingego.nnow.objects.blocks.cakes;

import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.List;

import com.github.wimpingego.nnow.util.config.ModConfigs;

public class BlockNetherCake extends BlockCakeBase {
    public BlockNetherCake(AbstractBlock.Properties properties) {
        super(properties);
    }

    @Override
    public void teleportToDimension(IWorld world, BlockPos pos, PlayerEntity player) {
        super.teleportToDimension(world, pos, player);
    }

    @Override
    public boolean isRefillItem(ItemStack stack) {
        List<? extends String> items = ModConfigs.NETHER_CAKE_REFILL_ITEMS.get();
        if (items == null || items.isEmpty()) return false;
        ResourceLocation registryLocation = stack.getItem().getRegistryName();
        return registryLocation != null && items.contains(registryLocation.toString());
    }

    @Override
    public RegistryKey<World> getCakeWorld() {
        return World.THE_NETHER;
    }

    @Override
    public boolean consumeCake() {
        return ModConfigs.EAT_NETHER_CAKE.get();
    }
}
