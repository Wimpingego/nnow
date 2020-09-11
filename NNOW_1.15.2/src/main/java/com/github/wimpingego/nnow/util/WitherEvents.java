package com.github.wimpingego.nnow.util;

import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDestroyBlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;

import java.util.List;

/*
  @author: Naxanria
*/
public class WitherEvents
{
  public static void onWitherExplosion(final LivingDestroyBlockEvent event)
  {
    if (event.getEntityLiving() instanceof WitherEntity || event.getEntity() instanceof WitherSkullEntity && event.getState().getBlock() instanceof IExplosionResistant)
    {
      event.setCanceled(true);
    }
  }
  
  public static void onExplosion(final ExplosionEvent event)
  {
    World world = event.getWorld();
    Explosion explosion = event.getExplosion();
    List<BlockPos> blocks = explosion.getAffectedBlockPositions();
    for (int i = 0; i < blocks.size(); i++)
    {
      if (world.getBlockState(blocks.get(i)).getBlock() instanceof IExplosionResistant)
      {
        blocks.remove(i);
        i--;
      }
    }
  }
}
