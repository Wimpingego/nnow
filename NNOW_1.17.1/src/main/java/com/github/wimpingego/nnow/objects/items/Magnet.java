package com.github.wimpingego.nnow.objects.items;


import java.util.List;

import com.github.wimpingego.nnow.util.EnableUtil;
import com.github.wimpingego.nnow.util.MagnetRangeUtil;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.AABB;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class Magnet extends Item
{
	public Magnet(Properties properties)
	{
		super(properties);
	}
	
	int range = ModConfigs.PICKUP_RANGE.get();
	
	public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
	{	
		if(entity instanceof Player && !world.isClientSide && EnableUtil.isEnabled(stack))
		{
			Player player = (Player)entity;
			
			boolean init = MagnetRangeUtil.getCurrentlySet(stack);
			
			if(!init)
			{
				range = ModConfigs.PICKUP_RANGE.get();
			}
			else
			{
				range = MagnetRangeUtil.getCurrentRange(stack);
			}			

			double x = player.getX();
			double y = player.getY();
			double z = player.getZ();

			//Scan for and collect items
			List<ItemEntity> items = entity.level.getEntitiesOfClass(ItemEntity.class, new AABB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ItemEntity e: items)
			{
				if(!player.isShiftKeyDown() && !e.getPersistentData().getBoolean("PreventRemoteMovement"))
				{						
					double factor = 0.035;
					e.push((x - e.getX()) * factor, (y - e.getY()+1.25) * factor, (z - e.getZ()) * factor);
				}
			}

			//Scan for and collect XP Orbs
			List<ExperienceOrb> xp = entity.level.getEntitiesOfClass(ExperienceOrb.class, new AABB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ExperienceOrb orb: xp)
			{
				if(!player.isShiftKeyDown())
				{						
					double factor = 0.035;
					orb.push((x - orb.getX()) * factor, (y - orb.getY()+1.25) * factor, (z - orb.getZ()) * factor);
				}
			}
		}
	}
	
	@Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
		ItemStack stack = player.getItemInHand(hand);	
		
		if(!world.isClientSide && !(player.isShiftKeyDown()))
        {
          EnableUtil.changeEnabled(player, hand);
          player.sendMessage(new TranslatableComponent("item.nnow.magnet.line1", EnableUtil.isEnabled(stack)), null);
          return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, player.getItemInHand(hand));
        }		
       
        return super.use(world, player, hand);
    }
	
	@Override
	public boolean isFoil(ItemStack stack)
	{
		return EnableUtil.isEnabled(stack);
	}
	  
	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslatableComponent("item.nnow.magnet.line2")));
			tooltip.add((new TranslatableComponent("item.nnow.magnet.line3",range)));
		} else {
			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
	
	
}