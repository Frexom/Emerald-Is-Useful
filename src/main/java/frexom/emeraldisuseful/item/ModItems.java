package frexom.emeraldisuseful.item;

import frexom.emeraldisuseful.EmeraldIsUseful;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterials.EMERALD, 4, -2.4f, new FabricItemSettings()));
    public static final Item NEMERITE_SWORD = registerItem("nemerite_sword", new SwordItem(ModToolMaterials.NEMERITE, 6, -2.4f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8f, new FabricItemSettings()));

    public static final Item DIAMOND_AND_EMERALD = registerItem("diamond_and_emerald", new Item(new FabricItemSettings()));
    public static final Item EMERALD_INGOT = registerItem("emerald_ingot", new Item(new FabricItemSettings()));
    public static final Item NEMERITE_INGOT = registerItem("nemerite_ingot", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(EMERALD_SWORD);
        entries.add(NEMERITE_SWORD);
        entries.add(EMERALD_PICKAXE);
        entries.add(DIAMOND_AND_EMERALD);
        entries.add(EMERALD_INGOT);
        entries.add(NEMERITE_INGOT);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EmeraldIsUseful.MOD_ID, name), item);
    }
    public static void registerModItems(){
        EmeraldIsUseful.LOGGER.info("Registering mod items for " + EmeraldIsUseful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
