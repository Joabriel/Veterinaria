import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Metodos{

  public static void Agregar(){
    
    try{

      LinkedHashMap<Integer,Registro> datosViejos = new LinkedHashMap<>(Leer()); 

      int maxID = 0;

        for(Integer id : datosViejos.keySet()){
          if(id > maxID){
            maxID = id;
          }
        }

        maxID = maxID + 1;


      LinkedHashMap<Integer,Registro> datosNuevos = new LinkedHashMap<>(InputAdd(maxID));

      LinkedHashMap<Integer,Registro> datos = new LinkedHashMap<>();
      datos.putAll(datosViejos);
      datos.putAll(datosNuevos);
 
      /*
      if(datosViejos == null){
        datos.putAll(datosNuevos);
      }else{
        datos.putAll(datosViejos);
        datos.putAll(datosNuevos);
      }
      */
      
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

    try(FileInputStream fileInp = new FileInputStream("Datos.ser");
      ObjectInputStream inp = new ObjectInputStream(fileInp)){
      
      return (LinkedHashMap<Integer, Registro>) inp.readObject();

    } catch(FileNotFoundException e){
    System.out.println("No se encontró el archivo, se usará mapa vacio");
     return new LinkedHashMap<>();   
    } catch(IOException | ClassNotFoundException e){
        System.out.println("Error en deserialización de datos.");
        return new LinkedHashMap<>();  
    }
  }

  public static void Modificar(){

  }

  public static void Eliminar(){

  }

 /* 
  public static int obtenerSiguienteID(){

    LinkedHashMap<Integer,Registro> datos = new LinkedHashMap<>();
    
    try(FileInputStream fileInp = new FileInputStream("datos.ser");
      ObjectInputStream inp = new ObjectInputStream(fileInp)){
      
      datos = (LinkedHashMap<Integer,Registro>) inp.readObject();

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

  }*/

  public static LinkedHashMap<Integer, Registro> InputAdd(int maxID){
    Scanner reader = new Scanner (System.in);

    LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();

    Registro reg = new Registro(new Clientes(), new Mascotas());


   // int nuevoId = obtenerSiguienteID();

        // ID del cliente y mascota(s).

        reg.getClientes().setId(maxID);
        reg.getMascotas().setId(maxID);
        System.out.println("ID del cliente y mascota(s): "+maxID);

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
          reader.nextLine();
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
          reader.nextLine();
          System.out.println("Color: ");
          reg.getMascotas().setColor(reader.nextLine());
          System.out.println("Estado de salud: (NULL por ahora).");
          reg.getMascotas().setEstadoSalud(null);
          System.out.println("");
        }


        try {
          datos.put(maxID,reg);
      //Metodos.Agregar(datos);         
        } catch (NullPointerException e) {
          System.out.println("No se puede invocar 'putAll()' de LinkedHashMap porque <local 2> está vacio no se que.... ");
        }

      return datos;

  }


} 
