package net.comtor.chartjs.Options.scales.Cartesian;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import net.comtor.chartjs.Options.scales.DisplayFormats;
import net.comtor.chartjs.Options.scales.Scale;

@JsonInclude(Include.NON_EMPTY)
public class TimeScale extends Scale{

    private DisplayFormats displayFormats;
    private Boolean isoWeekday;
    private TimeScale max;
    private TimeScale min;
    private String parser;
    private String round;
    private String tooltipFormat;
    private String unit;
    private Double unitStepSize;

    public DisplayFormats getDisplayFormats() {
        return this.displayFormats;
    }

    public TimeScale setDisplayFormats(DisplayFormats displayFormats) {
        this.displayFormats = displayFormats;
        return this;
    }

    public Boolean getIsoWeekday() {
        return this.isoWeekday;
    }

    public TimeScale setIsoWeekday(Boolean isoWeekday) {
        this.isoWeekday = isoWeekday;
        return this;
    }

    public TimeScale getMax() {
        return this.max;
    }

    public TimeScale setMax(TimeScale max) {
        this.max = max;
        return this;
    }

    public TimeScale getMin() {
        return this.min;
    }

    public TimeScale setMin(TimeScale min) {
        this.min = min;
        return this;
    }

    public String getParser() {
        return this.parser;
    }

    public TimeScale setParser(String parser) {
        this.parser = parser;
        return this;
    }

    public String getRound() {
        return this.round;
    }

    public TimeScale setRound(String round) {
        this.round = round;
        return this;
    }

    public String getTooltipFormat() {
        return this.tooltipFormat;
    }

    public TimeScale setTooltipFormat(String tooltipFormat) {
        this.tooltipFormat = tooltipFormat;
        return this;
    }

    public String getUnit() {
        return this.unit;
    }

    public TimeScale setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public Double getUnitStepSize() {
        return this.unitStepSize;
    }

    public TimeScale setUnitStepSize(Double unitStepSize) {
        this.unitStepSize = unitStepSize;
        return this;
    }
    public String getType(){
        return TIME_SCALE;
    }
}
