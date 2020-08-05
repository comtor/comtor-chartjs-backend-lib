package net.comtor.chartjs.chart;

import java.util.ArrayList;
import net.comtor.chartjs.AbstractDataset;

/**
 *
 * @author vihlai
 */
public class Data {

    private ArrayList<String> labels;
    private ArrayList<AbstractDataset> datasets;

    public Data() {
    }

    public Data(ArrayList<AbstractDataset> datasets) {
        this.datasets = datasets;
    }

    public Data(ArrayList<String> labels, ArrayList<AbstractDataset> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    public ArrayList<AbstractDataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(ArrayList<AbstractDataset> datasets) {
        this.datasets = datasets;
    }

    public ArrayList<String> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }

}
