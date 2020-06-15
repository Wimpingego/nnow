package com.github.wimpingego.nnow.objects.blocks.traps;


import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

import javax.annotation.Nullable;

/*
  @author: Naxanria
*/
public class TrapDamageSource extends DamageSource
{
  @SuppressWarnings("unused")
private TrapType type;
  private Entity source = null;
  // todo: have an option for fakeplayer kills
  public TrapDamageSource(TrapType type)
  {
    super("spikes." + type.name);
    this.type = type;
  
    setDamageBypassesArmor();
    setDamageIsAbsolute();
  }
  
  @Nullable
  @Override
  public Entity getTrueSource()
  {
    return source;
  }
  
  public TrapDamageSource setSource(Entity source)
  {
    this.source = source;
    return this;
  }
}
