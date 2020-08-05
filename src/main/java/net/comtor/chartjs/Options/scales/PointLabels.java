package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PointLabels {

    private String callback;
    private String fontColor;
    private String fontFamily;
    private Double fontSize;
    private String fontStyle;

    public PointLabels() {
    }

    public PointLabels(String callback, String fontColor, String fontFamily, Double fontSize, String fontStyle) {
        this.callback = callback;
        this.fontColor = fontColor;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
    }

    
    public String getCallback() {
        return this.callback;
    }

    public PointLabels setCallback(String callback) {
        this.callback = callback;
        return this;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public PointLabels setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public PointLabels setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Double getFontSize() {
        return this.fontSize;
    }

    public PointLabels setFontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public String getFontStyle() {
        return this.fontStyle;
    }

    public PointLabels setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }
}
