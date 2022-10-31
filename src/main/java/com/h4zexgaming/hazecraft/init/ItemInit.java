package com.h4zexgaming.hazecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.h4zexgaming.hazecraft.objects.armor.ArmorBase;
import com.h4zexgaming.hazecraft.objects.items.ItemBase;
import com.h4zexgaming.hazecraft.objects.tools.ToolAxe;
import com.h4zexgaming.hazecraft.objects.tools.ToolHoe;
import com.h4zexgaming.hazecraft.objects.tools.ToolPickaxe;
import com.h4zexgaming.hazecraft.objects.tools.ToolShovel;
import com.h4zexgaming.hazecraft.objects.tools.ToolSword;
import com.h4zexgaming.hazecraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Legend of haze
	public static final ToolMaterial TOOL_LHAZE = EnumHelper.addToolMaterial("tool_lhaze", 10, 10000, 60.0F, 50.0F, 100);
	public static final Item SWORD_CORE = new ItemBase("sword_core");
	public static final Item SWORD_LHAZE = new ToolSword("sword_lhaze", TOOL_LHAZE);
	
	//Haze Material
	public static final ToolMaterial TOOL_HAZE = EnumHelper.addToolMaterial("tool_haze", 4, 1561, 20.0F, 10.0F, 50);
	public static final ArmorMaterial ARMOR_HAZE = EnumHelper.addArmorMaterial("armor_haze", Reference.MODID + ":haze", 50, new int[]{10, 22, 18, 10}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	//Haze
	public static final Item INGOT_HAZE = new ItemBase("ingot_haze");
	
	public static final Item AXE_HAZE = new ToolAxe("axe_haze", TOOL_HAZE);
	public static final Item PICKAXE_HAZE = new ToolPickaxe("pickaxe_haze", TOOL_HAZE);
	public static final Item SWORD_HAZE = new ToolSword("sword_haze", TOOL_HAZE);
	public static final Item HOE_HAZE = new ToolHoe("hoe_haze", TOOL_HAZE);
	public static final Item SHOVEL_HAZE = new ToolShovel("shovel_haze", TOOL_HAZE);
	
	public static final Item HELMET_HAZE = new ArmorBase("helmet_haze", ARMOR_HAZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_HAZE = new ArmorBase("chestplate_haze", ARMOR_HAZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_HAZE = new ArmorBase("leggings_haze", ARMOR_HAZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_HAZE = new ArmorBase("boots_haze", ARMOR_HAZE, 1, EntityEquipmentSlot.FEET);
	
	//Zoal
	public static final Item ZOAL = new ItemBase("zoal");
	
	//Pyrine
	public static final Item PYRINE = new ItemBase("pyrine");
	
	//gytite
	public static final Item GYTITE = new ItemBase("gytite");
	
	//Yarium
	public static final Item YARIUM = new ItemBase("yarium");

	//Eityne
	public static final Item EITYNE = new ItemBase("eityne");
	
	//Enderian
	public static final Item ENDERIAN = new ItemBase("enderian");
}
