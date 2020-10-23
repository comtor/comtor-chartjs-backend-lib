package net.comtor.chartjs.chartColors;

import java.util.Random;

/**
 *
 * @author ericson
 */
public class DefaultColorPalette extends ChartColorPalette{

    public DefaultColorPalette() {

        this.addColor(new ChartColor(1f, 0f, 0f));      // Red      #FF0000
        this.addColor(new ChartColor(0f, 0f, 1f));      // Blue     #0000FF
        this.addColor(new ChartColor(0f, 1f, 0f));      // Green    #00FF00
        this.addColor(new ChartColor(1f, 1f, 0f));      // Yellow   #FFFF00
        this.addColor(new ChartColor(0f, 1f, 1f));      // Cyan     #00FFFF
        this.addColor(new ChartColor(1f, 0f, 1f));      // Magenta  #FF00FF
        
        this.addColor(new ChartColor(1f, 0.5f, 0f));            // #FF7F00
        this.addColor(new ChartColor(0.5f, 1f, 0f));            // #7FFF00
        this.addColor(new ChartColor(0f, 0.5f, 1f));            // #007FFF
        this.addColor(new ChartColor(1f, 0f, 0.5f));            // #FF007F
        this.addColor(new ChartColor(0.5f, 0f, 1f));            // #7F00FF
        this.addColor(new ChartColor(0.5f, 0.5f, 0.5f));        // #7F7F7F  

        this.addColor(new ChartColor(0.8f, 0f, 0f));
        this.addColor(new ChartColor(0f, 0f, 0.8f));
        this.addColor(new ChartColor(0f, 0.8f, 0f));
        this.addColor(new ChartColor(0.8f, 0.8f, 0f));
        this.addColor(new ChartColor(0f, 0.8f, 0.8f));
        this.addColor(new ChartColor(0.8f, 0f, 0.8f));

        this.addColor(new ChartColor(0.8f, 0.4f, 0f));
        this.addColor(new ChartColor(0.4f, 0.8f, 0f));
        this.addColor(new ChartColor(0f, 0.4f, 0.8f));
        this.addColor(new ChartColor(0.8f, 0f, 0.4f));
        this.addColor(new ChartColor(0.4f, 0f, 0.8f));
        this.addColor(new ChartColor(0.4f, 0.4f, 0.4f));
    }
        
    public ChartColor getRandomColor(){
        return getColor(new Random().nextInt(getPalette().size()));
}
        
}
