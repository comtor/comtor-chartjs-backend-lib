package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DataType2 {

    /*r: raw radius in pixels*/
    private Double x;
    private Double y;
    private Double r;
    private String label;

    public DataType2() {
    }

    public DataType2(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public DataType2(Double x, Double y, Double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public DataType2(Double x, Double y, Double r, String label) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.label = label;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
