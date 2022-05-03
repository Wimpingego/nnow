package com.github.wimpingego.nnow.objects.blocks.traps;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

/*
  @author: Naxanria
*/
public class TrapDamageSource extends DamageSource
{

@SuppressWarnings("unused")
private TrapType type;
  private Entity source = null;
  public TrapDamageSource(TrapType type)
  {
    super("trap." + type.name);
    this.type = type;
  
    bypassArmor();
    bypassMagic();
  }
  
  @Nullable
  @Override
  public Entity getEntity()
  {
    return source;
  }
  
  public TrapDamageSource setSource(Entity source)
  {
    this.source = source;
    return this;
  }
}
