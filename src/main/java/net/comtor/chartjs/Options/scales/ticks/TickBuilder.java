package net.comtor.chartjs.Options.scales.ticks;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TickBuilder {

    public final static String CATEGORY_TICKS = "category_ticks";
    public final static String LINEAR_TICKS = "linear_ticks";
    public final static String RADIAL_LINEAR_TICKS = "radial_ticks";

    private Ticks tick;

    public TickBuilder(Ticks tick) {
        this.tick = tick;
    }

    public TickBuilder(String type) {
        switch (type) {
            case CATEGORY_TICKS:
                tick = new CategoryTicks();
            case LINEAR_TICKS:
                tick = new LinearTicks();
            case RADIAL_LINEAR_TICKS:
                tick = new RadialLinearTicks();
        }
    }

    public TickBuilder setMinMaxTicks(String min, String max) {
        if (!(tick instanceof CategoryTicks)) {
            throw new IllegalArgumentException("This tick not have this option");
        }
        castToCategoryTick().setMax(max);
        castToCategoryTick().setMin(min);
        return this;
    }

    public TickBuilder setMinMaxTick(Double min, Double max) {
        if (tick instanceof LinearTicks) {
            castToLinearTick().setMin(min);
            castToLinearTick().setMax(max);
        } else if (tick instanceof RadialLinearTicks) {
            castToRadialLinearThick().setMin(min);
            castToRadialLinearThick().setMax(max);
        } else {
            throw new IllegalArgumentException("This tick not have this option");
        }
        return this;
    }

    public TickBuilder isBeginAtZero(boolean beginAtZero) {
        if (tick instanceof LinearTicks) {
            castToLinearTick().setBeginAtZero(beginAtZero);
        } else if (tick instanceof RadialLinearTicks) {
            castToRadialLinearThick().setBeginAtZero(beginAtZero);
        } else {
            throw new IllegalArgumentException("These thicks not have this option");
        }
        return this;
    }

    public TickBuilder setStepSize(Double stepSize) {
        if (tick instanceof LinearTicks) {
            castToLinearTick().setStepSize(stepSize);
        } else if (tick instanceof RadialLinearTicks) {
            castToRadialLinearThick().setStepSize(stepSize);
        } else {
            throw new IllegalArgumentException("This scale not have this option");
        }
        return this;
    }

    public Ticks build() {
        return tick;
    }

    private LinearTicks castToLinearTick() {
        return LinearTicks.class.cast(this.tick);
    }

    private CategoryTicks castToCategoryTick() {
        return CategoryTicks.class.cast(this.tick);
    }

    private RadialLinearTicks castToRadialLinearThick() {
        return RadialLinearTicks.class.cast(this.tick);
    }

}
