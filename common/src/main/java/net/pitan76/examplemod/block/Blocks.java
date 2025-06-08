package net.pitan76.examplemod.block;

import net.minecraft.block.Block;
import net.pitan76.mcpitanlib.api.block.CompatibleMaterial;
import net.pitan76.mcpitanlib.api.block.v2.CompatBlock;
import net.pitan76.mcpitanlib.api.block.v2.CompatibleBlockSettings;
import net.pitan76.mcpitanlib.api.registry.result.RegistryResult;

import static net.pitan76.examplemod.ExampleMod._id;
import static net.pitan76.examplemod.ExampleMod.registry;

public class Blocks {

    public static RegistryResult<Block> EXAMPLE_BLOCK;

    public static void init() {
        EXAMPLE_BLOCK = registry.registerBlock(_id("example_block"), () -> new CompatBlock(CompatibleBlockSettings.of(_id("example_block"), CompatibleMaterial.STONE)));
    }
}
