package com.utils.funcs;
import com.utils.funcs.Registro;
/*import com.utils.funcs.MaxID;
import com.utils.controladores.AgregarController;
import com.principal.modelos.Clientes;
import com.principal.modelos.Mascotas;*/

/*import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;*/
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.utils.funcs.Registro;



public interface Metodos{

  void Agregar(ArrayList<LinkedHashMap<Integer, Registro>> datos);
  LinkedHashMap<Integer, Registro> Leer(/*LinkedHashMap<Integer, Registro> datos*/);
  //void Modificar(int valor);
  //void Eliminar(int valor);
}

// Formulario.
/*  public static LinkedHashMap<Integer, Registro> InputAdd(int maxID){
    Scanner reader = new Scanner (System.in);
    int cant = 0; 

    LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();
    
    ArrayList<Mascotas> mascotasAL = new ArrayList<>();
    Registro reg = new Registro(new Clientes(), mascotasAL);

    
        reg.getClientes().setId(maxID);
 
        System.out.println("ID del cliente y mascota(s): "+maxID);

        System.out.println("Nombre del Cliente: ");
        reg.getClientes().setNombre(reader.nextLine());

        System.out.println("Domicilio del Cliente: ");
        reg.getClientes().setDomicilio(reader.nextLine());
        
        System.out.print("DNI del Cliente: ");
        reg.getClientes().setDni(reader.nextInt());
    reader.nextLine();

        System.out.print("Cantidad de Mascotas: ");
        cant = reader.nextInt();
    reader.nextLine();
        reg.getClientes().setCantMasc(cant);
        System.out.println("");

    for(int i=1; i<=cant; i++){

      Mascotas mascota = new Mascotas();
      mascota.setId(maxID);
      mascota.setNumero(i);

      System.out.println("Datos de mascota N°:"+i);
      System.out.println("Nombre de la mascota");
      mascota.setNombre(reader.nextLine());
      mascota.setDomicilio(reg.getClientes().getDomicilio());
      System.out.println("Especie: ");
      mascota.setEspecie(reader.nextLine());
      System.out.println("Raza: ");
      mascota.setRaza(reader.nextLine());
      System.out.print("Edad: ");
      mascota.setEdad(reader.nextInt());
      reader.nextLine();
      System.out.println("Color: ");
      mascota.setColor(reader.nextLine());      
      System.out.println("");

      mascotasAL.add(mascota);
    }


        try {
      datos.put(maxID, reg);

        } catch (NullPointerException e) {
          System.out.println("No se puede invocar 'putAll()' de LinkedHashMap porque <local 2> está vacio no se que.... ");
        }

      return datos;

  }

}*/
