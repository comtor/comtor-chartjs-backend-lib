package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AngleLines {

    private Boolean display;
    private String color;
    private Integer lineWidth;

    public AngleLines() {
    }

    public AngleLines(Boolean display, String color, Integer lineWidth) {
        this.display = display;
        this.color = color;
        this.lineWidth = lineWidth;
    }

    public Boolean getDisplay() {
        return this.display;
    }

    public AngleLines setDisplay(Boolean display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public AngleLines setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getLineWidth() {
        return this.lineWidth;
    }

    public AngleLines setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }
}
