package com.github.wimpingego.nnow.objects.items;
import java.util.List;

import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import com.github.wimpingego.nnow.util.plus.GrowingUtil;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Viagra extends Item
{

	int radius = ModConfigs.VIAGRA_RADIUS.get();
	int baseTickDelay = ModConfigs.VIAGRA_TICK_DELAY.get();
	
	public Viagra(Properties properties)
	{
		super(properties);
	}
 
	public void inventoryTick(ItemStack stack, World world, Entity entity, int par4, boolean par5)
    {      
    	if(!(entity instanceof PlayerEntity) || world.isRemote)
        {
            return;
        }

    	PlayerEntity player = (PlayerEntity)entity;
        ItemStack equippedMain = player.getHeldItemMainhand();
        
        if(stack == equippedMain)
        {
			if (!world.isRemote)
			{  
				GrowingUtil.growCrops(world, player, baseTickDelay, radius);
			}
        }
    }
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.viagra.line1").applyTextStyle(TextFormatting.YELLOW)));
			tooltip.add((new TranslationTextComponent("item.nnow.viagra.line2", radius).applyTextStyle(TextFormatting.LIGHT_PURPLE)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
}
