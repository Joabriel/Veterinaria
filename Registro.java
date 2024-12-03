class Registro{
  private Clientes clientes;
  private Mascotas mascotas;

  public Clientes getClientes(){
    return clientes;
  }
  public void setClientes(Clientes clientes){
    this.clientes = clientes;
  }

  public Mascotas getMascotas(){
    return mascotas;
  }
  public void setMascotas(Mascotas mascotas){
    this.mascotas = mascotas;
  }

  public Registro(){}

  public Registro(Clientes clientes, Mascotas mascotas){
    this.clientes = clientes;
    this.mascotas = mascotas;
  }

  @Override
  public String toString(){
    return clientes.toString()+" - "+mascotas.toString();
  }

}
