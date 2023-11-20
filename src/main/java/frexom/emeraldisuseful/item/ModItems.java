package frexom.emeraldisuseful.item;

import frexom.emeraldisuseful.EmeraldIsUseful;
import frexom.emeraldisuseful.item.custom.KnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterials.EMERALD, 2.5f, -3f, new FabricItemSettings()));
    public static final Item NEMERITE_SHOVEL = registerItem("nemerite_shovel", new ShovelItem(ModToolMaterials.NEMERITE, 3.5f, -3f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8f, new FabricItemSettings()));
    public static final Item NEMERITE_PICKAXE = registerItem("nemerite_pickaxe", new PickaxeItem(ModToolMaterials.NEMERITE, 2, -2.8f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterials.EMERALD, 6, -3f, new FabricItemSettings()));
    public static final Item NEMERITE_AXE = registerItem("nemerite_axe", new AxeItem(ModToolMaterials.NEMERITE, 8, -3f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterials.EMERALD, -3, 0, new FabricItemSettings()));
    public static final Item NEMERITE_HOE = registerItem("nemerite_hoe", new HoeItem(ModToolMaterials.NEMERITE, -4, 0, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterials.EMERALD, 4, -2.4f, new FabricItemSettings()));
    public static final Item NEMERITE_SWORD = registerItem("nemerite_sword", new SwordItem(ModToolMaterials.NEMERITE, 6, -2.4f, new FabricItemSettings()));
    public static final Item EMERALD_KNIFE = registerItem("emerald_knife", new KnifeItem(ModToolMaterials.EMERALD, -1, -1.5f, new FabricItemSettings()));

    public static final Item NEMERITE_SMITHING_TEMPLATE = registerItem("nemerite_smithing_template", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_AND_EMERALD = registerItem("diamond_and_emerald", new Item(new FabricItemSettings()));
    public static final Item EMERALD_INGOT = registerItem("emerald_ingot", new Item(new FabricItemSettings()));
    public static final Item NEMERITE_INGOT = registerItem("nemerite_ingot", new Item(new FabricItemSettings()));

    
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EmeraldIsUseful.MOD_ID, name), item);
    }
    public static void registerModItems(){
        EmeraldIsUseful.LOGGER.info("Registering mod items for " + EmeraldIsUseful.MOD_ID);
    }
}
