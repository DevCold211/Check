package com.amm.avanyt.main;

import com.amm.avanyt.Core;
import com.amm.avanyt.utils.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockList extends Block implements IHasModel {

	protected String name;

	public BlockList(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(Core.MODID + "." + name);
		setCreativeTab(Core.tabamm);
		setRegistryName(name);
		BlockRegister.BLOCKS.add(this);
		ItemRegister.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		Core.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
