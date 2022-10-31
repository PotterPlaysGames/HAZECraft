package com.h4zexgaming.hazecraft.objects.items;

import com.h4zexgaming.hazecraft.Main;
import com.h4zexgaming.hazecraft.init.ItemInit;
import com.h4zexgaming.hazecraft.util.Interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
