package com.thomas.jumpmod.handlers;

import com.thomas.jumpmod.inti.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsHandler {
    public static final CreativeTabs tabTut = new CreativeTabs("tutTab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.POGOSTICKITEM);
        }
    };
}
