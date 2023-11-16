package frexom.emeraldisuseful.enchantment;

import frexom.emeraldisuseful.EmeraldIsUseful;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

        public static Enchantment TOXIC_BLADE = registerEnchantment("toxic_blade",
                new ToxicBladeEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

        private static Enchantment registerEnchantment(String name, Enchantment enchantment){
                return Registry.register(Registries.ENCHANTMENT, new Identifier(EmeraldIsUseful.MOD_ID, name), enchantment);
        }

        public static void registerModEnchantments() {
                EmeraldIsUseful.LOGGER.info("Registering enchantments for " + EmeraldIsUseful.MOD_ID);

        }
}
