package net.comtor.chartjs.chart;

import java.util.ArrayList;
import java.util.Arrays;
import net.comtor.chartjs.AbstractDataset;
import net.comtor.chartjs.ChartJs;
import net.comtor.chartjs.ComtorOptions.ComtorOptions;
import net.comtor.chartjs.ComtorOptions.LabelsFormat.LabelsFormat;
import net.comtor.chartjs.DataType2;
import net.comtor.chartjs.Options.Legend.Legend;
import net.comtor.chartjs.Options.Options;
import net.comtor.chartjs.Options.Plugins.DoughnutLabel.DoughnutLabel;
import net.comtor.chartjs.Options.Plugins.DoughnutLabel.Label;
import net.comtor.chartjs.Options.Plugins.Plugin;
import net.comtor.chartjs.Options.Title;
import net.comtor.chartjs.Options.Tooltip.Tooltip;
import net.comtor.chartjs.Options.Tooltip.TooltipCallback;
import net.comtor.chartjs.Options.scales.Cartesian.LinearScale;
import net.comtor.chartjs.Options.scales.Scale;
import net.comtor.chartjs.Options.scales.ScaleBuilder;
import net.comtor.chartjs.chart.BarChart.BarChart;
import net.comtor.chartjs.chart.BarChart.BarChartDataset;
import net.comtor.chartjs.chart.BubbleChart.BubbleChart;
import net.comtor.chartjs.chart.BubbleChart.BubbleChartDataset;
import net.comtor.chartjs.chart.DoughnutChart.DoughnutChart;
import net.comtor.chartjs.chart.DoughnutChart.DoughnutChartDataset;
import net.comtor.chartjs.chart.LineChart.LineChart;
import net.comtor.chartjs.chart.LineChart.LineChartDataset;
import net.comtor.chartjs.chart.PieChart.PieChart;
import net.comtor.chartjs.chart.PieChart.PieChartDataset;
import net.comtor.chartjs.chart.PolarAreaChart.PolarAreaChart;
import net.comtor.chartjs.chart.PolarAreaChart.PolarAreaDataset;
import net.comtor.chartjs.chart.RadarChart.RadarChart;
import net.comtor.chartjs.chart.RadarChart.RadarChartDataset;
import net.comtor.chartjs.chart.ScatterChart.ScatterChart;
import net.comtor.chartjs.chart.ScatterChart.ScatterChartDataset;

/**
 *
 * @author vihlai
 */
public class ChartJsBuilder {

    private ChartJs chart;
    private Options options;
    private ComtorOptions comtorOptions;
    private Data data;
    private ArrayList datasets;

    public ChartJsBuilder() {
    }

    public ChartJsBuilder(String type) {
        options = new Options();
        data = new Data();
        datasets = new ArrayList();
        switch (type) {
            case ChartJs.TYPE_BAR:
                chart = new BarChart();
                break;
            case ChartJs.TYPE_BUBBLE:
                chart = new BubbleChart();
                break;
            case ChartJs.TYPE_DOUGHNUT:
                chart = new DoughnutChart();
                break;
            case ChartJs.TYPE_LINE:
                chart = new LineChart();
                break;
            case ChartJs.TYPE_PIE:
                chart = new PieChart();
                break;
            case ChartJs.TYPE_POLAR_AREA:
                chart = new PolarAreaChart();
                break;
            case ChartJs.TYPE_RADAR:
                chart = new RadarChart();
                break;
            case ChartJs.TYPE_SCATTER:
                chart = new ScatterChart();
                break;
        }
    }

    //Options
    public ChartJsBuilder addOptions(Options options) {
        chart.setOptions(options);
        return this;
    }

    public ChartJsBuilder addTitle(String title) {
        Title titleOptions = new Title(title);
        options.setTitle(titleOptions);
        return this;
    }

    public ChartJsBuilder addCenterText(String text) {
        options.setCentertext(text);
        return this;
    }

    public ChartJsBuilder addTextLabelDoughnut(String... labels) {
        if (chart.getType().equals(ChartJs.TYPE_DOUGHNUT)) {
            ArrayList<String> labelStringArray = new ArrayList(Arrays.asList(labels));
            ArrayList<Label> labelArray = new ArrayList<>();
            for (String label : labelStringArray) {
                labelArray.add(new Label(label));
            }

            options.setPlugins(new Plugin(new DoughnutLabel(labelArray)));
        } else {
            throw new IllegalArgumentException("The type of chart should be doughnut");
        }

        return this;
    }

    public ChartJsBuilder setCurrencyLabelsFormat(String currency) {
        if (this.comtorOptions == null) {
            this.comtorOptions = new ComtorOptions();
        }
        LabelsFormat labelsFormat = this.comtorOptions.getLabelsFormat();
        if (labelsFormat == null) {
            labelsFormat = new LabelsFormat();
        }

        labelsFormat.setCurrencySymbol(currency);

        this.comtorOptions.setLabelsFormat(labelsFormat);

        return this;
    }

    public ChartJsBuilder setPercentageLabelsFormat() {
        if (this.comtorOptions == null) {
            this.comtorOptions = new ComtorOptions();
        }
        LabelsFormat labelsFormat = this.comtorOptions.getLabelsFormat();
        if (labelsFormat == null) {
            labelsFormat = new LabelsFormat();
        }

        labelsFormat.setAsPercentageFormat();

        this.comtorOptions.setLabelsFormat(labelsFormat);

        return this;
    }

    public ChartJsBuilder setNumberLabelsFormat() {
        if (this.comtorOptions == null) {
            this.comtorOptions = new ComtorOptions();
        }
        LabelsFormat labelsFormat = this.comtorOptions.getLabelsFormat();
        if (labelsFormat == null) {
            labelsFormat = new LabelsFormat();
        }

        labelsFormat.setAsNumberFormat();

        this.comtorOptions.setLabelsFormat(labelsFormat);

        return this;
    }

    public ChartJsBuilder addLabelsDoughnut(Label... labels) {
        ArrayList<Label> labelsArray = new ArrayList(Arrays.asList(labels));
        return addLabelsDoughnut(labelsArray);
    }

    public ChartJsBuilder addLabelsDoughnut(ArrayList<Label> label) {
        if (chart.getType().equals(ChartJs.TYPE_DOUGHNUT)) {

            options.setPlugins(new Plugin(new DoughnutLabel(label)));
        } else {
            throw new IllegalArgumentException("The type of chart should be doughnut");
        }

        return this;
    }

    public ChartJsBuilder showLegend(boolean legend) {
        Legend legendOptions = new Legend(legend);
        options.setLegend(legendOptions);
        return this;
    }

    public ChartJsBuilder setResponsive(boolean responsive) {
        options.setResponsive(responsive);
        return this;
    }

    public ChartJsBuilder setLabels(ArrayList<String> labels) {
        data.setLabels(labels);
        return this;
    }

    public ChartJsBuilder setLabels(String... labels) {
        ArrayList<String> label = new ArrayList(Arrays.asList(labels));
        setLabels(label);
        return this;
    }

    public ChartJsBuilder setData(ArrayList data) {
        isValidData(data);
        setDataToChart(data);
        return this;
    }

    public ChartJsBuilder setData(Number... data) {
        ArrayList<Double> dataArray = new ArrayList<>();
        for (Number number : data) {
            dataArray.add(number.doubleValue());
        }
        setData(dataArray);
        return this;
    }

    public ChartJsBuilder setBackgroundColor(ArrayList<String> color) {
        for (int i = 0; i < datasets.size(); i++) {
            AbstractDataset dataset = (AbstractDataset) datasets.get(i);
            if (dataset.getBackgroundColor() == null) {
                dataset.setBackgroundColor(color);
            }
        }
        return this;
    }

    public ChartJsBuilder setBackgroundColor(String... color) {
        ArrayList<String> colorDataset = new ArrayList(Arrays.asList(color));
        setBackgroundColor(colorDataset);
        return this;
    }

    public ChartJsBuilder setBorderColor(ArrayList<String> color) {
        for (int i = 0; i < datasets.size(); i++) {
            AbstractDataset dataset = (AbstractDataset) datasets.get(i);
            if (dataset.getBorderColor() == null) {
                dataset.setBorderColor(color);
            }
        }
        return this;
    }

    public ChartJsBuilder setBorderColor(String... color) {
        ArrayList<String> bordercolorDataset = new ArrayList(Arrays.asList(color));
        setBorderColor(bordercolorDataset);
        return this;
    }

    public ChartJsBuilder setBorderWidth(Integer border) {
        for (int i = 0; i < datasets.size(); i++) {
            AbstractDataset dataset = (AbstractDataset) datasets.get(i);
            if (dataset.getBorderColor() == null) {
                dataset.setBorderWidth(border);
            }
        }
        return this;
    }

    public ChartJsBuilder setLabel(String label) {
        for (int i = 0; i < datasets.size(); i++) {
            AbstractDataset dataset = (AbstractDataset) datasets.get(i);
            if (dataset.getLabel() == null) {
                dataset.setLabel(label);
            }
        }
        return this;
    }

    //Scales
    public ChartJsBuilder areCategoryScale() {
        areCartesianAxes();
        options.setScales(new ScaleBuilder(Scale.CATEGORY_SCALE).build());
        return this;
    }

    public ChartJsBuilder areLinearScale(String xLabel, String yLabel) {
        areCartesianAxes();
        options.setScales(new ScaleBuilder(Scale.LINEAR_SCALE).setLabelString(xLabel, yLabel).build());
        return this;
    }

    public ChartJsBuilder areLogarithmicScale() {
        areCartesianAxes();
        options.setScales(new ScaleBuilder(Scale.LOGARITHMIC_SCALE).build());
        return this;
    }

    public ChartJsBuilder areTimeScale() {
        areCartesianAxes();
        options.setScales(new ScaleBuilder(Scale.TIME_SCALE).build());
        return this;
    }

    //Axes
    public ChartJsBuilder areRadialAxes() {
        if (chart.getType().equals(ChartJs.TYPE_RADAR) || chart.getType().equals(ChartJs.TYPE_POLAR_AREA)) {
            options.setScales(new ScaleBuilder(Scale.RADIAL_SCALE).build());
        } else {
            throw new IllegalArgumentException("The type of chart should be polar area or radar");
        }
        return this;
    }

    private void areCartesianAxes() {
        if ((chart.getType().equals(ChartJs.TYPE_RADAR) || chart.getType().equals(ChartJs.TYPE_POLAR_AREA))) {
            throw new IllegalArgumentException("The type of chart should be polar area or radar");
        }
    }

    public ChartJsBuilder setStackedBarXAxe() {
        if (chart.getType().equals(ChartJs.TYPE_BAR) || chart.getType().equals(ChartJs.TYPE_LINE)) {
            options.setScales(new ScaleBuilder(options.getScales()).isStackedBarXAxe().build());
        } else {
            throw new IllegalArgumentException("The type of chart should be Bar");
        }
        return this;
    }

    public ChartJsBuilder setStackedBarYAxe() {
        if (chart.getType().equals(ChartJs.TYPE_BAR) || chart.getType().equals(ChartJs.TYPE_LINE)) {
            options.setScales(new ScaleBuilder(options.getScales()).isStackedBarYAxe().build());
        } else {
            throw new IllegalArgumentException("The type of chart should be Bar");
        }
        return this;
    }

    public ChartJsBuilder setScaleMinMaxTicksxAxis(Double min, Double max) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).setMinMaxTicksXAxis(min, max).build());

        return this;
    }

    public ChartJsBuilder setScaleMinMaxTicksyAxis(Double min, Double max) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).setMinMaxTicksYAxis(min, max).build());

        return this;
    }

    public ChartJsBuilder isScaleBeginAtZeroxAxis(boolean bzero) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).isBeginAtZeroXAxis(bzero).build());

        return this;
    }

    public ChartJsBuilder isScaleBeginAtZeroyAxis(boolean bzero) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).isBeginAtZeroYAxis(bzero).build());

        return this;
    }

    public ChartJsBuilder setScaleStepSizexAxis(Double stepSize) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).setStepSizeXAxis(stepSize).build());

        return this;
    }

    public ChartJsBuilder setScaleStepSizeyAxis(Double stepSize) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).setStepSizeYAxis(stepSize).build());

        return this;
    }

    public ChartJsBuilder addXAxis() {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).AddXAxe().build());

        return this;
    }

    public ChartJsBuilder addYAxis() {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).AddYAxe().build());

        return this;
    }

    private void hadScales(Options options) {
        if (options.getScales() == null) {
            throw new IllegalArgumentException("This method needs a preview scale");
        }
    }

    public ChartJsBuilder setScaleMinMaxTicksxAxis(String min, String max) {
        hadScales(options);
        options.setScales(new ScaleBuilder(options.getScales()).setMinMaxTicksXAxis(min, max).build());
        return this;
    }

    public ChartJsBuilder setHorizontalBar() {
        if (!chart.getType().equals(ChartJs.TYPE_BAR)) {
            throw new IllegalArgumentException("The type of chart should be Bar");
        } else {
            castToBarChart().isHorizontalChart();
        }
        return this;
    }

    private void isValidData(ArrayList data) {
        if (data.isEmpty()) {
            throw new IllegalArgumentException("data is empty");
        }
        if (chart.getType().equals(ChartJs.TYPE_BUBBLE) || chart.getType().equals(ChartJs.TYPE_SCATTER)) {
            if (!(data.get(0) instanceof DataType2)) {
                throw new IllegalArgumentException("The type of data is incorrect, should be DataType2");
            }
        } else if (!(data.get(0) instanceof Double)) {
            throw new IllegalArgumentException("The type of data is incorrect, should be Double");
        }
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public ComtorOptions getComtorOptions() {
        return comtorOptions;
    }

    public void setComtorOptions(ComtorOptions comtorOptions) {
        this.comtorOptions = comtorOptions;
    }

    public ChartJs build() {
        chart.setOptions(options);
        chart.setComtorOptions(comtorOptions);
        setDataAndDatasetToChart();
        return this.chart;
    }

    private void setDataAndDatasetToChart() {
        data.setDatasets(datasets);
        switch (chart.getType()) {
            case ChartJs.TYPE_BAR:
            case BarChart.TYPE_HORIZONTAL_BAR:
                castToBarChart().setData(data);
                break;
            case ChartJs.TYPE_BUBBLE:
                castToBubbleChart().setData(data);
                break;
            case ChartJs.TYPE_DOUGHNUT:
                castToDoughnutChart().setData(data);
                break;
            case ChartJs.TYPE_LINE:
                castToLineChart().setData(data);
                break;
            case ChartJs.TYPE_PIE:
                castToPieChart().setData(data);
                break;
            case ChartJs.TYPE_POLAR_AREA:
                castToPolarAreaChart().setData(data);
                break;
            case ChartJs.TYPE_RADAR:
                castToRadarChart().setData(data);
                break;
            case ChartJs.TYPE_SCATTER:
                castToScatterChart().setData(data);
                break;
        }
    }

    private void setDataToChart(ArrayList data) {
        switch (chart.getType()) {
            case ChartJs.TYPE_BAR:
            case BarChart.TYPE_HORIZONTAL_BAR:
                datasets.add(new BarChartDataset().addData(data));
                break;
            case ChartJs.TYPE_BUBBLE:
                datasets.add(new BubbleChartDataset().addData(data));
                break;
            case ChartJs.TYPE_DOUGHNUT:
                datasets.add(new DoughnutChartDataset().addData(data));
                break;
            case ChartJs.TYPE_LINE:
                datasets.add(new LineChartDataset().addData(data));
                break;
            case ChartJs.TYPE_PIE:
                datasets.add(new PieChartDataset().addData(data));
                break;
            case ChartJs.TYPE_POLAR_AREA:
                datasets.add(new PolarAreaDataset().addData(data));
                break;
            case ChartJs.TYPE_RADAR:
                datasets.add(new RadarChartDataset().addData(data));
                break;
            case ChartJs.TYPE_SCATTER:
                datasets.add(new ScatterChartDataset().addData(data));
                break;
        }
    }

    private BarChart castToBarChart() {
        return BarChart.class.cast(chart);
    }

    private BubbleChart castToBubbleChart() {
        return BubbleChart.class.cast(chart);
    }

    private DoughnutChart castToDoughnutChart() {
        return DoughnutChart.class.cast(chart);
    }

    private LineChart castToLineChart() {
        return LineChart.class.cast(chart);
    }

    private PieChart castToPieChart() {
        return PieChart.class.cast(chart);
    }

    private PolarAreaChart castToPolarAreaChart() {
        return PolarAreaChart.class.cast(chart);
    }

    private RadarChart castToRadarChart() {
        return RadarChart.class.cast(chart);
    }

    private ScatterChart castToScatterChart() {
        return ScatterChart.class.cast(chart);
    }
}
