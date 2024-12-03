import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main implements Metodos{

	public static void main(String[]args){
    Scanner reader = new Scanner(System.in);
    int selec = 0;  
 
    do{
    System.out.println("Selecciónar: [1]='Clientes', [2]:'Mascotas', [3]:'Salir'.");
    selec = reader.nextInt(); 
    int x = 0;
   
    if(selec == 1){
        System.out.println("Clientes.");
        System.out.println("Selecciona opción: [1]='Agregar', [2]='Leer', [3]='Actualizar', [4]='Eliminar', [5]='Salir'.");
        x = reader.nextInt();

        LinkedHashMap<Clientes, Mascotas> cargar = new LinkedHashMap<>();

        switch(x){
          case 1:

          Clientes cliente = new Clientes();

          System.out.print("Ingrese ID del cliente: ");
          cliente.setId(reader.nextInt());
          System.out.println("Nombre del Cliente: ");
          cliente.setNombre(reader.nextLine());
          System.out.println("Domicilio del Cliente: ");
          cliente.setDomicilio(reader.nextLine());
          System.out.print("DNI del Cliente: ");
          cliente.setDni(reader.nextInt());
          System.out.print("Cantidad de Mascotas: ");
          int cant = reader.nextInt();
          cliente.setCantMasc(cant);
          System.out.println("");

          Mascotas mascota = new Mascotas();
          for(int i=1; i<=cant; i++){
            System.out.println("Datos de mascota N°:"+i);
            System.out.println("Nombre de la mascota");
            mascota.setNombre(reader.nextLine());
            mascota.setDomicilio(cliente.getDomicilio());
            System.out.println("Especie: ");
            mascota.setEspecie(reader.nextLine());
            System.out.println("Raza: ");
            mascota.setRaza(reader.nextLine());
           // System.out.print("Sexo: ");
           // mascota.setSexo(reader.next());
            System.out.print("Edad: ");
            mascota.setEdad(reader.nextInt());
           // System.out.print("Peso: ");
           // mascota.setPeso(reader.nextDouble());
            System.out.println("Color: ");
            mascota.setColor(reader.nextLine());
            System.out.println("Estado de salud: (NULL por ahora).");
            mascota.setEstadoSalud(null);
          }

          cargar.put(cliente, mascota);

          Metodos.Agregar(cargar);

          /*
          cargar.put(1 ,new Clientes());
          cargar.put(2 ,new Clientes());

          // Enviar como parámetro "cargar" para "Metodos.Agregar()".
          Metodos.Agregar(cargar);

          System.out.println("Clientes cargados al archivo.");
          System.out.println("----");
|          */
          break;
          case 2:
          
          System.out.println("Leer: 1-Lista completa | 2-Cliente específico.");
          x = reader.nextInt();
          
          if(x == 1){

            System.out.println("Clientes: ");
            Metodos.Leer();
            System.out.println("----");
          }/*else if(x == 2){
      
            System.out.println("Ingrese ID del cliente: ");
            int y = reader.nextInt();
            System.out.println(cargar.get(y));
            System.out.println("----");
          
          }*/else{
            System.out.println("Error.");
          }
          
          break;
          case 3:
          break;
          case 4:
          break;
          case 5:
          System.out.println("Salida.");
          selec = 3;
          break;
          default:
          System.out.println("Error. Operación inválida.");
          break;
        }
/*
    }else if(selec == 2){
        System.out.println("Mascotas.");
        System.out.println("Selecciona opción: [1]='Agregar', [2]='Leer', [3]='Actualizar', [4]='Eliminar', [5]='Salida'.");  
        x = reader.nextInt();

        switch(x){
          case 1:
          LinkedHashMap<Integer, Mascotas> cargar = new LinkedHashMap<>();
          cargar.put(1, new Mascotas());
          cargar.put(2, new Mascotas());

          Metodos.Agregar(cargar);

          System.out.println("Mascotas cargadas al archivo.");
          break;
          case 2:
          break;
          case 3:
          break;
          case 4:
          break;
          case 5:
          System.out.println("Salida.");
          selec = 3;
          break;
          default:
          System.out.println("Error. Operación inválida.");
          break;
        }*/
      }
    }while(selec != 3);

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



reader.close();
  }
}


