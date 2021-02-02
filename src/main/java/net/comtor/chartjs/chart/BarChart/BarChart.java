package net.comtor.chartjs.chart.BarChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import net.comtor.chartjs.AbstractChartJs;
import net.comtor.chartjs.Options.Options;
import net.comtor.chartjs.ChartJs;
import net.comtor.chartjs.ComtorOptions.ComtorOptions;
import net.comtor.chartjs.chart.Data;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BarChart extends AbstractChartJs implements Serializable{

    private static final long serialVersionUID = 3520808807976923215L;
    
    public final static String TYPE_HORIZONTAL_BAR = "horizontalBar";
    
    private Data data;

    public BarChart() {
        super(ChartJs.TYPE_BAR);
    }

    public BarChart(Options options) {
        super(ChartJs.TYPE_BAR,options);
    }

    public BarChart(Options options, Data data) {
        this(options);
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    public void isHorizontalChart() {
        this.type=TYPE_HORIZONTAL_BAR;
    }


    @Override
    public String getType() {
        return this.type;
    }
}
