package com.utils.controladores;

// Mis archivos.
import com.utils.controladores.Stager;
//import com.utils.funcs.Metodos;
//import com.utils.funcs.Mets;
//import com.utils.funcs.Registro;
import com.utils.funcs.MaxID;
import com.utils.controladores.AgregarController;
//import com.principal.modelos.Clientes;
//import com.principal.modelos.Mascotas;
//import com.nosqldb.NosqlDB;

// Controladores.
/*
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;*/
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.function.Consumer;
//import java.net.URL;



public class MenuVetController{

	@FXML
	private Button btnAgregar, btnLeer, btnModificar, btnEliminar;


	Stager stager = new Stager();
	//Metodos mets = new Mets();
	MaxID maxID = new MaxID();
	

	public void Agregar(ActionEvent event) throws IOException{
		stager.iraStage("/ui/agregar/AgregarCliente.fxml", event, (AgregarController c) -> {
			c.setIdLabel(maxID.obtenerId());
		}); 
    //mets.Agregar();
	}

	public void Leer(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/Leer.fxml", event, null);
	}

	/*public void Modificar(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/modificar/Modificar.fxml", event, null);
	}*/

	/*public void Eliminar(ActionEvent event) throws IOException{
		stager.iraStage("/resources/ui/Eliminar.fxml", event, null);
	}*/


}




