public class Clientes extends Animales{
  private int dni;
  private int cantMasc;

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

  public Clientes(){
    super();
  };

  public Clientes(int id, String nombre, String domicilio, int dni, int cantMasc){
    super();
    this.dni = dni;
    this.cantMasc = cantMasc;
  }

  @Override
  public String toString(){
    return "ID: "+this.id+" nombre: "+this.nombre+" domicilio: "+this.domicilio+" DNI: "+this.dni+" Cantidad de mascotas: "+this.cantMasc;

  }



}
