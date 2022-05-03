package com.github.wimpingego.nnow.util;

import java.util.function.Supplier;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorMaterials implements ArmorMaterial {

    LC(NNOW.MODID + ":clear", 7, new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0F, () -> {
        return Ingredient.of(Items.LEATHER);}),
    CC(NNOW.MODID + ":clear", 15, new int[] { 1, 4, 5, 2 }, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0F,() -> {
        return Ingredient.of(Items.IRON_INGOT);}),
    IC(NNOW.MODID + ":clear", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0F,() -> {
        return Ingredient.of(Items.IRON_INGOT);}),
    GC(NNOW.MODID + ":clear", 7, new int[] { 1, 3, 5, 2 }, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0F,() -> {
        return Ingredient.of(Items.GOLD_INGOT);}),
    DC(NNOW.MODID + ":clear", 33, new int[] { 3, 6, 8, 3 }, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0F,() -> {
        return Ingredient.of(Items.DIAMOND);}),
    TC(NNOW.MODID + ":clear", 25, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0F,() -> {
        return Ingredient.of(Items.SCUTE);}),
    NC(NNOW.MODID + ":clear", 37, new int[] {3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,() -> {
        return Ingredient.of(Items.NETHERITE_INGOT);});

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    private ArmorMaterials(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
                           int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float p_i231593_9_, Supplier<Ingredient> repairMaterialIn) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.knockbackResistance = p_i231593_9_;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterialIn);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}