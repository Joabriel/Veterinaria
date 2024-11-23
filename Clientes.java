public class Clientes extends Animales{
  private int id;
  private int dni;
  private int cantMasc;

  public Integer getId(){
    return id
  }
  public void setId(Integer id){
    this.id = id;
  }

  public Integer getDni(){
    return dni;
  }
  public void setDni(Integer dni){
    this.dni = dni;
  }

  public Integer getCantMasc(){
    return cantMasc;
  }
  public void setCantMasc(Integer cantMasc){
    this.cantMasc = cantMasc;
  }

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
