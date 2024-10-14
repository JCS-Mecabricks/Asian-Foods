package github.jcsmecabricks.foreignfoods.data.provider;

import github.jcsmecabricks.foreignfoods.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ForeignfoodsRecipeProvider extends FabricRecipeProvider {
    public ForeignfoodsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.SUSHI)
                .pattern(" D ")
                .pattern("RSR")
                .pattern(" D ")
                .input('R', ItemInit.RICE)
                .input('S', Items.SALMON)
                .input('D', Items.DRIED_KELP)
                .criterion(hasItem(ItemInit.SUSHI), conditionsFromItem(ItemInit.SUSHI))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.CHOPSTICKS)
                .input(Items.STICK, 2)
                .criterion(hasItem(ItemInit.CHOPSTICKS), conditionsFromItem(ItemInit.CHOPSTICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.RAMEN)
                .input('R', ItemInit.SOUP)
                .input('S', Items.EGG)
                .input('D', ItemInit.CHOPSTICKS)
                .pattern(" D ")
                .pattern(" RS")
                .criterion(hasItem(ItemInit.RAMEN), conditionsFromItem(ItemInit.RAMEN))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.RICE)
                .input('S', Items.WHEAT_SEEDS)
                .input('D', Items.WHEAT)
                .pattern(" D ")
                .pattern("S  ")
                .criterion(hasItem(ItemInit.RICE), conditionsFromItem(ItemInit.RICE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.SOUP)
                .input('S', Items.MUSHROOM_STEW)
                .input('R', Items.COOKED_CHICKEN)
                .pattern("   ")
                .pattern(" SR")
                .criterion(hasItem(ItemInit.SOUP), conditionsFromItem(ItemInit.SOUP))
                .offerTo(exporter);

    }
}
