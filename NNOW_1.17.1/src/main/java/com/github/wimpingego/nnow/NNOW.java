package com.github.wimpingego.nnow;

import com.github.wimpingego.nnow.init.*;
import com.github.wimpingego.nnow.util.*;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

@Mod("nnow")
@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
public class NNOW
{	
	//public static NNOW instance;
	public static final String MOD_ID = "nnow";
	//public static final Logger LOGGER = LogManager.getLogger();
	
	public static final CreativeModeTab NNOW_TAB = new CreativeModeTab("NNOWTab") {
		public ItemStack makeIcon() {return new ItemStack(ItemList.ENDER_BAG.get());}
	};

	public static final CreativeModeTab NNOWLight_TAB = new CreativeModeTab("NNOWLightTab") {
		public ItemStack makeIcon() {return new ItemStack(LightList.LIGHT_BASE_BLOCK.get());}
	};

	public NNOW()
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.ALL);
        ModConfigs.load(ModConfigs.ALL, FMLPaths.CONFIGDIR.get().resolve("nnow-common.toml"));
		
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientSetup);

		ItemList.ITEMS.register(modEventBus);
		
		if(ModConfigs.METALS_ITEMS_LOADED.get())
		{
		MetalItemList.ITEMS.register(modEventBus);
		}
		
		BlockList.BLOCKS.register(modEventBus);
		BlockList.NO_ITEM_BLOCK.register(modEventBus);

		LightList.BLOCKS.register(modEventBus);
		LightList.NO_ITEM_BLOCK.register(modEventBus);

		if(ModConfigs.WATER_BLOCK_LOADED.get())
		{
		BlockList.WATER.register(modEventBus);
		}
		
		if(ModConfigs.LAVA_BLOCK_LOADED.get())
		{
		BlockList.LAVA.register(modEventBus);
		}
		
		if(ModConfigs.COBBLE_GEN_LOADED.get())
		{
		BlockList.COBBLE_GEN.register(modEventBus);
		}
		
		if(ModConfigs.METALS_ITEMS_LOADED.get())
		{
		MetalBlockList.BLOCKS.register(modEventBus);
		MetalBlockList.NO_ITEM_BLOCK.register(modEventBus);
		}

		MinecraftForge.EVENT_BUS.register(this);
        
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
    
        forgeEventBus.addListener(WitherEvents::onWitherExplosion);
        forgeEventBus.addListener(WitherEvents::onExplosion);
	}
	
	@SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(NNOW_TAB);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
			registry.register(blockItem);
		});

		LightList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(NNOWLight_TAB);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
			registry.register(blockItem);
		});

		if(ModConfigs.WATER_BLOCK_LOADED.get())
		{
			BlockList.WATER.getEntries().stream().map(RegistryObject::get).forEach(block -> {
				final Item.Properties properties = new Item.Properties().tab(NNOW_TAB);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
				registry.register(blockItem);
			});		
		}
		
		if(ModConfigs.LAVA_BLOCK_LOADED.get())
		{
			BlockList.LAVA.getEntries().stream().map(RegistryObject::get).forEach(block -> {
				final Item.Properties properties = new Item.Properties().tab(NNOW_TAB);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
				registry.register(blockItem);
			});		
		}
		
		if(ModConfigs.COBBLE_GEN_LOADED.get())
		{
			BlockList.COBBLE_GEN.getEntries().stream().map(RegistryObject::get).forEach(block -> {
				final Item.Properties properties = new Item.Properties().tab(NNOW_TAB);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
				registry.register(blockItem);
			});		
		}

		if(ModConfigs.METALS_ITEMS_LOADED.get())
		{
			MetalBlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
				final Item.Properties properties = new Item.Properties().tab(NNOW_TAB);
				final BlockItem blockItem = new BlockItem(block, properties);
				blockItem.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
				registry.register(blockItem);
			});		
		}		
	}

	private void setup(final FMLCommonSetupEvent event)
	
	{	
		MinecraftForge.EVENT_BUS.register(PlayerSpecialAbilities.class);
        MinecraftForge.EVENT_BUS.register(TrollInventory.class);
	}

	private void clientSetup(final FMLClientSetupEvent event)
	{
		ClientRenderer.registerBlocks();
		LightBlockClientRenderer.registerBlocks();
		
		if(ModConfigs.METALS_ITEMS_LOADED.get())
		{
			MetalClientRenderer.registerBlocks();
		}

	}	
	
}
