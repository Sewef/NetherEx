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

package logictechcorp.netherex.item;

import logictechcorp.libraryex.item.ItemBlockSlabLibEx;
import logictechcorp.netherex.init.NetherExBlocks;

public class ItemBlockBasaltSlab extends ItemBlockSlabLibEx
{
    public ItemBlockBasaltSlab(boolean isDouble)
    {
        super(!isDouble ? NetherExBlocks.BASALT_SLAB : NetherExBlocks.BASALT_SLAB_DOUBLE, NetherExBlocks.BASALT_SLAB, NetherExBlocks.BASALT_SLAB_DOUBLE);
    }
}
