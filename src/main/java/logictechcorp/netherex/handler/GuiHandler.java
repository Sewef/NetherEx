package logictechcorp.netherex.handler;

import logictechcorp.libraryex.util.PlayerHelper;
import logictechcorp.netherex.client.gui.inventory.GuiScreenRideableInventory;
import logictechcorp.netherex.inventory.ContainerRideableInventory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;

public class GuiHandler implements IGuiHandler
{
    public static final int BONSPIDER_GUI_ID = 0;

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        return this.getGuiElement(id, player, world, x, y, x, Side.SERVER);
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        return this.getGuiElement(id, player, world, x, y, x, Side.CLIENT);
    }

    private Object getGuiElement(int id, EntityPlayer player, World world, int x, int y, int z, Side side)
    {
        switch(id)
        {
            default:
                return null;
            case BONSPIDER_GUI_ID:
                RayTraceResult result = PlayerHelper.getRayTracedEntity(player, world, 1.0F);

                if(result != null)
                {
                    Entity entity = result.entityHit;

                    if(entity instanceof AbstractHorse)
                    {
                        AbstractHorse rideable = (AbstractHorse) entity;
                        IInventory rideableInventory = ReflectionHelper.getPrivateValue(AbstractHorse.class, rideable, "field_110296_bG", "horseChest");
                        Container container = new ContainerRideableInventory(player.inventory, rideableInventory, rideable, player, new ItemStack(Items.SADDLE));

                        if(side.isClient())
                        {
                            return new GuiScreenRideableInventory(container, player.inventory, rideableInventory, rideable, new ResourceLocation("textures/gui/container/horse.png"));
                        }
                        else
                        {
                            return container;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return null;
                }
        }
    }
}
