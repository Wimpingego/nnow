package com.github.wimpingego.nnow.util;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class ToolUtil3x3 {

	 public static BlockRayTraceResult getLookingAt(PlayerEntity player, double range)
	  {
	    return getLookingAt(player, range, RayTraceContext.FluidMode.NONE);
	  }
	  
	  public static BlockRayTraceResult getLookingAt(PlayerEntity player, double range, RayTraceContext.FluidMode fluidMode)
	  {
	    World world = player.world;

	    Vector3d look = player.getLookVec();
	    Vector3d startPos = getVec3d(player).add(0, player.getEyeHeight(), 0);
	    Vector3d endPos = startPos.add(look.mul(range, range, range));
	    RayTraceContext context = new RayTraceContext(startPos, endPos, RayTraceContext.BlockMode.OUTLINE, fluidMode, player);
	    return world.rayTraceBlocks(context);
	  }
	  
	  public static Vector3d getVec3d(BlockPos pos)
	  {
	    return new Vector3d(pos.getX(), pos.getY(), pos.getZ());
	  }

	  public static Vector3d getVec3d(Entity entity)
	  {
	    return entity.getPositionVec();
//	    return new Vec3d(entity.posX, entity.posY, entity.posZ);
	  }
	public static BlockRayTraceResult getLookingAt(Vector3d position, Vector3d look, double range, Entity entity)
	  {
	    Vector3d endPos = position.add(look.mul(range, range, range));
	    RayTraceContext context = new RayTraceContext(position, endPos, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity);
	    return entity.world.rayTraceBlocks(context);
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
	            positions.add(pos.add(x, 0, z));
	          }
	        }

	        break;
	      case NORTH:
	      case SOUTH:
	        for (int x = min; x <= max; x++)
	        {
	          for (int y = min; y <= max; y++)
	          {
	            positions.add(pos.add(x, y, 0));
	          }
	        }
	        break;
	      case WEST:
	      case EAST:
	        for (int z = min; z <= max; z++)
	        {
	          for (int y = min; y <= max; y++)
	          {
	            positions.add(pos.add(0, y, z));
	          }
	        }
	        break;
	    }

	    return positions;
	  }
	  
	  public static void dropItems(World world, List<ItemStack> items, BlockPos pos)
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
	  
	  public static void dropItems(World world, ItemStackHandler handler, BlockPos pos)
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
	
	  public static void dropItem(World world, ItemStack stack, BlockPos pos)
	  {
	    InventoryHelper.spawnItemStack(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, stack);
	  }
	  
	  public static int spawnExp(World world, BlockPos pos, BlockState state, int fortune, int silk)
	  {
	    return spawnExp(world, pos, state.getExpDrop(world, pos, fortune, silk));
	  }
	  
	  public static int spawnExp(World world, BlockPos pos, int exp)
	  {
	    return spawnExp(world, pos, exp, true);
	  }
	  
	  public static int spawnExp(World world, BlockPos pos, int exp, boolean split)
	  {
	    if (exp > 0)
	    {
	      if (split)
	      {
	        while (exp > 0)
	        {
	          int drop = ExperienceOrbEntity.getXPSplit(exp);
	          exp -= drop;
	          world.addEntity(new ExperienceOrbEntity(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, drop));
	        }
	      }
	      else
	      {
	        world.addEntity(new ExperienceOrbEntity(world, pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, exp));
	      }
	    }
	    
	    return exp;
	  }
}
