package com.github.wimpingego.nnow.blocks;

import com.github.wimpingego.nnow.setup.Registration;
import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;
import java.util.List;

public class CobbleGen extends Block
{
    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_COBBLEGEN_1 = "message.cobblegen_1";

    int wcost = Configs.W_COST.get();
    int wreturn = Configs.W_RETURN.get();
    int scost = Configs.S_COST.get();
    int sreturn = Configs.S_RETURN.get();
    int icost = Configs.I_COST.get();
    int ireturn = Configs.I_RETURN.get();
    int gcost = Configs.G_COST.get();
    int greturn = Configs.G_RETURN.get();
    int dcost = Configs.D_COST.get();
    int dreturn = Configs.D_RETURN.get();
    int ncost = Configs.N_COST.get();
    int nreturn = Configs.N_RETURN.get();

//    int shcost = Configs.SH_COST.get();
//    int shreturn = Configs.SH_RETURN.get();
//    int ihcost = Configs.IH_COST.get();
//    int ihreturn = Configs.IH_RETURN.get();
//    int ghcost = Configs.GH_COST.get();
//    int ghreturn = Configs.GH_RETURN.get();
//    int dhcost = Configs.DH_COST.get();
//    int dhreturn = Configs.DH_RETURN.get();
//    int nhcost = Configs.NH_COST.get();
//    int nhreturn = Configs.NH_RETURN.get();
//    int ehcost = Configs.EH_COST.get();
//    int ehreturn = Configs.EH_RETURN.get();

    public CobbleGen() {
        super(Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops());
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit)
    {
        ItemStack itemstack = player.getItemInHand(handIn);

    //Tagged Pickaxes
        if (Registration.TAG_WOODEN_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(wcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, wreturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

        if (Registration.TAG_STONE_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(scost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, sreturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

        if (Registration.TAG_IRON_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(icost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, ireturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

        if (Registration.TAG_GOLDEN_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(gcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, greturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

        if (Registration.TAG_DIAMOND_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(dcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, dreturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

        if (Registration.TAG_NETHERITE_PICKAXE.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(ncost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, nreturn);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemback);
                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemback))
            {
                player.drop(itemstack, false);
                return InteractionResult.SUCCESS;
            }
        }

//    //Tagged Hammers
//        if (Registration.TAG_STONE_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(shcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, shreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }
//
//        if (Registration.TAG_IRON_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(ihcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, ihreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }
//
//        if (Registration.TAG_GOLDEN_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(ghcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, ghreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }
//
//        if (Registration.TAG_DIAMOND_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(dhcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, dhreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }
//
//        if (Registration.TAG_EMERALD_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(ehcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, ehreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }
//
//        if (Registration.TAG_NETHERITE_HAMMER.contains(itemstack.getItem())  && !player.getAbilities().instabuild) {
//            itemstack.hurtAndBreak(nhcost, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
//            ItemStack itemback;
//            itemback = new ItemStack(Items.COBBLESTONE, nhreturn);
//
//            if (itemstack.isEmpty())
//            {
//                player.setItemInHand(handIn, itemback);
//                return InteractionResult.SUCCESS;
//            }
//            else if (!player.getInventory().add(itemback))
//            {
//                player.drop(itemstack, false);
//                return InteractionResult.SUCCESS;
//            }
//        }

        return super.use(state, worldIn, pos, player, handIn, hit);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_COBBLEGEN_1));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}

