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

package logictechcorp.netherex.client.render.entity;

import logictechcorp.netherex.client.model.entity.ModelNethermite;
import logictechcorp.netherex.entity.monster.EntityNethermite;
import logictechcorp.netherex.init.NetherExTextures;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNethermite extends RenderLiving<EntityNethermite>
{
    public RenderNethermite(RenderManager manager)
    {
        super(manager, new ModelNethermite(), 0.3F);
    }

    @Override
    protected float getDeathMaxRotation(EntityNethermite nethermite)
    {
        return 180.0F;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityNethermite mite)
    {
        return NetherExTextures.NETHERMITE;
    }
}
