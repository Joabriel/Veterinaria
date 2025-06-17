package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.event.ActionEvent

public class MenuController{

	Stager stager = new Stager();


	public void Agregar(ActionEvent event){

		stager.cambiarStage();

	}

	public void Leer(ActionEvent event){
		stager.cambiarStage();

	}

	public void Modificar(ActionEvent event){
		stager.cambiarStage();

	}

	public void Eliminar(ActionEvent event){
		stager.cambiarStage();

	}


}

protected class Stager{
	public void iraStage(){
			FXMLLoader loader = new FXMLLoader(getClass().getResource("")); // Enviar como parámetro, la ruta de la interfaz crud.
		Parent root = loader.load();
		Stage agregarStage = new Stage();
    agregarStage.setScene(new Scene(root));
    agregarStage.show();

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource().getScene().getWindow());
}

	public void volverPrincipalStage(){
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/resources/ui/menuVet.fxml"));
		Parent root = loader.load();
		Stage agregarStage = new Stage();
    agregarStage.setScene(new Scene(root));
    agregarStage.show();

		// Cerrar ventana actual.
		Stage actualStage = (Stage) ((Node)event.getSource().getScene().getWindow());

	}

}


