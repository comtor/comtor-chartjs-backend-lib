package net.comtor.chartjs.chart.RadarChart;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RadarChartDataset extends AbstractDataset {

    // Required parameters
    private ArrayList<Double> data;
    // Optional parameters
    private String borderCapStyle = BORDER_CAP_STYLE_BUTT;
    private List<Integer> borderDash = new LinkedList<>();
    private Double borderDashOffset;
    private String borderJoinStyle = BORDER_JOIN_STYLE_MITTER;
    private String hoverBorderCapStyle;
    private String hoverBorderColor;
    private List<Integer> hoverBorderDash = new LinkedList<>();
    private Integer hoverBorderDashOffset;
    private String hoverBorderJoinStyle;
    private String fill;
    private Integer order;
    private Integer lineTension;
    //PoIntegerStyles
    private String poIntegerBackgroundColor;
    private String poIntegerBorderColor;
    private Integer poIntegerBorderWidth;
    private Integer poIntegerHitRadius;
    private String poIntegerHoverBackgroundColor;
    private String poIntegerHoverBorderColor;
    private Integer poIntegerHoverRadius;
    private Integer poIntegerRadius;
    private Integer poIntegerRotation;
    private String poIntegerStyle = POINT_STYLES_CIRCLE;
    private boolean spanGaps;

    public RadarChartDataset() {
    }

    public RadarChartDataset(ArrayList<Double> data) {
        this.data = data;
    }

    public RadarChartDataset(String label, ArrayList<Double> data) {
        super(label);
        this.data = data;
    }

    private RadarChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public RadarChartDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor, ArrayList<Double> data) {
        this(label, backgroundColor, borderColor);
        this.data = data;
    }

    private RadarChartDataset(Double borderDashOffset, String hoverBorderCapStyle, String hoverBorderColor, Integer hoverBorderDashOffset, String hoverBorderJoinStyle, String fill, Integer order, Integer lineTension) {
        this.borderDashOffset = borderDashOffset;
        this.hoverBorderCapStyle = hoverBorderCapStyle;
        this.hoverBorderColor = hoverBorderColor;
        this.hoverBorderDashOffset = hoverBorderDashOffset;
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
        this.fill = fill;
        this.order = order;
        this.lineTension = lineTension;
    }

    public RadarChartDataset(ArrayList<Double> data, Double borderDashOffset, String hoverBorderCapStyle, String hoverBorderColor, Integer hoverBorderDashOffset, String hoverBorderJoinStyle, String fill, Integer order, Integer lineTension) {
        this(borderDashOffset, hoverBorderCapStyle, hoverBorderColor, hoverBorderDashOffset, hoverBorderJoinStyle, fill, order, lineTension);
        this.data = data;
    }
    
    
    public String getBorderCapStyle() {
        return borderCapStyle;
    }

    public void setBorderCapStyle(String borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
    }

    public List<Integer> getBorderDash() {
        return borderDash;
    }

    public void setBorderDash(List<Integer> borderDash) {
        this.borderDash = borderDash;
    }

    public Double getBorderDashOffset() {
        return borderDashOffset;
    }

    public void setBorderDashOffset(Double borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public String getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public void setBorderJoinStyle(String borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
    }

    public String getHoverBorderCapStyle() {
        return hoverBorderCapStyle;
    }

    public void setHoverBorderCapStyle(String hoverBorderCapStyle) {
        this.hoverBorderCapStyle = hoverBorderCapStyle;
    }

    @Override
    public String getHoverBorderColor() {
        return hoverBorderColor;
    }

    @Override
    public void setHoverBorderColor(String hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
    }

    public List<Integer> getHoverBorderDash() {
        return hoverBorderDash;
    }

    public void setHoverBorderDash(List<Integer> hoverBorderDash) {
        this.hoverBorderDash = hoverBorderDash;
    }

    public Integer getHoverBorderDashOffset() {
        return hoverBorderDashOffset;
    }

    public void setHoverBorderDashOffset(Integer hoverBorderDashOffset) {
        this.hoverBorderDashOffset = hoverBorderDashOffset;
    }

    public String getHoverBorderJoinStyle() {
        return hoverBorderJoinStyle;
    }

    public void setHoverBorderJoinStyle(String hoverBorderJoinStyle) {
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getLineTension() {
        return lineTension;
    }

    public void setLineTension(Integer lineTension) {
        this.lineTension = lineTension;
    }

    public String getPoIntegerBackgroundColor() {
        return poIntegerBackgroundColor;
    }

    public void setPoIntegerBackgroundColor(String poIntegerBackgroundColor) {
        this.poIntegerBackgroundColor = poIntegerBackgroundColor;
    }

    public String getPoIntegerBorderColor() {
        return poIntegerBorderColor;
    }

    public void setPoIntegerBorderColor(String poIntegerBorderColor) {
        this.poIntegerBorderColor = poIntegerBorderColor;
    }

    public Integer getPoIntegerBorderWidth() {
        return poIntegerBorderWidth;
    }

    public void setPoIntegerBorderWidth(Integer poIntegerBorderWidth) {
        this.poIntegerBorderWidth = poIntegerBorderWidth;
    }

    public Integer getPoIntegerHitRadius() {
        return poIntegerHitRadius;
    }

    public void setPoIntegerHitRadius(Integer poIntegerHitRadius) {
        this.poIntegerHitRadius = poIntegerHitRadius;
    }

    public String getPoIntegerHoverBackgroundColor() {
        return poIntegerHoverBackgroundColor;
    }

    public void setPoIntegerHoverBackgroundColor(String poIntegerHoverBackgroundColor) {
        this.poIntegerHoverBackgroundColor = poIntegerHoverBackgroundColor;
    }

    public String getPoIntegerHoverBorderColor() {
        return poIntegerHoverBorderColor;
    }

    public void setPoIntegerHoverBorderColor(String poIntegerHoverBorderColor) {
        this.poIntegerHoverBorderColor = poIntegerHoverBorderColor;
    }

    public Integer getPoIntegerHoverRadius() {
        return poIntegerHoverRadius;
    }

    public void setPoIntegerHoverRadius(Integer poIntegerHoverRadius) {
        this.poIntegerHoverRadius = poIntegerHoverRadius;
    }

    public Integer getPoIntegerRadius() {
        return poIntegerRadius;
    }

    public void setPoIntegerRadius(Integer poIntegerRadius) {
        this.poIntegerRadius = poIntegerRadius;
    }

    public Integer getPoIntegerRotation() {
        return poIntegerRotation;
    }

    public void setPoIntegerRotation(Integer poIntegerRotation) {
        this.poIntegerRotation = poIntegerRotation;
    }

    public String getPoIntegerStyle() {
        return poIntegerStyle;
    }

    public void setPoIntegerStyle(String poIntegerStyle) {
        this.poIntegerStyle = poIntegerStyle;
    }

    public boolean isSpanGaps() {
        return spanGaps;
    }

    public void setSpanGaps(boolean spanGaps) {
        this.spanGaps = spanGaps;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }
    
    public RadarChartDataset addData(ArrayList<Double> data){
        setData(data);
        return this;
    }

}
