package net.slayerrroar.reborn12k.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InventoryInteractionUtil {

    //thanks elidhan
    public static int itemCountInInventory(PlayerEntity player, Item item) {
        int itemCount = 0;

        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack currentStack = player.getInventory().getStack(i);
            if (!currentStack.isEmpty() && ItemStack.areItemsEqual(currentStack, new ItemStack(item))) {
                itemCount += currentStack.getCount();
            }
        }
        return Math.max(itemCount, 0);
    }

    public static void removeItemFromInventory(PlayerEntity player, Item item, int count) {
        int toRemove = count;

        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack currentStack = player.getInventory().getStack(i);
            if (!currentStack.isEmpty() && ItemStack.areItemsEqual(currentStack, new ItemStack(item))) {
                if (currentStack.getCount() > toRemove) {
                    currentStack.decrement(toRemove);
                    toRemove = 0;
                    break;
                } else {
                    toRemove -= currentStack.getCount();
                    currentStack.setCount(0);
                    if (toRemove == 0) {
                        break;
                    }
                }
            }
        }
    }

    public static void removeOneItemFromInventory(PlayerEntity player, Item item) {
        int toRemove = 1;

        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack currentStack = player.getInventory().getStack(i);
            if (!currentStack.isEmpty() && ItemStack.areItemsEqual(currentStack, new ItemStack(item))) {
                if (currentStack.getCount() > toRemove) {
                    currentStack.decrement(toRemove);
                    toRemove = 0;
                    break;
                } else {
                    toRemove -= currentStack.getCount();
                    currentStack.setCount(0);
                    if (toRemove == 0) {
                        break;
                    }
                }
            }
        }
    }

}