package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GridLines {

    private Boolean display;
    private final ArrayList<String> color = new ArrayList<>();
    private ArrayList<Integer> lineWidth = new ArrayList<>();
    private Boolean drawBorder;
    private Boolean drawOnChartArea;
    private Boolean drawTicks;
    private Integer tickMarkLength;
    private Integer zeroLineWidth;
    private String zeroLineColor;
    private Boolean offsetGridLines;

    public GridLines() {
    }

    public GridLines(Boolean display) {
        this.display = display;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public ArrayList<Integer> getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(ArrayList<Integer> lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Boolean getDrawBorder() {
        return drawBorder;
    }

    public void setDrawBorder(Boolean drawBorder) {
        this.drawBorder = drawBorder;
    }

    public Boolean getDrawOnChartArea() {
        return drawOnChartArea;
    }

    public void setDrawOnChartArea(Boolean drawOnChartArea) {
        this.drawOnChartArea = drawOnChartArea;
    }

    public Boolean getDrawTicks() {
        return drawTicks;
    }

    public void setDrawTicks(Boolean drawTicks) {
        this.drawTicks = drawTicks;
    }

    public Integer getTickMarkLength() {
        return tickMarkLength;
    }

    public void setTickMarkLength(Integer tickMarkLength) {
        this.tickMarkLength = tickMarkLength;
    }

    public Integer getZeroLineWidth() {
        return zeroLineWidth;
    }

    public void setZeroLineWidth(Integer zeroLineWidth) {
        this.zeroLineWidth = zeroLineWidth;
    }

    public String getZeroLineColor() {
        return zeroLineColor;
    }

    public void setZeroLineColor(String zeroLineColor) {
        this.zeroLineColor = zeroLineColor;
    }

    public Boolean getOffsetGridLines() {
        return offsetGridLines;
    }

    public void setOffsetGridLines(Boolean offsetGridLines) {
        this.offsetGridLines = offsetGridLines;
    }

    public ArrayList<String> getColor() {
        return color;
    }

}
