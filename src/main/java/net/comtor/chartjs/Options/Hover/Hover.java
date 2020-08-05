package net.comtor.chartjs.Options.Hover;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Hover {

    private final static String HOVER_SINGLE = "single";
    private final static String HOVER_LABEL = "label";
    private final static String HOVER_X_AXIS = "x-axis";
    private final static String HOVER_DATASET = "dataset";

    private String mode;
    private Integer animationDuration;
    private String onHover;

    public Hover() {
    }

    public Hover(String mode, Integer animationDuration, String onHover) {
        this.mode = mode;
        this.animationDuration = animationDuration;
        this.onHover = onHover;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
    }

    public String getOnHover() {
        return onHover;
    }

    public void setOnHover(String onHover) {
        this.onHover = onHover;
    }

}
