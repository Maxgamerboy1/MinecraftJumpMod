package com.thomas.jumpmod.util;

import com.thomas.jumpmod.inti.Blocks;
import com.thomas.jumpmod.inti.Items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientRegister {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Items.POGOSTICKITEM, 0, new ModelResourceLocation(Items.POGOSTICKITEM.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Blocks.tutBlock), 0, new ModelResourceLocation(Item.getItemFromBlock(Blocks.tutBlock).getRegistryName(), "inventory"));
    }
}
