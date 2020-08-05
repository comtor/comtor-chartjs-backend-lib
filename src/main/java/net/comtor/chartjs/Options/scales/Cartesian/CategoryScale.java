package net.comtor.chartjs.Options.scales.Cartesian;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.ArrayList;
import net.comtor.chartjs.Options.scales.Axes.XAxis;
import net.comtor.chartjs.Options.scales.Axes.YAxis;
import net.comtor.chartjs.Options.scales.Scale;
import net.comtor.chartjs.Options.scales.ticks.CategoryTicks;

@JsonInclude(Include.NON_EMPTY)
public class CategoryScale extends Scale {

    private ArrayList<XAxis<CategoryTicks>> xAxes;
    private ArrayList<YAxis<CategoryTicks>> yAxes;

    public CategoryScale() {
    }

    public CategoryScale(ArrayList<XAxis<CategoryTicks>> xAxes, ArrayList<YAxis<CategoryTicks>> yAxes) {
        this.xAxes = xAxes;
        this.yAxes = yAxes;
    }

    public ArrayList<XAxis<CategoryTicks>> getxAxes() {
        return xAxes;
    }

    public void setxAxes(ArrayList<XAxis<CategoryTicks>> xAxes) {
        this.xAxes = xAxes;
    }

    public ArrayList<YAxis<CategoryTicks>> getyAxes() {
        return yAxes;
    }

    public void setyAxes(ArrayList<YAxis<CategoryTicks>> yAxes) {
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
        return CATEGORY_SCALE;
    }

}
