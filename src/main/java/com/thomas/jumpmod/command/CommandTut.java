package com.thomas.jumpmod.command;

import com.thomas.jumpmod.JumpMod;
import com.thomas.jumpmod.inti.Blocks;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class CommandTut extends CommandBase {
    @Override
    public String getName() {
        return "tut";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "For doing something";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args)
            throws CommandException {
        World world = sender.getEntityWorld();

        if (world.isRemote) {
            JumpMod.LOGGER.warning("Processing on Client");
        } else {
            JumpMod.LOGGER.info("Processing on Server");

            EntityPlayerMP player = getCommandSenderAsPlayer(sender);

            if (args[0].equals("get")) {
                if (args[1].equals(Blocks.tutBlock.getUnlocalizedName().substring(5))) {
                    ItemStack stack = new ItemStack(Item.getItemFromBlock(Blocks.tutBlock));
                    player.addItemStackToInventory(stack);
                }
            }
        }
    }
}
