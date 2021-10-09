package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BaseSword extends SwordItem{

    public BaseSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
