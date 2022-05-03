package com.github.wimpingego.nnow.util;


import com.mojang.authlib.GameProfile;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
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

    private NNOWFakePlayer(ServerLevel world)
    {
        super(world, profile);
    }

    private static void checkInstance(ServerLevel world)
    {
        if (INSTANCE == null)
        {
            INSTANCE = new NNOWFakePlayer(world);
        }
    }

    public static WeakReference<NNOWFakePlayer> getInstance(ServerLevel world)
    {
        checkInstance(world);
        INSTANCE.level = world;
        return new WeakReference<>(INSTANCE);
    }

    public static WeakReference<NNOWFakePlayer> getInstance(ServerLevel world, double x, double y, double z)
    {
        checkInstance(world);
        INSTANCE.level = world;
        INSTANCE.setPosRaw(x, y, z);
        return new WeakReference<>(INSTANCE);
    }

    public static void invalidate(ServerLevel world)
    {
        if (INSTANCE != null && INSTANCE.level == world)
        {
            INSTANCE = null;
        }
    }

    @Override
    public boolean canBeAffected(MobEffectInstance potion)
    {
        return false;
    }
}
