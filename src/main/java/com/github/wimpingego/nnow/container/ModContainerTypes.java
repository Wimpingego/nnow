package com.github.wimpingego.nnow.container;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(
			ForgeRegistries.CONTAINERS, NNOW.MOD_ID);

	public static final RegistryObject<ContainerType<BookshelfChestContainer>> BOOKSHELF_CHEST = CONTAINER_TYPES
			.register("bookshelf_chest", () -> IForgeContainerType.create(BookshelfChestContainer::new));	
}
