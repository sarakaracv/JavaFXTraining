package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.border.LineBorder;

public class ShowShapes extends Application{
    @Override
    public void start(Stage primaryStage) {

        Pane pane= new Pane();
        pane.setPadding(new Insets(5));
        Text text1= new Text(20,20,"Programming is Fun");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(text1);

        Text text2= new Text(60,60,"Programming is fun/n Display Text");
        pane.getChildren().add(text2);

        Text text3= new Text(10,100,"Programming is fun/n Display Text");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);

        Scene scene= new Scene(pane);
        primaryStage.setTitle("Show Text");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage2= new Stage();
        Scene scene2= new Scene(new LinePane(),200,200);
        stage2.setTitle("ShowLine");
        stage2.setScene(scene2);
        stage2.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    class LinePane extends Pane{
        public LinePane(){
            Line line1= new Line(10,10,10,10);
            line1.endXProperty().bind(widthProperty().subtract(10));
            line1.endYProperty().bind(heightProperty().subtract(10));
            line1.setStrokeWidth(5);
            line1.setStroke(Color.GREEN);
            getChildren().add(line1);

            Line line2= new Line(10,10,10,10);
            line2.startXProperty().bind(widthProperty().subtract(10));
            line2.endYProperty().bind(heightProperty().subtract(10));
            line2.setStrokeWidth(5);
            line2.setStroke(Color.GREEN);
            getChildren().add(line2);
        }
    }


}
