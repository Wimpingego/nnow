package com.github.wimpingego.nnow.objects.items;


import java.util.List;

import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import com.github.wimpingego.nnow.util.plus.EnableUtil;
import com.github.wimpingego.nnow.util.plus.MagnetRangeUtil;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Magnet extends Item
{
	public Magnet(Properties properties)
	{
		super(properties);
	}
	
	int range = ModConfigs.PICKUP_RANGE.get();
	
	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{	
		if(entity instanceof PlayerEntity && !world.isRemote && EnableUtil.isEnabled(stack))
		{
			PlayerEntity player = (PlayerEntity)entity;
			
			boolean init = MagnetRangeUtil.getCurrentlySet(stack);
			
			if(!init)
			{
				range = ModConfigs.PICKUP_RANGE.get();
			}
			else
			{
				range = MagnetRangeUtil.getCurrentRange(stack);
			}			

			double x = player.getPosX();
			double y = player.getPosY();
			double z = player.getPosZ();

			//Scan for and collect items
			List<ItemEntity> items = entity.world.getEntitiesWithinAABB(ItemEntity.class, new AxisAlignedBB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ItemEntity e: items)
			{
				if(!player.isShiftKeyDown() && !e.getPersistentData().getBoolean("PreventRemoteMovement"))
				{						
					double factor = 0.035;
					e.addVelocity((x - e.getPosX()) * factor, (y - e.getPosY()+1.25) * factor, (z - e.getPosZ()) * factor);
				}
			}

			//Scan for and collect XP Orbs
			List<ExperienceOrbEntity> xp = entity.world.getEntitiesWithinAABB(ExperienceOrbEntity.class, new AxisAlignedBB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ExperienceOrbEntity orb: xp)
			{
				if(!player.isShiftKeyDown())
				{						
					double factor = 0.035;
					orb.addVelocity((x - orb.getPosX()) * factor, (y - orb.getPosY()+1.25) * factor, (z - orb.getPosZ()) * factor);
				}
			}
		}
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
		//ItemStack stack = player.getHeldItem(hand);	
		
		if(!world.isRemote && !(player.isShiftKeyDown()))
        {
            EnableUtil.changeEnabled(player, hand);
           //player.sendMessage(new TranslationTextComponent("item.nnow.magnet.line1", EnableUtil.isEnabled(stack)).applyTextStyle(TextFormatting.GREEN));
            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, player.getHeldItem(hand));
        }		
       
        return super.onItemRightClick(world, player, hand);
    }
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return EnableUtil.isEnabled(stack);
	}
	  
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.magnet.line2").applyTextStyle(TextFormatting.YELLOW)));
			tooltip.add((new TranslationTextComponent("item.nnow.magnet.line3",range).applyTextStyle(TextFormatting.LIGHT_PURPLE)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
	
	
}