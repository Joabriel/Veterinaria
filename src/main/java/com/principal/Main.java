package com.principal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Main extends Application{

  public void start(Stage stage) throws IOException{
    FXMLLoader loadfxml = new FXMLLoader(getClass().getResource("/ui/principal/menuVet.fxml"));
    Parent root = loadfxml.load();
    Scene scene = new Scene(root);

    stage.setScene(scene);
    stage.show();
    }

  public static void main(String[]args){
    launch(args);
  }
}
