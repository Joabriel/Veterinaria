package com.utils.controladores; 

// Controladores.
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;

// Manejo de archivos.
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


// Mis archivos.
import com.utils.funcs.Registro;
import com.utils.funcs.Mets;
//import com.utils.funcs.MaxID;
import java.util.LinkedHashMap;
import com.utils.controladores.MenuVetController;



public class AgregarController{

	// Instancias.
	LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();
	Registro reg = new Registro();
	ArrayList<LinkedHashMap<Integer, Registro>> enviarDatos = new ArrayList<>();
	Scanner reader = new Scanner(System.in);

	Stager stager = new Stager();
	//MaxID maxID = new MaxID();
	Mets mets = new Mets();

	// Variables
	
	private int  dni, cantPets;
	public String name, address;


	@FXML
	private Label idLabel;
	private TextField  txtfld_Name, txtfld_DNI, txtfld_Address, txtfld_cantPets;


	@FXML
	private Button ok_bttn, cancel_bttn;


	public void setIdLabel(int valor){
		//valor = maxID.obtenerId();
		idLabel.setText(""+valor);
	}


	public String getIdLabel(){
		return idLabel.getText();
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


	public void Aceptar(ActionEvent event) throws IOException{

		reg.getClientes().setNombre(name);
		reg.getClientes().setDni(dni);
		reg.getClientes().setDomicilio(address);
		reg.getClientes().setCantPets(cantPets);
	
		int key = Integer.parseInt(getIdLabel());

		datos.put(key,reg);
		enviarDatos.add(datos);
		mets.Agregar(enviarDatos);
	}

	public void Cancelar(ActionEvent event) throws IOException{
		stager.volverPrincipalStage(event);
	}

}
