package com.github.wimpingego.nnow.integration.jei;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class PSRightClickingRecipeCategory implements IRecipeCategory<CraftingRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(NNOW.MODID, "ps_right_clicking");
    public final static ResourceLocation TEXTURE = new ResourceLocation(NNOW.MODID, "textures/gui/jei/poking_stick.png");

    private final IDrawable background;
    private final IDrawable icon;

    public PSRightClickingRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(TEXTURE, 0, 0, 116, 53);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(Registration.POKING_STICK.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends CraftingRecipe> getRecipeClass() {
        return CraftingRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("From Right-Clicking");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CraftingRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 19, 19).addIngredients(Ingredient.merge(recipe.getIngredients()));
        builder.addSlot(RecipeIngredientRole.INPUT, 49, 0).addIngredients(Ingredient.of(Registration.TAG_POKING_STICK));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 81, 19).addItemStack(recipe.getResultItem());
    }
}
