package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.items.*;
import com.github.wimpingego.nnow.objects.items.armor.CustomArmorTC;
import com.github.wimpingego.nnow.objects.items.bowls.LavaBowl;
import com.github.wimpingego.nnow.objects.items.bowls.WaterBowl;
import com.github.wimpingego.nnow.objects.items.hammers.*;
import com.github.wimpingego.nnow.objects.items.pokingsticks.IronPokingStick;
import com.github.wimpingego.nnow.objects.items.pokingsticks.PokingStick;
import com.github.wimpingego.nnow.objects.items.pokingsticks.StonePokingStick;
import com.github.wimpingego.nnow.objects.items.spades.*;
import com.github.wimpingego.nnow.objects.items.tools.*;
import com.github.wimpingego.nnow.util.enums.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NNOW.MOD_ID);

	//Bush Blocks
	public static final RegistryObject<Item> IRON_BERRY = ITEMS.register("iron_berry", () -> new BlockItem(BlockList.IRON_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> COPPER_BERRY = ITEMS.register("copper_berry", () -> new BlockItem(BlockList.COPPER_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GOLD_BERRY = ITEMS.register("gold_berry", () -> new BlockItem(BlockList.GOLD_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> COAL_BERRY = ITEMS.register("coal_berry", () -> new BlockItem(BlockList.COAL_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> REDSTONE_BERRY = ITEMS.register("redstone_berry", () -> new BlockItem(BlockList.REDSTONE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GLOWSTONE_BERRY = ITEMS.register("glowstone_berry", () -> new BlockItem(BlockList.GLOWSTONE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> QUARTZ_BERRY = ITEMS.register("quartz_berry", () -> new BlockItem(BlockList.QUARTZ_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIAMOND_BERRY = ITEMS.register("diamond_berry", () -> new BlockItem(BlockList.DIAMOND_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> EMERALD_BERRY = ITEMS.register("emerald_berry", () -> new BlockItem(BlockList.EMERALD_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> LAPIS_BERRY = ITEMS.register("lapis_berry", () -> new BlockItem(BlockList.LAPIS_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> ICE_BERRY = ITEMS.register("ice_berry", () -> new BlockItem(BlockList.ICE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> FIRE_BERRY = ITEMS.register("fire_berry", () -> new BlockItem(BlockList.FIRE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> WOODEN_BERRY = ITEMS.register("wooden_berry", () -> new BlockItem(BlockList.WOODEN_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> XP_BERRY = ITEMS.register("xp_berry", () -> new BlockItem(BlockList.XP_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> NETHERITE_BERRY = ITEMS.register("netherite_berry", () -> new BlockItem(BlockList.NETHERITE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY).fireResistant()));
	
	public static final RegistryObject<Item> STONE_BERRY = ITEMS.register("stone_berry", () -> new BlockItem(BlockList.STONE_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> SAND_BERRY = ITEMS.register("sand_berry", () -> new BlockItem(BlockList.SAND_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> CLAY_BERRY = ITEMS.register("clay_berry", () -> new BlockItem(BlockList.CLAY_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIRT_BERRY = ITEMS.register("dirt_berry", () -> new BlockItem(BlockList.DIRT_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GRAVEL_BERRY = ITEMS.register("gravel_berry", () -> new BlockItem(BlockList.GRAVEL_BERRY_BUSH.get(), new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	
	//Nuggets
	public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", () -> new CoalNugget(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> REDSTONE_NUGGET = ITEMS.register("redstone_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> GLOWSTONE_NUGGET = ITEMS.register("glowstone_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> LAPIS_NUGGET = ITEMS.register("lapis_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> ICE_NUGGET = ITEMS.register("ice_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> FIRE_NUGGET = ITEMS.register("fire_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> WOODEN_NUGGET = ITEMS.register("wooden_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB).fireResistant()));

	//Dust
	public static final RegistryObject<Item> STONE_DUST = ITEMS.register("stone_dust", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> SAND_DUST = ITEMS.register("sand_dust", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DIRT_DUST = ITEMS.register("dirt_dust", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> GRAVEL_DUST = ITEMS.register("gravel_dust", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> CLAY_DUST = ITEMS.register("clay_dust", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	
	//Other items
	public static final RegistryObject<Item> W_SHEAR = ITEMS.register("wooden_shears", () -> new WoodenShears(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> G_SHEAR = ITEMS.register("golden_shears", () -> new GoldenShears(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> D_SHEAR = ITEMS.register("diamond_shears", () -> new DiamondShears(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> N_SHEAR = ITEMS.register("netherite_shears", () -> new NetheriteShears(new Item.Properties().tab(NNOW.NNOW_TAB).fireResistant()));
	
	public static final RegistryObject<Item> S_HAMMER = ITEMS.register("stone_hammer", () -> new StoneHammer(Tiers.STONE, 7, -3.3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> I_HAMMER = ITEMS.register("iron_hammer", () -> new IronHammer(Tiers.IRON, 6, -3.2f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> G_HAMMER = ITEMS.register("golden_hammer", () -> new GoldenHammer(Tiers.GOLD, 7, -3.1f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> D_HAMMER = ITEMS.register("diamond_hammer", () -> new DiamondHammer(Tiers.DIAMOND, 6, -3.1f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> N_HAMMER = ITEMS.register("netherite_hammer", () -> new NetheriteHammer(Tiers.NETHERITE, 7, -3.1f, new Item.Properties().tab(NNOW.NNOW_TAB).fireResistant()));
	public static final RegistryObject<Item> E_HAMMER = ITEMS.register("emerald_hammer", () -> new EmeraldHammer(Tiers.DIAMOND, 6, -3.1f, new Item.Properties().tab(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> S_SPADE = ITEMS.register("stone_spade", () -> new StoneSpade(Tiers.STONE, 1.5f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> I_SPADE = ITEMS.register("iron_spade", () -> new IronSpade(Tiers.IRON, 1.5f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> G_SPADE = ITEMS.register("golden_spade", () -> new GoldenSpade(Tiers.GOLD, 1.5f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> D_SPADE = ITEMS.register("diamond_spade", () -> new DiamondSpade(Tiers.DIAMOND, 1.5f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> N_SPADE = ITEMS.register("netherite_spade", () -> new NetheriteSpade(Tiers.NETHERITE, 2.0f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB).fireResistant()));
	public static final RegistryObject<Item> E_SPADE = ITEMS.register("emerald_spade", () -> new EmeraldSpade(Tiers.DIAMOND, 1.5f, -3f, new Item.Properties().tab(NNOW.NNOW_TAB)));
	
	public static final RegistryObject<Item> ENDER_BAG = ITEMS.register("ender_bag", () -> new EnderBag(new Item.Properties().tab(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> POKING_STICK = ITEMS.register("poking_stick", () -> new PokingStick(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> STONE_POKING_STICK = ITEMS.register("stone_poking_stick", () -> new StonePokingStick(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> IRON_POKING_STICK = ITEMS.register("iron_poking_stick", () -> new IronPokingStick(new Item.Properties().tab(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", () -> new Magnet(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> VIAGRA = ITEMS.register("viagra", () -> new Viagra(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DEATH_POTATO = ITEMS.register("death_potato", () -> new DeathPotato(new Item.Properties().tab(NNOW.NNOW_TAB).food(FoodList.DEATH_POTATO)));
	public static final RegistryObject<Item> VILLAGER_EGG = ITEMS.register("bun_in_the_oven", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> BUNDLE_LEAVES = ITEMS.register("bundle_leaves", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> STONE_LINED_BOWL = ITEMS.register("stone_lined_bowl", () -> new Item(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> BOWL_OF_RAW_LAVA = ITEMS.register("bowl_of_raw_lava", () -> new Item(new Item.Properties().stacksTo(1).tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> WATER_BOWL= ITEMS.register("water_bowl", () -> new WaterBowl(new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> LAVA_BOWL= ITEMS.register("lava_bowl", () -> new LavaBowl(new Item.Properties().tab(NNOW.NNOW_TAB)));

	//Armour
	public static final RegistryObject<ArmorItem> LC_HELMET = ITEMS.register("clear_leather_helmet",() -> new ArmorItem(ModArmorMaterials.LC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> CC_HELMET = ITEMS.register("clear_chain_helmet",() -> new ArmorItem(ModArmorMaterials.CC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> IC_HELMET = ITEMS.register("clear_iron_helmet",() -> new ArmorItem(ModArmorMaterials.IC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> GC_HELMET = ITEMS.register("clear_golden_helmet",() -> new ArmorItem(ModArmorMaterials.GC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> DC_HELMET = ITEMS.register("clear_diamond_helmet",() -> new ArmorItem(ModArmorMaterials.DC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> NC_HELMET = ITEMS.register("clear_netherite_helmet",() -> new ArmorItem(ModArmorMaterials.NC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB).fireResistant()));
	public static final RegistryObject<ArmorItem> TC_HELMET = ITEMS.register("clear_turtle_helmet",() -> new CustomArmorTC(ModArmorMaterials.TC, EquipmentSlot.HEAD, new Item.Properties().tab(NNOW.NNOW_TAB)));

}
