package net.comtor.chartjs.Options.scales.Cartesian;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.ArrayList;
import net.comtor.chartjs.Options.scales.Axes.XAxis;
import net.comtor.chartjs.Options.scales.Axes.YAxis;
import net.comtor.chartjs.Options.scales.Scale;
import net.comtor.chartjs.Options.scales.ticks.LinearTicks;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LinearScale extends Scale implements Serializable {

    private ArrayList<XAxis<LinearTicks>> xAxes = new ArrayList<>();
    private ArrayList<YAxis<LinearTicks>> yAxes = new ArrayList<>();

    public LinearScale() {
    }

    public ArrayList<XAxis<LinearTicks>> getxAxes() {
        return xAxes;
    }

    public void setxAxes(ArrayList<XAxis<LinearTicks>> xAxes) {
        this.xAxes = xAxes;
    }

    public void setxAxes(XAxis<LinearTicks> xAxes) {
        this.xAxes.add(xAxes);
    }

    public ArrayList<YAxis<LinearTicks>> getyAxes() {
        return yAxes;
    }

    public void setyAxes(ArrayList<YAxis<LinearTicks>> yAxes) {
        this.yAxes = yAxes;
    }

    public void setyAxes(YAxis<LinearTicks> yAxes) {
        this.yAxes.add(yAxes);
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
        return LINEAR_SCALE;
    }

}
