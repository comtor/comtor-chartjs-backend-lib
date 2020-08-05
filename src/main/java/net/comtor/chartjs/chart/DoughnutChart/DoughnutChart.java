package net.comtor.chartjs.chart.DoughnutChart;

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
public class DoughnutChart extends AbstractChartJs {

    private Data data;

    public DoughnutChart() {
        super(ChartJs.TYPE_DOUGHNUT);
    }

    public DoughnutChart(Options options) {
        super(ChartJs.TYPE_DOUGHNUT, options);
    }

    public DoughnutChart(Options options, Data data) {
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
        return ChartJs.TYPE_DOUGHNUT;
    }

}
