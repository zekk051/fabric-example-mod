package net.zekk051.templatemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.zekk051.templatemod.event.KeyInputHandler;

@Environment(EnvType.CLIENT)
public class TemplateModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //HandledScreens.register();
        KeyInputHandler.register();
    }
}
