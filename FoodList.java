package github.jcsmecabricks.foreignfoods.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent SUSHI_COMPONENTS = new FoodComponent.Builder()
            .nutrition(9)
            .saturationModifier(0.5F)
            .alwaysEdible()
            .build();
    public static final FoodComponent SOUP_COMPONENTS = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(0.F)
            .alwaysEdible()
            .build();
        public static final FoodComponent RAMEN_COMPONENTS = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();
}
