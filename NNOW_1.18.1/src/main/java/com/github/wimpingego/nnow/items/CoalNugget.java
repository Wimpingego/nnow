package com.github.wimpingego.nnow.items;

import com.github.wimpingego.nnow.setup.ModSetup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;


public class CoalNugget extends Item {

    public final int burnTime;

    public CoalNugget(Properties properties) {
        super(properties
                .tab(ModSetup.ITEM_GROUP));
        this.burnTime = 200;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
