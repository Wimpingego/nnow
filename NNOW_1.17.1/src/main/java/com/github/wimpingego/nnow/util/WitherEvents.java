package com.github.wimpingego.nnow.util;

import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
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
    if (event.getEntityLiving() instanceof WitherBoss || event.getEntity() instanceof WitherSkull && event.getState().getBlock() instanceof IExplosionResistant)
    {
      event.setCanceled(true);
    }
  }
  
  public static void onExplosion(final ExplosionEvent event)
  {
    Level world = event.getWorld();
    Explosion explosion = event.getExplosion();
    List<BlockPos> blocks = explosion.getToBlow();
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
