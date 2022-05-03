package com.github.wimpingego.nnow.blocks.traps;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.util.IExplosionResistant;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nullable;
import java.util.List;

import static com.github.wimpingego.nnow.blocks.DarkGlass.MESSAGE_WITHER_PROOF;

public class WitherTrap extends TrapBase implements IExplosionResistant{
    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_WITHER_TRAP = "message.wither_trap";
    public static final String MESSAGE_WITHER_TRAP_XP = "message.wither_trap_no_xp";
    public static final String MESSAGE_WITHER_TRAP_PLAYER_DROPS = "message.wither_trap_no_player_drops";
    public static final String MESSAGE_WITHER_TRAP_DMG = "item.nnow.info.wither_trap.dmg";
    public static final String MESSAGE_DEATH_ATTACK_WITHER_TRAP = "death.attack.trap.wither";
    public static final String MESSAGE_DEATH_ATTACK_WITHER_TRAP_PLAYER = "death.attack.trap.wither.player";

    static int W_Attack = Configs.WITHER_ATTACK_POWER.get();

    public WitherTrap(Properties properties, TrapType type) {
        super(properties, type);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_WITHER_TRAP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_WITHER_TRAP_XP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_WITHER_TRAP_PLAYER_DROPS));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_WITHER_TRAP_DMG,W_Attack));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_WITHER_PROOF).withStyle(ChatFormatting.RED));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}
