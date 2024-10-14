package github.jcsmecabricks.foreignfoods;

import github.jcsmecabricks.foreignfoods.data.provider.ForeignfoodsRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ForeignfoodsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
				pack.addProvider(ForeignfoodsRecipeProvider::new);

	}
}
