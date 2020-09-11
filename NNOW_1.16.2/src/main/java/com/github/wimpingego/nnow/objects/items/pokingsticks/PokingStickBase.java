package com.github.wimpingego.nnow.objects.items.pokingsticks;

import java.util.List;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class PokingStickBase extends Item {

	public PokingStickBase(Properties builder) {
		super(builder);
	}
	
	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 300;
	}
	
// STONE DUST FROM DIRT
	public ActionResultType onItemUse(ItemUseContext context) {
	if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GRASS_BLOCK) {
		for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
			if (stack.isEmpty()) {
				context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),0 + random.nextInt(3)));
				context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
					playerIn.sendBreakAnimation(context.getHand());
				});
				return ActionResultType.SUCCESS;
			}
		}
	}
	
	if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.PODZOL) {
		for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
			if (stack.isEmpty()) {
				context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
				context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
					playerIn.sendBreakAnimation(context.getHand());
				});
				return ActionResultType.SUCCESS;
			}
		}
	}
	
	if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIRT) {
		for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
			if (stack.isEmpty()) {
				context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
				context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
					playerIn.sendBreakAnimation(context.getHand());
				});
				return ActionResultType.SUCCESS;
			}
		}
	}		
	
	if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.COARSE_DIRT) {
		for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
			if (stack.isEmpty()) {
				context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
				context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
					playerIn.sendBreakAnimation(context.getHand());
				});
				return ActionResultType.SUCCESS;
			}
		}
	}	
	
	if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.MYCELIUM) {
		for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
			if (stack.isEmpty()) {
				context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
				context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
					playerIn.sendBreakAnimation(context.getHand());
				});
				return ActionResultType.SUCCESS;
			}
		}
	}
		return ActionResultType.FAIL;
	}
	
// Sapling & Cactus DROPS
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity) {
				
		double SaplingChance = ModConfigs.SAPLING_DROP_CHANCE.get();
		double CactusChance = ModConfigs.CACTUS_DROP_CHANCE.get();

		Block block = state.getBlock();

		if (!world.isRemote) {
			if (state.getBlockHardness(world, pos) == 0) {
				return true;
			}

			else if (block == Blocks.OAK_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.OAK_SAPLING, 1)));
				}
			}

			else if (block == Blocks.SPRUCE_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.SPRUCE_SAPLING, 1)));
				}
			}

			else if (block == Blocks.ACACIA_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.ACACIA_SAPLING, 1)));
				}
			}

			else if (block == Blocks.BIRCH_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.BIRCH_SAPLING, 1)));
				}
			}

			else if (block == Blocks.DARK_OAK_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.DARK_OAK_SAPLING, 1)));
				}
			}

			else if (block == Blocks.JUNGLE_LEAVES) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= SaplingChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.JUNGLE_SAPLING, 1)));
				}
			}
			
			else if (block == Blocks.SAND) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= CactusChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.CACTUS, 1)));
				}
			}
			
			else if (block == Blocks.RED_SAND) {

				stack.damageItem(1, entity, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

				double r = random.nextDouble();
				if (r <= CactusChance) {
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(Items.CACTUS, 1)));
				}
			}

			else {
				stack.damageItem(1, entity,
						playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			}
		}

		return true;
	}
	
// TOOLS TIP
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.poking_stick.line1")));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r" + "For More Info"));
		}
	}

}	
