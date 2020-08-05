package net.comtor.chartjs.Options;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import net.comtor.chartjs.Options.Hover.Hover;
import net.comtor.chartjs.Options.Legend.Legend;
import net.comtor.chartjs.Options.Tooltip.Tooltip;
import net.comtor.chartjs.Options.layout.Layout;
import net.comtor.chartjs.Options.scales.Scale;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Options implements Serializable{

    private static final long serialVersionUID = 3520808807976923216L;
    // Required parameters
    private Title title;
    private Tooltip tooltips;
    private Legend legend;
    private boolean responsive = true;
    private Scale scales;
    // Optional parameters
    private Animations animation;
    private Integer responsiveAnimationDuration;
    private boolean maIntegerainAspectRatio;
    private Integer aspectRatio;
    private Boolean maintainAspectRatio;
    private String onResize;
    private String onClick;
    private Hover hover;
    private Layout layout;
    private Object plugins;
    private String legendCallback;

    public Options() {
    }

    public Options(Title title) {
        this.title = title;
    }

    public Options(Title title, Tooltip tooltip) {
        this.title = title;
        this.tooltips = tooltip;
    }

    public Options(Title title, Tooltip tooltip, boolean responsive) {
        this(title, tooltip);
        this.responsive = responsive;
    }

    public Options(Title title, Tooltip tooltips, Legend legend) {
        this.title = title;
        this.tooltips = tooltips;
        this.legend = legend;
    }

    public Options(Builder builder) {
        this.title = builder.title;
        this.tooltips = builder.tooltips;
        this.responsive = builder.responsive;
    }

    public static class Builder {

        // Required parameters
        private Title title;
        private Tooltip tooltips;
        private Legend legend;
        private boolean responsive = true;
        private Scale scales;
        // Optional parameters
        private Animations animation;
        private Integer responsiveAnimationDuration;
        private boolean maIntegerainAspectRatio;
        private Integer aspectRatio;
        private Boolean maintainAspectRatio;
        private String onResize;
        private String onClick;
        private Hover hover;
        private Layout layout;
        private Object plugins;
        private String legendCallback;

        public Builder() {
        }

        public Builder(Title title, Tooltip tooltip) {
            this.title = title;
            this.tooltips = tooltip;
        }

        public Builder(Title title, Tooltip tooltip, boolean responsive) {
            this(title, tooltip);
            this.responsive = responsive;
        }

        public Builder(Title title, Tooltip tooltips, Legend legend) {
            this.title = title;
            this.tooltips = tooltips;
            this.legend = legend;
        }

        public Builder setTitle(String title) {            
            this.title = new Title(title);
            return this;
        }

        public Builder isEnableTooltip(boolean enable) {
            this.tooltips = new Tooltip();
            tooltips.setEnabled(enable);
            return this;
        }

        public Builder isResponsive(boolean responsive) {
            this.responsive = responsive;
            return this;
        }

        public void setHover(Hover hover) {
            this.hover = hover;
        }

        public Builder setScale(Scale scale) {
            this.scales = scale;
            return this;
        }

        public Options build() {
            return new Options(this);
        }

    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Tooltip getTooltips() {
        return tooltips;
    }

    public void setTooltips(Tooltip tooltips) {
        this.tooltips = tooltips;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public boolean isResponsive() {
        return responsive;
    }

    public void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

    public Scale getScales() {
        return scales;
    }

    public void setScales(Scale scales) {
        this.scales = scales;
    }

    public Animations getAnimation() {
        return animation;
    }

    public void setAnimation(Animations animation) {
        this.animation = animation;
    }

    public Integer getResponsiveAnimationDuration() {
        return responsiveAnimationDuration;
    }

    public void setResponsiveAnimationDuration(Integer responsiveAnimationDuration) {
        this.responsiveAnimationDuration = responsiveAnimationDuration;
    }

    public boolean isMaIntegerainAspectRatio() {
        return maIntegerainAspectRatio;
    }

    public void setMaIntegerainAspectRatio(boolean maIntegerainAspectRatio) {
        this.maIntegerainAspectRatio = maIntegerainAspectRatio;
    }

    public Integer getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    public String getOnResize() {
        return onResize;
    }

    public void setOnResize(String onResize) {
        this.onResize = onResize;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public Hover getHover() {
        return hover;
    }

    public void setHover(Hover hover) {
        this.hover = hover;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Object getPlugins() {
        return plugins;
    }

    public void setPlugins(Object plugins) {
        this.plugins = plugins;
    }

    public String getLegendCallback() {
        return legendCallback;
    }

    public void setLegendCallback(String legendCallback) {
        this.legendCallback = legendCallback;
    }

}
