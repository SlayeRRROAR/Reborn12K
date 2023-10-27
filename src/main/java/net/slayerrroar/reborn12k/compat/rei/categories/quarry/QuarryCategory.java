package net.slayerrroar.reborn12k.compat.rei.categories.quarry;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

import java.util.List;

public class QuarryCategory implements DisplayCategory<BasicDisplay> {
    public static final CategoryIdentifier<QuarryDisplay> QUARRY =
            CategoryIdentifier.of(Reborn12K.MOD_ID, "quarry");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return QUARRY;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("rei.reborn12k.quarry");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(RebornBlocks.QUARRY.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 41, bounds.y + 10);

        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x - 15, startPoint.y + 6))
                .entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 12, startPoint.y + 6))
                .entries(display.getInputEntries().get(1)).markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 77, startPoint.y + 6))
                .entries(display.getOutputEntries().get(0)).disableBackground().markOutput());
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 77, startPoint.y + 6)));

        widgets.add(Widgets.createArrow(new Point(startPoint.x + 38, startPoint.y + 6))
                .animationDurationTicks(60));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 49;
    }
}
