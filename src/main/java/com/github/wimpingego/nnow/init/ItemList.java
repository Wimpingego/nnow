package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.items.*;
import com.github.wimpingego.nnow.objects.items.armor.*;
import com.github.wimpingego.nnow.objects.items.hammers.*;
import com.github.wimpingego.nnow.objects.items.spades.*;
import com.github.wimpingego.nnow.util.enums.ModArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SoupItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NNOW.MOD_ID);
	
	//Bush Blocks
	public static final RegistryObject<Item> IRON_BERRY = ITEMS.register("iron_berry", () -> new BlockItem(BlockList.IRON_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GOLD_BERRY = ITEMS.register("gold_berry", () -> new BlockItem(BlockList.GOLD_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> COAL_BERRY = ITEMS.register("coal_berry", () -> new BlockItem(BlockList.COAL_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> REDSTONE_BERRY = ITEMS.register("redstone_berry", () -> new BlockItem(BlockList.REDSTONE_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> QUARTZ_BERRY = ITEMS.register("quartz_berry", () -> new BlockItem(BlockList.QUARTZ_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIAMOND_BERRY = ITEMS.register("diamond_berry", () -> new BlockItem(BlockList.DIAMOND_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> EMERALD_BERRY = ITEMS.register("emerald_berry", () -> new BlockItem(BlockList.EMERALD_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> LAPIS_BERRY = ITEMS.register("lapis_berry", () -> new BlockItem(BlockList.LAPIS_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> ICE_BERRY = ITEMS.register("ice_berry", () -> new BlockItem(BlockList.ICE_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> FIRE_BERRY = ITEMS.register("fire_berry", () -> new BlockItem(BlockList.FIRE_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> WOODEN_BERRY = ITEMS.register("wooden_berry", () -> new BlockItem(BlockList.WOODEN_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> XP_BERRY = ITEMS.register("xp_berry", () -> new BlockItem(BlockList.XP_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> STONE_BERRY = ITEMS.register("stone_berry", () -> new BlockItem(BlockList.STONE_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> SAND_BERRY = ITEMS.register("sand_berry", () -> new BlockItem(BlockList.SAND_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> CLAY_BERRY = ITEMS.register("clay_berry", () -> new BlockItem(BlockList.CLAY_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> DIRT_BERRY = ITEMS.register("dirt_berry", () -> new BlockItem(BlockList.DIRT_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	public static final RegistryObject<Item> GRAVEL_BERRY = ITEMS.register("gravel_berry", () -> new BlockItem(BlockList.GRAVEL_BERRY_BUSH.get(), new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.BERRY)));
	
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
	public static final RegistryObject<Item> WEETABIX = ITEMS.register("weetabix", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.WEETABIX)));
	public static final RegistryObject<Item> BOWL_OF_WEETABIX = ITEMS.register("bowl_of_weetabix", () -> new SoupItem(new Item.Properties().maxStackSize(1).group(NNOW.NNOW_TAB).food(FoodList.BOWLOFWEETABIX)));
	//public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new BlockItem(BlockList.PEPPER_CROP.get(), new Item.Properties().group(NNOW.NNOW_TAB)));
	//public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.PEPPER)));
	//public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds", () -> new BlockItem(BlockList.BARLEY_CROP.get(), new Item.Properties().group(NNOW.NNOW_TAB)));
	//public static final RegistryObject<Item> BARLEY = ITEMS.register("barley", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
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
	public static final RegistryObject<Item> E_HAMMER = ITEMS.register("emerald_hammer", () -> new EmeraldHammer(ItemTier.DIAMOND, 6, -3.1f, new Item.Properties().group(NNOW.NNOW_TAB)));

	public static final RegistryObject<Item> S_SPADE = ITEMS.register("stone_spade", () -> new StoneSpade(ItemTier.STONE, 1.5f, -3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> I_SPADE = ITEMS.register("iron_spade", () -> new IronSpade(ItemTier.IRON, 1.5f, -3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> G_SPADE = ITEMS.register("golden_spade", () -> new GoldenSpade(ItemTier.GOLD, 1.5f, -3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> D_SPADE = ITEMS.register("diamond_spade", () -> new DiamondSpade(ItemTier.DIAMOND, 1.5f, -3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> E_SPADE = ITEMS.register("emerald_spade", () -> new EmeraldSpade(ItemTier.DIAMOND, 1.5f, -3f, new Item.Properties().group(NNOW.NNOW_TAB)));
	
	public static final RegistryObject<Item> ENDER_BAG = ITEMS.register("ender_bag", () -> new EnderBag(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> POKING_STICK = ITEMS.register("poking_stick", () -> new PokingStick(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", () -> new Magnet(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> VIAGRA = ITEMS.register("viagra", () -> new Viagra(new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> DEATH_POTATO = ITEMS.register("death_potato", () -> new DeathPotato(new Item.Properties().group(NNOW.NNOW_TAB).food(FoodList.DEATH_POTATO)));
	public static final RegistryObject<Item> VILLAGER_EGG = ITEMS.register("bun_in_the_oven", () -> new Item(new Item.Properties().group(NNOW.NNOW_TAB)));
	
	//Discs
	public static final RegistryObject<Item> DOOM_MUSIC_DISC = ITEMS.register("doom_disc", () -> new MusicDisc(1, SoundList.DOOM_DISC_LAZY.get(), new Item.Properties().maxStackSize(1).group(NNOW.NNOW_TAB)));
	public static final RegistryObject<Item> MIZZY_MUSIC_DISC = ITEMS.register("mizzy_disc", () -> new MusicDisc(2, SoundList.MIZZY_DISC_LAZY.get(), new Item.Properties().maxStackSize(1).group(NNOW.NNOW_TAB)));
	
	//Armour
	public static final RegistryObject<ArmorItem> LC_HELMET = ITEMS.register("clear_leather_helmet",() -> new ArmorItem(ModArmorMaterials.LC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> CC_HELMET = ITEMS.register("clear_chain_helmet",() -> new ArmorItem(ModArmorMaterials.CC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> IC_HELMET = ITEMS.register("clear_iron_helmet",() -> new ArmorItem(ModArmorMaterials.IC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> GC_HELMET = ITEMS.register("clear_golden_helmet",() -> new ArmorItem(ModArmorMaterials.GC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> DC_HELMET = ITEMS.register("clear_diamond_helmet",() -> new ArmorItem(ModArmorMaterials.DC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
	public static final RegistryObject<ArmorItem> NC_HELMET = ITEMS.register("clear_netherite_helmet",() -> new ArmorItem(ModArmorMaterials.NC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB).isBurnable()));
	public static final RegistryObject<ArmorItem> TC_HELMET = ITEMS.register("clear_turtle_helmet",() -> new ItemCustomArmorTC(ModArmorMaterials.TC, EquipmentSlotType.HEAD, new Item.Properties().group(NNOW.NNOW_TAB)));
}
