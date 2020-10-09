package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ScaleLabel {

    private Boolean display = true;
    private String labelString;
    private Double lineHeight;
    private String fontColor;
    private String fontFamily;
    private Double fontSize;
    private String fontStyle;
    private String padding;

    public ScaleLabel() {
    }

    public ScaleLabel(Boolean display) {
        this.display = display;
    }

    public ScaleLabel(Boolean display, String labelString) {
        this.display = display;
        this.labelString = labelString;
    }

    public ScaleLabel(Boolean display, String labelString, String fontColor, Double fontSize) {
        this.display = display;
        this.labelString = labelString;
        this.fontColor = fontColor;
        this.fontSize = fontSize;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getLabelString() {
        return labelString;
    }

    public void setLabelString(String labelString) {
        this.labelString = labelString;
    }

    public Double getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(Double lineHeight) {
        this.lineHeight = lineHeight;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

}
