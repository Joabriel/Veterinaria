package com.utils.controladores;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.function.Consumer;
import com.utils.funcs.MaxID;

public class Stager{
	
	public <T> void iraStage(String source, ActionEvent event, Consumer<T> inicializador){


		try{
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(source));
			//fxmlloader.setLocation(new URL(source));
			Parent root = fxmlloader.load();

			T controller = fxmlloader.getController();
			if(inicializador != null){
				inicializador.accept(controller);
			}

			/*if(source.equals("/ui/agregar/AgregarCliente.fxml")){
				
				AgregarController addctrller = new AgregarController();
				MaxID maxID = new MaxID();

				addctrller.setIdLabel(maxID.obtenerId());
				addctrller.getIdLabel();
			}*/

		Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();		

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		actualStage.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void volverPrincipalStage(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/principal/menuVet.fxml"));
		Parent root = loader.load();
		Stage agregarStage = new Stage();
    agregarStage.setScene(new Scene(root));
    agregarStage.show();

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		actualStage.close();
	}

}
