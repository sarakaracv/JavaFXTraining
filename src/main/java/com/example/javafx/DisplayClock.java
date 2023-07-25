package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class DisplayClock extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


       // ClockPane clock= new ClockPane();
        String timeString= "clock.getHour()+ \": "+ "clock.getMinute()+\": "+ "clock.getSecond()";
        Label lblCurrentTime= new Label(timeString);

        BorderPane pane= new BorderPane();
       // pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime,Pos.TOP_CENTER);

        Scene scene= new Scene(pane,250,200);
        primaryStage.setTitle("Display Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
