package net.comtor.chartjs.chart.DoughnutChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DoughnutChartDataset extends AbstractDataset {
    
    // Required parameters
    private ArrayList<Double> data;
    // Optional parameters
    private String borderAlign = BORDER_ALIGN_CENTER;    
    private Integer weight;

    public DoughnutChartDataset(String label) {
        super(label);
    }

    public DoughnutChartDataset(String label, ArrayList<Double> data) {
        this(label);
        this.data = data;
    }
    
    public DoughnutChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor){
        super(label,backgroundColor,borderColor);
    }

    public DoughnutChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor,ArrayList<Double> data) {
        this(label,backgroundColor,borderColor);
        this.data = data;
    }

    public DoughnutChartDataset() {
        
    }

    public String getBorderAlign() {
        return borderAlign;
    }

    public void setBorderAlign(String borderAlign) {
        this.borderAlign = borderAlign;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public DoughnutChartDataset addData(ArrayList<Double> data) {
        setData(data);
        return this;
    }

}
