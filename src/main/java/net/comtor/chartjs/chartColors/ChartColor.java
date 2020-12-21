package net.comtor.chartjs.chartColors;

/**
 *
 * @author ericson
 */
public class ChartColor {

    private double r;
    private double g;
    private double b;
    private double a;

    public ChartColor(double r, double g, double b, double a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public ChartColor(double r, double g, double b) {
        this(r, g, b, 1);
    }

    public ChartColor(String hexColor) {
        hexColor = hexColor.replace("#", "");
        r = Integer.valueOf(hexColor.substring(0, 2), 16);
        g = Integer.valueOf(hexColor.substring(2, 4), 16);
        b = Integer.valueOf(hexColor.substring(4, 6), 16);
        a = 1;
    }

    public int getRed() {
        return (int) r;
    }

    public int getGreen() {
        return (int) g;
    }

    public int getBlue() {
        return (int) b;
    }

    public void setAlpha(double a) {
        this.a = a;
    }

    public double getAlpha() {
        return a;
    }

    public String getRBGA() {
        return "rgba(" + getRed() + ", " + getGreen() + ", " + getBlue() + ", " + getAlpha() + ")";
    }

}
