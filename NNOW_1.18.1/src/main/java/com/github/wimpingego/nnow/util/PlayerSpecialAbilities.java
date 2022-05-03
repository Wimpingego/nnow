package com.github.wimpingego.nnow.util;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PlayerSpecialAbilities
{
    //Set player health to max on tick update
    public static void giveFullHealth(Level world, Player player, ItemStack itemstack)
    {
        player.setHealth(20);
        return;
    }

    //Increases the player's food level to max on tick update, based on inputs
    public static void giveRegenEffect(Level world, Player player, ItemStack itemstack, int newfoodlevel, float newsatlevel)
    {
        if (player.tickCount % 180 == 0)
        {
            player.getFoodData().eat(newfoodlevel, newsatlevel);
        }

        return;
    }

    //Set player saturation level to max
    public static void giveSaturationEffect(Level world, Player player, ItemStack itemstack)
    {
        player.getFoodData().setSaturation(7.0F);

        return;
    }

    //gives extra yellow hears and a variable rate
    public static void giveYellowHearts(Level world, LivingEntity player, ItemStack stack, int extraHearts, float absorptionRate)
    {
        float current = player.getAbsorptionAmount();

        if(player.getHealth() < 20 || current >= extraHearts)
        {
            return;
        }

        if(current >= (extraHearts - 1))
        {
            if (player.tickCount % 180 == 0)
            {
                player.setAbsorptionAmount(extraHearts);
            }
            return;
        }
        if(current < (extraHearts - 1))
        {
            if (player.tickCount % 180 == 0)
            {
                player.setAbsorptionAmount(current + absorptionRate);
            }
            return;
        }

        return;
    }

    //Set player yellow hearts to none on tick update
    public static void giveNoExtraHearts(Level world, Player player, ItemStack itemstack)
    {
        player.setAbsorptionAmount(0);
        return;
    }

    //Set player oxygen to max on tick update
    public static void giveBreathing(Level world, Player player, ItemStack itemstack)
    {
        player.setAirSupply(300);
        return;
    }

    //Gives player Dolphin's Grace
    public static void giveDolphinEffect(Level world, Player player, ItemStack itemstack)
    {
        if (player.tickCount % 180 == 0 && player.isInWater())
        {
            player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 260, 0, false, false));
        }
    }

    //Gives player Conduit Effect
    public static void giveConduitEffect(Level world, Player player, ItemStack itemstack)
    {
        if (player.tickCount % 180 == 0 && player.isInWater())
        {
            player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 260, 2, false, false));
        }
    }

    //Gives player Water Breathing Effect
    public static void giveWaterBreathingEffect(Level world, Player player, ItemStack itemstack)
    {
        if (player.tickCount % 200 == 0)
        {
            player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false));
        }
    }
}


