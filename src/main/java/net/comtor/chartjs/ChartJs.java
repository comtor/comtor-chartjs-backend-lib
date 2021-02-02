package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.ComtorOptions.ComtorOptions;
import net.comtor.chartjs.Options.Options;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface ChartJs {

    public final static String TYPE_LINE = "line";
    public final static String TYPE_BAR = "bar";
    public final static String TYPE_RADAR = "radar";
    public final static String TYPE_DOUGHNUT = "doughnut";
    public final static String TYPE_PIE = "pie";
    public final static String TYPE_POLAR_AREA = "polarArea";
    public final static String TYPE_BUBBLE = "bubble";
    public final static String TYPE_SCATTER = "scatter";

    public Options getOptions();

    public void setOptions(Options options);

    public String getType();

    public void setComtorOptions(ComtorOptions comtorOptions);
    
    public ComtorOptions getComtorOptions();

}
