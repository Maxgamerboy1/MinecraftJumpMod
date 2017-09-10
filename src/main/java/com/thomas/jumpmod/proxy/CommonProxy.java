package com.thomas.jumpmod.proxy;

import com.thomas.jumpmod.command.CommandTut;
import com.thomas.jumpmod.util.ServerRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ServerRegister.class);
    }
    public void init(FMLInitializationEvent event) { }
    public void postInit(FMLPostInitializationEvent event) { }

    public void serverStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandTut());
    }
    public void serverStopping(FMLServerStoppingEvent event) { }
}
