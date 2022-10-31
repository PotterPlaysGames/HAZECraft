package com.h4zexgaming.hazecraft;

import com.h4zexgaming.hazecraft.proxy.CommonProxy;
import com.h4zexgaming.hazecraft.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.VERSION, version = Reference.VERSION)
public class Main {
	
	@Instance
	public  static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static  void preInit(FMLPreInitializationEvent event) {}
	@EventHandler
	public static  void init(FMLInitializationEvent event) {}
	@EventHandler
	public static  void postInit(FMLPostInitializationEvent event) {}
	
}
