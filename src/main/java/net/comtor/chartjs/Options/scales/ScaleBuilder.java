package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import net.comtor.chartjs.Options.scales.Axes.XAxis;
import net.comtor.chartjs.Options.scales.Axes.YAxis;
import net.comtor.chartjs.Options.scales.Radial.RadialLinearScale;
import net.comtor.chartjs.Options.scales.Cartesian.LinearScale;
import net.comtor.chartjs.Options.scales.Cartesian.CategoryScale;
import net.comtor.chartjs.Options.scales.ticks.CategoryTicks;
import net.comtor.chartjs.Options.scales.ticks.LinearTicks;
import net.comtor.chartjs.Options.scales.ticks.RadialLinearTicks;
import net.comtor.chartjs.Options.scales.ticks.TickBuilder;
import net.comtor.chartjs.Options.scales.ticks.Ticks;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ScaleBuilder {

    private Scale scale;
    private GridLines lines;
    private ScaleLabel scaleLabel;
    private XAxis xAxe;
    private YAxis yAxe;

    public ScaleBuilder(Scale scale) {
        this.scale = scale;
        assignAxis();
    }

    public ScaleBuilder(String type) {
        lines = new GridLines();
        scaleLabel = new ScaleLabel();
        switch (type) {
            case Scale.CATEGORY_SCALE:
                scale = new CategoryScale();
                xAxe = new XAxis<CategoryTicks>();
                yAxe = new YAxis<CategoryTicks>();
                castToCategoryScale().appendXAxe(xAxe);
                castToCategoryScale().appendYAxe(yAxe);
                break;
            case Scale.LINEAR_SCALE:
                scale = new LinearScale();
                xAxe = new XAxis<LinearTicks>();
                yAxe = new YAxis<LinearTicks>();
                castToLinearScale().appendXAxe(xAxe);
                castToLinearScale().appendYAxe(yAxe);
                break;
            case Scale.RADIAL_SCALE:
                scale = new RadialLinearScale();
                xAxe = new XAxis<RadialLinearTicks>();
                yAxe = new YAxis<RadialLinearTicks>();
                castToRadialScale().appendXAxe(xAxe);
                castToRadialScale().appendYAxe(yAxe);
                break;
        }
    }

    private void assignAxis() {
        if (scale instanceof LinearScale) {
            xAxe = castToLinearScale().extractLastXAxis();
            yAxe = castToLinearScale().extractLastYAxis();
        }
        if (scale instanceof CategoryScale) {
            xAxe = castToCategoryScale().extractLastXAxis();
            yAxe = castToCategoryScale().extractLastYAxis();
        }
        if (scale instanceof RadialLinearScale) {
            xAxe = castToRadialScale().extractLastXAxis();
            yAxe = castToRadialScale().extractLastYAxis();
        }
    }

    public ScaleBuilder isDisplayGridLines() {
        lines.setDisplay(true);
        return this;
    }

    public ScaleBuilder isDisplayScaleLabel() {
        scaleLabel.setDisplay(true);
        return this;
    }

    public ScaleBuilder AddXAxe() {
        xAxe = new XAxis();
        AddXAxeToScale();
        return this;
    }

    private void AddXAxeToScale() {
        if (scale instanceof LinearScale) {
            castToLinearScale().appendXAxe(xAxe);
        }
        if (scale instanceof CategoryScale) {
            castToCategoryScale().appendXAxe(xAxe);
        }
        if (scale instanceof RadialLinearScale) {
            castToRadialScale().appendXAxe(xAxe);
        }
    }

    public ScaleBuilder AddYAxe() {
        yAxe = new YAxis();
        AddYAxeToScale();
        return this;
    }

    private void AddYAxeToScale() {
        if (scale instanceof LinearScale) {
            castToLinearScale().appendYAxe(yAxe);
        }
        if (scale instanceof CategoryScale) {
            castToCategoryScale().appendYAxe(yAxe);
        }
        if (scale instanceof RadialLinearScale) {
            castToRadialScale().appendYAxe(yAxe);
        }
    }

    public ScaleBuilder isStackedBarXAxe() {
        xAxe.setStacked(true);
        return this;
    }

    public ScaleBuilder isStackedBarYAxe() {
        yAxe.setStacked(true);
        return this;
    }

    public ScaleBuilder setMinMaxTicksXAxis(String min, String max) {
        Ticks ticks = new TickBuilder(hasTicksxAxe()).setMinMaxTicks(min, max).build();
        xAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder setMinMaxTicksYAxis(String min, String max) {
        Ticks ticks = new TickBuilder(hasTicksyAxe()).setMinMaxTicks(min, max).build();
        yAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder setMinMaxTicksXAxis(Double min, Double max) {
        Ticks ticks = new TickBuilder(hasTicksxAxe()).setMinMaxTick(min, max).build();
        xAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder setMinMaxTicksYAxis(Double min, Double max) {
        Ticks ticks = new TickBuilder(hasTicksyAxe()).setMinMaxTick(min, max).build();
        yAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder isBeginAtZeroXAxis(boolean bZero) {
        Ticks ticks = new TickBuilder(hasTicksxAxe()).isBeginAtZero(bZero).build();
        xAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder isBeginAtZeroYAxis(boolean bZero) {
        Ticks ticks = new TickBuilder(hasTicksyAxe()).isBeginAtZero(bZero).build();
        yAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder setStepSizeXAxis(Double stepSize) {
        Ticks ticks = new TickBuilder(hasTicksxAxe()).setStepSize(stepSize).build();
        xAxe.setTicks(ticks);
        return this;
    }

    public ScaleBuilder setStepSizeYAxis(Double stepSize) {
        Ticks ticks = new TickBuilder(hasTicksyAxe()).setStepSize(stepSize).build();
        yAxe.setTicks(ticks);
        return this;
    }

    private void setxAxisToScale() {
        if (scale instanceof LinearScale) {
            castToLinearScale().addlastXAxis(xAxe);
            castToLinearScale().addlastYAxis(yAxe);
        }
        if (scale instanceof CategoryScale) {
            castToCategoryScale().addlastXAxis(xAxe);
            castToCategoryScale().addlastYAxis(yAxe);
        }
        if (scale instanceof RadialLinearScale) {
            castToRadialScale().addlastXAxis(xAxe);
            castToRadialScale().addlastYAxis(yAxe);
        }
    }

    public Scale build() {
        setxAxisToScale();
        return this.scale;
    }

    private Ticks hasTicksxAxe() {
        if (scale instanceof LinearScale) {
            if (castToLinearScale().extractLastXAxis().getTicks() != null) {
                return castToLinearScale().extractLastXAxis().getTicks();
            } else {
                return new LinearTicks();
            }
        } else if (scale instanceof RadialLinearScale) {
            if (castToRadialScale().extractLastXAxis().getTicks() != null) {
                return castToRadialScale().extractLastXAxis().getTicks();
            } else {
                return new RadialLinearTicks();
            }
        } else if (scale instanceof CategoryScale) {
            if (castToCategoryScale().extractLastXAxis().getTicks() != null) {
                return castToCategoryScale().extractLastXAxis().getTicks();
            } else {
                return new CategoryTicks();
            }
        }
        return null;
    }

    private Ticks hasTicksyAxe() {
        if (scale instanceof LinearScale) {
            if (castToLinearScale().extractLastYAxis().getTicks() != null) {
                return castToLinearScale().extractLastYAxis().getTicks();
            } else {
                return new LinearTicks();
            }
        } else if (scale instanceof RadialLinearScale) {
            if (castToRadialScale().extractLastYAxis().getTicks() != null) {
                return castToRadialScale().extractLastYAxis().getTicks();
            } else {
                return new RadialLinearTicks();
            }
        } else if (scale instanceof CategoryScale) {
            if (castToCategoryScale().extractLastYAxis().getTicks() != null) {
                return castToCategoryScale().extractLastYAxis().getTicks();
            } else {
                return new CategoryTicks();
            }
        }
        return null;
    }

    private LinearScale castToLinearScale() {
        return LinearScale.class.cast(scale);
    }

    private CategoryScale castToCategoryScale() {
        return CategoryScale.class.cast(scale);
    }

    private RadialLinearScale castToRadialScale() {
        return RadialLinearScale.class.cast(scale);
    }

}
