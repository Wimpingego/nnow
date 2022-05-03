package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.bushs.metals.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MetalBlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	//Metal Blocks
	public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> BISMUTH_BLOCK = BLOCKS.register("bismuth_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block",() -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK).strength(2, 6)));
	
	//No Item Blocks Info
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MOD_ID);

	//Metal Bushes
	public static final RegistryObject<Block> NICKEL_BERRY_BUSH = NO_ITEM_BLOCK.register("nickel_berry_bush",() -> new NickelBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> SILVER_BERRY_BUSH = NO_ITEM_BLOCK.register("silver_berry_bush",() -> new SilverBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> URANIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("uranium_berry_bush",() -> new UraniumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> LEAD_BERRY_BUSH = NO_ITEM_BLOCK.register("lead_berry_bush",() -> new LeadBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> ALUMINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("aluminum_berry_bush",() -> new AluminumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> TIN_BERRY_BUSH = NO_ITEM_BLOCK.register("tin_berry_bush",() -> new TinBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> OSMIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("osmium_berry_bush",() -> new OsmiumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> BISMUTH_BERRY_BUSH = NO_ITEM_BLOCK.register("bismuth_berry_bush",() -> new BismuthBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> ZINC_BERRY_BUSH = NO_ITEM_BLOCK.register("zinc_berry_bush",() -> new ZincBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));	
	public static final RegistryObject<Block> PLATINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("platinum_berry_bush",() -> new PlatinumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
	public static final RegistryObject<Block> IRIDIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("iridium_berry_bush",() -> new IridiumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
}
