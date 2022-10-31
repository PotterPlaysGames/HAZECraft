package com.h4zexgaming.hazecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.h4zexgaming.hazecraft.objects.blocks.BlockBase;
import com.h4zexgaming.hazecraft.objects.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_HAZE = new BlockBase("block_haze", Material.IRON);
	public static final Block BLOCK_ZOAL = new BlockBase("block_zoal", Material.IRON);
	public static final Block BLOCK_PYRINE = new BlockBase("block_pyrine", Material.IRON);
	public static final Block BLOCK_YARIUM = new BlockBase("block_yarium", Material.IRON);
	public static final Block BLOCK_GYTINE = new BlockBase("block_gytine", Material.IRON);
	public static final Block BLOCK_EITYNE = new BlockBase("block_eityne", Material.IRON);
	public static final Block BLOCK_ENDERIAN = new BlockBase("block_enderian", Material.IRON);

	public static final Block ORE_ENDERIAN = new BlockOres("ore_enderian", "end");
	public static final Block ORE_PYRINE = new BlockOres("ore_pyrine", "nether");
}
