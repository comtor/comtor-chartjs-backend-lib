package net.comtor.chartjs.Options.scales.ticks;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RadialLinearTicks extends Ticks {

    private String backdropColor;
    private Double backdropPaddingX;
    private Double backdropPaddingY;
    private Boolean beginAtZero;
    private Double min;
    private Double max;
    private Double maxTicksLimit;
    private Boolean showLabelBackdrop;
    private Double fixedStepSize;
    private Double stepSize;
    private Double suggestedMax;
    private Double suggestedMin;

    public RadialLinearTicks() {
    }

    public RadialLinearTicks(Double min, Double max) {
        this.min = min;
        this.max = max;
    }

    public RadialLinearTicks(String backdropColor, Double backdropPaddingX, Double backdropPaddingY, Boolean beginAtZero, Double min, Double max, Double maxTicksLimit, Boolean showLabelBackdrop, Double fixedStepSize, Double stepSize, Double suggestedMax, Double suggestedMin) {
        this.backdropColor = backdropColor;
        this.backdropPaddingX = backdropPaddingX;
        this.backdropPaddingY = backdropPaddingY;
        this.beginAtZero = beginAtZero;
        this.min = min;
        this.max = max;
        this.maxTicksLimit = maxTicksLimit;
        this.showLabelBackdrop = showLabelBackdrop;
        this.fixedStepSize = fixedStepSize;
        this.stepSize = stepSize;
        this.suggestedMax = suggestedMax;
        this.suggestedMin = suggestedMin;
    }

    public String getBackdropColor() {
        return backdropColor;
    }

    public void setBackdropColor(String backdropColor) {
        this.backdropColor = backdropColor;
    }

    public Double getBackdropPaddingX() {
        return backdropPaddingX;
    }

    public void setBackdropPaddingX(Double backdropPaddingX) {
        this.backdropPaddingX = backdropPaddingX;
    }

    public Double getBackdropPaddingY() {
        return backdropPaddingY;
    }

    public void setBackdropPaddingY(Double backdropPaddingY) {
        this.backdropPaddingY = backdropPaddingY;
    }

    public Boolean getBeginAtZero() {
        return beginAtZero;
    }

    public void setBeginAtZero(Boolean beginAtZero) {
        this.beginAtZero = beginAtZero;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMaxTicksLimit() {
        return maxTicksLimit;
    }

    public void setMaxTicksLimit(Double maxTicksLimit) {
        this.maxTicksLimit = maxTicksLimit;
    }

    public Boolean getShowLabelBackdrop() {
        return showLabelBackdrop;
    }

    public void setShowLabelBackdrop(Boolean showLabelBackdrop) {
        this.showLabelBackdrop = showLabelBackdrop;
    }

    public Double getFixedStepSize() {
        return fixedStepSize;
    }

    public void setFixedStepSize(Double fixedStepSize) {
        this.fixedStepSize = fixedStepSize;
    }

    public Double getStepSize() {
        return stepSize;
    }

    public void setStepSize(Double stepSize) {
        this.stepSize = stepSize;
    }

    public Double getSuggestedMax() {
        return suggestedMax;
    }

    public void setSuggestedMax(Double suggestedMax) {
        this.suggestedMax = suggestedMax;
    }

    public Double getSuggestedMin() {
        return suggestedMin;
    }

    public void setSuggestedMin(Double suggestedMin) {
        this.suggestedMin = suggestedMin;
    }

}
