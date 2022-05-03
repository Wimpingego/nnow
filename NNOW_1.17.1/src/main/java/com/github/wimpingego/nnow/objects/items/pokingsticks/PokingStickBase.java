package com.github.wimpingego.nnow.objects.items.pokingsticks;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class PokingStickBase extends Item {

	public final int burnTime;

	public PokingStickBase(Properties builder) {
		super(builder);
		this.burnTime = 200;
	}

	public Item asItem() {
		return super.asItem();
	}

	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return this.burnTime;
	}

	// STONE DUST FROM DIRT
	public InteractionResult useOn(UseOnContext context) {

		int DustDrop = ModConfigs.DUST_DROP.get();

		Level world = context.getLevel();
		Player player = context.getPlayer();
		BlockPos pos = context.getClickedPos();
		BlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		ItemStack stack = context.getItemInHand();

		if
			(
				block == Blocks.GRASS_BLOCK ||
				block == Blocks.DIRT ||
				block == Blocks.PODZOL ||
				block == Blocks.COARSE_DIRT ||
				block == Blocks.MYCELIUM  	||

				block == Blocks.COBBLESTONE ||
				block == Blocks.COBBLED_DEEPSLATE ||
				block == Blocks.DEEPSLATE  ||
				block == Blocks.STONE

			)
		{
			world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.STONE_DUST.get(), DustDrop)));
			assert player != null;
			stack.hurtAndBreak(1, player, (p_220038_0_) -> {
				p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
			});
		}
		return InteractionResult.PASS;
	}

	// Sapling & Cactus DROPS
	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
		int SaplingDropAmount = ModConfigs.SAPLING_DROP_AMOUNT.get();
		double SaplingChance = ModConfigs.SAPLING_DROP_CHANCE.get();
		double CactusChance = ModConfigs.CACTUS_DROP_CHANCE.get();

		Block block = state.getBlock();

		if (!worldIn.isClientSide) {
			if (block == Blocks.SPRUCE_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPRUCE_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.BIRCH_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BIRCH_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.OAK_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.OAK_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.ACACIA_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.ACACIA_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.JUNGLE_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.JUNGLE_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.DARK_OAK_LEAVES) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= SaplingChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DARK_OAK_SAPLING, SaplingDropAmount)));
				}
			} else if (block == Blocks.SAND) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= CactusChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
				}
			} else if (block == Blocks.RED_SAND) {
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= CactusChance) {
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
				}
			}

			if
				(
					block == Blocks.SPRUCE_LEAVES ||
					block == Blocks.BIRCH_LEAVES ||
					block == Blocks.OAK_LEAVES ||
					block == Blocks.ACACIA_LEAVES ||
					block == Blocks.JUNGLE_LEAVES ||
					block == Blocks.DARK_OAK_LEAVES ||
					block == Blocks.SAND ||
					block == Blocks.RED_SAND
				)
			{
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});
			}
		}
		return true;
	}

	public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
		if (entity instanceof Sheep) {
			Level world = player.level;
			Vec3 pos = entity.position();
			world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.STRING, 1)));
			stack.hurtAndBreak(1, player, (p_220038_0_) -> {
				p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
			});
		}

		if (entity instanceof Chicken) {
			Level world = player.level;
			Vec3 pos = entity.position();
			world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.FEATHER, 1)));
			stack.hurtAndBreak(1, player, (p_220038_0_) -> {
				p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
			});
		}

		return true;
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stackIn) {
		ItemStack stack = stackIn.copy();
		stack.setDamageValue(getDamage(stack) + 1);

		return stack;
	}

	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslatableComponent("item.nnow.poking_stick.line1")));
		} else {
			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
		}
	}
}
// Old 1.16.5 Snapshot Code
// STONE DUST FROM DIRT
//	public InteractionResult useOn(UseOnContext context) {
//	if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == Blocks.GRASS_BLOCK) {
//		for (ItemStack stack : context.getPlayer().inventory.items) {
//			if (stack.isEmpty()) {
//				context.getPlayer().addItem(new ItemStack(ItemList.STONE_DUST.get(),0 + random.nextInt(3)));
//				context.getItemInHand().hurtAndBreak(1, context.getPlayer(), (playerIn) -> {
//					playerIn.broadcastBreakEvent(context.getHand());
//				});
//				return InteractionResult.SUCCESS;
//			}
//		}
//	}
//
//	if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == Blocks.PODZOL) {
//		for (ItemStack stack : context.getPlayer().inventory.items) {
//			if (stack.isEmpty()) {
//				context.getPlayer().addItem(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
//				context.getItemInHand().hurtAndBreak(1, context.getPlayer(), (playerIn) -> {
//					playerIn.broadcastBreakEvent(context.getHand());
//				});
//				return InteractionResult.SUCCESS;
//			}
//		}
//	}
//
//	if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == Blocks.DIRT) {
//		for (ItemStack stack : context.getPlayer().inventory.items) {
//			if (stack.isEmpty()) {
//				context.getPlayer().addItem(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
//				context.getItemInHand().hurtAndBreak(1, context.getPlayer(), (playerIn) -> {
//					playerIn.broadcastBreakEvent(context.getHand());
//				});
//				return InteractionResult.SUCCESS;
//			}
//		}
//	}
//
//	if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == Blocks.COARSE_DIRT) {
//		for (ItemStack stack : context.getPlayer().inventory.items) {
//			if (stack.isEmpty()) {
//				context.getPlayer().addItem(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
//				context.getItemInHand().hurtAndBreak(1, context.getPlayer(), (playerIn) -> {
//					playerIn.broadcastBreakEvent(context.getHand());
//				});
//				return InteractionResult.SUCCESS;
//			}
//		}
//	}
//
//	if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == Blocks.MYCELIUM) {
//		for (ItemStack stack : context.getPlayer().inventory.items) {
//			if (stack.isEmpty()) {
//				context.getPlayer().addItem(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
//				context.getItemInHand().hurtAndBreak(1, context.getPlayer(), (playerIn) -> {
//					playerIn.broadcastBreakEvent(context.getHand());
//				});
//				return InteractionResult.SUCCESS;
//			}
//		}
//	}

// Sapling & Cactus DROPS
//	@Override
//	public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entity) {
//
//		double SaplingChance = ModConfigs.SAPLING_DROP_CHANCE.get();
//		double CactusChance = ModConfigs.CACTUS_DROP_CHANCE.get();
//
//		Block block = state.getBlock();
//
//		if (!world.isClientSide) {
//			if (state.getDestroySpeed(world, pos) == 0) {
//				return true;
//			}
//
//			else if (block == Blocks.OAK_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.OAK_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.SPRUCE_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.SPRUCE_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.ACACIA_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.ACACIA_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.BIRCH_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.BIRCH_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.DARK_OAK_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.DARK_OAK_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.JUNGLE_LEAVES) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= SaplingChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.JUNGLE_SAPLING, 1)));
//				}
//			}
//
//			else if (block == Blocks.SAND) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= CactusChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.CACTUS, 1)));
//				}
//			}
//
//			else if (block == Blocks.RED_SAND) {
//
//				stack.hurtAndBreak(1, entity, (p_220038_0_) -> {
//					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//				});
//
//				double r = random.nextDouble();
//				if (r <= CactusChance) {
//					world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
//							new ItemStack(Items.CACTUS, 1)));
//				}
//			}
//
//			else {
//				stack.hurtAndBreak(1, entity,
//						playerEntity -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
//			}
//		}
//
//		return true;
//	}

// TOOLS TIP
//	@Override
//	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
//		if (KeyboardHelper.isHoldingShift()) {
//			tooltip.add((new TranslatableComponent("item.nnow.poking_stick.line1")));
//		} else {
//			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
//		}
//	}
//}
