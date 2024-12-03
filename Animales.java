import java.io.Serializable;

public abstract class Animales implements Serializable{
	protected int id;
  protected String nombre;
	protected String domicilio;

  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }

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

  

}



