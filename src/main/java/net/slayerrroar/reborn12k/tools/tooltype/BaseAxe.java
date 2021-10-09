package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class BaseAxe extends AxeItem{

    public BaseAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
