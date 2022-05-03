package com.github.wimpingego.nnow.items;

import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.util.EnableUtil;
import com.github.wimpingego.nnow.util.MagnetRangeUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import javax.annotation.Nullable;
import java.util.List;

public class Magnet extends Item
{
    public static final String MESSAGE_MAGNET_IS = "item.nnow.magnet.line1";
    public static final String MESSAGE_MORE_INFO_SHIFT = "item.nnow.info.shift";
    public static final String MESSAGE_MORE_INFO_MAGNET_1 = "item.nnow.info_magnet_1";
    public Magnet(Properties properties)
    {
        super(properties);
    }

    int range = Configs.PICKUP_RANGE.get();

    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected)
    {
        if(entity instanceof Player && !world.isClientSide && EnableUtil.isEnabled(stack))
        {
            Player player = (Player)entity;

            boolean init = MagnetRangeUtil.getCurrentlySet(stack);

            if(!init)
            {
                range = Configs.PICKUP_RANGE.get();
            }
            else
            {
                range = MagnetRangeUtil.getCurrentRange(stack);
            }

            double x = player.getX();
            double y = player.getY();
            double z = player.getZ();

            //Scan for and collect items
            List<ItemEntity> items = entity.level.getEntitiesOfClass(ItemEntity.class, new AABB(x - range, y - range, z - range, x + range, y + range, z + range));
            for(ItemEntity e: items)
            {
                if(!player.isShiftKeyDown() && !e.getPersistentData().getBoolean("PreventRemoteMovement"))
                {
                    double factor = 0.035;
                    e.push((x - e.getX()) * factor, (y - e.getY()+1.25) * factor, (z - e.getZ()) * factor);
                }
            }

            //Scan for and collect XP Orbs
            List<ExperienceOrb> xp = entity.level.getEntitiesOfClass(ExperienceOrb.class, new AABB(x - range, y - range, z - range, x + range, y + range, z + range));
            for(ExperienceOrb orb: xp)
            {
                if(!player.isShiftKeyDown())
                {
                    double factor = 0.035;
                    orb.push((x - orb.getX()) * factor, (y - orb.getY()+1.25) * factor, (z - orb.getZ()) * factor);
                }
            }
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        ItemStack stack = player.getItemInHand(hand);

        if(!world.isClientSide && !(player.isShiftKeyDown()))
        {
            EnableUtil.changeEnabled(player, hand);
            player.sendMessage(new TranslatableComponent(MESSAGE_MAGNET_IS, EnableUtil.isEnabled(stack)), null);
            return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, player.getItemInHand(hand));
        }

        return super.use(world, player, hand);
    }

    @Override
    public boolean isFoil(ItemStack stack)
    {
        return EnableUtil.isEnabled(stack);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_MAGNET_1,range));
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MAGNET_IS, EnableUtil.isEnabled(stack)));
        } else {
            pTooltipComponents.add(new TranslatableComponent(MESSAGE_MORE_INFO_SHIFT).withStyle(ChatFormatting.YELLOW));
        }
    }
}
