package com.github.wimpingego.nnow.util;

import com.mojang.authlib.GameProfile;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.FakePlayer;

import java.lang.ref.WeakReference;
import java.util.UUID;

/*
  @author: Naxanria
*/
public class NNOWFakePlayer extends FakePlayer
{
  private final static GameProfile profile = new GameProfile(UUID.nameUUIDFromBytes("nnow.common".getBytes()), "[NNOW]");
  
  private static NNOWFakePlayer INSTANCE;
  
  private NNOWFakePlayer(ServerWorld world)
  {
    super(world, profile);
  }
  
  private static void checkInstance(ServerWorld world)
  {
    if (INSTANCE == null)
    {
      INSTANCE = new NNOWFakePlayer(world);
    }
  }
  
  public static WeakReference<NNOWFakePlayer> getInstance(ServerWorld world)
  {
    checkInstance(world);
    INSTANCE.world = world;
    return new WeakReference<>(INSTANCE);
  }
  
  public static WeakReference<NNOWFakePlayer> getInstance(ServerWorld world, double x, double y, double z)
  {
    checkInstance(world);
    INSTANCE.world = world;
    INSTANCE.setRawPosition(x, y, z);
    return new WeakReference<>(INSTANCE);
  }
  
  public static void invalidate(ServerWorld world)
  {
    if (INSTANCE != null && INSTANCE.world == world)
    {
      INSTANCE = null;
    }
  }
  
  @Override
  public boolean isPotionApplicable(EffectInstance potion)
  {
    return false;
  }
}
