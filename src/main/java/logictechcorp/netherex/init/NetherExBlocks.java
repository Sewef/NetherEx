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

package logictechcorp.netherex.init;

import logictechcorp.libraryex.block.*;
import logictechcorp.libraryex.item.ItemBlockLibEx;
import logictechcorp.netherex.NetherEx;
import logictechcorp.netherex.block.*;
import logictechcorp.netherex.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(NetherEx.MOD_ID)
public class NetherExBlocks
{
    public static final BlockBasalt BASALT = null;
    public static final BlockNetherrack NETHERRACK = null;
    public static final BlockLibEx CRYING_OBSIDIAN = null;
    public static final BlockLibEx GLOWING_OBSIDIAN = null;
    public static final BlockNetherBrick NETHER_BRICK = null;
    public static final BlockNetherrackPath NETHERRACK_PATH = null;
    public static final BlockHyphae HYPHAE = null;
    public static final BlockTilledSoulSand TILLED_SOUL_SAND = null;
    public static final BlockSoulGlass SOUL_GLASS = null;
    public static final BlockSoulGlassPane SOUL_GLASS_PANE = null;
    public static final BlockLibEx AMETHYST_BLOCK = null;
    public static final BlockRime RIME_BLOCK = null;
    public static final BlockLibEx COBALT_BLOCK = null;
    public static final BlockLibEx ARDITE_BLOCK = null;
    public static final BlockFrostburnIce FROSTBURN_ICE = null;
    public static final BlockBoneSliver BONE_SLIVER = null;
    public static final BlockBoneChunk BONE_CHUNK = null;
    public static final BlockWornIron WORN_IRON = null;
    public static final BlockBlueFire BLUE_FIRE = null;
    public static final BlockNetherPortal NETHER_PORTAL = null;
    public static final BlockUrnOfSorrow URN_OF_SORROW = null;
    public static final BlockDynamicNetherOre QUARTZ_ORE = null;
    public static final BlockOreLibEx AMETHYST_ORE = null;
    public static final BlockOreLibEx RIME_ORE = null;
    public static final BlockOreLibEx COBALT_ORE = null;
    public static final BlockOreLibEx ARDITE_ORE = null;
    public static final BlockThornstalk THORNSTALK = null;
    public static final BlockElderMushroom ELDER_MUSHROOM = null;
    public static final BlockElderMushroomCap ELDER_MUSHROOM_CAP = null;
    public static final BlockElderMushroomStem ELDER_MUSHROOM_STEM = null;
    public static final BlockEnokiMushroomStem ENOKI_MUSHROOM_STEM = null;
    public static final BlockEnokiMushroomCap ENOKI_MUSHROOM_CAP = null;
    public static final BlockInfiniteFluidLibEx ICHOR = null;
    public static final BlockBlight BLIGHT = null;
    public static final BlockVanillaSlab VANILLA_SLAB = null;
    public static final BlockBasaltSlab BASALT_SLAB = null;
    public static final BlockNetherBrickSlab NETHER_BRICK_SLAB = null;
    public static final BlockVanillaSlab.Double VANILLA_SLAB_DOUBLE = null;
    public static final BlockBasaltSlab.Double BASALT_SLAB_DOUBLE = null;
    public static final BlockNetherBrickSlab.Double NETHER_BRICK_SLAB_DOUBLE = null;
    public static final BlockStairsLibEx RED_NETHER_BRICK_STAIRS = null;
    public static final BlockStairsLibEx BASALT_STAIRS = null;
    public static final BlockStairsLibEx BASALT_SMOOTH_STAIRS = null;
    public static final BlockStairsLibEx BASALT_BRICK_STAIRS = null;
    public static final BlockStairsLibEx BASALT_PILLAR_STAIRS = null;
    public static final BlockStairsLibEx FIERY_NETHER_BRICK_STAIRS = null;
    public static final BlockStairsLibEx ICY_NETHER_BRICK_STAIRS = null;
    public static final BlockStairsLibEx LIVELY_NETHER_BRICK_STAIRS = null;
    public static final BlockStairsLibEx GLOOMY_NETHER_BRICK_STAIRS = null;
    public static final BlockVanillaWall VANILLA_WALL = null;
    public static final BlockBasaltWall BASALT_WALL = null;
    public static final BlockNetherBrickWall NETHER_BRICK_WALL = null;
    public static final BlockVanillaFence VANILLA_FENCE = null;
    public static final BlockBasaltFence BASALT_FENCE = null;
    public static final BlockNetherBrickFence NETHER_BRICK_FENCE = null;
    public static final BlockFenceGateLibEx QUARTZ_FENCE_GATE = null;
    public static final BlockFenceGateLibEx NETHER_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx RED_NETHER_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx BASALT_FENCE_GATE = null;
    public static final BlockFenceGateLibEx BASALT_SMOOTH_FENCE_GATE = null;
    public static final BlockFenceGateLibEx BASALT_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx BASALT_PILLAR_FENCE_GATE = null;
    public static final BlockFenceGateLibEx FIERY_NETHER_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx ICY_NETHER_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx LIVELY_NETHER_BRICK_FENCE_GATE = null;
    public static final BlockFenceGateLibEx GLOOMY_NETHER_BRICK_FENCE_GATE = null;

    @Mod.EventBusSubscriber(modid = NetherEx.MOD_ID)
    public static class EventHandler
    {
        @SubscribeEvent
        public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(
                    new BlockBasalt(),
                    new BlockNetherrack(),
                    new BlockLibEx(NetherEx.instance, "crying_obsidian", "pickaxe", 3, 50.0F, 2000.0F, Material.ROCK).setLightLevel(0.50F),
                    new BlockLibEx(NetherEx.instance, "glowing_obsidian", "pickaxe", 3, 50.0F, 2000.0F, Material.ROCK).setLightLevel(1.0F),
                    new BlockNetherBrick(),
                    new BlockNetherrackPath(),
                    new BlockHyphae(),
                    new BlockTilledSoulSand(),
                    new BlockSoulGlass(),
                    new BlockSoulGlassPane(),
                    new BlockLibEx(NetherEx.instance, "amethyst_block", "pickaxe", 2, 5.0F, 10.0F, Material.ROCK),
                    new BlockRime(),
                    new BlockLibEx(NetherEx.instance, "cobalt_block", "pickaxe", 4, 5.0F, 3.0F, Material.IRON),
                    new BlockLibEx(NetherEx.instance, "ardite_block", "pickaxe", 4, 5.0F, 3.0F, Material.IRON),
                    new BlockFrostburnIce(),
                    new BlockBoneSliver(),
                    new BlockBoneChunk(),
                    new BlockWornIron(),
                    new BlockBlueFire(),
                    new BlockNetherPortal(),
                    new BlockUrnOfSorrow(),
                    new BlockDynamicNetherOre("quartz_ore", 2, 3.0F, 5.0F, 0.0F, BlockDynamic.TexturePlacement.UNDER),
                    new BlockOreLibEx(NetherEx.instance, "amethyst_ore", 2, new ResourceLocation(NetherEx.MOD_ID + ":amethyst_crystal"), 3.0F, 5.0F, 0.0F),
                    new BlockOreLibEx(NetherEx.instance, "rime_ore", 2, new ResourceLocation(NetherEx.MOD_ID + ":rime_crystal"), 3.0F, 5.0F, 0.0F),
                    new BlockOreLibEx(NetherEx.instance, "cobalt_ore", 4, 10.0F, 5.0F, 0.0F),
                    new BlockOreLibEx(NetherEx.instance, "ardite_ore", 4, 10.0F, 5.0F, 0.0F),
                    new BlockThornstalk(),
                    new BlockElderMushroom(),
                    new BlockElderMushroomCap(),
                    new BlockElderMushroomStem(),
                    new BlockEnokiMushroomStem(),
                    new BlockEnokiMushroomCap(),
                    new BlockInfiniteFluidLibEx(NetherEx.instance, "ichor", NetherExFluids.ICHOR, Material.WATER),
                    new BlockBlight(),
                    new BlockVanillaSlab(),
                    new BlockBasaltSlab(),
                    new BlockNetherBrickSlab(),
                    new BlockVanillaSlab.Double(),
                    new BlockBasaltSlab.Double(),
                    new BlockNetherBrickSlab.Double(),
                    new BlockStairsLibEx(NetherEx.instance, "red_nether_brick", Blocks.RED_NETHER_BRICK.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "basalt", Blocks.STONE.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "basalt_smooth", Blocks.STONE.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "basalt_brick", Blocks.STONE.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "basalt_pillar", Blocks.STONE.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "fiery_nether_brick", Blocks.NETHER_BRICK.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "icy_nether_brick", Blocks.NETHER_BRICK.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "lively_nether_brick", Blocks.NETHER_BRICK.getDefaultState()),
                    new BlockStairsLibEx(NetherEx.instance, "gloomy_nether_brick", Blocks.NETHER_BRICK.getDefaultState()),
                    new BlockVanillaWall(),
                    new BlockBasaltWall(),
                    new BlockNetherBrickWall(),
                    new BlockVanillaFence(),
                    new BlockBasaltFence(),
                    new BlockNetherBrickFence(),
                    new BlockFenceGateLibEx(NetherEx.instance, "quartz", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "nether_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "red_nether_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "basalt", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "basalt_smooth", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "basalt_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "basalt_pillar", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "fiery_nether_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "icy_nether_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "lively_nether_brick", Material.ROCK),
                    new BlockFenceGateLibEx(NetherEx.instance, "gloomy_nether_brick", Material.ROCK)
            );
        }

        @SubscribeEvent
        public static void onRegisterItems(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(
                    new ItemBlockBasalt(),
                    new ItemBlockNetherrack(),
                    new ItemBlockLibEx(CRYING_OBSIDIAN),
                    new ItemBlockLibEx(GLOWING_OBSIDIAN),
                    new ItemBlockNetherBrick(),
                    new ItemBlockNetherrackPath(),
                    new ItemBlockLibEx(HYPHAE),
                    new ItemBlockLibEx(TILLED_SOUL_SAND),
                    new ItemBlockLibEx(SOUL_GLASS),
                    new ItemBlockLibEx(SOUL_GLASS_PANE),
                    new ItemBlockLibEx(AMETHYST_BLOCK),
                    new ItemBlockLibEx(RIME_BLOCK),
                    new ItemBlockLibEx(COBALT_BLOCK),
                    new ItemBlockLibEx(ARDITE_BLOCK),
                    new ItemBlockLibEx(FROSTBURN_ICE),
                    new ItemBlockLibEx(BONE_SLIVER),
                    new ItemBlockLibEx(BONE_CHUNK),
                    new ItemBlockLibEx(WORN_IRON),
                    new ItemBlockUrnOfSorrow(),
                    new ItemBlockLibEx(QUARTZ_ORE),
                    new ItemBlockLibEx(AMETHYST_ORE),
                    new ItemBlockLibEx(RIME_ORE),
                    new ItemBlockLibEx(COBALT_ORE),
                    new ItemBlockLibEx(ARDITE_ORE),
                    new ItemBlockElderMushroom(),
                    new ItemBlockElderMushroomCap(),
                    new ItemBlockLibEx(ELDER_MUSHROOM_STEM),
                    new ItemBlockLibEx(ENOKI_MUSHROOM_STEM),
                    new ItemBlockLibEx(ENOKI_MUSHROOM_CAP),
                    new ItemBlockThornstalk(),
                    new ItemBlockLibEx(ICHOR),
                    new ItemBlockLibEx(BLIGHT),
                    new ItemBlockVanillaSlab(false),
                    new ItemBlockBasaltSlab(false),
                    new ItemBlockNetherBrickSlab(false),
                    new ItemBlockVanillaSlab(true),
                    new ItemBlockBasaltSlab(true),
                    new ItemBlockNetherBrickSlab(true),
                    new ItemBlockLibEx(RED_NETHER_BRICK_STAIRS),
                    new ItemBlockLibEx(FIERY_NETHER_BRICK_STAIRS),
                    new ItemBlockLibEx(ICY_NETHER_BRICK_STAIRS),
                    new ItemBlockLibEx(LIVELY_NETHER_BRICK_STAIRS),
                    new ItemBlockLibEx(GLOOMY_NETHER_BRICK_STAIRS),
                    new ItemBlockLibEx(BASALT_STAIRS),
                    new ItemBlockLibEx(BASALT_SMOOTH_STAIRS),
                    new ItemBlockLibEx(BASALT_BRICK_STAIRS),
                    new ItemBlockLibEx(BASALT_PILLAR_STAIRS),
                    new ItemBlockVanillaWall(),
                    new ItemBlockBasaltWall(),
                    new ItemBlockNetherBrickWall(),
                    new ItemBlockVanillaFence(),
                    new ItemBlockBasaltFence(),
                    new ItemBlockNetherBrickFence(),
                    new ItemBlockLibEx(QUARTZ_FENCE_GATE),
                    new ItemBlockLibEx(NETHER_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(RED_NETHER_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(BASALT_FENCE_GATE),
                    new ItemBlockLibEx(BASALT_SMOOTH_FENCE_GATE),
                    new ItemBlockLibEx(BASALT_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(BASALT_PILLAR_FENCE_GATE),
                    new ItemBlockLibEx(FIERY_NETHER_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(ICY_NETHER_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(LIVELY_NETHER_BRICK_FENCE_GATE),
                    new ItemBlockLibEx(GLOOMY_NETHER_BRICK_FENCE_GATE)
            );
        }
    }
}
