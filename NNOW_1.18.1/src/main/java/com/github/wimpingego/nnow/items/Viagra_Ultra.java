package com.github.wimpingego.nnow.items;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.util.EnableUtil;
import com.github.wimpingego.nnow.util.GrowingUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

public class Viagra_Ultra extends Item {

    public static final String MESSAGE_VIAGRA_ULTRA_IS = "item.nnow.viagra_ultra.line1";
    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_MORE_INFO_VIAGRA_1 = "item.nnow.info_viagra_1";

    int radius = Configs.VIAGRA_RADIUS.get();
    int baseTickDelay = Configs.VIAGRA_TICK_DELAY.get();

    public Viagra_Ultra(Properties properties) {
        super(properties);
    }

    public void inventoryTick(ItemStack stack, Level world, Entity entity, int par4, boolean par5) {
        if (!(entity instanceof Player) || world.isClientSide) {
            return;
        }

        Player player = (Player) entity;

            if (!world.isClientSide && EnableUtil.isEnabled(stack)) {
                GrowingUtil.growCrops(world, player, baseTickDelay/2, radius*2);
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        ItemStack stack = player.getItemInHand(hand);

        if(player.isShiftKeyDown() && !world.isClientSide)
        {
            EnableUtil.changeEnabled(player, hand);
            player.sendMessage(new TranslatableComponent(MESSAGE_VIAGRA_ULTRA_IS, EnableUtil.isEnabled(stack)), null);
            player.level.playSound(null, player.blockPosition(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS, 0.1f,0.9f);
            return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, player.getItemInHand(hand));
        }

        return super.use(world, player, hand);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return EnableUtil.isEnabled(stack);
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == Items.BONE_BLOCK;
    }

    @Override
    public float getXpRepairRatio(ItemStack stack) {
        return 5f;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_VIAGRA_1,radius*2));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_VIAGRA_ULTRA_IS, EnableUtil.isEnabled(stack)));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}

