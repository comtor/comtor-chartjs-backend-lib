package net.comtor.chartjs.chart.Mixed;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import net.comtor.chartjs.ChartJs;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MixedChart {

    private List<ChartJs> chartList;

}
