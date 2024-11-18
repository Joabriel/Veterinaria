package Veterinaria_ProgII;

class Mascotas extends Animales{
	private String especie;
	private String raza;
	private char sexo;
  private int edad;
  private double peso;
  private String color;
	private String estadoSalud; //(Buena, Estable, Crítico).

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

  public char getSexo(){
    return sexo;
  }
  public void setSexo(char sexo){
    this.sexo = sexo;
  }

  public int getEdad(){
    return edad;
  } 
  public void setEdad(int edad){
    this.edad = edad;
  }

  public double getPeso(){
    return peso;
  }
  public void setPeso(int peso){
    this.peso = peso;
  }

  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }

  public String getEstadoSalud(){
    return estadoSalud;
  }
  public void setEstadoSalud(String estadoSalud){
    this estadoSalud = estadoSalud;
  }

  public Animal(){}

  void Ingreso(String nombre){
    System.out.println(nombre+" ingresó a la veterinaria.");
  }

  void Vacunar(String nombre){
    System.out.println("La mascota: "+nombre+" esta vacunada!");
  }
  
  void Alimentar(String nombre){
    System.out.println("La mascota: "+nombre+" Comió.");
  }

  void Chek(boolean estadoSalud){ 
    
    if(estadoSalud equals(estadoSalud )){ //Bien
      Salida();
    }

  }

  void Salida(String nombre){
    System.out.println("La mascota: "+nombre+" vuelve a su casa."); 
  }
  

} 
