package com.utils.controladores; 

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;


import com.principal.modelos.Clientes;



public class AgregarController{

	@FXML
	private TextField txtfld_ID, txtfld_Name, txtfld_DNI, txtfld_Address, txtfld_cantPets; 
	
// Creo que no es necesario agregar los botones.
	@FXML
	private Button ok_bttn, cancel_bttn;

	private String name, address;
	private int id, dni, cantPets;


	public void AddID(ActionEvent event) throws IOException{
		id = Integer.parseInt(txtfld_ID.getText());
	}

	public void AddName(ActionEvent event) throws IOException{
		name = txtfld_Name.getText();
	}

	public void AddDNI(ActionEvent event) throws IOException{
		dni = Integer.parseInt(txtfld_DNI.getText());
	}

	public void AddAddress(ActionEvent event) throws IOException{
		address = txtfld_Address.getText();
	}

	public void AddCantPets(ActionEvent event) throws IOException{
		cantPets = Integer.parseInt(txtfld_cantPets.getText());
	}


	Clientes clientes = new Clientes();

	public void Aceptar(ActionEvent event){

		clientes.setNombre(name);
		clientes.setDomicilio(address);
		clientes.setId(id);
		clientes.setDni(dni);
		clientes.setCantMasc(cantPets);
	}

	public void Cancelar(ActionEvent event){

	}

}
