import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main implements Metodos{

	public static void main(String[]args){
    Scanner reader = new Scanner(System.in);
    int selec = 0;  
 
    do{
      System.out.println("Selecciona opción: [1]='Agregar', [2]='Leer', [3]='Actualizar', [4]='Eliminar', [5]='Salir'.");
      selec = reader.nextInt();
      int x = 0;

      LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();

      switch(selec){
        case 1:
        System.out.println("AGREGAR: ");

        Registro reg = new Registro(new Clientes(), new Mascotas());

        System.out.print("Ingrese ID del cliente y mascota(s): ");
        int id = reader.nextInt();

        if(!datos.containsKey(id)){
          reg.getClientes().setId(id);  
          reg.getMascotas().setId(id);
        }else{
          System.out.println("Ese ID ya está en uso.");
          selec = 3;
        }

        // (Borrar Buffer).
        System.out.println("Nombre del Cliente: ");
        reg.getClientes().setNombre(reader.nextLine());
        System.out.println("Domicilio del Cliente: ");
        reg.getClientes().setDomicilio(reader.nextLine());
        System.out.print("DNI del Cliente: ");
        reg.getClientes().setDni(reader.nextInt());
        System.out.print("Cantidad de Mascotas: ");
        int cant = reader.nextInt();
        reg.getClientes().setCantMasc(cant);
        System.out.println("");

        for(int i=1; i<=cant; i++){ 
          System.out.println("Datos de mascota N°:"+i);
          // (Borrar buffer).
          System.out.println("Nombre de la mascota");
          reg.getMascotas().setNombre(reader.nextLine());
          reg.getMascotas().setDomicilio(reg.getClientes().getDomicilio());
          System.out.println("Especie: ");
          reg.getMascotas().setEspecie(reader.nextLine());
          System.out.println("Raza: ");
          reg.getMascotas().setRaza(reader.nextLine());
          // System.out.print("Sexo: ");
          // mascota.setSexo(reader.next());
          System.out.print("Edad: ");
          reg.getMascotas().setEdad(reader.nextInt());
          // System.out.print("Peso: ");
          // mascota.setPeso(reader.nextDouble());
          System.out.println("Color: ");
          reg.getMascotas().setColor(reader.nextLine());
          System.out.println("Estado de salud: (NULL por ahora).");
          reg.getMascotas().setEstadoSalud(null);
          System.out.println("");
        }

        datos.put(id,reg);
        Metodos.Agregar(datos);

        break;
        case 2:
        System.out.println("LEER.");
          
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
        System.out.println("ACTUALIZAR.");
          break;
          case 4:
        System.out.println("ELIMINAR.");
          break;
          case 5:
          System.out.println("Salida.");
          selec = 3;
          break;
        default:
          System.out.println("Error. Operación inválida.");
          break;
        }

    }while(selec != 3);
    reader.close();
  }

}


