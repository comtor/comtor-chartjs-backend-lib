package net.comtor.chartjs.chart.BarChart;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BarChartScaleConfiguration {

    private boolean offset = true;
    private boolean offsetGridLines = true;

    public BarChartScaleConfiguration() {
    }

    public BarChartScaleConfiguration(boolean offset, boolean offsetGridLines) {
        this.offset = offset;
        this.offsetGridLines = offsetGridLines;
    }

    public boolean isOffset() {
        return offset;
    }

    public void setOffset(boolean offset) {
        this.offset = offset;
    }

    public boolean isOffsetGridLines() {
        return offsetGridLines;
    }

    public void setOffsetGridLines(boolean offsetGridLines) {
        this.offsetGridLines = offsetGridLines;
    }

}
