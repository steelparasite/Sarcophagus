package xyz.steelparasite.sarcophagus.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.steelparasite.sarcophagus.EgyptMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EgyptMod.MODID);

   public static final DeferredItem<Item> PLAYER_HEART = ITEMS.register("player_heart",
           () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
