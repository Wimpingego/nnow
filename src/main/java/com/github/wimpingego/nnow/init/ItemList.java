package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.items.CoalNugget;
import com.github.wimpingego.nnow.objects.items.DeathPotato;
import com.github.wimpingego.nnow.objects.items.MusicDisc;
import com.github.wimpingego.nnow.objects.items.Magnet;
import com.github.wimpingego.nnow.objects.items.PokingStick;
import com.github.wimpingego.nnow.objects.items.Viagra;
import com.github.wimpingego.nnow.objects.items.hammers.DiamondHammer;
import com.github.wimpingego.nnow.objects.items.hammers.GoldenHammer;
import com.github.wimpingego.nnow.objects.items.hammers.IronHammer;
import com.github.wimpingego.nnow.objects.items.hammers.StoneHammer;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, NNOW.MOD_ID);
	
	//Bush Blocks
	public static final RegistryObject<Item> IRONBERRY = ITEMS.register("iron_berry", () -> new BlockItem(BlockList.IRONBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GOLDBERRY = ITEMS.register("gold_berry", () -> new BlockItem(BlockList.GOLDBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> COALBERRY = ITEMS.register("coal_berry", () -> new BlockItem(BlockList.COALBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> REDSTONEBERRY = ITEMS.register("redstone_berry", () -> new BlockItem(BlockList.REDSTONEBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> QUARTZBERRY = ITEMS.register("quartz_berry", () -> new BlockItem(BlockList.QUARTZBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIAMONDBERRY = ITEMS.register("diamond_berry", () -> new BlockItem(BlockList.DIAMONDBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> EMERALDBERRY = ITEMS.register("emerald_berry", () -> new BlockItem(BlockList.EMERALDBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> LAPISBERRY = ITEMS.register("lapis_berry", () -> new BlockItem(BlockList.LAPISBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> ICEBERRY = ITEMS.register("ice_berry", () -> new BlockItem(BlockList.ICEBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> FIREBERRY = ITEMS.register("fire_berry", () -> new BlockItem(BlockList.FIREBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> WOODENBERRY = ITEMS.register("wooden_berry", () -> new BlockItem(BlockList.WOODENBERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> XPBERRY = ITEMS.register("xp_berry", () -> new BlockItem(BlockList.XP_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	
	//Nuggets
	public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", () -> new CoalNugget(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> REDSTONE_NUGGET = ITEMS.register("redstone_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> LAPIS_NUGGET = ITEMS.register("lapis_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> ICE_NUGGET = ITEMS.register("ice_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> FIRE_NUGGET = ITEMS.register("fire_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> WOODEN_NUGGET = ITEMS.register("wooden_nugget", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	//Crops + Food
	//public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new BlockItem(BlockList.PEPPER_CROP.get(), new Item.Properties().group(NNOW.NNOW_TAB)));
	//public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.PEPPER)));
	//public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds", () -> new BlockItem(BlockList.BARLEY_CROP.get(), new Item.Properties().group(NNOW.NNOW_TAB)));
	//public static final RegistryObject<Item> BARLEY = ITEMS.register("barley", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	public static final RegistryObject<Item> WEETABIX = ITEMS.register("weetabix", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.WEETABIX)));
	
	//Dust
	public static final RegistryObject<Item> STONE_DUST = ITEMS.register("stone_dust", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> SAND_DUST = ITEMS.register("sand_dust", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DIRT_DUST = ITEMS.register("dirt_dust", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> GRAVEL_DUST = ITEMS.register("gravel_dust", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> CLAY_DUST = ITEMS.register("clay_dust", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	//Other items
	
	public static final RegistryObject<Item> S_HAMMER = ITEMS.register("stone_hammer", () -> new StoneHammer(ItemTier.STONE, 7, -3.3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> I_HAMMER = ITEMS.register("iron_hammer", () -> new IronHammer(ItemTier.IRON, 6, -3.2f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> G_HAMMER = ITEMS.register("golden_hammer", () -> new GoldenHammer(ItemTier.GOLD, 7, -3.1f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> D_HAMMER = ITEMS.register("diamond_hammer", () -> new DiamondHammer(ItemTier.DIAMOND, 6, -3.1f, new Item.Properties().group(NNOW.NNOW_TAB)));
	
	public static final RegistryObject<Item> POKING_STICK = ITEMS.register("poking_stick", () -> new PokingStick(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", () -> new Magnet(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> VIAGRA = ITEMS.register("viagra", () -> new Viagra(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DEATH_POTATO = ITEMS.register("death_potato", () -> new DeathPotato(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.DEATH_POTATO)));
	
	//Discs
	
	public static final RegistryObject<Item> DOOM_MUSIC_DISC = ITEMS.register("doom_disc", () -> new MusicDisc(1, SoundList.DOOM_DISC_LAZY.get(), new Item.Properties().maxStackSize(1).group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> MIZZY_MUSIC_DISC = ITEMS.register("mizzy_disc", () -> new MusicDisc(2, SoundList.MIZZY_DISC_LAZY.get(), new Item.Properties().maxStackSize(1).group(NNOW.NNOW_TAB)));

}
