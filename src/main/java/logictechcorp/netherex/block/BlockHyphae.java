/*
 * NetherEx
 * Copyright (c) 2016-2018 by MineEx
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logictechcorp.netherex.block;

import logictechcorp.libraryex.block.BlockLibEx;
import logictechcorp.netherex.NetherEx;
import logictechcorp.netherex.handler.ConfigHandler;
import logictechcorp.netherex.init.NetherExBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockHyphae extends BlockLibEx
{
    public BlockHyphae()
    {
        super(NetherEx.instance, "hyphae", "pickaxe", 0, 0.5F, 2.0F, Material.ROCK);

        if(ConfigHandler.blockConfig.hyphae.shouldSpread)
        {
            this.setTickRandomly(true);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World world, BlockPos pos, Random rand)
    {
        if(rand.nextInt(10) == 0)
        {
            world.spawnParticle(EnumParticleTypes.TOWN_AURA, (double) ((float) pos.getX() + rand.nextFloat()), (double) ((float) pos.getY() + 1.1F), (double) ((float) pos.getZ() + rand.nextFloat()), 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if(!world.isRemote && ConfigHandler.blockConfig.hyphae.shouldSpread)
        {
            if(world.getLightFromNeighbors(pos.up()) < 4 && world.getBlockState(pos.up()).getLightOpacity(world, pos.up()) > 2)
            {
                world.setBlockState(pos, NetherExBlocks.NETHERRACK.getDefaultState().withProperty(BlockNetherrack.TYPE, BlockNetherrack.EnumType.LIVELY));
            }
            else
            {
                if(world.getLightFromNeighbors(pos.up()) >= 9)
                {
                    for(int i = 0; i < 4; i++)
                    {
                        BlockPos newPos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                        IBlockState stateNew = world.getBlockState(newPos);
                        IBlockState stateUp = world.getBlockState(newPos.up());

                        if(stateNew.getBlock() == NetherExBlocks.NETHERRACK && stateNew.getValue(BlockNetherrack.TYPE) == BlockNetherrack.EnumType.LIVELY && world.getLightFromNeighbors(newPos.up()) >= 4 && stateUp.getLightOpacity(world, newPos.up()) <= 2)
                        {
                            world.setBlockState(newPos, this.getDefaultState());
                        }
                    }
                }
            }
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(NetherExBlocks.NETHERRACK);
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return BlockNetherrack.EnumType.LIVELY.ordinal();
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing facing, IPlantable plantable)
    {
        return plantable.getPlantType(world, pos.offset(facing)) == EnumPlantType.Nether;
    }
}
