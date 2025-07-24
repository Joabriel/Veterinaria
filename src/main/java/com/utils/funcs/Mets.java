package com.utils.funcs;

// Mis archivos.
import com.nosqldb.NosqlDB;
import com.utils.funcs.MaxID;

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

public class Mets implements Metodos{

	NosqlDB nosqldb = new NosqlDB();

  @Override
  public void Agregar(ArrayList<LinkedHashMap<Integer, Registro>> recibirDatos){
    
    try{

      //MaxID maxID = new MaxID();

			LinkedHashMap<Integer, Registro> datos = Leer();

      for(LinkedHashMap<Integer, Registro> nuevoMapa : recibirDatos){
        datos.putAll(nuevoMapa);
      }  

      FileOutputStream fileOut = new FileOutputStream(nosqldb.getSource());
      ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(datos);

      fileOut.close();
      out.close();
      System.out.println("");
      System.out.println("Datos Cargados.");
      System.out.println("----");
    }catch(IOException e){
      System.out.println("Error en serialización de los datos.");
    }
  }


  //@SuppressWarnings("unchecked")
  @Override
  public LinkedHashMap<Integer,Registro> Leer(){

    try(FileInputStream fileInp = new FileInputStream(nosqldb.getSource());
      ObjectInputStream inp = new ObjectInputStream(fileInp)){
      
      return (LinkedHashMap<Integer, Registro>) inp.readObject();

    } catch(FileNotFoundException e){
    System.out.println("No se encontró el archivo, se usará mapa vacio");
     return new LinkedHashMap<>();   
    } catch(IOException | ClassNotFoundException e){
        System.out.println("Vacío.");
        return new LinkedHashMap<>();  
    }
  }
  /*@Override
 public void Modificar(int valor){
   /*
    LinkedHashMap<Integer, Registro> datosViejos = Leer();
    LinkedHashMap<Integer, Registro> modificarDatos = datosViejos;
    LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();

    for(Integer id : modificarDatos.keySet()){
      if(valor == id){
        modificarDatos = InputAdd(id);
        break;
      }
      
    }

    datos.putAll(datosViejos);
    datos.putAll(modificar);

    try (FileOutputStream fileOut = new FileOutputStream(DB.source); 
  ObjectOutputStream out = new ObjectOutputStream(fileOut)){
      
      out.writeObject(datos);

    } catch (IOException e) {
      System.out.println("Error: No se pudo realizar la transmisión.");
    }

  }*/ 

 /* @Override
  public void Eliminar(int x){/*
    LinkedHashMap<Integer, Registro> eliminar = Leer();
    
    for(Integer id : eliminar.keySet()){
      if(id == x){
        eliminar.remove(id);
        break;
      }
    }

    try (FileOutputStream fileOut = new FileOutputStream(DB.source);
    ObjectOutputStream out = new ObjectOutputStream(fileOut)){

    out.writeObject(eliminar);

    }catch(IOException e){
    System.out.println("Error.");
    }
  }*/
}

