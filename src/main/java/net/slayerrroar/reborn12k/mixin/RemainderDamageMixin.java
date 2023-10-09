package net.slayerrroar.reborn12k.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.collection.DefaultedList;
import net.slayerrroar.reborn12k.items.GenericItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Recipe.class)
public interface RemainderDamageMixin {

    @Inject(method = "getRemainder", at = @At("RETURN"))
    private void remainderDamage(Inventory inventory, CallbackInfoReturnable<DefaultedList<ItemStack>> cir) {
        DefaultedList<ItemStack> defaultedList = cir.getReturnValue();

        for(int i = 0; i < defaultedList.size(); ++i) {
            if (inventory.getStack(i).isOf(GenericItems.STONE_HAMMER) ||
                inventory.getStack(i).isOf(GenericItems.IRON_HAMMER) ||
                inventory.getStack(i).isOf(GenericItems.STONE_HAMMER)) {

                ItemStack remainderStack = inventory.getStack(i);
                remainderStack.setDamage(remainderStack.getDamage()+1);

                if (remainderStack.getDamage() < remainderStack.getMaxDamage()) {
                    defaultedList.set(i, remainderStack.copy());
                }
            }
        }
    }
}
