package com.thomas.jumpmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class PogoStick extends ItemBase {
    public PogoStick(String name, CreativeTabs tab) {
        super(name, tab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (playerIn.onGround) {
            playerIn.jump();
            playerIn.addVelocity(0, 1.25, 0);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
