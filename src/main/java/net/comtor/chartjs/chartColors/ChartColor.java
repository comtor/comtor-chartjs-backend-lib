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

    public ChartColor(ChartColor color) {
        this((double) color.getRed() / 255,
                (double) color.getGreen() / 225,
                (double) color.getBlue() / 255,
                color.getAlpha());
    }

    public ChartColor(double r, double g, double b) {
        this(r, g, b, 1.0f);
    }

    public ChartColor(String colorStrHex) {
        this(
                Integer.valueOf(colorStrHex.substring(0, 2), 16) / 255.0,
                Integer.valueOf(colorStrHex.substring(2, 4), 16) / 255.0,
                Integer.valueOf(colorStrHex.substring(4, 6), 16) / 255.0);
    }

    public int getRed() {
        return (int) (r * 255);
    }

    public int getGreen() {
        return (int) (g * 255);
    }

    public int getBlue() {
        return (int) (b * 255);
    }

    public void setAlpha(double a) {
        this.a = a;
    }

    public double getAlpha() {
        return a;
    }

    public String getRBGA() {
        return "rgba("
                + getRed() + ", "
                + getGreen() + ", "
                + getBlue() + ", "
                + getAlpha()
                + ")";
    }
}
