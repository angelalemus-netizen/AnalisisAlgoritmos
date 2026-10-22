package com.example.analisisalgoritmos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Gráfica 1
        LineChart<Number, Number> chartIterativa = crearGrafica("Tiempo - Sumatoria Iterativa");
        XYChart.Series<Number, Number> serieIterativa = new XYChart.Series<>();
        serieIterativa.setName("Iterativa");

        // Gráfica 2
        LineChart<Number, Number> chartGauss = crearGrafica("Tiempo - Sumatoria Gauss");
        XYChart.Series<Number, Number> serieGauss = new XYChart.Series<>();
        serieGauss.setName("Gauss");

        // Gráfica 3
        LineChart<Number, Number> chartRecursiva = crearGrafica("Tiempo - Sumatoria Recursiva");
        XYChart.Series<Number, Number> serieRecursiva = new XYChart.Series<>();
        serieRecursiva.setName("Recursiva");

        System.out.println("Sumatoria Iterativa");

        for(long i = 100; i<=100000000; i*=10){
            long startTime = System.nanoTime();
            Sumatorias.sumatoriaN(i);
            long endTime = System.nanoTime();
            serieIterativa.getData().add(new XYChart.Data<>(i,endTime-startTime));

            System.out.println(endTime-startTime);
        }

        System.out.println("Sumatoria Gauss");
        for(long i = 100; i<=100000000; i*=10){
            long startTime = System.nanoTime();
            Sumatorias.sumatoriaGauss(i);
            long endTime = System.nanoTime();
            serieGauss.getData().add(new XYChart.Data<>(i,endTime-startTime));
            long duration = endTime - startTime;
            System.out.println(duration);

        }
        chartIterativa.getData().add(serieIterativa);
        chartGauss.getData().add(serieGauss);
        chartRecursiva.getData().add(serieRecursiva);

        VBox root = new VBox(10, chartIterativa, chartGauss);
        Scene scene = new Scene(root, 1200, 600);
        stage.setScene(scene);
        stage.show();

        System.out.println("Sumatoria Recursiva");
    for(long i = 100; i<=100000000; i*=10){
        long startTime = System.nanoTime();
        Sumatorias.sumatoriaRecursiva(i);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration);

    }

    }

    private LineChart<Number, Number> crearGrafica(String titulo) {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Valor de N");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Tiempo (Nanosegundos)");

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle(titulo);
        return chart;
    }
}
