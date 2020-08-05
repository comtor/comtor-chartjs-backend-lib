package net.comtor.chartjs.chart.BubbleChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;
import net.comtor.chartjs.DataType2;

/**
 *
 * @author vihlai
 */
public class BubbleChartDataset extends AbstractDataset {
    
    // Required parameters
    private ArrayList<DataType2> data;
    // Optional parameters
    private Integer hoverRadius;
    private Integer hitRadius;
    private Integer order;
    private String poIntegerStyle = POINT_STYLES_CIRCLE;
    private Integer rotation;
    private Integer radius;    

    public BubbleChartDataset() {
    }
    
    public BubbleChartDataset(String label) {
        super(label);
    }

    public BubbleChartDataset(String label, ArrayList<DataType2> data) {
        this(label);
        this.data = data;
    }

    public BubbleChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public BubbleChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<DataType2> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    public Integer getHoverRadius() {
        return hoverRadius;
    }

    public void setHoverRadius(Integer hoverRadius) {
        this.hoverRadius = hoverRadius;
    }

    public Integer getHitRadius() {
        return hitRadius;
    }

    public void setHitRadius(Integer hitRadius) {
        this.hitRadius = hitRadius;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getPoIntegerStyle() {
        return poIntegerStyle;
    }

    public void setPoIntegerStyle(String poIntegerStyle) {
        this.poIntegerStyle = poIntegerStyle;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public ArrayList<DataType2> getData() {
        return data;
    }

    public void setData(ArrayList<DataType2> data) {
        this.data = data;
    }
    
    public BubbleChartDataset addData(ArrayList<DataType2> data){
        setData(data);
        return this;
    }

}
