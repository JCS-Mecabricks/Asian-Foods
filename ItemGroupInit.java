package github.jcsmecabricks.foreignfoods.init;

import github.jcsmecabricks.foreignfoods.Foreignfoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    private static final Text FOREIGNFOODS_TITLE = Text.translatable("itemGroup." + Foreignfoods.MOD_ID + ".foreignfoods_group");
    public static final ItemGroup FOREIGNFOODS_GROUP = register("foreignfoods_group", FabricItemGroup.builder()
            .displayName(FOREIGNFOODS_TITLE)
            .icon(ItemInit.RAMEN::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(Foreignfoods.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());


    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, Foreignfoods.id(name), itemGroup);
    }
    public static void load() {}
}
