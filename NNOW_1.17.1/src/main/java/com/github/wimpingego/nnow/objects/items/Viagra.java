package com.github.wimpingego.nnow.objects.items;
import java.util.List;

import com.github.wimpingego.nnow.util.EnableUtil;
import com.github.wimpingego.nnow.util.GrowingUtil;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class Viagra extends Item {

	static int use = ModConfigs.VIAGRA_MAX_USES.get();
	int radius = ModConfigs.VIAGRA_RADIUS.get();
	int baseTickDelay = ModConfigs.VIAGRA_TICK_DELAY.get();

	public Viagra(Properties properties) {
		super(properties.durability(use));
	}

	public void inventoryTick(ItemStack stack, Level world, Entity entity, int par4, boolean par5) {
		if (!(entity instanceof Player) || world.isClientSide) {
			return;
		}

		Player player = (Player) entity;
		ItemStack equippedMain = player.getMainHandItem();

		if (stack == equippedMain) {
			if (!world.isClientSide && EnableUtil.isEnabled(stack)) {
				GrowingUtil.growCrops(world, player, baseTickDelay, radius);

				if (ModConfigs.VIAGRA_TAKES_USES.get()) {
					stack.hurt(1, world.random, (ServerPlayer) player);
					stack.hurtAndBreak(1, player,
							playerEntity -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
				}
			}
		}
	}

	@Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
		ItemStack stack = player.getItemInHand(hand);	
		
		if(!world.isClientSide && !((player.isShiftKeyDown())))
        {
          EnableUtil.changeEnabled(player, hand);
          player.sendMessage(new TranslatableComponent("item.nnow.viagra.line3", EnableUtil.isEnabled(stack)), null);
          return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, player.getItemInHand(hand));
        }		
       
        return super.use(world, player, hand);
    }

	@Override
	public boolean isFoil(ItemStack stack) {
		return EnableUtil.isEnabled(stack);
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.EMERALD_BLOCK;
	}

	@Override
	public float getXpRepairRatio(ItemStack stack) {
		return 5f;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslatableComponent("item.nnow.viagra.line1")));
			tooltip.add((new TranslatableComponent("item.nnow.viagra.line2", radius)));
		} else {
			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
		}
	}
}
