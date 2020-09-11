package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MetalItemList {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NNOW.MOD_ID);
	
	//Metal Berrys
	public static final RegistryObject<Item> COPPER_BERRY = ITEMS.register("copper_berry", () -> new BlockItem(MetalBlockList.COPPER_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> NICKEL_BERRY = ITEMS.register("nickel_berry", () -> new BlockItem(MetalBlockList.NICKEL_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> SILVER_BERRY = ITEMS.register("silver_berry", () -> new BlockItem(MetalBlockList.SILVER_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> URANIUM_BERRY = ITEMS.register("uranium_berry", () -> new BlockItem(MetalBlockList.URANIUM_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> LEAD_BERRY = ITEMS.register("lead_berry", () -> new BlockItem(MetalBlockList.LEAD_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> ALUMINUM_BERRY = ITEMS.register("aluminum_berry", () -> new BlockItem(MetalBlockList.ALUMINUM_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> TIN_BERRY = ITEMS.register("tin_berry", () -> new BlockItem(MetalBlockList.TIN_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> OSMIUM_BERRY = ITEMS.register("osmium_berry", () -> new BlockItem(MetalBlockList.OSMIUM_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> BISMUTH_BERRY = ITEMS.register("bismuth_berry", () -> new BlockItem(MetalBlockList.BISMUTH_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> ZINC_BERRY = ITEMS.register("zinc_berry", () -> new BlockItem(MetalBlockList.ZINC_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> PLATINUM_BERRY = ITEMS.register("platinum_berry", () -> new BlockItem(MetalBlockList.PLATINUM_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> IRIDIUM_BERRY = ITEMS.register("iridium_berry", () -> new BlockItem(MetalBlockList.IRIDIUM_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));

	//Metal Nuggets
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	//Metal Ingots
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	//Villager Item
	public static final RegistryObject<Item> INGOT_FURNACE = ITEMS.register("ingot_furnace", () -> new BlockItem(BlockList.INGOT_FURNACE.get(), new Item.Properties().group(NNOW.NNOW_TAB)));
}
