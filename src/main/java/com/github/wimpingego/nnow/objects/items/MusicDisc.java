package com.github.wimpingego.nnow.objects.items;


import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;

public class MusicDisc extends MusicDiscItem {

	public MusicDisc(int comparatorValueIn, SoundEvent soundIn, Properties builder) {
		super(comparatorValueIn, soundIn, builder);
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return Rarity.create("", TextFormatting.AQUA);
	}

}