package com.utils.controladores;

import com.utils.controladores.AgregarController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

public class MenuVetController{

	@FXML
	private Button btnAgregar, btnLeer, btnModificar, btnEliminar;


	Stager stager = new Stager();


	public void Agregar(ActionEvent event) throws IOException{
		stager.iraStage("/ui/agregar/AgregarCliente.fxml", event);
	}

	public void Leer(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/Leer.fxml", event);
	}

	public void Modificar(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/Modificar.fxml", event);
	}

	public void Eliminar(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/Eliminar.fxml", event);
	}


}

class Stager{
	
	public void iraStage(String source, ActionEvent event) throws IOException{
		FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(source));
		//fxmlloader.setLocation(new URL(source));
		Parent root = fxmlloader.load();

		Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();		

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		actualStage.close();
}

	public void volverPrincipalStage(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/ui/principal/menuVet.fxml"));
		Parent root = loader.load();
		Stage agregarStage = new Stage();
    agregarStage.setScene(new Scene(root));
    agregarStage.show();

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		actualStage.close();
	}

}


