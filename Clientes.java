public class Clientes extends Animales{
  private int id;
  private int dni;
  private int cantMasc;

  public Clientes(){};

  public Clientes(String nombre, String domicilio, int id, int dni, int cantMasc){
    super();
    this.id = id;
    this.dni = dni;
    this.cantMasc = cantMasc;
  }

  public String toString(){
    return "nombre: "+this.nombre+" domicilio: "+this.domicilio;

  }

}
