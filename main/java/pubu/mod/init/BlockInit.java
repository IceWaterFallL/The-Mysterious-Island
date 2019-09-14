package pubu.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import pubu.mod.objects.blocks.BlockBase;
import pubu.mod.objects.blocks.BlockLeaf;
import pubu.mod.objects.blocks.BlockLogs;
import pubu.mod.objects.blocks.BlockOres;
import pubu.mod.objects.blocks.BlockPlank;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	public static final Block BLOCK_TIN = new BlockBase("block_tin", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("planks");
	public static final Block LEAVES = new BlockLeaf("planks");
	public static final Block SAPLINGS = new BlockSaplings("planks");
}
