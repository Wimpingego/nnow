package com.github.wimpingego.nnow.integration.recipes;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import java.util.ArrayList;
import java.util.List;

public class RightClickingRecipes {

    //Right-Clicking with Poking Stick
    public static List<Recipe<?>> createStoneDust() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Registration.STONE_DUST.get());

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.STONE),Ingredient.of(Items.GRASS_BLOCK),Ingredient.of(Items.DEEPSLATE));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_stone_dust");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createGravelDust() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Registration.GRAVEL_DUST.get());

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.COBBLESTONE),Ingredient.of(Items.MOSSY_COBBLESTONE),Ingredient.of(Items.COBBLED_DEEPSLATE));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_gravel_dust");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createSandDust() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Registration.SAND_DUST.get());

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.GRAVEL),Ingredient.of(Registration.AGG_BLOCK_ITEM.get()));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_sand_dust");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createDirtDust() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Registration.DIRT_DUST.get());

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.SAND),Ingredient.of(Items.RED_SAND),Ingredient.of(Registration.AGS_BLOCK.get()),Ingredient.of(Registration.AGRS_BLOCK.get()));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_dirt_dust");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createClayDust() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Registration.CLAY_DUST.get());

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.DIRT),Ingredient.of(Items.PODZOL),Ingredient.of(Items.COARSE_DIRT),Ingredient.of(Items.MYCELIUM));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_clay_dust");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }
}
