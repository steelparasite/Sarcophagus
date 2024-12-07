package xyz.steelparasite.sarcophagus.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.steelparasite.sarcophagus.Sarcophagus;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sarcophagus.MODID);

    public static final DeferredItem<Item> PLAYERHEART = ITEMS.register("playerheart",
           () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCARAB = ITEMS.register("scarab",
           () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLDENSCARAB = ITEMS.register("goldenscarab",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GRANITE_SHARD = ITEMS.register("granite_shard",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RITUAL_DAGGER = ITEMS.register("ritual_dagger",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
