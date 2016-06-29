package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Handler;

public class Controller implements Initializable{
    @FXML
    Button btn;
    @FXML
    Button btn1;
    @FXML
    LineChart<Double,Double> charts0;
    @FXML
 NumberAxis xAxis=new NumberAxis("x axis",0,10.1,1);
    @FXML
    NumberAxis yAxis=new NumberAxis("y axis",0,10.0,1);

    @FXML
    public void onStart(){
        btn.setText("Hello");
    }
@FXML
    public void onChart(){
    ObservableList<XYChart.Series<Double, Double>> lineChartData = FXCollections.observableArrayList();
    LineChart.Series<Double, Double> series1 = new LineChart.Series<Double, Double>();
    LineChart.Series<Double,Double> series2=new LineChart.Series<>();
    LineChart.Series<Double,Double> series3=new LineChart.Series<>();
    series1.setName("Series 1");
    series2.setName("Series 2");
    series3.setName("Series 3");

Double x,y;
    Random rnd=new Random();
    for (int i = 0; i <10 ; i++) {
        x=rnd.nextDouble()*10;
        y=rnd.nextDouble()*10;
        series1.getData().add(new XYChart.Data<Double, Double>( (double)i,x));
        series2.getData().add(new XYChart.Data<>((double)i,y));
        y=rnd.nextDouble()*10;
        series3.getData().add(new XYChart.Data<>((double)i,y));
        System.out.println("i "+i+" x: "+x+" y: "+y);
    }

    lineChartData.add(series1);
    lineChartData.add(series2);
    lineChartData.add(series3);



    charts0.setData(lineChartData);
    charts0.createSymbolsProperty();
}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ok");

//        ObservableList<XYChart.Series<Double, Double>> lineChartData = FXCollections.observableArrayList();
//        LineChart.Series<Double, Double> series1 = new LineChart.Series<Double, Double>();
//        LineChart.Series<Double,Double> series2=new LineChart.Series<>();
//        series1.setName("Series 1");
//        series2.setName("Series 2");
//
//        Double x,y;
//        Random rnd=new Random();
//        for (int i = 0; i <10 ; i++) {
//            x=rnd.nextDouble()*10;
//            y=rnd.nextDouble()*10;
//            series1.getData().add(new XYChart.Data<Double, Double>( (double)i,x));
//            series2.getData().add(new XYChart.Data<>((double)i,y));
//            System.out.println("i "+i+" x: "+x+" y: "+y);
//        }
//
//        lineChartData.add(series1);
//        lineChartData.add(series2);
//
//
//
//        charts0.setData(lineChartData);
//        charts0.createSymbolsProperty();



    }
}
