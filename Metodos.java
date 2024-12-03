import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public interface Metodos{

  public static void Agregar(LinkedHashMap cargar){
    try{

      FileOutputStream fileOut = new FileOutputStream("Datos.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(cargar);

      fileOut.close();
      out.close(); 
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
