package net.comtor.chartjs.Options.Plugins.DoughnutLabel;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Label implements Serializable {

    private String text;
    private Font font;
    private String color;

    public Label() {
    }

    public Label(String text) {
        this.text = text;
    }

    public Label(String text, Font font) {
        this.text = text;
        this.font = font;
    }

    public Label(String text, String color) {
        this.text = text;
        this.color = color;
    }

    public Label(String text, Font font, String color) {
        this.text = text;
        this.font = font;
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
