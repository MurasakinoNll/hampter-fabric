package net.harak.item.custom;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents
{
    public static final FoodComponent COOKED_HAMPTER = new FoodComponent.Builder()
            .hunger(4)
            .alwaysEdible()
            .meat()
            .saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 2000, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 10), 1f)
            .build();
}
