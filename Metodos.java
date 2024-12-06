import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;

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

  public static LinkedHashMap<Integer,Registro> Leer(){
    
    LinkedHashMap<Integer, Registro> deser = null;

    try{
      FileInputStream fileInp = new FileInputStream("Datos.ser");
      ObjectInputStream inp = new ObjectInputStream(fileInp);

      deser = (LinkedHashMap<Integer,Registro>) inp.readObject();

      fileInp.close();
      inp.close(); 
    }catch(IOException | ClassNotFoundException e){
        System.out.println("Error en deserialización de datos.");
    }

    return deser;
  }


  public static void Modificar(){

  }

  public static void Eliminar(){

  }

  public static int obtenerSiguienteID(){
    LinkedHashMap<Integer,Registro> datos = null;
    
    try{
      FileInputStream fileInp = new FileInputStream("datos.ser");
      ObjectInputStream inp = new ObjectInputStream(fileInp);

      datos = (LinkedHashMap<Integer,Registro>) inp.readObject();

      fileInp.close();
      inp.close();

      int maxID = 0;

      for(Integer id : datos.keySet()){
        if(id > maxID){
          maxID = id;
        }
      }

      return maxID + 1;

    }catch(FileNotFoundException e){
      return 1;
    }catch(IOException | ClassNotFoundException e){
      e.printStackTrace();
      return -1;
    }

  }


} 
