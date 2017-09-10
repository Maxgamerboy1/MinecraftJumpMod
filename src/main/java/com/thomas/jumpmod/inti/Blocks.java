package com.thomas.jumpmod.inti;

import com.thomas.jumpmod.blocks.BlockTutBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocks {
    public static final Block tutBlock = new BlockTutBlock("tut_block", Material.GROUND, CreativeTabs.BUILDING_BLOCKS, 5f, 15f, "shovel", 1);
}
