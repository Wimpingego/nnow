package com.github.wimpingego.nnow.objects.items.hammers;

import com.github.wimpingego.nnow.util.ModConfigs;

import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class StoneHammer extends Hammer{
	
	Double speed = ModConfigs.STONE_HAMMER_SPEED_MODIFIER.get();
	static int use = ModConfigs.STONE_HAMMER_DURABILITY_MODIFIER.get();
	
	public StoneHammer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder.maxDamage(use));
	}

	  @Override
	  public float getDestroySpeed(ItemStack stack, BlockState state)
	  {
	    return super.getDestroySpeed(stack, state) / speed.floatValue();
	  }
	
}
