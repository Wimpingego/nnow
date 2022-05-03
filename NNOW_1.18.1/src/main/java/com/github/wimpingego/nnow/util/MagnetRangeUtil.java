package com.github.wimpingego.nnow.util;


import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;

public class MagnetRangeUtil
{
    public static int getCurrentRange(ItemStack stack)
    {
        return stack.getTag().getInt("currentRange");
    }

    public static boolean getCurrentlySet(ItemStack stack)
    {
        return stack.getTag().getBoolean("currentlySet");
    }

    public static void setCurrentRange(Player player, InteractionHand hand, int range)
    {
        setCurrentRange(player.getItemInHand(hand), range);
    }

    public static void setCurrentRange(ItemStack stack, int newRange)
    {
        if(!stack.hasTag())
        {
            stack.setTag(new CompoundTag());
        }

        stack.getTag().putInt("currentRange", newRange);
        stack.getTag().putBoolean("currentlySet", true);
    }
}

