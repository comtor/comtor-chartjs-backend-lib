package net.comtor.chartjs.Options.scales.Cartesian;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.Options.scales.Scale;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LogarithmicScale extends Scale {

    @Override
    public String getType() {
        return LOGARITHMIC_SCALE;
    }
}
