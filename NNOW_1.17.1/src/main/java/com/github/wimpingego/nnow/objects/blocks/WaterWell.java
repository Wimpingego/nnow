package com.github.wimpingego.nnow.objects.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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

public class WaterWell extends Block
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WaterWell(Properties properties)
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

        if (itemstack.getItem() == Items.BUCKET && !player.getAbilities().instabuild)
        {
            itemstack.shrink(1);
            ItemStack itemstack1;
            itemstack1 = new ItemStack(Items.WATER_BUCKET);

            if (itemstack.isEmpty())
            {
                player.setItemInHand(handIn, itemstack1);

                return InteractionResult.SUCCESS;
            }
            else if (!player.getInventory().add(itemstack1))
            {
                player.drop(itemstack1, false);

                return InteractionResult.SUCCESS;
            }
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add((new TranslatableComponent("item.nnow.waterwell.line1").withStyle(ChatFormatting.GREEN)));
        tooltip.add((new TranslatableComponent("item.nnow.waterwell.general.line1").withStyle(ChatFormatting.YELLOW)));
    }
}
