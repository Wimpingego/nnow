package com.github.wimpingego.nnow.objects.items;

//import net.minecraft.block.Blocks;
//import net.minecraft.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.ChatFormatting;

import net.minecraft.world.item.Item.Properties;

public class DeathPotato extends Item {
	
	public DeathPotato(Properties properties) {
		super(properties);
	}

	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}

//	@Override
//	public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
//		entity.getEntityWorld().setBlockState(entity.getPosition(), Blocks.WATER.getDefaultState());
//		return super.onEntityItemUpdate(stack, entity);
//	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return Rarity.create("DeathPotato", ChatFormatting.GREEN);
	}
	
	public boolean hasEnchantment() {
		return true;
		}
	
}

	  
	  
	  
	  
	  
	  