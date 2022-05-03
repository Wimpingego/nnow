package com.github.wimpingego.nnow.blocks.traps;

import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class GoldTrap extends TrapBase {

    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_GOLDEN_TRAP = "message.golden_trap";
    public static final String MESSAGE_GOLDEN_TRAP_NO_XP = "message.golden_trap_no_xp";
    public static final String MESSAGE_GOLDEN_TRAP_NO_PLAYER_DROPS = "message.golden_trap_no_player_drops";
    public static final String MESSAGE_GOLDEN_TRAP_DMG = "item.nnow.info.golden_trap.dmg";
    public static final String MESSAGE_DEATH_ATTACK_GOLDEN_TRAP = "death.attack.trap.golden";

    static int G_Attack = Configs.GOLDERN_ATTACK_POWER.get();

    public GoldTrap(Properties properties, TrapType type) {
        super(properties, type);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_GOLDEN_TRAP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_GOLDEN_TRAP_NO_XP));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_GOLDEN_TRAP_NO_PLAYER_DROPS));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_GOLDEN_TRAP_DMG,G_Attack));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}
