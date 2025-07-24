package com.principal.modelos;

public class Clientes extends Animales{
  private int dni;
  private int cantPets;

  public Integer getDni(){
    return dni;
  }
  public void setDni(Integer dni){
    this.dni = dni;
  }

  public Integer getCantPets(){
    return cantPets;
  }
  public void setCantPets(Integer cantMasc){
    this.cantPets = cantPets;
  }

  public Clientes(){
    super();
  };

  public Clientes(int id, String nombre, String domicilio, int dni, int cantPets){
    super();
    this.dni = dni;
    this.cantPets = cantPets;
  }

  @Override
  public String toString(){
    return "ID: "+this.id+" nombre: "+this.nombre+" domicilio: "+this.domicilio+" DNI: "+this.dni+" Cantidad de mascotas: "+this.cantPets;

  }



}
