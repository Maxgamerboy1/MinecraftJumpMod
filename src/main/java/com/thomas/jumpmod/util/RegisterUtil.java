package com.thomas.jumpmod.util;

import com.thomas.jumpmod.JumpMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.http.config.RegistryBuilder;

public class RegisterUtil {
    public static void registerAll(FMLPreInitializationEvent event) {
        registerBlocks(event);
        registerItems(event);
    }

    private static void registerBlocks(FMLPreInitializationEvent event, Block...blocks) {
        JumpMod.LOGGER.info("Registering blocks...");
        for (Block block : blocks) {
            final ItemBlock itemBlock = new ItemBlock(block);
            if (event.getSide() == Side.CLIENT){
                RegistryBuilder<Block> builder = RegistryBuilder.create();
                builder.register("jumpmod:" + block.getUnlocalizedName(), block);

                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                        0,
                        new ModelResourceLocation(block.getRegistryName(), "inventory"));
            }
        }
    }

    private static void registerItems(FMLPreInitializationEvent event, Item...items) {
        JumpMod.LOGGER.info("Registering items...");
        for (Item item : items) {
            if (event.getSide() == Side.CLIENT) {
                RegistryBuilder<Item> builder = RegistryBuilder.create();
                builder.register("jumpmod:" + item.getUnlocalizedName(), item);

                ModelLoader.setCustomModelResourceLocation(item,
                        0,
                        new ModelResourceLocation(item.getRegistryName(), "inventory"));
            }
        }
    }
}
