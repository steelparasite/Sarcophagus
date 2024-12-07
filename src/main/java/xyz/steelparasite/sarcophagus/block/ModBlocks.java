package xyz.steelparasite.sarcophagus.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.steelparasite.sarcophagus.Sarcophagus;
import xyz.steelparasite.sarcophagus.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Sarcophagus.MODID);

    public static final DeferredBlock<Block> SARCOPHAGUS_BLOCK = registerBlock("sarcophagus_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(1.5f,3.0f)
                    .sound(SoundType.MUD_BRICKS)
                    .requiresCorrectToolForDrops()
                    ));

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus iEventBus){
        BLOCKS.register(iEventBus);
    }
}
