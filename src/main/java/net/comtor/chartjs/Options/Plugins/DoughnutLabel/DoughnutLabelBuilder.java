package net.comtor.chartjs.Options.Plugins.DoughnutLabel;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DoughnutLabelBuilder implements Serializable {

    private ArrayList<Label> labels;

    public DoughnutLabelBuilder() {
        labels = new ArrayList<>();
    }

    public DoughnutLabelBuilder addLabel(String text) {
        labels.add(new Label(text));
        return this;
    }

    public DoughnutLabelBuilder addLabel(String text, double size) {
        labels.add(new Label(text, new Font(size)));
        return this;
    }

    public DoughnutLabelBuilder addLabel(String text, String color) {
        labels.add(new Label(text, color));
        return this;
    }

    public DoughnutLabelBuilder addLabel(String text, String color, double size) {
        labels.add(new Label(text, new Font(size), color));
        return this;
    }

    public DoughnutLabelBuilder addLabel(String text, String color, String familyfont) {
        labels.add(new Label(text, new Font(familyfont), color));
        return this;
    }

    public DoughnutLabelBuilder addLabel(String text, String color, String familyfont, double size) {
        labels.add(new Label(text, new Font(familyfont, size), color));
        return this;
    }

    public ArrayList<Label> build() {
        return this.labels;
    }

}
