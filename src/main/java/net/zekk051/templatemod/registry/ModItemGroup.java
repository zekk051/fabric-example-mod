package net.zekk051.templatemod.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.zekk051.templatemod.TemplateMod;

//No need to register in main(TemplateMod) class
public class ModItemGroup {
    public static final ItemGroup TEMPLATEMOD_GROUP = FabricItemGroupBuilder.build(
            new Identifier(TemplateMod.MOD_ID, "templatemod_group"),
            () -> new ItemStack(Items.EXPERIENCE_BOTTLE));
}
