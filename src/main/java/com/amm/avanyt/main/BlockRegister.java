package com.amm.avanyt.main;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegister 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MagicalMachine = new BlockList(Material.ANVIL,"magicalmachine").setHardness(5f);
}
