package com.github.wimpingego.nnow.objects.items.armor;


import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.PlayerSpecialAbilities;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ItemCustomArmorTC extends ArmorItem
{
	public ItemCustomArmorTC(IArmorMaterial materialIn, EquipmentSlotType slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}	
	
	@Override	
	public void onArmorTick(final ItemStack stack, final World world, final PlayerEntity player)
	{
		if(player instanceof PlayerEntity)
		{
			ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		    		    
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
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.SCUTE;
	}
}
