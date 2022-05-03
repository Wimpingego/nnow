package com.github.wimpingego.nnow.blocks.traps;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class IronTrap extends TrapBase {

    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_IRON_TRAP = "message.iron_trap";
    public static final String MESSAGE_DEATH_ATTACK_IRON_TRAP = "death.attack.trap.iron";

    public IronTrap(Properties properties, TrapType type) {
        super(properties, type);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_IRON_TRAP));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}
