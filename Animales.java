import java.io.Serializable;

public abstract class Animales implements Serializable{
	protected String nombre;
	protected String domicilio;

  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getDomicilio(){
    return domicilio;
  }
  public void setDomicilio(String domicilio){
    this.domicilio = domicilio;
  }

  public Animales(){};

  public void MostrarInfo(){

  }


}



