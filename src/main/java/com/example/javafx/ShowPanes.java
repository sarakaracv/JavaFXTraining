package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
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