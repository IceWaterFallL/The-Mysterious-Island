package pubu.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import pubu.mod.objects.armour.ArmourBase;
import pubu.mod.objects.items.ItemBase;
import pubu.mod.objects.tools.ToolAxe;
import pubu.mod.objects.tools.ToolHoe;
import pubu.mod.objects.tools.ToolPickaxe;
import pubu.mod.objects.tools.ToolShovel;
import pubu.mod.objects.tools.ToolSword;
import pubu.mod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 270, 6.0F, 2.0F, 14);
	public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item TIN_COPPER = new ItemBase("ingot_tin");
	
	//Tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	
	//Armour
	public static final Item HELMET_COPPER = new ArmourBase("helmet_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmourBase("chestplate_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmourBase("leggings_copper", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmourBase("boots_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
}
