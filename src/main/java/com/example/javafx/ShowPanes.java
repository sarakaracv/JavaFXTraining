package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class ShowPanes extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane= new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setVgap(5);
        pane.setHgap(5);

        pane.getChildren().addAll(new Label("First Name"), new TextField(),new Label("MI: "));
        TextField tfMI= new TextField();
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMI, new Label("Last Name"), new TextField());

        Scene scene= new Scene(pane,200,250);
        primaryStage.setScene(scene);
        primaryStage.show();

        GridPane pane1= new GridPane();
        Stage stage1= new Stage();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane1.setHgap(5.5);
        pane1.setVgap(5.5);

        pane1.add(new Label("First Name"),0,0);//label name
        pane1.add(new TextField(),1,0);//texting part
        pane1.add(new Label("MI: "),0,1);
        pane1.add(new TextField(),1,1);
        pane1.add(new Label("Last Name"),0,2);
        pane1.add(new TextField(),1,2);

        Button btAdd= new Button("Add Name");// another button bottom of the page
        pane1.add(btAdd,1,3);

        Scene scene1= new Scene(pane1,200,200);
        stage1.setTitle("ShowGridPane");//top on page name
        stage1.setScene(scene1);
        stage1.show();

        Stage stage2= new Stage();
        BorderPane pane2= new BorderPane();

        pane2.setTop(new CustomPane("Top"));
        pane2.setRight(new CustomPane("Right"));
        pane2.setBottom(new CustomPane("Bottom"));
        pane2.setLeft(new CustomPane("Left"));
        pane2.setCenter(new CustomPane("Center"));

        Scene scene2=new Scene(pane2);
        stage2.setTitle("ShowBorderPane");
        stage2.setScene(scene2);
        stage2.show();

        Stage stage3= new Stage();
        BorderPane bPane= new BorderPane();
        bPane.setTop(getHBox());
        bPane.setLeft(getVBox());

        Scene scene4= new Scene(bPane);
        stage3.setTitle("ShowHBox");
        stage3.setScene(scene4);
        stage3.show();
    }

    public HBox getHBox(){
        HBox hBox= new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView imageView= new ImageView(new Image("https://www.onlinestores.com/48-stars-american-flag.html"));
        hBox.getChildren().add(imageView);
        return hBox;
    }

    public VBox getVBox(){
        VBox vBox= new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        vBox.getChildren().add(new Label("Courses: "));
        Label[] courses= {new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 2410"),new Label("CSCI 3720")};
        for (Label course: courses){
            vBox.setMargin(course, new Insets(0,0,0,15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    }
    class CustomPane extends StackPane{
        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(11.5,12.5,13.5,14.5));

        }
    }