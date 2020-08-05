package net.comtor.chartjs.Options.scales.ticks;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CategoryTicks extends Ticks {

    private ArrayList<String> labels;
    private String min;
    private String max;

    public CategoryTicks() {
    }

    public CategoryTicks(ArrayList<String> labels, String min, String max) {
        this.labels = labels;
        this.min = min;
        this.max = max;
    }

    public CategoryTicks(String min, String max) {
        this.min = min;
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public ArrayList<String> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }

}
