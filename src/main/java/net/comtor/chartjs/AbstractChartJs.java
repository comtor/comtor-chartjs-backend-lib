package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.ComtorOptions.ComtorOptions;
import net.comtor.chartjs.Options.Options;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class AbstractChartJs implements ChartJs {

    private ComtorOptions comtorOptions;
    private Options options;
    private String type;
    
    public AbstractChartJs(String type, Options options) {
        this.type = type;
        this.options = options;
    }

    public AbstractChartJs(String type) {
        this(type, null);
    }

    @Override
    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public ComtorOptions getComtorOptions() {
        return comtorOptions;
    }

    public void setComtorOptions(ComtorOptions comtorOptions) {
        this.comtorOptions = comtorOptions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
