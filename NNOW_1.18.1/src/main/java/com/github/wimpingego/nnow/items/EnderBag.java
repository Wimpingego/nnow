package com.github.wimpingego.nnow.items;

import com.github.wimpingego.nnow.setup.ModSetup;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;

public class EnderBag extends Item{
    public static final String SCREEN_ENDER_BAG_TITLE = "screen.nnow.ender_bag";
    //public static final TranslatableComponent CONTAINER_TITLE = new TranslatableComponent("item.nnow.ender_bag.line1");

    public EnderBag(Properties properties){
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {

        PlayerEnderChestContainer enderChest = player.getEnderChestInventory();

        if (enderChest != null) {
            if (!world.isClientSide) {
                player.openMenu(new SimpleMenuProvider((p_220114_1_, p_220114_2_, p_220114_3_) -> {
                    return ChestMenu.threeRows(p_220114_1_, p_220114_2_, enderChest);
                }, new TranslatableComponent(SCREEN_ENDER_BAG_TITLE)));
            }
        }
        return new InteractionResultHolder<ItemStack>(InteractionResult.PASS, player.getItemInHand(hand));
    }

}

