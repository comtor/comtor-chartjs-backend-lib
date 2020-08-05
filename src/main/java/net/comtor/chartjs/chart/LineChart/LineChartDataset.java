package net.comtor.chartjs.chart.LineChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractLineScatterDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LineChartDataset extends AbstractLineScatterDataset {
    
    private ArrayList<Double> data;
    
    public LineChartDataset() {
    }

    public LineChartDataset(ArrayList<Double> data) {
        this.data = data;
    }

    public LineChartDataset(String label, ArrayList<Double> data) {
        super(label);
        this.data = data;
    }

    private LineChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public LineChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<Double> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private LineChartDataset(Double borderDashOffset, String clip, String hoverBorderCapStyle, Double hoverBorderDashOffset, String hoverBorderJoinStyle, Double lineTension){
        super(borderDashOffset,clip,hoverBorderCapStyle,hoverBorderDashOffset,hoverBorderJoinStyle,lineTension);
    }

    private LineChartDataset(ArrayList<Double> data,Double borderDashOffset, String clip, String hoverBorderCapStyle, Double hoverBorderDashOffset, String hoverBorderJoinStyle, Double lineTension){
        this(borderDashOffset,clip,hoverBorderCapStyle,hoverBorderDashOffset,hoverBorderJoinStyle,lineTension);
        this.data=data;
    }
    

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }
    
    public LineChartDataset addData(ArrayList<Double> data){
        setData(data);
        return this;
    }
}
