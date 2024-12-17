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

        Metodos.Agregar();

        break;


        case 2:
        System.out.println("LEER.");
          
          System.out.println("Leer: 1-Lista completa | 2-Cliente específico.");
          x = reader.nextInt();
          
          if(x == 1){
          System.out.println("Lista completa: ");
          System.out.println("");
          datos = Metodos.Leer();

          if(datos != null){
            for(Integer clave : datos.keySet()){
            System.out.println("ID: "+clave+" Cliente: "+datos.get(clave));
          }
          }else{
            System.out.println("No se pudieron obtener los datos.");
          }
         
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


