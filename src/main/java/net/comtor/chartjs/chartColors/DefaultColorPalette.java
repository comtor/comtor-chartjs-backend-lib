package net.comtor.chartjs.chartColors;

import java.util.Random;

/**
 *
 * @author ericson
 */
public class DefaultColorPalette extends ChartColorPalette{

        public DefaultColorPalette() {

        this.addColor(new ChartColor(1*255, 0*255, 0*255));      // Red      #FF0000
        this.addColor(new ChartColor(0*255, 0*255, 1*255));      // Blue     #0000FF
        this.addColor(new ChartColor(0*255, 1*255, 0*255));      // Green    #00FF00
        this.addColor(new ChartColor(1*255, 1*255, 0*255));      // Yellow   #FFFF00
        this.addColor(new ChartColor(0*255, 1*255, 1*255));      // Cyan     #00FFFF
        this.addColor(new ChartColor(1*255, 0*255, 1*255));      // Magenta  #FF00FF
        
        this.addColor(new ChartColor(1*255, 0.5*255, 0*255));            // #FF7F00
        this.addColor(new ChartColor(0.5*255, 1*255, 0*255));            // #7FFF00
        this.addColor(new ChartColor(0*255, 0.5*255, 1*255));            // #007FFF
        this.addColor(new ChartColor(1*255, 0*255, 0.5*255));            // #FF007F
        this.addColor(new ChartColor(0.5*255, 0*255, 1*255));            // #7F00FF
        this.addColor(new ChartColor(0.5*255, 0.5*255, 0.5*255));        // #7F7F7F  

        this.addColor(new ChartColor(0.8*255, 0*255, 0*255));
        this.addColor(new ChartColor(0*255, 0*255, 0.8*255));
        this.addColor(new ChartColor(0*255, 0.8*255, 0*255));
        this.addColor(new ChartColor(0.8*255, 0.8*255, 0*255));
        this.addColor(new ChartColor(0*255, 0.8*255, 0.8*255));
        this.addColor(new ChartColor(0.8*255, 0*255, 0.8*255));

        this.addColor(new ChartColor(0.8*255, 0.4*255, 0*255));
        this.addColor(new ChartColor(0.4*255, 0.8*255, 0*255));
        this.addColor(new ChartColor(0*255, 0.4*255, 0.8*255));
        this.addColor(new ChartColor(0.8*255, 0*255, 0.4*255));
        this.addColor(new ChartColor(0.4*255, 0*255, 0.8*255));
        this.addColor(new ChartColor(0.4*255, 0.4*255, 0.4*255));
    }
        
    public ChartColor getRandomColor(){
        return getColor(new Random().nextInt(getPalette().size()));
}
        
}
