package org.kurtlike.elements.abctract;

import javafx.collections.ObservableList;
import javafx.scene.chart.*;
import javafx.scene.layout.Pane;

public abstract class MyAbstractChart {
    protected LineChart<Number,Number> lineChart = new LineChart<>(new NumberAxis(), new NumberAxis());
    public abstract void addFunc(Number [][]data, String name);
    public abstract void addDot(Number x, Number y, String name);
    public abstract void clearChart();
    public void insertChart(Pane pane){
        pane.getChildren().add(lineChart);
    }
}
