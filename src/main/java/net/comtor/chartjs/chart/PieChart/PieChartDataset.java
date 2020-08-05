package net.comtor.chartjs.chart.PieChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PieChartDataset extends AbstractDataset {

    private String borderAlign = BORDER_ALIGN_CENTER;
    private Integer weight;

    private ArrayList<Double> data;

    public PieChartDataset() {
    }

    public PieChartDataset(ArrayList<Double> data) {
        this.data = data;
    }

    public PieChartDataset(String label, ArrayList<Double> data) {
        super(label);
        this.data = data;
    }

    private PieChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public PieChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<Double> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private PieChartDataset(String borderAlign) {
        this.borderAlign = borderAlign;
    }

    public PieChartDataset(String label, ArrayList<Double> data, String borderAlign) {
        this(label, data);
        this.borderAlign = borderAlign;
    }

    public String getBorderAlign() {
        return borderAlign;
    }

    public void setBorderAlign(String borderAlign) {
        this.borderAlign = borderAlign;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public PieChartDataset addData(ArrayList<Double> data) {
        setData(data);
        return this;
    }
}
