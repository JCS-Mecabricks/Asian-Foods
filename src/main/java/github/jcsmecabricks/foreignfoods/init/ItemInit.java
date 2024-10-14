package github.jcsmecabricks.foreignfoods.init;

import github.jcsmecabricks.foreignfoods.Foreignfoods;
import github.jcsmecabricks.foreignfoods.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ItemInit {
    public static final Item CHOPSTICKS = register("chopsticks", new Item(new Item.Settings()));
    public static final Item RICE = register("rice", new Item(new Item.Settings()));
    public static final Item SUSHI = register("sushi",
            new Item(new Item.Settings().food(FoodList.SUSHI_COMPONENTS).maxCount(16)));
    public static final Item SOUP = register("soup",
            new Item(new Item.Settings().food(FoodList.SOUP_COMPONENTS).maxCount(1)));
    public static final Item RAMEN = register("ramen",
            new Item(new Item.Settings().food(FoodList.RAMEN_COMPONENTS).maxCount(1)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Foreignfoods.id(name), item);
    }
    public static void load() {}
}
