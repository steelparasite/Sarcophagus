package xyz.steelparasite.sarcophagus.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.steelparasite.sarcophagus.Sarcophagus;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sarcophagus.MODID);

    public static final Supplier<CreativeModeTab> SARCOPHAGUS_ITEMS_TAB = CREATIVE_MODE_TAB.register("sarcophagus_items_tab",
            () -> CreativeModeTab.builder()
                    .icon( () -> new ItemStack(ModItems.PLAYERHEART.get()))
                    .title(Component.translatable("creativetab.sarcophagus.sarcophagus_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PLAYERHEART);
                        output.accept(ModItems.SCARAB);
                        output.accept(ModItems.GOLDENSCARAB);
                        output.accept(ModItems.GRANITE_SHARD);
                    }).build());

    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
