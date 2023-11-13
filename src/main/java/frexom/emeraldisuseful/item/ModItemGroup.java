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
            .icon(() -> new ItemStack(Items.EMERALD)).entries((displayContext, entries) -> {
                entries.add(Items.EMERALD);
                entries.add(ModItems.DIAMOND_AND_EMERALD);
                entries.add(ModItems.EMERALD_INGOT);
                entries.add(ModItems.NEMERITE_INGOT);
                entries.add(ModItems.NEMERITE_SMITHING_TEMPLATE);
                entries.add(ModItems.EMERALD_SHOVEL);
                entries.add(ModItems.NEMERITE_SHOVEL);
                entries.add(ModItems.EMERALD_PICKAXE);
                entries.add(ModItems.NEMERITE_PICKAXE);
                entries.add(ModItems.EMERALD_AXE);
                entries.add(ModItems.NEMERITE_AXE);
                entries.add(ModItems.EMERALD_HOE);
                entries.add(ModItems.NEMERITE_HOE);
                entries.add(ModItems.EMERALD_SWORD);
                entries.add(ModItems.NEMERITE_SWORD);
            }).build());
    public static void registerItemGroup(){
        EmeraldIsUseful.LOGGER.info("Registering item group for " + EmeraldIsUseful.MOD_ID);
    }
}
