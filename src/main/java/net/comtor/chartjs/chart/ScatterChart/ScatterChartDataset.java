package net.comtor.chartjs.chart.ScatterChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractLineScatterDataset;
import net.comtor.chartjs.DataType2;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ScatterChartDataset extends AbstractLineScatterDataset {

    private ArrayList<DataType2> data;

    public ScatterChartDataset() {
    }

    public ScatterChartDataset(ArrayList<DataType2> data) {
        this.data = data;
    }

    public ScatterChartDataset(String label, ArrayList<DataType2> data) {
        super(label);
        this.data = data;
    }

    private ScatterChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public ScatterChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<DataType2> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private ScatterChartDataset(Double borderDashOffset, String clip, String hoverBorderCapStyle, Double hoverBorderDashOffset, String hoverBorderJoinStyle, Double lineTension) {
        super(borderDashOffset, clip, hoverBorderCapStyle, hoverBorderDashOffset, hoverBorderJoinStyle, lineTension);
    }

    private ScatterChartDataset(ArrayList<DataType2> data, Double borderDashOffset, String clip, String hoverBorderCapStyle, Double hoverBorderDashOffset, String hoverBorderJoinStyle, Double lineTension) {
        this(borderDashOffset, clip, hoverBorderCapStyle, hoverBorderDashOffset, hoverBorderJoinStyle, lineTension);
        this.data = data;
    }

    public ArrayList<DataType2> getData() {
        return data;
    }

    public void setData(ArrayList<DataType2> data) {
        this.data = data;
    }

    public ScatterChartDataset addData(ArrayList<DataType2> data){
        setData(data);
        return this;
    }
}
