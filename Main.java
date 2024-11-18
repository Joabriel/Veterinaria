import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main implements Metodos{

	public static void main(String[]args){
    Scanner reader = new Scanner(System.in);

    System.out.println("Selecciónar: 1:[Cliente], 2:[Mascota]");
    int selec  = reader.nextInt(); 

    switch(selec){
      case 1: 
    
      LinkedHashMap<Integer, Clientes> cargar = new LinkedHashMap<>();

      cargar.put(1 ,new Clientes());
      cargar.put(2 ,new Clientes());

      // Enviar como parámetro "cargar" para "Metodos.Agregar()".
      Metodos.Agregar(cargar);

      System.out.println("Clientes cargados al archivo.");
      

      /*System.out.println("Ingrese nombre e id del cliente.");
      
      String nombre = reader.nextLine();
      int id = reader.nextInt(); 

      Clientes client = new Clientes();

      client.setNombre(nombre);
      client.setId(id);

      Metodos.Agregar(client); */
    
    
    //Metodos.Agregar(client);

      break;
      case 2:

      System.out.println("Ingrese nombre");

      break;
      default:
      System.out.println("Selección inválida.");
      break;
    }

   
	}
 
}

