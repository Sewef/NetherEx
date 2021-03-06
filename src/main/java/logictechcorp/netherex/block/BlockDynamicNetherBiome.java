package logictechcorp.netherex.block;

import logictechcorp.libraryex.IModData;
import logictechcorp.libraryex.block.BlockDynamic;
import logictechcorp.libraryex.world.biome.wrapper.BiomeBlockType;
import logictechcorp.netherex.world.biome.NetherBiomeManager;
import logictechcorp.netherex.world.biome.wrapper.INetherBiomeWrapper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.Biome;

public abstract class BlockDynamicNetherBiome extends BlockDynamic
{
    public BlockDynamicNetherBiome(IModData data, String name, Material material, TexturePlacement texturePlacement)
    {
        super(data, name, material, texturePlacement);
    }

    @Override
    public IBlockState getDynamicState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        Biome biome = world.getBiome(pos);
        INetherBiomeWrapper wrapper = NetherBiomeManager.INSTANCE.getBiomeWrapper(biome);

        if(wrapper != null)
        {
            return wrapper.getBiomeBlock(BiomeBlockType.WALL_BLOCK, null);
        }

        return Blocks.NETHERRACK.getDefaultState();
    }
}
