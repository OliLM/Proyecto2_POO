package mipaquete;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class App extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane root= new StackPane();
        Label lbl= new Label("PRUEBA DE LA VENTANA");

        root.getChildren().add(lbl);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
