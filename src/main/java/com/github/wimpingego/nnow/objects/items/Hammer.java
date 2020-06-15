package com.github.wimpingego.nnow.objects.items;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ModConfigs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Hammer extends PickaxeItem
{
	public Hammer(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double DropChance = ModConfigs.DROP_CHANCE.get();
		double SecondChance = ModConfigs.SECOND_CHANCE.get();
		double EggChance = ModConfigs.EGG_CHANCE.get();

		Block block = state.getBlock();
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.COBBLESTONE)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         	        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.SAND_DUST.get(), 1)));
		        }		
			}			
			else if(block == Blocks.SAND)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         		        
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.DIRT_DUST.get(), 1)));
		        }	
		        
		        if (r <= SecondChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, 1)));
		        }
			}		

			else if(block == Blocks.DIRT)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.GRAVEL_DUST.get(), 1)));
		        }		
			}
			else if(block == Blocks.GRAVEL)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= DropChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.CLAY_DUST.get(), 1)));
		        }		
			}
			else if(block == Blocks.GRASS)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= SecondChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SUGAR_CANE, 1)));
		        }	
		        
		        if(ModConfigs.SKYBLOCK_MODE.get()){
		        	if (r <= EggChance)
		        	{
		        		worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.VILLAGER_SPAWN_EGG, 1)));
		        	}
		        }
			}
			if(!(block == Blocks.COBBLESTONE) || 
					!(block == Blocks.SAND) || 
					!(block == Blocks.GRAVEL) || 
					!(block == Blocks.GRASS))
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });		
			}
	    }

		return true;
	}
}
