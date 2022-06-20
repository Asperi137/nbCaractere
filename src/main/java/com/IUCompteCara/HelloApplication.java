package com.IUCompteCara;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Hello application.
 */
public class HelloApplication extends Application {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nbCara.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 280);
        stage.setTitle("Compter un caractere donné");
        stage.setScene(scene);
        stage.show();
    }

}
