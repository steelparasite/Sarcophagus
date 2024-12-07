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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
