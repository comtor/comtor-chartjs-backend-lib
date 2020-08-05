package net.comtor.chartjs.Options.Legend;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LegendLabel {

    public final static String LEGEND_LABEL_KEY = "labels";

    private Integer boxWidth;
    private Integer fontSize;
    private String fontStyle;
    private String fontColor;
    private String fontFamily;
    private Integer padding;
    private String generateLabels;
    private String filter;
    private boolean usePoIntegerStyle;
    private LegendItem legendItem;

    public LegendLabel() {
    }

    public LegendLabel(Integer boxWidth, Integer fontSize, String fontStyle, String fontColor, String fontFamily, Integer padding, String generateLabels, String filter, boolean usePoIntegerStyle, LegendItem legendItem) {
        this.boxWidth = boxWidth;
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
        this.fontColor = fontColor;
        this.fontFamily = fontFamily;
        this.padding = padding;
        this.generateLabels = generateLabels;
        this.filter = filter;
        this.usePoIntegerStyle = usePoIntegerStyle;
        this.legendItem = legendItem;
    }

    public Integer getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(Integer boxWidth) {
        this.boxWidth = boxWidth;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
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

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public String getGenerateLabels() {
        return generateLabels;
    }

    public void setGenerateLabels(String generateLabels) {
        this.generateLabels = generateLabels;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public boolean isUsePoIntegerStyle() {
        return usePoIntegerStyle;
    }

    public void setUsePoIntegerStyle(boolean usePoIntegerStyle) {
        this.usePoIntegerStyle = usePoIntegerStyle;
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }

    public void setLegendItem(LegendItem legendItem) {
        this.legendItem = legendItem;
    }

}
