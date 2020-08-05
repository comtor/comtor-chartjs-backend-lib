package net.comtor.chartjs.Options.scales.Radial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.ArrayList;
import net.comtor.chartjs.Options.scales.AngleLines;
import net.comtor.chartjs.Options.scales.Axes.XAxis;
import net.comtor.chartjs.Options.scales.Axes.YAxis;
import net.comtor.chartjs.Options.scales.PointLabels;
import net.comtor.chartjs.Options.scales.Scale;
import net.comtor.chartjs.Options.scales.ticks.RadialLinearTicks;
import net.comtor.chartjs.Options.scales.ticks.Ticks;

/**
 *
 * @author vihlai
 */
@JsonInclude(Include.NON_EMPTY)
public class RadialLinearScale extends Scale implements Serializable {

    private Boolean lineArc;
    private AngleLines angleLines;
    private PointLabels pointLabels;
    private RadialLinearTicks ticks;

    private ArrayList<XAxis<RadialLinearTicks>> xAxes;
    private ArrayList<YAxis<RadialLinearTicks>> yAxes;

    public RadialLinearScale() {
    }

    public Boolean getLineArc() {
        return lineArc;
    }

    public void setLineArc(Boolean lineArc) {
        this.lineArc = lineArc;
    }

    public AngleLines getAngleLines() {
        return angleLines;
    }

    public void setAngleLines(AngleLines angleLines) {
        this.angleLines = angleLines;
    }

    public PointLabels getPointLabels() {
        return pointLabels;
    }

    public void setPointLabels(PointLabels pointLabels) {
        this.pointLabels = pointLabels;
    }

    public RadialLinearTicks getTicks() {
        return ticks;
    }

    public void setTicks(RadialLinearTicks ticks) {
        this.ticks = ticks;
    }

    public ArrayList<XAxis<RadialLinearTicks>> getxAxes() {
        return xAxes;
    }

    public void setxAxes(ArrayList<XAxis<RadialLinearTicks>> xAxes) {
        this.xAxes = xAxes;
    }

    public ArrayList<YAxis<RadialLinearTicks>> getyAxes() {
        return yAxes;
    }

    public void setyAxes(ArrayList<YAxis<RadialLinearTicks>> yAxes) {
        this.yAxes = yAxes;
    }
    
     public XAxis extractLastXAxis() {
        return xAxes.get(xAxes.size() - 1);
    }

    public void appendXAxe(XAxis xAxe) {
        xAxes.add(xAxe);
    }

    public void addlastXAxis(XAxis xAxe) {
        xAxes.set(xAxes.size() == 0 ? 0 : xAxes.size() - 1, xAxe);
    }

    public YAxis extractLastYAxis() {
        return yAxes.get(yAxes.size() - 1);
    }

    public void appendYAxe(YAxis yAxe) {
        yAxes.add(yAxe);
    }

    public void addlastYAxis(YAxis yAxe) {
        yAxes.set(yAxes.size() == 0 ? 0 : yAxes.size() - 1, yAxe);
    }

    @Override
    public String getType() {
        return RADIAL_SCALE;
    }

}
