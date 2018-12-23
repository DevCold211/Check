package com.amm.avanyt;

import com.amm.avanyt.proxy.CommonProxy;
import com.amm.avanyt.utils.Ref;

import net.minecraft.creativetab.CreativeTabs;
import com.amm.avanyt.utils.tabamm;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Ref.NAME, modid = Ref.MODID, version = Ref.VERSION)
public class Core 
{
	  public static final String MODID = "Avan's Magic Mod";
	  public static final String NAME = "amm";
	  public static final String VERSION = "@VERSION@";
	  
	  public static final CreativeTabs tabamm = new tabamm("tabamm");
	  @Mod.Instance
	  public static Core instance;
	  
	  @SidedProxy(clientSide="com.amm.avanyt.proxy.ClientProxy", serverSide="com.amm.avanyt.proxy.CommonProxy")
	  public static CommonProxy proxy;
	  
	  @Mod.EventHandler
	  public void PreInit(FMLPreInitializationEvent event) {}
	  
	  @Mod.EventHandler
	  public void init(FMLInitializationEvent event) {
	  }
	  
	  @Mod.EventHandler
	  public void PostInit(FMLPostInitializationEvent event) {}
}
