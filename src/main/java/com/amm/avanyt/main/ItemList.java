package com.amm.avanyt.main;

import com.amm.avanyt.Core;
import com.amm.avanyt.utils.IHasModel;

import net.minecraft.item.Item;

	public class ItemList
	  extends Item
	  implements IHasModel
	{
	  public ItemList(String name)
	  {
	    setUnlocalizedName(name);
	    setRegistryName(name);
	    setCreativeTab(Core.tabamm);
	    
	    ItemRegister.ITEMS.add(this);
	  }
	  
	  public void registerModels()
	  {
	    Core.proxy.registerItemRenderer(this, 0, "inventory");
	  }
	}

