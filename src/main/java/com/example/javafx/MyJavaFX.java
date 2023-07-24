package com.example.javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MyJavaFX extends Application{
//--module-path /path/to/JavaFX/lib --add-modules=javafx.controls


    @Override
    public void start(Stage primaryStage){
        StackPane pane= new StackPane();
        pane.getChildren().add(new Button("StackPane"));
        pane.setRotate(80);// show little sidewards

        Scene scene= new Scene(pane,200,50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();// middle button
        //Font.getFamilies();
        Font.getFontNames("Times");


//        Button btOk= new Button("OK");
//        Scene scene= new Scene(btOk,200,250);
//        primaryStage.setTitle("MyJavaFX");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        Stage stage= new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"),300,400));
        stage.show();

       // Font font= new Font("Times",12);//size 12
        Font font1= Font.font("Times New Roman", FontWeight.BOLD,12);
        Font font2= Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC,12.5);

        Stage stage1= new Stage();
        Circle circle= new Circle();
        //circle.setCenterX(100);// circle always seems left side
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));//with this circle is become center
       // circle.setCenterY(100);
        circle.setRadius(50);
       // circle.setStyle("-fx-stroke: black; -fx-fill: red;"); css method
        //circle.setStroke(Color.BLACK);
//        circle.setStroke(Color.LIGHTBLUE);
//        circle.setFill(Color.PINK);
        Color color= new Color(0.25,0.14,0.333,0.51);//red,blue or green,blue,opacity(darker)
        Color color1= color.brighter();
        Color color2= color1.darker();
        Color color3= Color.color(0.33,0.55,0.879,0.654);
        Color color4= Color.rgb(56,177,57,0.99);
      //  circle.setFill(color4);
       // circle.setFill(Color.AZURE);
        circle.setFill(Color.WHITE);// white circle

        Label label= new Label("Javafx");
        label.setFont(font2);


        Pane pane1= new Pane();
        //pane1.getChildren().add(circle);
        pane1.getChildren().addAll(circle,label);

        Scene scene1= new Scene(pane1,200,200);
        stage1.setTitle("Show Circle");
        stage1.setScene(scene1);
        stage1.show();

        Stage stage2= new Stage();
        Pane pane5= new HBox(10);
        pane5.setPadding(new javafx.geometry.Insets(5,5,5,5));
        Image image= new Image("https://www.onlinestores.com/48-stars-american-flag.html");
        pane5.getChildren().add(new ImageView(image));
        ImageView imageView= new ImageView();
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane5.getChildren().add(imageView);

        ImageView imageView1= new ImageView(image);
        imageView1.setRotate(90);
        pane5.getChildren().add(imageView1);

        Scene scene6= new Scene(pane5);
        stage2.setTitle("Show Title");
        stage2.setScene(scene6);
        stage2.show();



    }
    public static void main(String[] args) {
        Application.launch(args);
    }

    //https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
}
