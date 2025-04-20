package com.principal.modelos;

public class Mascotas extends Animales{
  private int numero;
	private String especie;
	private String raza;
  private int edad;
  private String color;
  
  public int getNumero(){
    return numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }

    public String getEspecie(){
    return especie;
  }
  public void setEspecie(String especie){
    this.especie = especie;
  }

  public String getRaza(){
    return raza;
  }
  public void setRaza(String raza){
    this.raza = raza;
  }

  public int getEdad(){
    return edad;
  } 
  public void setEdad(int edad){
    this.edad = edad;
  }

  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }

  public Mascotas(){
    super();
  }

  public Mascotas(int numero, String especie, String raza, int edad, String color){
    super();
    this.numero = numero;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.color = color;
  };


  void Vacunar(String nombre){
    System.out.println("La mascota: "+nombre+" esta vacunada!");
  }
  
  void Alimentar(String nombre){
    System.out.println("La mascota: "+nombre+" Comió.");
  }

/*  void Chek(bool
  void Salida(String nombre){
    System.out.println("La mascota: "+nombre+" vuelve a su casa."); 
  }
  */

  public String toString(){
    return "ID: "+this.id+" - Núm: "+this.numero+" Nombre: "+this.nombre+" Domicilio: "+this.domicilio+" Especie: "+this.especie+" Raza: "+this.raza+ " Edad: "+this.edad+" Color: "+this.color;
  }

} 
