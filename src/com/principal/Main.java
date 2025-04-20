package com.principal;

import com.principal.modelos.Clientes;
import com.principal.modelos.Mascotas;
import com.utils.funcs.Metodos;
import com.utils.funcs.Registro;

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
          
          System.out.println("Leer: 1-Lista completa | 2-Cliente específico | 3-Salir.");
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
          
        }else if(x == 2){

          System.out.println("Ingrese ID del cliente: ");  
          int y = reader.nextInt();
          datos = Metodos.Leer();

          if(datos != null){
            for(Integer id : datos.keySet()){
              if(y == id){
              System.out.println("ID: "+id+" Cliente: "+datos.get(id));  
              }
            }  
          }/*else{    
            System.out.println("Cliente no encontrado.");*/          
          System.out.println("----");
        
        }else if(x == 3){
          System.out.println("Salida.");
          selec = 5;
        }else{  
          System.out.println("Error.");
        }
          
          break;
          case 3:
        System.out.println("ACTUALIZAR.");
        System.out.println("");
        System.out.println("Ingrese ID para Modificar: ");
        x = reader.nextInt();
        Metodos.Modificar(x);
        System.out.println("Modificado.");
        System.out.println("----");

          break;
          case 4:
        System.out.println("ELIMINAR.");
        System.out.println("Ingrese ID a eliminar: ");
        x = reader.nextInt();
        Metodos.Eliminar(x);
        System.out.println("Eliminado.");
        System.out.println("----");
          break;
          case 5:
          System.out.println("Salida.");
          break;
        default:
          System.out.println("Error. Operación inválida.");
          break;
        }

    }while(selec != 5);
    reader.close();
  }

}


