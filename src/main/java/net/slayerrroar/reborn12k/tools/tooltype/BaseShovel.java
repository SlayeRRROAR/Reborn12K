package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class BaseShovel extends ShovelItem{

    public BaseShovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }
    
}
