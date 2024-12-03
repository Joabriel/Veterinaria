import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public interface Metodos{

  public static void Agregar(LinkedHashMap datos){
    try{

      FileOutputStream fileOut = new FileOutputStream("Datos.ser");
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

  public static void Leer(){
    
    try{
      FileInputStream fileInp = new FileInputStream("Datos.ser");
      ObjectInputStream inp = new ObjectInputStream(fileInp);

      LinkedHashMap<Clientes, Mascotas> leer = new LinkedHashMap<>();

      leer = (LinkedHashMap) inp.readObject();

      fileInp.close();
      inp.close();  
    }catch(IOException | ClassNotFoundException e){
        System.out.println("Error en deserialización de datos.");
      }

    }


  public static void Modificar(){

  }

  public static void Eliminar(){

  }


} 
