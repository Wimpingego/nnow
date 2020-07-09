package com.github.wimpingego.nnow.objects.items.hammers;

import java.util.List;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ToolUtil3x3;
import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class HammerBase extends PickaxeItem {
	
	//Double speed = ModConfigs.SPEED_MODIFIER.get();
	
	public HammerBase(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	  @Override
	  public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity)
	  {
			double DropChance = ModConfigs.DROP_CHANCE.get();
			double SecondChance = ModConfigs.SECOND_CHANCE.get();
			double EggChance = ModConfigs.EGG_CHANCE.get();

			Block block = state.getBlock();
		  
	    if (!world.isRemote)
	    {
	      if (state.getBlockHardness(world, pos) == 0)
	      {
	        return true;
	      }

	    //STONE BLOCKS
	      
	      if(block == Blocks.COBBLESTONE)
			{
		        //stack.damageItem(0, entity, (p_220038_0_) -> {
		            //p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         //});
		         	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}	
	      
			else if(block == Blocks.STONE)
			{
		         	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}	

			else if(block == Blocks.GRANITE)
			{
 	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.DIORITE)
			{
	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.ANDESITE)
			{
	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}
	      
	    //SAND & GRAVEL BLOCKS
	      
			else if(block == Blocks.SAND)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.SANDSTONE)
			{
		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.SMOOTH_SANDSTONE)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.CHISELED_SANDSTONE)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.CUT_SANDSTONE)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.RED_SAND)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.RED_SANDSTONE)
			{
 		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.SMOOTH_RED_SANDSTONE)
			{
  		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.CHISELED_RED_SANDSTONE)
			{
  		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}
	      
			else if(block == Blocks.CUT_RED_SANDSTONE)
			{
  		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}

			else if(block == Blocks.GRAVEL)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.SAND_DUST.get(), 1)));
		        }		
			}
	      
	    //GRASS & DRIT BLOCKS
	      
			else if(block == Blocks.DIRT)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.COARSE_DIRT)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.GRASS_BLOCK)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.PODZOL)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.MYCELIUM)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.GRASS)
			{
 
		        double r = random.nextDouble();
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SUGAR_CANE, 1)));
		        }	
		        
		        if(ModConfigs.SKYBLOCK_MODE.get()){
		        	if (r <= EggChance)
		        	{
		        		world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.VILLAGER_SPAWN_EGG, 1)));
		        	}
		        }
			}
	      
			else if(block == Blocks.TALL_GRASS)
			{
 
		        double r = random.nextDouble();
		        if (r <= SecondChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SUGAR_CANE, 1)));
		        }	
		        
		        if(ModConfigs.SKYBLOCK_MODE.get()){
		        	if (r <= EggChance)
		        	{
		        		world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.VILLAGER_SPAWN_EGG, 1)));
		        	}
		        }
			}
	      
	    //ICE BLOCKS
	      
			else if(block == Blocks.ICE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.ICE_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.PACKED_ICE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.ICE_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.BLUE_ICE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.ICE_NUGGET.get(), 1)));
		        }		
			}
	      
	    //NETHER BLOCKS
	      
			else if(block == Blocks.NETHERRACK)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.FIRE_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.SOUL_SAND)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.FIRE_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.MAGMA_BLOCK)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.FIRE_NUGGET.get(), 1)));
		        }		
			}
	      
	    //WOOD BLOCKS
	      
			else if(block == Blocks.OAK_LOG)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.SPRUCE_LOG)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.BIRCH_LOG)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.ACACIA_LOG)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.DARK_OAK_LOG)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.JUNGLE_LOG)
			{

		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.WOODEN_NUGGET.get(), 1)));
		        }		
			}
	      
	    //ORE BLOCKS
	      
			else if(block == Blocks.IRON_ORE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.IRON_NUGGET, 1)));
		        }		
			}
	      
			else if(block == Blocks.GOLD_ORE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GOLD_NUGGET, 1)));
		        }		
			}
	      
			else if(block == Blocks.COAL_ORE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.COAL_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.REDSTONE_ORE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.REDSTONE_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.NETHER_QUARTZ_ORE)
			{
   
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.QUARTZ_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.DIAMOND_ORE)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIAMOND_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.EMERALD_ORE)
			{
  
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.EMERALD_NUGGET.get(), 1)));
		        }		
			}
	      
			else if(block == Blocks.LAPIS_ORE)
			{
 
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.LAPIS_NUGGET.get(), 1)));
		        }		
			}
	      	      
	      if (entity instanceof PlayerEntity)
	      {
	        PlayerEntity player = (PlayerEntity) entity;
	        if (!player.isCrouching())
	        {
	          breakNeighbours(world, pos, (ServerPlayerEntity) player, true, stack);
	          return true;
	        }
	        else
	        {
//	          stack.attemptDamageItem(1, world.rand, (ServerPlayerEntity) player);
	          stack.damageItem(1, player, playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));
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

	    return super.canHarvestBlock(state);
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
	          player.getHeldItemMainhand().damageItem(1, player, playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND));
	          //attemptDamageItem(1, world.rand, player instanceof ServerPlayerEntity ? (ServerPlayerEntity) player : null);
	        }

	        ToolUtil3x3.dropItems(world, Block.getDrops(blockState, (ServerWorld) world, blockPos, null, player, player.getHeldItemMainhand()), blockPos);
	        ToolUtil3x3.spawnExp(world, blockPos, blockState, EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack), EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack));
	        
	        blockState.spawnAdditionalDrops(world, blockPos, player.getHeldItemMainhand()); 
	        
	      }
	    }
	  }

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.hammer.line1").applyTextStyle(TextFormatting.YELLOW)));
			tooltip.add((new TranslationTextComponent("item.nnow.hammer.line2").applyTextStyle(TextFormatting.LIGHT_PURPLE)));
			tooltip.add((new TranslationTextComponent("item.nnow.hammer.line3").applyTextStyle(TextFormatting.GREEN)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
}
