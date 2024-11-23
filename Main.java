import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main implements Metodos{

	public static void main(String[]args){
    Scanner reader = new Scanner(System.in);

    System.out.println("Selecciónar: [1]='Clientes' [2]:'Mascotas' [3]='Salida'.");
    int selec  = reader.nextInt(); 
    int x = 0;
    System.out.println("");

   do {
    
    if(selec = 1){
        System.out.println("Clientes.");
        System.out.println("Selecciona opción: [1]='Agregar', [2]='Leer', [3]='Actualizar', [4]='Eliminar'.");
        x = reader.nextInt();

        switch(x){
          case 1:
           
          LinkedHashMap<Integer, Clientes> cargar = new LinkedHashMap<>();
          cargar.put(1 ,new Clientes());
          cargar.put(2 ,new Clientes());

          // Enviar como parámetro "cargar" para "Metodos.Agregar()".
          Metodos.Agregar(cargar);

          System.out.println("Clientes cargados al archivo.");

          break;
          case 2:
          break;
          case 3:
          break;
          case 4:
          default:
          System.out.println("Error. Operación inválida.");
          break;
        }

    }else if(selec = 2){
        System.out.println("Mascotas.");
        System.out.println("Selecciona opción: [1]='Agregar', [2]='Leer', [3]='Actualizar', [4]='Eliminar'.");  
        x = reader.nextInt();

        switch(x){
          case 1:
          break;
          case 2:
          break;
          case 3:
          break;
          case 4:
          default:
          System.out.println("Error. Operación inválida.");
          break;
        }


      }else if{
      System.out.println("Salida.");
    }else{
      System.out.println("Opc inválida.");
    }

   } while (selec != 3); 

    /*switch(selec){
      case 1:
      System.out.println("Clientes.");

      


           
      -----

      System.out.println("Ingrese nombre e id del cliente.");
      
      String nombre = reader.nextLine();
      int id = reader.nextInt(); 

      Clientes client = new Clientes();

      client.setNombre(nombre);
      client.setId(id);

      Metodos.Agregar(client); */
    
    
    //Metodos.Agregar(client);
    /*
      break;
      case 2:
      System.out.println("Mascota.");

      break;
      default:
      System.out.println("Selección inválida.");
      break;
    }*/
   
	}
 
}

