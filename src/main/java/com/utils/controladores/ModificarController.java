/*package com.utils.controladores;

import com.utils.funcs.Mets;
import com.utils.funcs.Metodos;
import com.utils.controladores.Stager;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class ModificarController{

	@FXML
	private TextField txtfld_ID;

	int id;

	public void ModifyID(ActionEvent event){
		id = Integer.parseInt(txtfld_ID.getText());
	}

	Metodos mets = new Mets();

	public void Aceptar(ActionEvent event) throws IOException{
		mets.Modificar(id);
	}

	Stager stager = new Stager();

	public void Cancelar(ActionEvent event) throws IOException{
		stager.volverPrincipalStage(event);
	}
	
}*/
