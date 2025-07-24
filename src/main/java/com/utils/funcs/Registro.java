package com.utils.funcs;

import com.principal.modelos.Clientes;
import com.principal.modelos.Mascotas;

import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable{
  private Clientes clientes = new Clientes();
  private ArrayList<Mascotas> mascotas = new ArrayList();

  // Clientes.
  public Clientes getClientes(){
    return clientes;
  }
  public void setClientes(Clientes clientes){
    this.clientes = clientes;
  }

  // Mascotas.
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
