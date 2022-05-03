package com.github.wimpingego.nnow.blocks;

import com.github.wimpingego.nnow.util.IExplosionResistant;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;
import java.util.List;

public class SuperObsidian extends Block implements IExplosionResistant {

    public static final String MESSAGE_WITHER_PROOF = "message.wither_proof";

    public SuperObsidian() {
        super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(0.5f, 3600000.0F).requiresCorrectToolForDrops());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> list, TooltipFlag flags) {
        list.add(new TranslatableComponent(MESSAGE_WITHER_PROOF)
                .withStyle(ChatFormatting.RED));

    }
}