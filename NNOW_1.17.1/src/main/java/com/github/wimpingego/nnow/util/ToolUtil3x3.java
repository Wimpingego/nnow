package com.github.wimpingego.nnow.util;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.Containers;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemStackHandler;

public class ToolUtil3x3 {

	 public static BlockHitResult getLookingAt(Player player, double range)
	  {
	    return getLookingAt(player, range, ClipContext.Fluid.NONE);
	  }
	  
	  public static BlockHitResult getLookingAt(Player player, double range, ClipContext.Fluid fluidMode)
	  {
	    Level world = player.level;

	    Vec3 look = player.getLookAngle();
	    Vec3 startPos = getVec3d(player).add(0, player.getEyeHeight(), 0);
	    Vec3 endPos = startPos.add(look.multiply(range, range, range));
	    ClipContext context = new ClipContext(startPos, endPos, ClipContext.Block.OUTLINE, fluidMode, player);
	    return world.clip(context);
	  }
	  
	  public static Vec3 getVec3d(BlockPos pos)
	  {
	    return new Vec3(pos.getX(), pos.getY(), pos.getZ());
	  }

	  public static Vec3 getVec3d(Entity entity)
	  {
	    return entity.position();
//	    return new Vec3d(entity.posX, entity.posY, entity.posZ);
	  }
	public static BlockHitResult getLookingAt(Vec3 position, Vec3 look, double range, Entity entity)
	  {
	    Vec3 endPos = position.add(look.multiply(range, range, range));
	    ClipContext context = new ClipContext(position, endPos, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity);
	    return entity.level.clip(context);
	  }
	  
	  public static List<BlockPos> getBlocks(BlockPos pos, Direction facing)
	  {
	    return getBlocks(pos, facing, 3);
	  }

	  public static List<BlockPos> getBlocks(BlockPos pos, Direction facing, int radius)
	  {
	    List<BlockPos> positions = new ArrayList<>();

	    if (radius % 2 == 0)
	    {
	      return positions;
	    }

	    if (radius < 3)
	    {
	      positions.add(pos);
	      return positions;
	    }

	    int d = radius / 2;
	    int min = -d;
	    int max = d;

	    switch (facing)
	    {
	      case DOWN:
	      case UP:
	        for (int x = min; x <= max; x++)
	        {
	          for (int z = min; z <= max; z++)
	          {
	            positions.add(pos.offset(x, 0, z));
	          }
	        }

	        break;
	      case NORTH:
	      case SOUTH:
	        for (int x = min; x <= max; x++)
	        {
	          for (int y = min; y <= max; y++)
	          {
	            positions.add(pos.offset(x, y, 0));
	          }
	        }
	        break;
	      case WEST:
	      case EAST:
	        for (int z = min; z <= max; z++)
	        {
	          for (int y = min; y <= max; y++)
	          {
	            positions.add(pos.offset(0, y, z));
	          }
	        }
	        break;
	    }

	    return positions;
	  }
	  
	  public static void dropItems(Level world, List<ItemStack> items, BlockPos pos)
	  {
	    for (ItemStack stack : items)
	    {
	      if (stack.isEmpty())
	      {
	        continue;
	      }
	      
	      dropItem(world, stack, pos);
	    }
	  }
	  
	  public static void dropItems(Level world, ItemStackHandler handler, BlockPos pos)
	  {
	    for (int i = 0; i < handler.getSlots(); i++)
	    {
	      ItemStack stack = handler.getStackInSlot(i);
	      if (stack.isEmpty())
	      {
	        continue;
	      }
	      
	      dropItem(world, stack, pos);
	    }
	  }
	
	  public static void dropItem(Level world, ItemStack stack, BlockPos pos)
	  {
	    Containers.dropItemStack(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, stack);
	  }
	  
	  public static int spawnExp(Level world, BlockPos pos, BlockState state, int fortune, int silk)
	  {
	    return spawnExp(world, pos, state.getExpDrop(world, pos, fortune, silk));
	  }
	  
	  public static int spawnExp(Level world, BlockPos pos, int exp)
	  {
	    return spawnExp(world, pos, exp, true);
	  }
	  
	  public static int spawnExp(Level world, BlockPos pos, int exp, boolean split)
	  {
	    if (exp > 0)
	    {
	      if (split)
	      {
	        while (exp > 0)
	        {
	          int drop = ExperienceOrb.getExperienceValue(exp);
	          exp -= drop;
	          world.addFreshEntity(new ExperienceOrb(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, drop));
	        }
	      }
	      else
	      {
	        world.addFreshEntity(new ExperienceOrb(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, exp));
	      }
	    }
	    
	    return exp;
	  }
}
