package com.github.wimpingego.nnow.items;

import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import javax.annotation.Nonnull;

public class LavaBowl extends Item {

    static int use = Configs.LAVA_BOWL_MAX_USES.get();

    public LavaBowl(Properties props) {
        super(props.durability(use));
    }

    @Nonnull
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, @Nonnull InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        BlockHitResult blockHitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.NONE);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemStack);
        } else if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemStack);
        } else {
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getDirection();
            BlockPos blockPos2 = blockPos.relative(direction);
            if (level.mayInteract(player, blockPos) && player.mayUseItemAt(blockPos2, direction, itemStack)) {
                BlockState blockState;
                blockState = level.getBlockState(blockPos);
                BlockPos blockPos3 = blockState.getBlock() instanceof LiquidBlockContainer ? blockPos : blockPos2;

                boolean success =
                        ((BucketItem) Items.LAVA_BUCKET).emptyContents(player, level, blockPos3, blockHitResult);
                if (success) {
                    if (player instanceof ServerPlayer) {
                        CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, blockPos3, itemStack);
                    }

                    itemStack.hurtAndBreak(1, player, (p_220038_0_) -> {
                        p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                    });

                    player.awardStat(Stats.ITEM_USED.get(this));

                    return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
                } else {
                    return InteractionResultHolder.fail(itemStack);
                }
            } else {
                return InteractionResultHolder.fail(itemStack);
            }
        }
    }
}
