package pubu.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import pubu.mod.init.ItemInit;

public class TheMysteriousIslandTab extends CreativeTabs
{
	public TheMysteriousIslandTab(String label) { super("themysteriousislandtab");
	this.setBackgroundImageName("themysteriousisland.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COPPER); }
}
