package com.h4zexgaming.hazecraft.objects.tools;

import com.h4zexgaming.hazecraft.Main;
import com.h4zexgaming.hazecraft.init.ItemInit;
import com.h4zexgaming.hazecraft.util.Interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
