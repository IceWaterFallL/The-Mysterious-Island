package pubu.mod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import pubu.mod.init.BlockInit;
import pubu.mod.objects.blocks.BlockOres;
import pubu.mod.util.handlers.EnumHandler;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_nether_copper, ore_overworld_copper, ore_end_copper;
	private WorldGenerator ore_nether_tin, ore_overworld_tin, ore_end_tin;
	
	public WorldGenCustomOres() 
	{
		ore_nether_copper = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_copper = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_copper = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		
		ore_nether_tin = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TIN), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_tin = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TIN), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_tin = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TIN), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_nether_copper, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_nether_tin, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 0:
			
			runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_tin, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1:
			
			runGenerator(ore_end_copper, world, random, chunkX, chunkZ, 50, 0, 256);
			runGenerator(ore_end_tin, world, random, chunkX, chunkZ, 50, 0, 256);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
