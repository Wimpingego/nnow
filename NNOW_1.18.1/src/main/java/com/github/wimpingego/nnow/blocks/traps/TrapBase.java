package com.github.wimpingego.nnow.blocks.traps;

import com.github.wimpingego.nnow.util.NNOWFakePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/*
@author: Naxanria
@edits: Wimpingego
*/

public class TrapBase extends Block{

    public static final VoxelShape BB_SHAPE = box(0.0D, 0.01D, 0.0D, 16.0D, 4.0D, 16.0D);
    public static final DirectionProperty FACING = DirectionalBlock.FACING;
    private final TrapType type;

    public TrapBase(Properties properties, TrapType type)
    {
        super(properties);
        this.type = type;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return BB_SHAPE;
    }

    /* FACING */
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }
    /* END FACING */

    public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_,Entity p_152434_) {

        if (p_152434_ instanceof LivingEntity
                && p_152434_.getType() != EntityType.PLAYER
                && p_152434_.getType() != EntityType.VILLAGER)

            if (!p_152431_.isClientSide)
            {
                if (p_152434_ instanceof LivingEntity)
                {
                    LivingEntity livingEntity = (LivingEntity) p_152434_;
                    if (type.lethal || livingEntity.getHealth() > 1f)
                    {
                        TrapDamageSource spikeDmgSource = new TrapDamageSource(type);
                        if (type.isPlayer)
                        {
                            NNOWFakePlayer fakePlayer = NNOWFakePlayer.getInstance((ServerLevel) p_152431_).get();

                            if (fakePlayer != null)
                            {
                                spikeDmgSource.setSource(fakePlayer);
                            }
                        }

                        livingEntity.hurt(spikeDmgSource, type.damage);
                    }
                }
            }
    }
}