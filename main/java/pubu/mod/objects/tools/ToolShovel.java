package pubu.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import pubu.mod.Main;
import pubu.mod.init.ItemInit;
import pubu.mod.util.interfaces.IHasModel;

public class ToolShovel extends ItemSpade implements IHasModel 
{
	public ToolShovel(String name, ToolMaterial material) 
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
