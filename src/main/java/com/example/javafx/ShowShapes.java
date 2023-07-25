package com.example.javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


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

        Pane pane2= new Pane();

        Rectangle r1= new Rectangle(25,50,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane2.getChildren().add(new Text(10,27,"ri"));
        pane2.getChildren().add(r1);

        Rectangle r2= new Rectangle(25,50,60,30);
        pane2.getChildren().add(new Text(10,27,"r2"));
        pane2.getChildren().add(r1);

        Rectangle r3= new Rectangle(25,90,60,30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane2.getChildren().add(new Text(10,107,"r3"));
        pane2.getChildren().add(r3);

        for (int i=0; i<4; i++){
            Rectangle r= new Rectangle(100,50,100,30);
            r.setRotate(i*360/8);
            r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            r.setFill(Color.WHITE);
            pane2.getChildren().add(r);

            Stage stage3= new Stage();
            Scene scene3= new Scene(pane2,250,150);
            stage3.setTitle("Show Rectangle");
            stage3.setScene(scene3);
            stage3.show();

            Pane pane3= new Pane();
            for(int j=0; j<16; j++) {

                Ellipse e1 = new Ellipse(150, 100, 100, 50);
                e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
                e1.setFill(Color.WHITE);
                e1.setRotate(i * 180 / 16);
                pane3.getChildren().add(e1);
            }
                Stage stage4= new Stage();
                Scene scene4= new Scene(pane3,300,200);
                stage4.setTitle("Show Ellipse");
                stage4.setScene(scene4);
                stage4.show();

                Pane pane5= new Pane();

            Arc arc1= new Arc(150,100,80,80,30,35);
            arc1.setFill(Color.RED);
            arc1.setType(ArcType.ROUND);
            pane5.getChildren().add(new Text(210,40,"arc1: round"));
            pane5.getChildren().add(arc1);

            Arc arc2= new Arc(150,100,80,80,30+90,35);
            arc2.setFill(Color.WHITE);
            arc2.setType(ArcType.OPEN);
            arc2.setStroke(Color.BLACK);
            pane5.getChildren().add(new Text(20,40,"arc2: open"));
            pane5.getChildren().add(arc2);

            Arc arc3= new Arc(150,100,80,80,30+180,35);
            arc3.setFill(Color.WHITE);
            arc3.setType(ArcType.CHORD);
            arc2.setStroke(Color.BLACK);
            pane5.getChildren().add(new Text(20,170,"arc3: chord"));
            pane5.getChildren().add(arc3);

            Arc arc4= new Arc(150,100,80,80,30+270,35);
            arc4.setFill(Color.GREEN);
            arc4.setType(ArcType.CHORD);
            arc4.setStroke(Color.BLACK);
            pane5.getChildren().add(new Text(210,170,"arc4: chord"));
            pane5.getChildren().add(arc4);

            Stage stage5= new Stage();
            Scene scene5= new Scene(pane5,300,200);
            stage5.setTitle("Show Ellipse");
            stage5.setScene(scene5);
            stage5.show();

            Pane pane6= new Pane();
            Polygon polygon= new Polygon();
            pane6.getChildren().add(polygon);
            polygon.setFill(Color.WHITE);
            polygon.setStroke(Color.BLACK);
            ObservableList<Double> list=polygon.getPoints();

            final double width=200, height=200;
            double centerX= width/2, centerY=height/2;
            double radius= Math.min(width,height)*0.4;

            for (int z=0; z<6; i++){
                list.add(centerX+radius*Math.cos(2*z*Math.PI/6));
                list.add(centerY-radius*Math.cos(2*z*Math.PI/6));
            }

            Stage stage6= new Stage();
            Scene scene6= new Scene(pane6,width,height);
            stage6.setTitle("Show Polygon");
            stage6.setScene(scene6);
            stage6.show();


        }

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
