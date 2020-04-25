package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.NNOW.NNOWItemGroup;
import com.github.wimpingego.nnow.objects.items.CoalNugget;
import com.github.wimpingego.nnow.objects.items.Magnet;
import com.github.wimpingego.nnow.objects.items.PokingStick;
import com.github.wimpingego.nnow.objects.items.Viagra;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NNOW.MOD_ID);
	
	//public static final RegistryObject<Item> DEF_ITEM = ITEMS.register("def_item", () -> new MiningItem(new Item.Properties().group(NNOWItemGroup.instance)));
	
	//Coins
	public static final RegistryObject<Item> COIN_0 = ITEMS.register("coin_0", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COIN_1 = ITEMS.register("coin_1", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COIN_2 = ITEMS.register("coin_2", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COIN_3 = ITEMS.register("coin_3", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COIN_4 = ITEMS.register("coin_4", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COIN_C = ITEMS.register("coin_c", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.COIN_C)));
	
	//Nuggets
	public static final RegistryObject<Item> REDSTONE_NUGGET = ITEMS.register("redstone_nugget", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> LAPIS_NUGGET = ITEMS.register("lapis_nugget", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", () -> new CoalNugget(new Item.Properties().group(NNOWItemGroup.instance)));
	
	//Crops 
	public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new BlockItem(BlockList.PEPPER_CROP.get(), new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.PEPPER)));
	
	public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds", () -> new BlockItem(BlockList.BARLEY_CROP.get(), new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> BARLEY = ITEMS.register("barley", () -> new Item(new Item.Properties().group(NNOWItemGroup.instance)));
	
	//Bush Blocks
	public static final RegistryObject<Item> IRONBERRY = ITEMS.register("iron_berry", () -> new BlockItem(BlockList.IRONBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GOLDBERRY = ITEMS.register("gold_berry", () -> new BlockItem(BlockList.GOLDBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> COALBERRY = ITEMS.register("coal_berry", () -> new BlockItem(BlockList.COALBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> REDSTONEBERRY = ITEMS.register("redstone_berry", () -> new BlockItem(BlockList.REDSTONEBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> QUARTZBERRY = ITEMS.register("quartz_berry", () -> new BlockItem(BlockList.QUARTZBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIAMONDBERRY = ITEMS.register("diamond_berry", () -> new BlockItem(BlockList.DIAMONDBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> EMERALDBERRY = ITEMS.register("emerald_berry", () -> new BlockItem(BlockList.EMERALDBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> LAPISBERRY = ITEMS.register("lapis_berry", () -> new BlockItem(BlockList.LAPISBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	public static final RegistryObject<Item> FROSTBERRY = ITEMS.register("frost_berry", () -> new BlockItem(BlockList.FROSTBERRY_BUSH.get(), new Item.Properties().group(NNOWItemGroup.instance).food(FoodList.BERRY)));
	
	//Other items

	public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", () -> new Magnet(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> VIAGRA = ITEMS.register("viagra", () -> new Viagra(new Item.Properties().group(NNOWItemGroup.instance)));
	public static final RegistryObject<Item> POKING_STICK = ITEMS.register("poking_stick", () -> new PokingStick(new Item.Properties().group(NNOWItemGroup.instance)));

}
