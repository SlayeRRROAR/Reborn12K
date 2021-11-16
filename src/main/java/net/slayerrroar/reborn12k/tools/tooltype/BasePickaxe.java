package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BasePickaxe extends PickaxeItem{

    public BasePickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }
    
}
