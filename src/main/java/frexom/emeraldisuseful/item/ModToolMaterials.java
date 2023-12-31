package frexom.emeraldisuseful.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    EMERALD(MiningLevels.DIAMOND, 1938, 12, 3, 10, () -> {
        return Ingredient.ofItems(Items.EMERALD);
    }),
    NEMERITE(MiningLevels.NETHERITE, 2258, 14,5, 21, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final int miningSpeed;
    private final int attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, int miningSpeed, int attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
