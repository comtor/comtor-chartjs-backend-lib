package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSeeAlso;
import net.comtor.chartjs.chart.BarChart.BarChartDataset;
import net.comtor.chartjs.chart.BubbleChart.BubbleChartDataset;
import net.comtor.chartjs.chart.DoughnutChart.DoughnutChartDataset;
import net.comtor.chartjs.chart.LineChart.LineChartDataset;
import net.comtor.chartjs.chart.PieChart.PieChartDataset;
import net.comtor.chartjs.chart.PolarAreaChart.PolarAreaDataset;
import net.comtor.chartjs.chart.RadarChart.RadarChartDataset;
import net.comtor.chartjs.chart.ScatterChart.ScatterChartDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@XmlSeeAlso({BarChartDataset.class, BubbleChartDataset.class, DoughnutChartDataset.class, LineChartDataset.class, PieChartDataset.class, PolarAreaDataset.class,RadarChartDataset.class,ScatterChartDataset.class})
public abstract class AbstractDataset implements ChartDataset {

    //Required params
    private String label;

    //Optional params
    private ArrayList<String> backgroundColor;
    private ArrayList<String> borderColor;
    private Integer borderWidth;
    private String hoverBackgroundColor;
    private String hoverBorderColor;
    private Integer hoverBorderWidth;

    public AbstractDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, Integer borderWidth, String hoverBackgroundColor, String hoverBorderColor, Integer hoverBorderWidth) {
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.hoverBackgroundColor = hoverBackgroundColor;
        this.hoverBorderColor = hoverBorderColor;
        this.hoverBorderWidth = hoverBorderWidth;
    }

    public AbstractDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        this(label, backgroundColor, borderColor, null, null, null, null);
    }

    public AbstractDataset(String label) {
        this(label, null, null);
    }

    public AbstractDataset() {
    }
    

    @Override
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public ArrayList<String> getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(ArrayList<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public ArrayList<String> getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ArrayList<String> borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    @Override
    public String getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public void setHoverBackgroundColor(String hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    @Override
    public String getHoverBorderColor() {
        return hoverBorderColor;
    }

    public void setHoverBorderColor(String hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
    }

    @Override
    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public void setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
    }

}
