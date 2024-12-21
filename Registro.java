import java.io.Serializable;
import java.util.ArrayList;

class Registro implements Serializable{
  private Clientes clientes;
  private ArrayList<Mascotas> mascotas;

  public Clientes getClientes(){
    return clientes;
  }
  public void setClientes(Clientes clientes){
    this.clientes = clientes;
  }

  public ArrayList<Mascotas> getMascotas(){
    return mascotas;
  }
  public void setMascotas(ArrayList<Mascotas> mascotas){
    this.mascotas = mascotas;
  }

  public Registro(){}

  public Registro(Clientes clientes, ArrayList<Mascotas> mascotas){
    this.clientes = clientes;
    this.mascotas = mascotas;
  }

  @Override
  public String toString(){
    return clientes.toString()+" //// "+mascotas.toString();
  }

}
