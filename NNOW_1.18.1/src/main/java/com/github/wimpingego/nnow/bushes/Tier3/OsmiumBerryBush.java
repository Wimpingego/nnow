package com.github.wimpingego.nnow.bushes.Tier3;

import com.github.wimpingego.nnow.bushes.base.BaseBush;
import com.github.wimpingego.nnow.bushes.base.BushType;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class OsmiumBerryBush extends BaseBush
{
	private final BushType type;
	   
	   public OsmiumBerryBush(Block.Properties properties, BushType type) {
		   super(properties);
		   this.type = type;
		   this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
	   }
	   
	   @Override
		public InteractionResult use(BlockState p_225533_1_, Level p_225533_2_, BlockPos p_225533_3_, Player p_225533_4_, InteractionHand p_225533_5_, BlockHitResult p_225533_6_) {
		      int i = p_225533_1_.getValue(AGE);
		      boolean flag = i == 3;
		      if (!flag && p_225533_4_.getItemInHand(p_225533_5_).getItem() == Items.BONE_MEAL) {
		         return InteractionResult.PASS;
		      } else if (i > 1) {
				  int j = (int) (type.nuggets + p_225533_2_.random.nextInt(2));
		         popResource(p_225533_2_, p_225533_3_, new ItemStack(Registration.OSMIUM_NUGGET.get(), j + (flag ? 1 : 0)));
		         p_225533_2_.playSound((Player)null, p_225533_3_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_225533_2_.random.nextFloat() * 0.4F);
		         p_225533_2_.setBlock(p_225533_3_, p_225533_1_.setValue(AGE, 1), 2);
		         return InteractionResult.SUCCESS;
		      } else {
		         return super.use(p_225533_1_, p_225533_2_, p_225533_3_, p_225533_4_, p_225533_5_, p_225533_6_);
		      }
		   }
}