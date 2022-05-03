package com.github.wimpingego.nnow.integration.recipes;

import com.github.wimpingego.nnow.NNOW;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import java.util.ArrayList;
import java.util.List;

public class MiningRecipes {

    //Spalings
    public static List<Recipe<?>> createSpruce_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.SPRUCE_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.SPRUCE_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_spruce_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createBirch_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.BIRCH_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.BIRCH_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_birch_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createOak_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.OAK_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.OAK_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_oak_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createAcacia_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.ACACIA_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.ACACIA_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_acacia_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createJungle_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.JUNGLE_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.JUNGLE_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_jungle_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    public static List<Recipe<?>> createDark_Oak_Spaling() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.DARK_OAK_SAPLING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.DARK_OAK_LEAVES));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_dark_oak_spaling");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }
    //Cactus
    public static List<Recipe<?>> createCactus_Sand() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.CACTUS);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.SAND),Ingredient.of(Items.RED_SAND));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_cactus_sand");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    //SugarCane
    public static List<Recipe<?>> createSugarCane_Grass() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.SUGAR_CANE);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.GRASS));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_sugarcane_grass");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }

    //String
    public static List<Recipe<?>> createSting_Green_Wool() {
        List<Recipe<?>> recipes = new ArrayList<>();
        String group = "nnow.poking_stick";

        ItemStack output = new ItemStack(Items.STRING);

        NonNullList<Ingredient> inputs = NonNullList.of(Ingredient.EMPTY,
                Ingredient.of(Items.GREEN_WOOL));
        ResourceLocation id = new ResourceLocation(NNOW.MODID, "jei_string_green_wool");
        ShapelessRecipe recipe = new ShapelessRecipe(id, group, output, inputs);
        recipes.add(recipe);

        return recipes;
    }
}
