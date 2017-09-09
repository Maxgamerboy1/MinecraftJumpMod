package com.thomas.jumpmod.util;

import com.thomas.jumpmod.JumpMod;
import com.thomas.jumpmod.inti.Blocks;
import com.thomas.jumpmod.inti.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ServerRegister {

    private static void registerItemBlock(IForgeRegistry<Item> registry, Block blockIn) {
        ItemBlock itemBlock = new ItemBlock(blockIn);
        itemBlock.setRegistryName(blockIn.getRegistryName());
        registry.register(itemBlock);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        JumpMod.LOGGER.info("Registering blocks...");
        event.getRegistry().registerAll(Blocks.tutBlock);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        JumpMod.LOGGER.info("Registering items...");
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(Items.POGOSTICKITEM);

        registerItemBlock(registry, Blocks.tutBlock);
    }
}
