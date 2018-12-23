package com.amm.avanyt.main;

import com.amm.avanyt.utils.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegHandler
{
	@SubscribeEvent
	public static void onItemRegister(Register<Item> event) {
		event.getRegistry().registerAll(ItemRegister.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onBlockRegister(Register<Block> event) {
		event.getRegistry().registerAll(BlockRegister.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e) {
		for (Item i : ItemRegister.ITEMS) {
			if (i instanceof IHasModel)
				((IHasModel) i).registerModels();
		}
		for (Block b : BlockRegister.BLOCKS) {
			if (b instanceof IHasModel)
				((IHasModel) b).registerModels();
		}
	}
}