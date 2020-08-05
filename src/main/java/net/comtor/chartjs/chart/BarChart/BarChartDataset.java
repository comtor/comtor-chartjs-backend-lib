package net.comtor.chartjs.chart.BarChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BarChartDataset extends AbstractDataset {

    // Required parameters
    private ArrayList<Double> data;
    // Optional parameters
    private String borderSkipped = BORDER_SKIPPED_BOTTOM;
    private Integer order;
    private String xAxisID;
    private String yAxisID;
    private Double barPercentage;
    private Double categoryPercentage;
    private String barThickness;
    private Double maxBarThickness;
    private Double minBarLength;
    //Required params

    public BarChartDataset() {
    }

    
    public BarChartDataset(ArrayList<Double> data) {
        this.data = data;
    }

    public BarChartDataset(String label, ArrayList<Double> data) {
        super(label);
        this.data = data;
    }

    private BarChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public BarChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<Double> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private BarChartDataset(String borderSkipped, Integer order, String xAxisID, String yAxisID, Double barPercentage, Double categoryPercentage, String barThickness, Double maxBarThickness, Double minBarLength) {
        this.borderSkipped = borderSkipped;
        this.order = order;
        this.xAxisID = xAxisID;
        this.yAxisID = yAxisID;
        this.barPercentage = barPercentage;
        this.categoryPercentage = categoryPercentage;
        this.barThickness = barThickness;
        this.maxBarThickness = maxBarThickness;
        this.minBarLength = minBarLength;
    }

    public BarChartDataset(ArrayList<Double> data, String borderSkipped, Integer order, String xAxisID, String yAxisID, Double barPercentage, Double categoryPercentage, String barThickness, Double maxBarThickness, Double minBarLength) {
        this(borderSkipped, order, xAxisID, yAxisID, barPercentage, categoryPercentage, barThickness, maxBarThickness, minBarLength);
        this.data = data;
    }

    public String getBorderSkipped() {
        return borderSkipped;
    }

    public void setBorderSkipped(String borderSkipped) {
        this.borderSkipped = borderSkipped;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getxAxisID() {
        return xAxisID;
    }

    public void setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
    }

    public String getyAxisID() {
        return yAxisID;
    }

    public void setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
    }

    public Double getBarPercentage() {
        return barPercentage;
    }

    public void setBarPercentage(Double barPercentage) {
        this.barPercentage = barPercentage;
    }

    public Double getCategoryPercentage() {
        return categoryPercentage;
    }

    public void setCategoryPercentage(Double categoryPercentage) {
        this.categoryPercentage = categoryPercentage;
    }

    public String getBarThickness() {
        return barThickness;
    }

    public void setBarThickness(String barThickness) {
        this.barThickness = barThickness;
    }

    public Double getMaxBarThickness() {
        return maxBarThickness;
    }

    public void setMaxBarThickness(Double maxBarThickness) {
        this.maxBarThickness = maxBarThickness;
    }

    public Double getMinBarLength() {
        return minBarLength;
    }

    public void setMinBarLength(Double minBarLength) {
        this.minBarLength = minBarLength;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }
    
    public BarChartDataset addData(ArrayList<Double> data){
        setData(data);
        return this;
    }
}
