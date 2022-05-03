package com.github.wimpingego.nnow.objects.items.armor;


import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.PlayerSpecialAbilities;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class CustomArmorTC extends ArmorItem
{
	public CustomArmorTC(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	@Override	
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(player instanceof Player)
		{
			ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		    		    
	    	//Check ArmorUtil for additional perks applied to armor
	    	
		    //Helmet
		    if(head.getItem() == ItemList.TC_HELMET.get())
			{
		    	PlayerSpecialAbilities.giveWaterBreathingEffect(world, player, stack);				
			}
			else
			{
				//something
			}		    	
		}
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.SCUTE;
	}
}
