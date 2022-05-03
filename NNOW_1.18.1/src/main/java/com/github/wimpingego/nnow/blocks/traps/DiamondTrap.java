package com.github.wimpingego.nnow.blocks.traps;

import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nullable;
import java.util.List;

public class DiamondTrap extends TrapBase {

    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_DIAMOND_TRAP = "message.diamond_trap";
    public static final String MESSAGE_DIAMOND_TRAP_XP = "message.diamond_trap_no_xp";
    public static final String MESSAGE_DIAMOND_TRAP_PLAYER_DROPS = "message.diamond_trap_no_player_drops";
    public static final String MESSAGE_DIAMOND_TRAP_DMG = "item.nnow.info.diamond_trap.dmg";
    public static final String MESSAGE_DEATH_ATTACK_DIAMOND_TRAP = "death.attack.trap.diamond";
    public static final String MESSAGE_DEATH_ATTACK_DIAMOND_TRAP_PLAYER = "death.attack.trap.diamond.player";

    static int D_Attack = Configs.DIAMOND_ATTACK_POWER.get();

    public DiamondTrap(Properties properties, TrapType type) {
        super(properties, type);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_DIAMOND_TRAP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_DIAMOND_TRAP_XP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_DIAMOND_TRAP_PLAYER_DROPS));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_DIAMOND_TRAP_DMG,D_Attack));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}
