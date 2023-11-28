package net.slayerrroar.reborn12k.compat.rei.categories.melter;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

import java.text.DecimalFormat;
import java.util.List;

@Environment(EnvType.CLIENT)
public class MelterCategory implements DisplayCategory<MelterDisplay> {
    public static final CategoryIdentifier<MelterDisplay> MELTER =
            CategoryIdentifier.of(Reborn12K.MOD_ID, "melter");

    @Override
    public CategoryIdentifier<? extends MelterDisplay> getCategoryIdentifier() {
        return MELTER;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("rei.reborn12k.melter");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(RebornBlocks.MELTER.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(MelterDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 41, bounds.y + 10);

        /*double cookingTime = display.getCookingTime();
        DecimalFormat df = new DecimalFormat("###.##");*/

        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 15, startPoint.y + 1))
                .entries(display.getInputEntries().get(0))
                .markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 12, startPoint.y + 1))
                .entries(display.getInputEntries().get(1))
                .markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 71, startPoint.y + 9))
                .entries(display.getOutputEntries().get(0))
                .disableBackground()
                .markOutput());
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 71, startPoint.y + 9)));

        widgets.add(Widgets.createBurningFire(new Point(startPoint.x - 1, startPoint.y + 20))
                .animationDurationMS(10000));
        /*widgets.add(Widgets.createLabel(new Point(bounds.x + bounds.width - 51, bounds.y + 5),
                Text.translatable("rei.reborn12k.cooking.time", df.format(cookingTime / 20d))).noShadow().rightAligned().color(0xFF404040, 0xFFBBBBBB));*/
        widgets.add(Widgets.createArrow(new Point(startPoint.x + 36, startPoint.y + 8))
                .animationDurationTicks(60));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 49;
    }

}