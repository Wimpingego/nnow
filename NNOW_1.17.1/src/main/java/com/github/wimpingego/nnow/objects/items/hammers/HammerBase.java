package com.github.wimpingego.nnow.objects.items.hammers;

import java.util.List;

import com.github.wimpingego.nnow.util.ToolUtil3x3;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import net.minecraft.world.item.Item.Properties;

public class HammerBase extends PickaxeItem {
	public HammerBase(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entity) {
		if (!world.isClientSide) {
			if (state.getDestroySpeed(world, pos) == 0) {
				return true;
			}
		}

		if (entity instanceof Player) {
			Player player = (Player) entity;
			if (!player.isCrouching()) {
				breakNeighbours(world, pos, (ServerPlayer) player, true, stack);
				return true;

			} else {
				stack.hurtAndBreak(1, player,
						playerEntity -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
			}
		}
		return true;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		if (state.getBlock() == Blocks.BEDROCK) {
			return false;
		}
		//return super.canHarvestBlock(state) || state.getBlock() == BlockTags.SAND || state.getBlock() == Tags.Blocks.DIRT || state.getBlock() == Tags.Blocks.GRAVEL || state.getBlock() == Blocks.SOUL_SAND;
		return super.isCorrectToolForDrops(state) || state.getBlock() == Blocks.DIRT|| state.getBlock() == Blocks.GRAVEL || state.getBlock() == Blocks.SAND || state.getBlock() == Blocks.RED_SAND;}

	private void breakNeighbours(Level world, BlockPos pos, ServerPlayer player, boolean damageItem,
			ItemStack stack) {

		BlockHitResult rayTraceResult = ToolUtil3x3.getLookingAt(player, 6);
		Direction facing = rayTraceResult.getDirection();

		List<BlockPos> brokenBlocks = ToolUtil3x3.getBlocks(pos, facing);
		for (BlockPos blockPos : brokenBlocks) {
			BlockState blockState = world.getBlockState(blockPos);
			if (!isCorrectToolForDrops(blockState)) {
				continue;
			}

//			if (blockState.getBlock().hasTileEntity(blockState))
//			{
//				continue;
//			}

			world.destroyBlock(blockPos, false);

			if (!player.isCreative()) {
				if (damageItem) {
					player.getMainHandItem().hurtAndBreak(1, player,
							playerEntity -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
				}

				ToolUtil3x3.dropItems(world, Block.getDrops(blockState, (ServerLevel) world, blockPos, null, player,
						player.getMainHandItem()), blockPos);
				ToolUtil3x3.spawnExp(world, blockPos, blockState,
						EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, stack),
						EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack));

				blockState.spawnAfterBreak((ServerLevel) world, blockPos, player.getMainHandItem());
			}
		}
	}

	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslatableComponent("item.nnow.hammer.line1")));
			tooltip.add((new TranslatableComponent("item.nnow.hammer.line2")));
		} else {
			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
		}
	}
}