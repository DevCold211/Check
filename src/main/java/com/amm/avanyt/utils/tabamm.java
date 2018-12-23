package com.amm.avanyt.utils;

import com.amm.avanyt.main.BlockRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class tabamm
extends CreativeTabs
{
public tabamm(String label)
{
  super("tabamm");
}

public ItemStack getTabIconItem()
{
  return new ItemStack(BlockRegister.MagicalMachine);
}
}