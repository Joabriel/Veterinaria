import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Metodos{

  public void Serializar(Clientes cli, String archivo){

    try{
    //-->
  
    FileOutputStream fileOut = new FileOutputStream(archivo);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(cli);

    fileOut.close();
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


  }

  /*
 public static void Agregar(Clientes cli){
    FileOutputStream file = new FileOutputStream("Datos.txt");
    ObjectOutputStream out = new ObjectOutputStream(file);

    out.writeObject();

    out.close();
  }*/
  /*
  public static void imprimir(ArrayList<String> lista1){
    for(String elemento : lista1){
      System.out.println(elemento+"-");
      System.out.println();
    }*/

}
