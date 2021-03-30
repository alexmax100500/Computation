package org.kurtlike.elements.charts;

import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import org.kurtlike.App;
import org.kurtlike.elements.abctract.MyAbstractChart;

public class MyLineChart extends MyAbstractChart{
    public MyLineChart(){
        super.lineChart.setMinSize(500,500);
    }
    @Override
    public void addFunc(Number [][]data, String name) {
        XYChart.Series<Number,Number> series = new XYChart.Series<>();
        series.setName(name);
        for(Number []x: data){
            series.getData().add(new XYChart.Data<>(x[0],x[1]));
        }
        super.lineChart.getData().add(series);

    }
    @Override
    public void addDot(Number x, Number y,String name) {
        XYChart.Series<Number,Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>(x,y));
        series.setName(name);
        super.lineChart.getData().add(series);
    }

    @Override
    public void clearChart() {
        super.lineChart.getData().clear();
    }

    public void addCss(String path){
        super.lineChart.getStylesheets().add(App.class.getResource(path).toExternalForm());
    }
}
