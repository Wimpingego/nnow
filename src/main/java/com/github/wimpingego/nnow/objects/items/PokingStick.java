package com.github.wimpingego.nnow.objects.items;

import java.util.List;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class PokingStick extends Item {

	static int use = ModConfigs.MAX_USES.get();
	
	public PokingStick(Properties properties) {
		super(properties.maxDamage(use));       
	}
	
	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
	return 300;
	}
		
	//GRASS & DRIT BLOCKS
	
		public ActionResultType onItemUse(ItemUseContext context) {
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GRASS_BLOCK) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),0 + random.nextInt(3)));
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
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
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
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
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
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
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
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
	//STONE BLOCKS
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.STONE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.COBBLESTONE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GRANITE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}		
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIORITE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.ANDESITE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_PEBBLE.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
			
	//ICE BLOCKS
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.ICE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.ICE_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.PACKED_ICE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.ICE_NUGGET.get(),4 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.BLUE_ICE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.ICE_NUGGET.get(),3 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
	//NETHER BLOCKS
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.NETHERRACK) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.FIRE_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.SOUL_SAND) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.FIRE_NUGGET.get(),4 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.MAGMA_BLOCK) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.FIRE_NUGGET.get(),3 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
	//WOOD BLOCKS
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.OAK_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}	
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.SPRUCE_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.BIRCH_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.ACACIA_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DARK_OAK_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.JUNGLE_LOG) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.WOODEN_NUGGET.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
	//ORE BLOCKS
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.IRON_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(Items.IRON_NUGGET));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GOLD_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(Items.GOLD_NUGGET));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.COAL_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.COAL_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.REDSTONE_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.REDSTONE_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.NETHER_QUARTZ_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.QUARTZ_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}		
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIAMOND_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.DIAMOND_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}

		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.EMERALD_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.EMERALD_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
			
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.LAPIS_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.LAPIS_NUGGET.get()));
					context.getItem().damageItem(4, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
				
		return ActionResultType.FAIL;
	}
			
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.poking_stick.line1").applyTextStyle(TextFormatting.YELLOW)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}	
}	
