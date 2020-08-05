package net.comtor.chartjs.Options.Legend;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Legend {

    public static final String POSITION_TOP = "top";
    public static final String POSITION_LEFT = "left";
    public static final String POSITION_BOTTOM = "bottom";
    public static final String POSITION_RIGHT = "right";

    public static final String ALIGN_START = "start";
    public static final String ALIGN_CENTER = "center";
    public static final String ALIGN_END = "end";

    // Required parameters
    private boolean display;
    // Optional parameters
    private String position = POSITION_TOP;
    private String align = ALIGN_CENTER;
    private boolean fullWidth;
    private String onClick;
    private String onHover;
    private String onLeave;
    private LegendLabel labels;
    private boolean reverse;
    private boolean rtl;

    public Legend() {
    }

    public Legend(boolean display) {
        this.display = display;
    }

    public Legend(boolean display, String onClick, String onHover, String onLeave, LegendLabel labels, boolean rtl) {
        this.display = display;
        this.onClick = onClick;
        this.onHover = onHover;
        this.onLeave = onLeave;
        this.labels = labels;
        this.rtl = rtl;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public boolean isFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public String getOnHover() {
        return onHover;
    }

    public void setOnHover(String onHover) {
        this.onHover = onHover;
    }

    public String getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(String onLeave) {
        this.onLeave = onLeave;
    }

    public LegendLabel getLabels() {
        return labels;
    }

    public void setLabels(LegendLabel labels) {
        this.labels = labels;
    }

    public boolean isRtl() {
        return rtl;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }

}
