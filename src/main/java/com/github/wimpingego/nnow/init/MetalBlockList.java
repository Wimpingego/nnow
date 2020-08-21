package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.bushs.metals.*;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MetalBlockList {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	//Metal Blocks
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> BISMUTH_BLOCK = BLOCKS.register("bismuth_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block",() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2, 6)));
	
	//No Item Blocks Info
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
	
	//Metal Bushes
	public static final RegistryObject<Block> COPPER_BERRY_BUSH = NO_ITEM_BLOCK.register("copper_berry_bush",() -> new CopperBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> NICKEL_BERRY_BUSH = NO_ITEM_BLOCK.register("nickel_berry_bush",() -> new NickelBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> SILVER_BERRY_BUSH = NO_ITEM_BLOCK.register("silver_berry_bush",() -> new SilverBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> URANIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("uranium_berry_bush",() -> new UraniumBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> LEAD_BERRY_BUSH = NO_ITEM_BLOCK.register("lead_berry_bush",() -> new LeadBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> ALUMINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("aluminum_berry_bush",() -> new AluminumBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> TIN_BERRY_BUSH = NO_ITEM_BLOCK.register("tin_berry_bush",() -> new TinBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> OSMIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("osmium_berry_bush",() -> new OsmiumBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> BISMUTH_BERRY_BUSH = NO_ITEM_BLOCK.register("bismuth_berry_bush",() -> new BismuthBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> ZINC_BERRY_BUSH = NO_ITEM_BLOCK.register("zinc_berry_bush",() -> new ZincBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> PLATINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("platinum_berry_bush",() -> new PlatinumBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> IRIDIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("iridium_berry_bush",() -> new IridiumBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
}
