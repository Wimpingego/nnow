package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import net.minecraft.ChatFormatting;
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
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class CobbleGen extends Block
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    int wcost = ModConfigs.W_COST.get();
    int wreturn = ModConfigs.W_RETURN.get();
    int scost = ModConfigs.S_COST.get();
    int sreturn = ModConfigs.S_RETURN.get();
    int icost = ModConfigs.I_COST.get();
    int ireturn = ModConfigs.I_RETURN.get();
    int gcost = ModConfigs.G_COST.get();
    int greturn = ModConfigs.G_RETURN.get();
    int dcost = ModConfigs.D_COST.get();
    int dreturn = ModConfigs.D_RETURN.get();
    int ncost = ModConfigs.N_COST.get();
    int nreturn = ModConfigs.N_RETURN.get();

    int shcost = ModConfigs.SH_COST.get();
    int shreturn = ModConfigs.SH_RETURN.get();
    int ihcost = ModConfigs.IH_COST.get();
    int ihreturn = ModConfigs.IH_RETURN.get();
    int ghcost = ModConfigs.GH_COST.get();
    int ghreturn = ModConfigs.GH_RETURN.get();
    int dhcost = ModConfigs.DH_COST.get();
    int dhreturn = ModConfigs.DH_RETURN.get();
    int nhcost = ModConfigs.NH_COST.get();
    int nhreturn = ModConfigs.NH_RETURN.get();
    int ehcost = ModConfigs.EH_COST.get();
    int ehreturn = ModConfigs.EH_RETURN.get();

    public CobbleGen(Properties properties)
    {
        super(properties);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit)
    {
        ItemStack itemstack = player.getItemInHand(handIn);
//Pickaxes
        if (itemstack.getItem() == Items.WOODEN_PICKAXE && !player.getAbilities().instabuild) {
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

        if (itemstack.getItem() == Items.STONE_PICKAXE && !player.getAbilities().instabuild) {
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

        if (itemstack.getItem() == Items.IRON_PICKAXE && !player.getAbilities().instabuild) {
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

        if (itemstack.getItem() == Items.GOLDEN_PICKAXE && !player.getAbilities().instabuild) {
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

        if (itemstack.getItem() == Items.DIAMOND_PICKAXE && !player.getAbilities().instabuild) {
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

        if (itemstack.getItem() == Items.NETHERITE_PICKAXE && !player.getAbilities().instabuild) {
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
//NNOW Hammers
        if (itemstack.getItem() == ItemList.S_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(shcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, shreturn);

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

        if (itemstack.getItem() == ItemList.I_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(ihcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, ihreturn);

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

        if (itemstack.getItem() == ItemList.G_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(ghcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, ghreturn);

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

        if (itemstack.getItem() == ItemList.D_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(dhcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, dhreturn);

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

        if (itemstack.getItem() == ItemList.N_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(nhcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, nhreturn);

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

        if (itemstack.getItem() == ItemList.E_HAMMER.get() && !player.getAbilities().instabuild) {
            itemstack.hurtAndBreak(ehcost, player, (p_220038_0_) -> {
                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);});
            ItemStack itemback;
            itemback = new ItemStack(Items.COBBLESTONE, ehreturn);

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
        return super.use(state, worldIn, pos, player, handIn, hit);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add((new TranslatableComponent("item.nnow.cobblegen.line1").withStyle(ChatFormatting.GREEN)));
        tooltip.add((new TranslatableComponent("item.nnow.cobblegen.general.line1").withStyle(ChatFormatting.YELLOW)));
    }
}
