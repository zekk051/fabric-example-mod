package net.zekk051.templatemod;

import net.fabricmc.api.ModInitializer;
import net.zekk051.templatemod.block.ModBlocks;
import net.zekk051.templatemod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "templatemod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registrerModItems();
	}
}
