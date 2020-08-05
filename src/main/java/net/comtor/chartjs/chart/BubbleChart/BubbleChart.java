package net.comtor.chartjs.chart.BubbleChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.AbstractChartJs;
import net.comtor.chartjs.Options.Options;
import net.comtor.chartjs.ChartJs;
import net.comtor.chartjs.chart.Data;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BubbleChart extends AbstractChartJs {

    // Required parameters
    private Data data;

    public BubbleChart() {
        super(ChartJs.TYPE_BUBBLE);
    }

    public BubbleChart(Options options) {
        super(ChartJs.TYPE_BUBBLE, options);
    }

    public BubbleChart(Options options, Data data) {
        this(options);
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String getType() {
        return ChartJs.TYPE_BUBBLE;
    }
}
