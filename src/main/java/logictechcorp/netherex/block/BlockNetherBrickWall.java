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

import logictechcorp.libraryex.block.BlockWallLibEx;
import logictechcorp.libraryex.block.state.VariableBlockStateContainer;
import logictechcorp.libraryex.client.model.item.ItemModelHandler;
import logictechcorp.netherex.NetherEx;
import net.minecraft.block.BlockWall;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherBrickWall extends BlockWallLibEx
{
    public static final PropertyEnum<BlockNetherrack.EnumType> TYPE = PropertyEnum.create("type", BlockNetherrack.EnumType.class);

    public BlockNetherBrickWall()
    {
        super(NetherEx.instance, "nether_brick_wall", Blocks.STONE);
        ((VariableBlockStateContainer) this.blockState).destroyContainer();
        this.setDefaultState(this.blockState.getBaseState());
        this.setHardness(1.5F);
        this.setResistance(10.0F);
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list)
    {
        for(BlockNetherrack.EnumType type : BlockNetherrack.EnumType.values())
        {
            list.add(new ItemStack(this, 1, type.ordinal()));
        }
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return state.getValue(TYPE).ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(TYPE, BlockNetherrack.EnumType.fromMeta(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(TYPE).ordinal();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new VariableBlockStateContainer(super.createBlockState(), this, UP, NORTH, EAST, SOUTH, WEST, TYPE);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerModel()
    {
        ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(BlockWall.VARIANT).build());

        for(BlockNetherrack.EnumType type : BlockNetherrack.EnumType.values())
        {
            ItemModelHandler.registerBlockModel(this, type.ordinal(), String.format(NetherEx.MOD_ID + ":%s_" + this.getRegistryName().getPath(), type.getName()), "inventory");
        }
    }
}
