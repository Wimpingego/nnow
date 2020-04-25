package com.github.wimpingego.nnow.entities;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.tileentity.BookshelfChestTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, NNOW.MOD_ID);


	
	public static final RegistryObject<TileEntityType<BookshelfChestTileEntity>> BOOKSHELF_CHEST = TILE_ENTITY_TYPES
			.register("bookshelf_chest", () -> TileEntityType.Builder
					.create(BookshelfChestTileEntity::new, BlockList.BOOKSHELF_CHEST.get()).build(null));	
}
