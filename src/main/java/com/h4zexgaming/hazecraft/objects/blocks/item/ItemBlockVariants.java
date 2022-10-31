package com.h4zexgaming.hazecraft.objects.blocks.item;

import com.h4zexgaming.hazecraft.util.Interfaces.IMetaName;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock
{
	public ItemBlockVariants(Block block)
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		// TODO Auto-generated method stub
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
}
