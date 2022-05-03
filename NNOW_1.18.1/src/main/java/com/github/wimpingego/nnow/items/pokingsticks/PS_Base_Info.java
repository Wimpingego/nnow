package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class PS_Base_Info extends Item {

    public static final String MESSAGE_POKING_STICK_1 = "message.poking_stick_1";

    public final int burnTime;

    public PS_Base_Info(Properties builder) {
        super(builder);
        this.burnTime = 300;
    }

    public @NotNull Item asItem() {
        return super.asItem();
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

    // Dust Drops From Blocks
    public @NotNull InteractionResult useOn(UseOnContext context) {

        int StoneDustDrop = Configs.STONE_DUST_DROP.get();
        int GravelDustDrop = Configs.GRAVEL_DUST_DROP.get();
        int SandDustDrop = Configs.SAND_DUST_DROP.get();
        int DirtDustDrop = Configs.DIRT_DUST_DROP.get();
        int ClayDustDrop = Configs.CLAY_DUST_DROP.get();

        Level world = context.getLevel();
        Player player = context.getPlayer();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        ItemStack stack = context.getItemInHand();

        if (
                block == Blocks.GRASS_BLOCK ||
                        block == Blocks.STONE ||
                        block == Blocks.DEEPSLATE
        ) {
            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.STONE_DUST.get(), StoneDustDrop)));
            assert player != null;
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        } else if (
                block == Blocks.COBBLESTONE ||
                        block == Blocks.MOSSY_COBBLESTONE ||
                        block == Blocks.COBBLED_DEEPSLATE
        ) {
            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.GRAVEL_DUST.get(), GravelDustDrop)));
            assert player != null;
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        } else if (
                block == Blocks.GRAVEL ||
                        block == Registration.AGG_BLOCK.get()
        ) {
            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.SAND_DUST.get(), SandDustDrop)));
            assert player != null;
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        } else if (
                block == Blocks.SAND ||
                        block == Blocks.RED_SAND ||
                        block == Registration.AGRS_BLOCK.get() ||
                        block == Registration.AGS_BLOCK.get()
        ) {
            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.DIRT_DUST.get(), DirtDustDrop)));
            assert player != null;
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        } else if (
                block == Blocks.DIRT ||
                        block == Blocks.PODZOL ||
                        block == Blocks.COARSE_DIRT ||
                        block == Blocks.MYCELIUM
        ) {
            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.CLAY_DUST.get(), ClayDustDrop)));
            assert player != null;
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        }
        return InteractionResult.PASS;
    }

    // Sapling & Cactus DROPS
    public boolean mineBlock(@NotNull ItemStack stack, Level worldIn, BlockState state, @NotNull BlockPos pos, @NotNull LivingEntity entityLiving) {
        int SaplingDropAmount = Configs.SAPLING_DROP_AMOUNT.get();
        double SaplingChance = Configs.SAPLING_DROP_CHANCE.get();
        int CactusDropAmount = Configs.CACTUS_DROP_AMOUNT.get();
        double CactusChance = Configs.CACTUS_DROP_CHANCE.get();
        int SugarCaneDropAmount = Configs.SUGAR_CANE_DROP_AMOUNT.get();
        double SugarCaneChance = Configs.SUGAR_CANE_DROP_CHANCE.get();

        Block block = state.getBlock();

        if (!worldIn.isClientSide) {
            if (block == Blocks.SPRUCE_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPRUCE_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.BIRCH_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BIRCH_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.OAK_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.OAK_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.ACACIA_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.ACACIA_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.JUNGLE_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.JUNGLE_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.DARK_OAK_LEAVES) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SaplingChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DARK_OAK_SAPLING, SaplingDropAmount)));
                }
            } else if (block == Blocks.SAND) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= CactusChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, CactusDropAmount)));
                }
            } else if (block == Blocks.RED_SAND) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= CactusChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CACTUS, CactusDropAmount)));
                }
            } else if (block == Blocks.GRASS) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= SugarCaneChance) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SUGAR_CANE, SugarCaneDropAmount)));
                }
            } else if (block == Blocks.GREEN_WOOL) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));

                double r = worldIn.random.nextDouble();
                if (r <= 0.5) {
                    worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
                }
            }

            if
            (
                    block == Blocks.SPRUCE_LEAVES ||
                            block == Blocks.BIRCH_LEAVES ||
                            block == Blocks.OAK_LEAVES ||
                            block == Blocks.ACACIA_LEAVES ||
                            block == Blocks.JUNGLE_LEAVES ||
                            block == Blocks.DARK_OAK_LEAVES ||
                            block == Blocks.SAND ||
                            block == Blocks.RED_SAND ||
                            block == Blocks.GRASS ||
                            block == Blocks.GREEN_WOOL
            ) {
                stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
        return true;
    }

    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
//        if (entity instanceof Sheep) {
//            Level world = player.level;
//            Vec3 pos = entity.position();
//            world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.STRING, 1)));
//            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
//        }

        if (entity instanceof Chicken) {
            Level world = player.level;
            Vec3 pos = entity.position();
            world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.FEATHER, 1)));
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        }

        if (entity instanceof Creeper) {
            Level world = player.level;
            Vec3 pos = entity.position();
            world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.GUNPOWDER, 1)));
            stack.hurtAndBreak(1, player, (p_220038_0_) -> p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        }

        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stackIn) {
        ItemStack stack = stackIn.copy();
        stack.setDamageValue(getDamage(stack) + 1);

        return stack;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, List<Component> list, @NotNull TooltipFlag flags) {
        list.add(new TranslatableComponent(MESSAGE_POKING_STICK_1).withStyle(ChatFormatting.YELLOW));
    }
}
//
//    // STONE DUST FROM DIRT
//    public InteractionResult useOn(UseOnContext context) {
//
//        int DustDrop = Configs.DUST_DROP.get();
//
//        Level world = context.getLevel();
//        Player player = context.getPlayer();
//        BlockPos pos = context.getClickedPos();
//        BlockState state = world.getBlockState(pos);
//        Block block = state.getBlock();
//        ItemStack stack = context.getItemInHand();
//
//        if
//        (
//                block == Blocks.GRASS_BLOCK ||
//                        block == Blocks.DIRT ||
//                        block == Blocks.PODZOL ||
//                        block == Blocks.COARSE_DIRT ||
//                        block == Blocks.MYCELIUM  	||
//
//                        block == Blocks.COBBLESTONE ||
//                        block == Blocks.COBBLED_DEEPSLATE ||
//                        block == Blocks.DEEPSLATE  ||
//                        block == Blocks.STONE
//
//        )
//        {
//            world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Registration.STONE_DUST.get(), DustDrop)));
//            assert player != null;
//            stack.hurtAndBreak(1, player, (p_220038_0_) -> {
//                p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
//            });
//        }
//        return InteractionResult.PASS;
//    }


