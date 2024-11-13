import java.util.List;
import java.util.ArrayList;

//
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//
public class Main{

	public static void main(String[]args){

    System.out.println("Se trabajan con datos de CLIENTES.");
    /*System.out.println("Opcs:");
    System.out.println("      [1]: Agregar.");
    System.out.println("      [2]: Leer.");
    System.out.println("      [3]: Editar.");
    System.out.println("      [4]: Salir.");
    int opc;*/

    Clientes persona1 = new Clientes();
    //Metodos met = new Metodos();

    ArrayList<Clientes> lista1 = new ArrayList<>();

    persona1.setNombre("Joabriel");
    persona1.setDomicilio("Bolivia 1557");

    lista1.add(persona1);

    System.out.println("Lista de ArrayList de Cliente: "+lista1.get(0));

    // Cómo Serializar y Deserializar Objetos?
    try{
    //-->
  
    FileOutputStream fileOut = new FileOutputStream("Datos.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(lista1);

    out.close();  
    //<--
    
    //-->
    System.out.println();

    FileInputStream fileIn = new FileInputStream("Datos.txt");
    ObjectInputStream in = new ObjectInputStream(fileIn);


    System.out.println("Del archivo: ");
    //<--

      in.close();
    }catch(IOException | ClassNotFoundException e){
      System.out.println("Error en serialización y/o deserialización de los datos.");
    }
  
    
    /*
    do{
    switch(opc){
      case 1:
      met.Agregar(persona);
      break;
      case 2:
      met.Leer(persona);
      break;
      case 3:
      met.Editar(persona);
      case 4:
      System.out.println("Salida....");
      break;
      default:
      System.out.println("No.");
      break;
      }
    }while(opc != 3);
    */

	}
 
}

