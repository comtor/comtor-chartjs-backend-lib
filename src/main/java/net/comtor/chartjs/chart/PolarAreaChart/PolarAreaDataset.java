package net.comtor.chartjs.chart.PolarAreaChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PolarAreaDataset extends AbstractDataset {

    private String borderAlign = BORDER_ALIGN_CENTER;
    private ArrayList<Double> data;
    //Config
    private String startAngle = "-0.5 * Math.PI";
    private boolean animateRotate;
    private boolean animateScale;

    public PolarAreaDataset() {
    }

    public PolarAreaDataset(ArrayList<Double> data) {
        this.data = data;
    }

    public PolarAreaDataset(String label, ArrayList<Double> data) {
        super(label);
        this.data = data;
    }

    private PolarAreaDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public PolarAreaDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<Double> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private PolarAreaDataset(String borderAlign) {
        this.borderAlign= borderAlign;
    }

    public PolarAreaDataset(String label, ArrayList<Double> data, String borderAlign) {
        this(label, data);
        this.borderAlign = borderAlign;
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

    public String getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(String startAngle) {
        this.startAngle = startAngle;
    }

    public boolean isAnimateRotate() {
        return animateRotate;
    }

    public void setAnimateRotate(boolean animateRotate) {
        this.animateRotate = animateRotate;
    }

    public boolean isAnimateScale() {
        return animateScale;
    }

    public void setAnimateScale(boolean animateScale) {
        this.animateScale = animateScale;
    }
    
    public PolarAreaDataset addData(ArrayList<Double> data){
        setData(data);
        return this;
    }

}
