package net.comtor.chartjs.chartColors;

import java.util.LinkedList;

/**
 *
 * @author ericson
 */
public class ChartColorPalette {

    private LinkedList<ChartColor> palette;

    public ChartColorPalette() {
        this.palette = new LinkedList<>();
    }

    public ChartColor getColor(int index) {
        index = index % palette.size();
        
        return palette.get(index);
    }

    public LinkedList<ChartColor> getPalette() {
        return palette;
    }

    public void removeColor(int index) {
        this.palette.remove(index);
    }

    public void removeColor(ChartColor color) {
        this.palette.remove(color);
    }

    public void addColor(ChartColor color) {
        this.palette.add(color);
    }

}
