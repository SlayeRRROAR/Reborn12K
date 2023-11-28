package net.slayerrroar.reborn12k.compat.rei.categories.manufactory;

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
public class ManufactoryCategory implements DisplayCategory<ManufactoryDisplay> {
    public static final CategoryIdentifier<ManufactoryDisplay> MANUFACTORY =
            CategoryIdentifier.of(Reborn12K.MOD_ID, "manufactory");

    @Override
    public CategoryIdentifier<? extends ManufactoryDisplay> getCategoryIdentifier() {
        return MANUFACTORY;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("rei.reborn12k.manufactory");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(RebornBlocks.MANUFACTORY.asItem().getDefaultStack());
    }
    @Override
    public List<Widget> setupDisplay(ManufactoryDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 41, bounds.getCenterY() - 10);

        /*double cookingTime = display.getCookingTime();
        DecimalFormat df = new DecimalFormat("###.##");*/

        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20 - 21 * 2, startPoint.y + 3))
                .entries(display.getInputEntries().get(0))
                .markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20 - 21, startPoint.y + 3))
                .entries(display.getInputEntries().get(2))
                .markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20, startPoint.y + 3))
                .entries(display.getInputEntries().get(1))
                .markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 3))
                .entries(display.getOutputEntries().get(0))
                .disableBackground()
                .markOutput());
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 80, startPoint.y + 3)));

        /*widgets.add(Widgets.createLabel(new Point(bounds.x + bounds.width - 50, bounds.y + 5),
                    Text.translatable("rei.reborn12k.cooking.time", df.format(cookingTime / 20d))).noShadow().rightAligned().color(0xFF404040, 0xFFBBBBBB));*/
        widgets.add(Widgets.createArrow(new Point(startPoint.x + 44, startPoint.y + 2))
                .animationDurationTicks(60));


        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 49;
    }

}
