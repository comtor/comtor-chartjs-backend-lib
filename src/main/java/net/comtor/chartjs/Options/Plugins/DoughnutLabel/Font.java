package net.comtor.chartjs.Options.Plugins.DoughnutLabel;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Font implements Serializable {

    private double size = 50;
    private String family;

    public Font() {
    }

    public Font(double size) {
        this.size = size;
    }

    public Font(String family) {
        this.family = family;
    }
    public Font(String family, double size) {
        this.size=size;
        this.family = family;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

}
