package net.comtor.chartjs.Options.scales.ticks;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LinearTicks extends Ticks{

    private Boolean beginAtZero;
    private Double min;
    private Double max;
    private Double maxTicksLimit;
    private Double precision;
    private Double stepSize;
    private Double suggestedMax;
    private Double suggestedMin;

    public LinearTicks() {
    }

    public LinearTicks(Double min, Double max) {
        this.min = min;
        this.max = max;
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

    public Double getPrecision() {
        return precision;
    }

    public void setPrecision(Double precision) {
        this.precision = precision;
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
