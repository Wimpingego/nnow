package com.github.wimpingego.nnow.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BaseBlock extends Block {

    public BaseBlock() {
        super(Properties.of (Material.METAL, MaterialColor.METAL)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F));
    }
}
