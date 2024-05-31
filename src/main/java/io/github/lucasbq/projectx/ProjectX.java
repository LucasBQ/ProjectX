package io.github.lucasbq.projectx;

import io.github.lucasbq.projectx.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectX.MOD_ID)
public class ProjectX {
    public static final String MOD_ID = "projectx";

    public ProjectX() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
