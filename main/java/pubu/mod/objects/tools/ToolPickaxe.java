package pubu.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import pubu.mod.Main;
import pubu.mod.init.ItemInit;
import pubu.mod.util.interfaces.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel 
{
	public ToolPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.themysteriousislandtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}