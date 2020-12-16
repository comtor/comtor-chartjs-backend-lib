package net.comtor.chartjs.Options.Plugins;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import net.comtor.chartjs.Options.Plugins.DoughnutLabel.DoughnutLabel;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Plugin implements Serializable {

    private DoughnutLabel doughnutlabel;

    public Plugin() {
    }

    public Plugin(DoughnutLabel doughnutlabel) {
        this.doughnutlabel = doughnutlabel;
    }

    public DoughnutLabel getDoughnutlabel() {
        return doughnutlabel;
    }

    public void setDoughnutlabel(DoughnutLabel doughnutlabel) {
        this.doughnutlabel = doughnutlabel;
    }

}
