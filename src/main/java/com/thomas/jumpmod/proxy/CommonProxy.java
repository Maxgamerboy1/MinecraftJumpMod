package com.thomas.jumpmod.proxy;

import com.thomas.jumpmod.util.ServerRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ServerRegister registerer = new ServerRegister();
        MinecraftForge.EVENT_BUS.register(registerer);
    }
    public void init(FMLInitializationEvent event) { }
    public void postInit(FMLPostInitializationEvent event) { }
    public void serverStarting(FMLServerStartingEvent event) { }
    public void serverStopping(FMLServerStoppingEvent event) { }
}
