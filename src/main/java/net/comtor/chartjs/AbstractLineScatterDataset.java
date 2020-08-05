package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static net.comtor.chartjs.ChartDataset.BORDER_CAP_STYLE_BUTT;
import static net.comtor.chartjs.ChartDataset.BORDER_JOIN_STYLE_MITTER;
import static net.comtor.chartjs.ChartDataset.CUBIC_INTERPOLATION_MODE_DEFAULT;
import static net.comtor.chartjs.ChartDataset.POINT_STYLES_CIRCLE;
import static net.comtor.chartjs.ChartDataset.STEPPED_LINE_FALSE;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class AbstractLineScatterDataset extends AbstractDataset {

    private String borderCapStyle = BORDER_CAP_STYLE_BUTT;
    private List<Integer> borderDash = new LinkedList<>();
    private Double borderDashOffset;
    private String borderJoinStyle = BORDER_JOIN_STYLE_MITTER;
    private String cubicInterpolationMode = CUBIC_INTERPOLATION_MODE_DEFAULT;
    private String clip;
    private String fill;
    private String hoverBorderCapStyle;
    private List<Integer> hoverBorderDash = new LinkedList<>();
    private Double hoverBorderDashOffset;
    private String hoverBorderJoinStyle;
    private Double lineTension;
    private Integer order;
    private String poIntegerBackgroundColor;
    private String poIntegerBorderColor;
    private Integer poIntegerBorderWidth;
    private Integer poIntegerHitRadius;
    private String poIntegerHoverBackgroundColor;
    private String poIntegerHoverBorderColor;
    private Integer poIntegerHoverBorderWidth;
    private Integer poIntegerHoverRadius;
    private Integer poIntegerRadius;
    private Integer poIntegerRotation;
    private String poIntegerStyle = POINT_STYLES_CIRCLE;
    private boolean showLine;
    private boolean spanGaps;
    private String steppedLine = STEPPED_LINE_FALSE;
    private String xAxisID;
    private String yAxisID;

    public AbstractLineScatterDataset(Double borderDashOffset, String clip, String hoverBorderCapStyle, Double hoverBorderDashOffset, String hoverBorderJoinStyle, Double lineTension) {
        this.borderDashOffset = borderDashOffset;
        this.clip = clip;
        this.hoverBorderCapStyle = hoverBorderCapStyle;
        this.hoverBorderDashOffset = hoverBorderDashOffset;
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
        this.lineTension = lineTension;
    }

    public AbstractLineScatterDataset(String label) {
        super(label);
    }

    public AbstractLineScatterDataset(String label, ArrayList<String> backgroundColor, ArrayList<String> borderColor) {
        super(label, backgroundColor, borderColor);
    }

    public AbstractLineScatterDataset() {
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

    public String getCubicInterpolationMode() {
        return cubicInterpolationMode;
    }

    public void setCubicInterpolationMode(String cubicInterpolationMode) {
        this.cubicInterpolationMode = cubicInterpolationMode;
    }

    public String getClip() {
        return clip;
    }

    public void setClip(String clip) {
        this.clip = clip;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getHoverBorderCapStyle() {
        return hoverBorderCapStyle;
    }

    public void setHoverBorderCapStyle(String hoverBorderCapStyle) {
        this.hoverBorderCapStyle = hoverBorderCapStyle;
    }

    public List<Integer> getHoverBorderDash() {
        return hoverBorderDash;
    }

    public void setHoverBorderDash(List<Integer> hoverBorderDash) {
        this.hoverBorderDash = hoverBorderDash;
    }

    public Double getHoverBorderDashOffset() {
        return hoverBorderDashOffset;
    }

    public void setHoverBorderDashOffset(Double hoverBorderDashOffset) {
        this.hoverBorderDashOffset = hoverBorderDashOffset;
    }

    public String getHoverBorderJoinStyle() {
        return hoverBorderJoinStyle;
    }

    public void setHoverBorderJoinStyle(String hoverBorderJoinStyle) {
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
    }

    public Double getLineTension() {
        return lineTension;
    }

    public void setLineTension(Double lineTension) {
        this.lineTension = lineTension;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public Integer getPoIntegerHoverBorderWidth() {
        return poIntegerHoverBorderWidth;
    }

    public void setPoIntegerHoverBorderWidth(Integer poIntegerHoverBorderWidth) {
        this.poIntegerHoverBorderWidth = poIntegerHoverBorderWidth;
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

    public boolean isShowLine() {
        return showLine;
    }

    public void setShowLine(boolean showLine) {
        this.showLine = showLine;
    }

    public boolean isSpanGaps() {
        return spanGaps;
    }

    public void setSpanGaps(boolean spanGaps) {
        this.spanGaps = spanGaps;
    }

    public String getSteppedLine() {
        return steppedLine;
    }

    public void setSteppedLine(String steppedLine) {
        this.steppedLine = steppedLine;
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

}
