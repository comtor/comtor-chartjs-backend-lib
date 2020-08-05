package net.comtor.chartjs.Options.scales.ticks;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlSeeAlso;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@XmlSeeAlso({LinearTicks.class, CategoryTicks.class, RadialLinearTicks.class})
public abstract class Ticks {

    private Double sampleSize;
    private Boolean autoSkip;
    private Double autoSkipPadding;
    private Double labelOffset;
    private Double maxRotation;
    private Double minRotation;
    private Boolean mirror;
    private Double padding;

    public Ticks() {
    }

    public Ticks(Double sampleSize, Boolean autoSkip, Double autoSkipPadding, Double labelOffset, Double maxRotation, Double minRotation, Boolean mirror, Double padding) {
        this.sampleSize = sampleSize;
        this.autoSkip = autoSkip;
        this.autoSkipPadding = autoSkipPadding;
        this.labelOffset = labelOffset;
        this.maxRotation = maxRotation;
        this.minRotation = minRotation;
        this.mirror = mirror;
        this.padding = padding;
    }

    public Double getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Double sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Boolean getAutoSkip() {
        return autoSkip;
    }

    public void setAutoSkip(Boolean autoSkip) {
        this.autoSkip = autoSkip;
    }

    public Double getAutoSkipPadding() {
        return autoSkipPadding;
    }

    public void setAutoSkipPadding(Double autoSkipPadding) {
        this.autoSkipPadding = autoSkipPadding;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    public void setLabelOffset(Double labelOffset) {
        this.labelOffset = labelOffset;
    }

    public Double getMaxRotation() {
        return maxRotation;
    }

    public void setMaxRotation(Double maxRotation) {
        this.maxRotation = maxRotation;
    }

    public Double getMinRotation() {
        return minRotation;
    }

    public void setMinRotation(Double minRotation) {
        this.minRotation = minRotation;
    }

    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public Double getPadding() {
        return padding;
    }

    public void setPadding(Double padding) {
        this.padding = padding;
    }

}
