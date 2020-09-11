package com.github.wimpingego.nnow.util.loot;

/*
 * BluSunrize
 * Copyright (c) 2020
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

import com.github.wimpingego.nnow.NNOW;
import com.google.gson.JsonObject;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

@EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
public class LootDropMods {

	public static final boolean ENABLE = true;

	@SubscribeEvent
	public static void registerModifierSerializers(
			@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
		if (ENABLE) {
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "hammer_gravel_dust_from_cobblestone")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "hammer_sand_dust_from_gravel")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "hammer_dirt_dust_from_sand")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "hammer_dirt_dust_from_red_sand")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "hammer_clay_ball_from_dirt")));

			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "spade_sand_dust_from_gravel")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "spade_dirt_dust_from_sand")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "spade_dirt_dust_from_red_sand")));
			event.getRegistry().register(new DropsConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(NNOW.MOD_ID, "spade_clay_ball_from_dirt")));

			event.getRegistry()
					.register(new SugarCaneDropsSerializer().setRegistryName(NNOW.MOD_ID, "sugar_cane_drops"));
		}
	}

	private static class DropsConverterModifier extends LootModifier {
		private final int numSeedsToConvert;
		private final Item itemToCheck;
		private final Item itemReward;

		public DropsConverterModifier(ILootCondition[] conditionsIn, int numSeeds, Item itemCheck, Item reward) {
			super(conditionsIn);
			numSeedsToConvert = numSeeds;
			itemToCheck = itemCheck;
			itemReward = reward;
		}

		@Nonnull
		@Override
		public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
			int numSeeds = 0;
			for (ItemStack stack : generatedLoot) {
				if (stack.getItem() == itemToCheck)
					numSeeds += stack.getCount();
			}
			if (numSeeds >= numSeedsToConvert) {
				generatedLoot.removeIf(x -> x.getItem() == itemToCheck);
				generatedLoot.add(new ItemStack(itemReward, (numSeeds / numSeedsToConvert)));
				numSeeds = numSeeds % numSeedsToConvert;
				if (numSeeds > 0)
					generatedLoot.add(new ItemStack(itemToCheck, numSeeds));
			}
			return generatedLoot;
		}

		private static class Serializer extends GlobalLootModifierSerializer<DropsConverterModifier> {

			@Override
			public DropsConverterModifier read(ResourceLocation name, JsonObject object,
					ILootCondition[] conditionsIn) {
				int numSeeds = JSONUtils.getInt(object, "numSeeds");
				Item olddrop = ForgeRegistries.ITEMS
						.getValue(new ResourceLocation((JSONUtils.getString(object, "seedItem"))));
				Item newdrop = ForgeRegistries.ITEMS
						.getValue(new ResourceLocation(JSONUtils.getString(object, "replacement")));
				return new DropsConverterModifier(conditionsIn, numSeeds, olddrop, newdrop);
			}
		}
	}

	private static class SugarCaneDropsModifier extends LootModifier {

		protected SugarCaneDropsModifier(ILootCondition[] conditionsIn) {
			super(conditionsIn);
		}

		protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
			generatedLoot.add(new ItemStack(Items.SUGAR_CANE));
			return generatedLoot;
		}
	}
		private static class SugarCaneDropsSerializer extends GlobalLootModifierSerializer<SugarCaneDropsModifier> {

			@Override
			public SugarCaneDropsModifier read(ResourceLocation location, JsonObject object,
					ILootCondition[] ailootcondition) {
				return new SugarCaneDropsModifier(ailootcondition);
			}
		}
}

