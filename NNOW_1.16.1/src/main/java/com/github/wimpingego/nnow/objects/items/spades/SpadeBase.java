package com.github.wimpingego.nnow.objects.items.spades;

import java.util.List;

import com.github.wimpingego.nnow.util.ToolUtil3x3;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class SpadeBase extends ShovelItem {
	
	public SpadeBase(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity) {

		if (!world.isRemote) {
			if (state.getBlockHardness(world, pos) == 0) {
				return true;
			}

			if (entity instanceof PlayerEntity) {
				PlayerEntity player = (PlayerEntity) entity;
				if (!player.isCrouching()) {
					breakNeighbours(world, pos, (ServerPlayerEntity) player, true, stack);
					return true;
				} else {
					stack.damageItem(1, player,
							playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));
				}
			}
		}

		return true;
	}

	  @Override
	  public boolean canHarvestBlock(BlockState state)
	  {
	    if (state.getBlock() == Blocks.BEDROCK)
	    {
	      return false;
	    }
	    //return state.getBlock() == BlockTags.SAND || state.getBlock() == Tags.Blocks.DIRT || state.getBlock() == Tags.Blocks.GRAVEL || state.getBlock() == Blocks.SOUL_SAND;
		return super.canHarvestBlock(state)
				|| state.getBlock() == Blocks.GRASS_BLOCK || state.getBlock() == Blocks.GRASS_PATH || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.COARSE_DIRT
				|| state.getBlock() == Blocks.PODZOL || state.getBlock() == Blocks.FARMLAND || state.getBlock() == Blocks.MYCELIUM || state.getBlock() == Blocks.GRAVEL || state.getBlock() == Blocks.CLAY
				|| state.getBlock() == Blocks.SAND || state.getBlock() == Blocks.RED_SAND || state.getBlock() == Blocks.SOUL_SOIL || state.getBlock() == Blocks.SOUL_SAND
				|| state.getBlock() == Blocks.SNOW_BLOCK || state.getBlock() == Blocks.SNOW
			 	|| state.getBlock() == Blocks.WHITE_CONCRETE_POWDER || state.getBlock() == Blocks.ORANGE_CONCRETE_POWDER || state.getBlock() ==  Blocks.MAGENTA_CONCRETE_POWDER || state.getBlock() ==  Blocks.LIGHT_BLUE_CONCRETE_POWDER
			 	|| state.getBlock() ==  Blocks.YELLOW_CONCRETE_POWDER|| state.getBlock() == Blocks.LIME_CONCRETE_POWDER || state.getBlock() ==  Blocks.PINK_CONCRETE_POWDER || state.getBlock() ==  Blocks.GRAY_CONCRETE_POWDER
			 	|| state.getBlock() ==  Blocks.LIGHT_GRAY_CONCRETE_POWDER || state.getBlock() ==  Blocks.CYAN_CONCRETE_POWDER|| state.getBlock() ==  Blocks.PURPLE_CONCRETE_POWDER || state.getBlock() ==  Blocks.BLUE_CONCRETE_POWDER
			 	|| state.getBlock() ==  Blocks.BROWN_CONCRETE_POWDER || state.getBlock() ==  Blocks.GREEN_CONCRETE_POWDER || state.getBlock() ==  Blocks.RED_CONCRETE_POWDER || state.getBlock() ==  Blocks.BLACK_CONCRETE_POWDER;
		}
	  
	  private void breakNeighbours(World world, BlockPos pos, ServerPlayerEntity player, boolean damageItem, ItemStack stack)
	  {
	    BlockRayTraceResult rayTraceResult = ToolUtil3x3.getLookingAt(player, 6);
	    Direction facing = rayTraceResult.getFace();
	    
	    List<BlockPos> brokenBlocks = ToolUtil3x3.getBlocks(pos, facing);
	    for (BlockPos blockPos : brokenBlocks)
	    {
	      BlockState blockState = world.getBlockState(blockPos);
	      if (!canHarvestBlock(blockState))
	      {
	        continue;
	      }
	      
	      if (blockState.getBlock().hasTileEntity(blockState))
	      {
	        continue;
	      }
	      
	      world.destroyBlock(blockPos, false);
	      
	      if (!player.isCreative())
	      {
	        if (damageItem)
	        {
	          player.getHeldItemMainhand().damageItem(1, player, playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));//attemptDamageItem(1, world.rand, player instanceof ServerPlayerEntity ? (ServerPlayerEntity) player : null);
	        }
	        
	        ToolUtil3x3.dropItems(world, Block.getDrops(blockState, (ServerWorld) world, blockPos, null, player, player.getHeldItemMainhand()), blockPos);
	        ToolUtil3x3.spawnExp(world, blockPos, blockState, EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack), EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack));
	        blockState.spawnAdditionalDrops(world, blockPos, player.getHeldItemMainhand());
	      }
	    }
	  }


	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.spade.line1")));
			tooltip.add((new TranslationTextComponent("item.nnow.spade.line2")));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
}
