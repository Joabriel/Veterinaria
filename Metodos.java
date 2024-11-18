import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public interface Metodos{

  public static void Agregar(LinkedHashMap cargar){

    try{
  
    FileOutputStream fileOut = new FileOutputStream("Datos.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(cargar);

    fileOut.close();
    out.close(); 

    }catch(IOException e){
      System.out.println("Error en serialización y/o deserialización de los datos.");
    }
    

  }



}
