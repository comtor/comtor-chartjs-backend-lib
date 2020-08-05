package net.comtor.chartjs.Options;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Animations {

    public static final String FONT_STYLE_BOLD = "bold";
    public static final String FONT_STYLE_NORMAL = "normal";
    public static final String ANIMATION_EASEINOUTQUART = "easeInOutQuart";
    public static final String ANIMATION_LINEAR = "linear";
    public static final String ANIMATION_EASEOUTBOUNCE = "easeOutBounce";
    public static final String ANIMATION_EASEINBACK = "easeInBack";
    public static final String ANIMATION_EASEINOUTQUAD = "easeInOutQuad";
    public static final String ANIMATION_EASEOUTQUART = "easeOutQuart";
    public static final String ANIMATION_EASEOUTQUAD = "easeOutQuad";
    public static final String ANIMATION_EASEINOUTBOUNCE = "easeInOutBounce";
    public static final String ANIMATION_EASEOUTSINE = "easeOutSine";
    public static final String ANIMATION_EASEINOUTCUBIC = "easeInOutCubic";
    public static final String ANIMATION_EASEINEXPO = "easeInExpo";
    public static final String ANIMATION_EASEINOUTBACK = "easeInOutBack";
    public static final String ANIMATION_EASEINCIRC = "easeInCirc";
    public static final String ANIMATION_EASEINOUTELASTIC = "easeInOutElastic";
    public static final String ANIMATION_EASEOUTBACK = "easeOutBack";
    public static final String ANIMATION_EASEINQUAD = "easeInQuad";
    public static final String ANIMATION_EASEINOUTEXPO = "easeInOutExpo";
    public static final String ANIMATION_EASEINQUART = "easeInQuart";
    public static final String ANIMATION_EASEOUTQUINT = "easeOutQuint";
    public static final String ANIMATION_EASEINOUTCIRC = "easeInOutCirc";
    public static final String ANIMATION_EASEINSINE = "easeInSine";
    public static final String ANIMATION_EASEOUTEXPO = "easeOutExpo";
    public static final String ANIMATION_EASEOUTCIRC = "easeOutCirc";
    public static final String ANIMATION_EASEOUTCUBIC = "easeOutCubic";
    public static final String ANIMATION_EASEINQUINT = "easeInQuint";
    public static final String ANIMATION_EASEINELASTIC = "easeInElastic";
    public static final String ANIMATION_EASEINOUTSINE = "easeInOutSine";
    public static final String ANIMATION_EASEINOUTQUINT = "easeInOutQuint";
    public static final String ANIMATION_EASEINBOUNCE = "easeInBounce";
    public static final String ANIMATION_EASEOUTELASTIC = "easeOutElastic";
    public static final String ANIMATION_EASEINCUBIC = "easeInCubic";

    private Integer duration = 1000;
    private String easing = ANIMATION_EASEOUTQUART;
    private String onProgress;
    private String onComplete;

    public Animations() {
    }

    public Animations(String onProgress, String onComplete) {
        this.onProgress = onProgress;
        this.onComplete = onComplete;
    }

    public Animations(Builder builder) {
        this.onProgress = builder.onProgress;
        this.onComplete = builder.onComplete;
    }

    public static class Builder {

        private Integer duration = 1000;
        private String easing = ANIMATION_EASEOUTQUART;
        private String onProgress;
        private String onComplete;

        public Builder() {
        }

        public Builder(String onProgress, String onComplete) {
            this.onProgress = onProgress;
            this.onComplete = onComplete;
        }

        public Builder setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Builder setEasing(String easing) {
            this.easing = easing;
            return this;
        }

        public Builder setOnProgress(String onProgress) {
            this.onProgress = onProgress;
            return this;
        }

        public Builder setOnComplete(String onComplete) {
            this.onComplete = onComplete;
            return this;
        }

        public Animations build() {
            return new Animations(this);
        }

    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEasing() {
        return easing;
    }

    public void setEasing(String easing) {
        this.easing = easing;
    }

    public String getOnProgress() {
        return onProgress;
    }

    public void setOnProgress(String onProgress) {
        this.onProgress = onProgress;
    }

    public String getOnComplete() {
        return onComplete;
    }

    public void setOnComplete(String onComplete) {
        this.onComplete = onComplete;
    }

}
