package com.github.wimpingego.nnow.objects.items;

//import net.minecraft.block.Blocks;
//import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.TextFormatting;;

public class DeathPotato extends Item {
	
	public DeathPotato(Properties properties) {
		super(properties);
	}

	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	//@Override
	//public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
		//entity.getEntityWorld().setBlockState(entity.getPosition(), Blocks.FIRE.getDefaultState());
		//return super.onEntityItemUpdate(stack, entity);
	//}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return Rarity.create("DeathPotato", TextFormatting.GREEN);
	}
}

	  
	  
	  
	  
	  
	  