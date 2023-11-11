package frexom.emeraldisuseful.item;

import frexom.emeraldisuseful.EmeraldIsUseful;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup  {

    public static final ItemGroup EMERALD_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(EmeraldIsUseful.MOD_ID, "emerald_sword"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.emerald-is-useful"))
            .icon(() -> new ItemStack(ModItems.EMERALD_SWORD)).entries((displayContext, entries) -> {
                entries.add(Items.EMERALD);
                entries.add(ModItems.DIAMOND_AND_EMERALD);
                entries.add(ModItems.EMERALD_INGOT);
                entries.add(ModItems.NEMERITE_INGOT);
                entries.add(ModItems.EMERALD_SWORD);
                entries.add(ModItems.NEMERITE_SWORD);
                entries.add(ModItems.EMERALD_PICKAXE);
            }).build());
    public static void registerItemGroup(){
        EmeraldIsUseful.LOGGER.info("Registering item group for " + EmeraldIsUseful.MOD_ID);
    }
}
