package net.comtor.chartjs.chart.LineChart;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PointStyleLineChart {

    public enum PointStyles {
        circle,
        cross,
        crossRot,
        dash,
        line,
        rect,
        rectRounded,
        rectRot,
        star,
        triangle
    }
    private String pointBackgroundColor;
    private String pointBorderColor;
    private int pointBorderWidth;
    private int pointHitRadius;
    private int pointRadius;
    private int pointRotation;
    private PointStyles pointStyle;

    public String getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public void setPointBackgroundColor(String pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
    }

    public String getPointBorderColor() {
        return pointBorderColor;
    }

    public void setPointBorderColor(String pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
    }

    public int getPointBorderWidth() {
        return pointBorderWidth;
    }

    public void setPointBorderWidth(int pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
    }

    public int getPointHitRadius() {
        return pointHitRadius;
    }

    public void setPointHitRadius(int pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
    }

    public int getPointRadius() {
        return pointRadius;
    }

    public void setPointRadius(int pointRadius) {
        this.pointRadius = pointRadius;
    }

    public int getPointRotation() {
        return pointRotation;
    }

    public void setPointRotation(int pointRotation) {
        this.pointRotation = pointRotation;
    }

    public PointStyles getPointStyle() {
        return pointStyle;
    }

    public void setPointStyle(PointStyles pointStyle) {
        this.pointStyle = pointStyle;
    }

    public String getJS() {
        return ""
                + "pointBackgroundColor:" + getPointBackgroundColor()
                + "pointBorderColor:" + getPointBorderColor()
                + "pointBorderWidth:" + getPointBorderWidth()
                + "pointHitRadius:" + getPointHitRadius()
                + "pointRadius:" + getPointRadius()
                + "pointRotation:" + getPointRotation()
                + "pointStyle:" + getPointStyle();
    }
}
