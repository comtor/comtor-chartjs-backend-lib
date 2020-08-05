package net.comtor.chartjs.Options.Legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LegendItem {

    // Required parameters
    private String text;
    // Optional parameters
    private String fillStyle;
    private boolean hidden;
    private String lineCap;
    private List<Integer> lineDash;
    private Integer lineDashOffset;
    private String lineJoin;
    private Integer lineWidth;
    private String strokeStyle;
    private String poIntegerStyle;
    private Integer rotation;

    public LegendItem() {
    }

    public LegendItem(String text) {
        this.text = text;
    }

    public LegendItem(String text, String fillStyle, boolean hidden, String lineCap, List<Integer> lineDash, Integer lineDashOffset, String lineJoin, Integer lineWidth, String strokeStyle, String poIntegerStyle, Integer rotation) {
        this.text = text;
        this.fillStyle = fillStyle;
        this.hidden = hidden;
        this.lineCap = lineCap;
        this.lineDash = lineDash;
        this.lineDashOffset = lineDashOffset;
        this.lineJoin = lineJoin;
        this.lineWidth = lineWidth;
        this.strokeStyle = strokeStyle;
        this.poIntegerStyle = poIntegerStyle;
        this.rotation = rotation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getLineCap() {
        return lineCap;
    }

    public void setLineCap(String lineCap) {
        this.lineCap = lineCap;
    }

    public List<Integer> getLineDash() {
        return lineDash;
    }

    public void setLineDash(List<Integer> lineDash) {
        this.lineDash = lineDash;
    }

    public Integer getLineDashOffset() {
        return lineDashOffset;
    }

    public void setLineDashOffset(Integer lineDashOffset) {
        this.lineDashOffset = lineDashOffset;
    }

    public String getLineJoin() {
        return lineJoin;
    }

    public void setLineJoin(String lineJoin) {
        this.lineJoin = lineJoin;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    public String getStrokeStyle() {
        return strokeStyle;
    }

    public void setStrokeStyle(String strokeStyle) {
        this.strokeStyle = strokeStyle;
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

}
