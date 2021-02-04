package com.github.wimpingego.nnow.objects.items;
import java.util.List;

import com.github.wimpingego.nnow.util.EnableUtil;
import com.github.wimpingego.nnow.util.GrowingUtil;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Viagra extends Item {

	static int use = ModConfigs.VIAGRA_MAX_USES.get();
	int radius = ModConfigs.VIAGRA_RADIUS.get();
	int baseTickDelay = ModConfigs.VIAGRA_TICK_DELAY.get();

	public Viagra(Properties properties) {
		super(properties.maxDamage(use));
	}

	public void inventoryTick(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if (!(entity instanceof PlayerEntity) || world.isRemote) {
			return;
		}

		PlayerEntity player = (PlayerEntity) entity;
		ItemStack equippedMain = player.getHeldItemMainhand();

		if (stack == equippedMain) {
			if (!world.isRemote && EnableUtil.isEnabled(stack)) {
				GrowingUtil.growCrops(world, player, baseTickDelay, radius);

				if (ModConfigs.VIAGRA_TAKES_USES.get()) {
					stack.attemptDamageItem(1, world.rand, (ServerPlayerEntity) player);
					stack.damageItem(1, player,
							playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));
				}
			}
		}
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
		ItemStack stack = player.getHeldItem(hand);	
		
		if(!world.isRemote && !((player.isSneaking())))
        {
          EnableUtil.changeEnabled(player, hand);
          player.sendMessage(new TranslationTextComponent("item.nnow.viagra.line3", EnableUtil.isEnabled(stack)), null);
          return new ActionResult<ItemStack>(ActionResultType.SUCCESS, player.getHeldItem(hand));
        }		
       
        return super.onItemRightClick(world, player, hand);
    }

	@Override
	public boolean hasEffect(ItemStack stack) {
		return EnableUtil.isEnabled(stack);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.EMERALD_BLOCK;
	}

	@Override
	public float getXpRepairRatio(ItemStack stack) {
		return 5f;
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.viagra.line1")));
			tooltip.add((new TranslationTextComponent("item.nnow.viagra.line2", radius)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
		}
	}
}
