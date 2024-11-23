import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public interface Metodos{

  public abstract void Agregar(LinkedHashMap cargar){

    try{
  
    FileOutputStream fileOut = new FileOutputStream("Datos.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(cargar);

    fileOut.close();
    out.close(); 

    }catch(IOException e){
      System.out.println("Error en serialización de los datos.");
    }

  }

  public abstract void Leer(TreeMap maparbol){
    
    try{
        FileInputStream fileInp = new FileInputStream("Datos.txt");
        ObjectInputStream inp = new ObjectInputStream(fileInp);

        fileInp.close();
        inp.close();
      }catch(IOException e){
        System.out.println("Error en deserialización de datos.");
      }

    }


  public abstract void Modificar(){

  }

  public abstract void Eliminar(){

  }


  }

}
