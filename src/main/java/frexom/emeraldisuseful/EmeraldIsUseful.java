package frexom.emeraldisuseful;

import frexom.emeraldisuseful.item.ModItemGroup;
import frexom.emeraldisuseful.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldIsUseful implements ModInitializer {
	public static final String MOD_ID = "emerald-is-useful";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
	}
}