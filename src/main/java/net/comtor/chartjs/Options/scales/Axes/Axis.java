package net.comtor.chartjs.Options.scales.Axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.Options.scales.GridLines;
import net.comtor.chartjs.Options.scales.ScaleLabel;
import net.comtor.chartjs.Options.scales.ticks.Ticks;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class Axis<T extends Ticks> {

    public static final String POSITION_TOP = "top";
    public static final String POSITION_LEFT = "left";
    public static final String POSITION_BOTTOM = "bottom";
    public static final String POSITION_RIGHT = "right";

    private String type;
    private String position;
    private Boolean offset;
    private String id;
    private GridLines gridLines;
    private ScaleLabel scaleLabel;
    private Boolean display = true;
    private String beforeUpdate;
    private String beforeSetDimensions;
    private String afterSetDimensions;
    private String beforeDataLimits;
    private String afterDataLimits;
    private String beforeBuildTicks;
    private String afterBuildTicks;
    private String beforeTickToLabelConversion;
    private String afterTickToLabelConversion;
    private String beforeCalculateTickRotation;
    private String afterCalculateTickRotation;
    private String beforeFit;
    private String afterFit;
    private String afterUpdate;
    private Boolean stacked;

    public Axis() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getOffset() {
        return offset;
    }

    public void setOffset(Boolean offset) {
        this.offset = offset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GridLines getGridLines() {
        return gridLines;
    }

    public void setGridLines(GridLines gridLines) {
        this.gridLines = gridLines;
    }

    public ScaleLabel getScaleLabel() {
        return scaleLabel;
    }

    public void setScaleLabel(ScaleLabel scaleLabel) {
        this.scaleLabel = scaleLabel;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getBeforeUpdate() {
        return beforeUpdate;
    }

    public void setBeforeUpdate(String beforeUpdate) {
        this.beforeUpdate = beforeUpdate;
    }

    public String getBeforeSetDimensions() {
        return beforeSetDimensions;
    }

    public void setBeforeSetDimensions(String beforeSetDimensions) {
        this.beforeSetDimensions = beforeSetDimensions;
    }

    public String getAfterSetDimensions() {
        return afterSetDimensions;
    }

    public void setAfterSetDimensions(String afterSetDimensions) {
        this.afterSetDimensions = afterSetDimensions;
    }

    public String getBeforeDataLimits() {
        return beforeDataLimits;
    }

    public void setBeforeDataLimits(String beforeDataLimits) {
        this.beforeDataLimits = beforeDataLimits;
    }

    public String getAfterDataLimits() {
        return afterDataLimits;
    }

    public void setAfterDataLimits(String afterDataLimits) {
        this.afterDataLimits = afterDataLimits;
    }

    public String getBeforeBuildTicks() {
        return beforeBuildTicks;
    }

    public void setBeforeBuildTicks(String beforeBuildTicks) {
        this.beforeBuildTicks = beforeBuildTicks;
    }

    public String getAfterBuildTicks() {
        return afterBuildTicks;
    }

    public void setAfterBuildTicks(String afterBuildTicks) {
        this.afterBuildTicks = afterBuildTicks;
    }

    public String getBeforeTickToLabelConversion() {
        return beforeTickToLabelConversion;
    }

    public void setBeforeTickToLabelConversion(String beforeTickToLabelConversion) {
        this.beforeTickToLabelConversion = beforeTickToLabelConversion;
    }

    public String getAfterTickToLabelConversion() {
        return afterTickToLabelConversion;
    }

    public void setAfterTickToLabelConversion(String afterTickToLabelConversion) {
        this.afterTickToLabelConversion = afterTickToLabelConversion;
    }

    public String getBeforeCalculateTickRotation() {
        return beforeCalculateTickRotation;
    }

    public void setBeforeCalculateTickRotation(String beforeCalculateTickRotation) {
        this.beforeCalculateTickRotation = beforeCalculateTickRotation;
    }

    public String getAfterCalculateTickRotation() {
        return afterCalculateTickRotation;
    }

    public void setAfterCalculateTickRotation(String afterCalculateTickRotation) {
        this.afterCalculateTickRotation = afterCalculateTickRotation;
    }

    public String getBeforeFit() {
        return beforeFit;
    }

    public void setBeforeFit(String beforeFit) {
        this.beforeFit = beforeFit;
    }

    public String getAfterFit() {
        return afterFit;
    }

    public void setAfterFit(String afterFit) {
        this.afterFit = afterFit;
    }

    public String getAfterUpdate() {
        return afterUpdate;
    }

    public void setAfterUpdate(String afterUpdate) {
        this.afterUpdate = afterUpdate;
    }

    public Boolean getStacked() {
        return stacked;
    }

    public void setStacked(Boolean stacked) {
        this.stacked = stacked;
    }

}
