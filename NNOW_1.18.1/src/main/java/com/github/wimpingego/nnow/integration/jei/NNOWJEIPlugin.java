package com.github.wimpingego.nnow.integration.jei;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaRecipeCategoryUid;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.plugins.vanilla.anvil.AnvilRecipe;
import mezz.jei.plugins.vanilla.anvil.AnvilRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static com.github.wimpingego.nnow.integration.recipes.MiningRecipes.*;
import static com.github.wimpingego.nnow.integration.recipes.RightClickingRecipes.*;

@JeiPlugin
public class NNOWJEIPlugin implements IModPlugin {
    public static final String MESSAGE_INFO_POKING_STICK = "wiki.nnow.poking_stick";
    public static final String MESSAGE_INFO_VIAGRA = "wiki.nnow.viagra";
    public static final String MESSAGE_INFO_VIAGRA_ULTRA = "wiki.nnow.viagra_ultra";
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(NNOW.MODID, "jei");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {

        ItemStack poking_stick = new ItemStack(Registration.POKING_STICK.get());
        Component poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(poking_stick, VanillaTypes.ITEM, poking_stick_message);

        ItemStack stone_poking_stick = new ItemStack(Registration.STONE_POKING_STICK.get());
        Component stone_poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(stone_poking_stick, VanillaTypes.ITEM, stone_poking_stick_message);

        ItemStack iron_poking_stick = new ItemStack(Registration.IRON_POKING_STICK.get());
        Component iron_poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(iron_poking_stick, VanillaTypes.ITEM, iron_poking_stick_message);

        ItemStack gold_poking_stick = new ItemStack(Registration.GOLD_POKING_STICK.get());
        Component gold_poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(gold_poking_stick, VanillaTypes.ITEM, gold_poking_stick_message);

        ItemStack diamond_poking_stick = new ItemStack(Registration.DIAMOND_POKING_STICK.get());
        Component diamond_poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(diamond_poking_stick, VanillaTypes.ITEM, diamond_poking_stick_message);

        ItemStack netherite_poking_stick = new ItemStack(Registration.NETHERITE_POKING_STICK.get());
        Component netherite_poking_stick_message = new TranslatableComponent("wiki.nnow.poking_stick");
        registration.addIngredientInfo(netherite_poking_stick, VanillaTypes.ITEM, netherite_poking_stick_message);

        ItemStack viagra = new ItemStack(Registration.VIAGRA.get());
        Component viagra_message = new TranslatableComponent("wiki.nnow.viagra");
        registration.addIngredientInfo(viagra, VanillaTypes.ITEM, viagra_message);

        ItemStack viagra_ultra = new ItemStack(Registration.VIAGRA_ULTRA.get());
        Component viagra_ultra_message = new TranslatableComponent("wiki.nnow.viagra_ultra");
        registration.addIngredientInfo(viagra_ultra, VanillaTypes.ITEM, viagra_ultra_message);

        registration.addRecipes(createStoneDust(), PSRightClickingRecipeCategory.UID);
        registration.addRecipes(createGravelDust(), PSRightClickingRecipeCategory.UID);
        registration.addRecipes(createSandDust(), PSRightClickingRecipeCategory.UID);
        registration.addRecipes(createDirtDust(), PSRightClickingRecipeCategory.UID);
        registration.addRecipes(createClayDust(), PSRightClickingRecipeCategory.UID);

        registration.addRecipes(createSpruce_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createBirch_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createOak_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createAcacia_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createJungle_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createDark_Oak_Spaling(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createCactus_Sand(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createSugarCane_Grass(), PSMiningRecipeCategory.UID);
        registration.addRecipes(createSting_Green_Wool(), PSMiningRecipeCategory.UID);
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        registry.addRecipeCategories(new PSRightClickingRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
        registry.addRecipeCategories(new PSMiningRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
    }
}
