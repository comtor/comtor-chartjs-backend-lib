package net.comtor.chartjs.chart.PolarAreaChart;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PolarAreaStyle {
    private String backgroundColor;
    private String borderColor;
    private int borderWidth;
}
