package net.comtor.chartjs.Options.scales;

import net.comtor.chartjs.Options.scales.Cartesian.LinearScale;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author vihlai
 */
@JsonInclude(Include.NON_EMPTY)
public class LinearScales {

    private final List<LinearScale> xAxes = new ArrayList<LinearScale>();

    private final List<LinearScale> yAxes = new ArrayList<LinearScale>();

    public List<LinearScale> getxAxes() {
        return xAxes;
    }

    public LinearScales addxAxis(LinearScale xAxis) {
        this.xAxes.add(xAxis);
        return this;
    }

    public LinearScales setxAxes(List<LinearScale> xAxes) {
        this.xAxes.clear();
        if (xAxes != null) {
            this.xAxes.addAll(xAxes);
        }
        return this;
    }

    public List<LinearScale> getyAxes() {
        return yAxes;
    }

    public LinearScales addyAxis(LinearScale yAxis) {
        this.yAxes.add(yAxis);
        return this;
    }

    public LinearScales setyAxes(List<LinearScale> yAxes) {
        this.yAxes.clear();
        if (yAxes != null) {
            this.yAxes.addAll(yAxes);
        }
        return this;
    }

}
