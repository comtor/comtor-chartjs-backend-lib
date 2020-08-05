package net.comtor.chartjs.Options.scales.Axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.comtor.chartjs.Options.scales.ticks.Ticks;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class YAxis<T extends Ticks> extends Axis {

    private T ticks;

    public YAxis() {
    }

    public YAxis(T ticks) {
        this.ticks = ticks;
    }

    public T getTicks() {
        return ticks;
    }

    public void setTicks(T ticks) {
        this.ticks = ticks;
    }

}
