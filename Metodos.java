import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.println("Vacío.");
        return new LinkedHashMap<>();  
    }
  }

  public static void Modificar(int x){
    LinkedHashMap<Integer, Registro> datosViejos = Leer();
    LinkedHashMap<Integer, Registro> modificar = datosViejos;
    LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();

    for(Integer id : modificar.keySet()){
      if(x == id){
        modificar = InputAdd(id);
        break;
      }
    }

    datos.putAll(datosViejos);
    datos.putAll(modificar);

    try (FileOutputStream fileOut = new FileOutputStream("Datos.ser"); 
  ObjectOutputStream out = new ObjectOutputStream(fileOut)){
      
      out.writeObject(datos);

    } catch (IOException e) {
      System.out.println("Error: No se pudo realizar la transmisión.");
    }

  }

  public static void Eliminar(int x){
    LinkedHashMap<Integer, Registro> eliminar = Leer();
    
    for(Integer id : eliminar.keySet()){
      if(id == x){
        eliminar.remove(id);
        break;
      }
    }

    try (FileOutputStream fileOut = new FileOutputStream("Datos.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut)){

    out.writeObject(eliminar);

    }catch(IOException e){
    System.out.println("Error.");
    }

  }

  public static LinkedHashMap<Integer, Registro> InputAdd(int maxID){
    Scanner reader = new Scanner (System.in);
    int cant = 0; 

    LinkedHashMap<Integer, Registro> datos = new LinkedHashMap<>();
    
    ArrayList<Mascotas> mascotasAL = new ArrayList<>();
    Registro reg = new Registro(new Clientes(), mascotasAL);

    
        reg.getClientes().setId(maxID);
 
        System.out.println("ID del cliente y mascota(s): "+maxID);

        System.out.println("Nombre del Cliente: ");
        reg.getClientes().setNombre(reader.nextLine());

        System.out.println("Domicilio del Cliente: ");
        reg.getClientes().setDomicilio(reader.nextLine());
        
        System.out.print("DNI del Cliente: ");
        reg.getClientes().setDni(reader.nextInt());
    reader.nextLine();

        System.out.print("Cantidad de Mascotas: ");
        cant = reader.nextInt();
    reader.nextLine();
        reg.getClientes().setCantMasc(cant);
        System.out.println("");

    for(int i=1; i<=cant; i++){

      Mascotas mascota = new Mascotas();
      mascota.setId(maxID);
      mascota.setNumero(i);

      System.out.println("Datos de mascota N°:"+i);
      System.out.println("Nombre de la mascota");
      mascota.setNombre(reader.nextLine());
      mascota.setDomicilio(reg.getClientes().getDomicilio());
      System.out.println("Especie: ");
      mascota.setEspecie(reader.nextLine());
      System.out.println("Raza: ");
      mascota.setRaza(reader.nextLine());
      System.out.print("Edad: ");
      mascota.setEdad(reader.nextInt());
      reader.nextLine();
      System.out.println("Color: ");
      mascota.setColor(reader.nextLine());      
      System.out.println("");

      mascotasAL.add(mascota);
    }


        try {
      datos.put(maxID, reg);

        } catch (NullPointerException e) {
          System.out.println("No se puede invocar 'putAll()' de LinkedHashMap porque <local 2> está vacio no se que.... ");
        }

      return datos;

  }


} 
