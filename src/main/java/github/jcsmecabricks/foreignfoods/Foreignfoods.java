package github.jcsmecabricks.foreignfoods;

import github.jcsmecabricks.foreignfoods.init.ItemGroupInit;
import github.jcsmecabricks.foreignfoods.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foreignfoods implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ForeignFoods");

	public static final String MOD_ID = "foreignfoods";

	@Override
	public void onInitialize() {


		LOGGER.info("Loading...");
		ItemGroupInit.load();
		ItemInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addBefore(Items.SUSPICIOUS_STEW, ItemInit.RAMEN);
			entries.addBefore(Items.SUSPICIOUS_STEW, ItemInit.SOUP);
			entries.addAfter(Items.DRIED_KELP, ItemInit.SUSHI);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.STICK, ItemInit.CHOPSTICKS);
			entries.addAfter(Items.PUFFERFISH, ItemInit.RICE);
		});
	}
	public static Identifier id(String path) { return Identifier.of(MOD_ID, path);
	}
}