package com.utils.funcs;
import com.utils.funcs.Mets;
import java.util.LinkedHashMap;


public class MaxID /*implements Metodos*/{

  Mets mets = new Mets();
  public LinkedHashMap<Integer,Registro> datosViejos = new LinkedHashMap<>(mets.Leer()); 
  public int maxID = 0;

  public int obtenerId(){

    for(Integer id : datosViejos.keySet()){
      if(id > maxID){
        maxID = id;
      }
    }

    maxID = maxID + 1;

    return maxID;
  }

  /*public MaxID(LinkedHashMap<Integer, Registro> datosViejos, int maxID){
    this.datosViejos = datosViejos;
    this.maxID = maxID;
  }*/

  /*
  public int getNum(){
    return this.maxID;
  }
    
  @Override
  public String toString(){
    return ""+this.maxID;
  }*/
}
