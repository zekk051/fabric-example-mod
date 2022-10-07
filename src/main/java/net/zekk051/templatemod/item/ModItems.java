package net.zekk051.templatemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zekk051.templatemod.TemplateMod;
import net.zekk051.templatemod.registry.ModItemGroup;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item",
            new Item(new FabricItemSettings().group(ModItemGroup.TEMPLATEMOD_GROUP)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }

    public static void registrerModItems(){
        TemplateMod.LOGGER.info("Registering ModItems for " + TemplateMod.MOD_ID);
    }
}
