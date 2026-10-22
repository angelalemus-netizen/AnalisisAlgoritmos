package com.example.analisisalgoritmos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        NumberAxis yAxis = new NumberAxis();

//Setting labelto the axis
        yAxis.setLabel("name of the axis");



        System.out.println("Sumatoria Iterativa");

        for(long i = 100; i<=100000000; i*=10){
            long startTime = System.nanoTime();
            Sumatorias.sumatoriaN(i);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(duration);
        }

        System.out.println("Sumatoria Gauss");
        for(long i = 100; i<=100000000; i*=10){
            long startTime = System.nanoTime();
            Sumatorias.sumatoriaGauss(i);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(duration);

        }
        System.out.println("Sumatoria Recursiva");
//    for(long i = 100; i<=100000000; i*=10){
//        long startTime = System.nanoTime();
//        Sumatorias.sumRecursiva(i);
//        long endTime = System.nanoTime();
//        long duration = endTime - startTime;
//        System.out.println(duration);
//
//    }

    }
}
