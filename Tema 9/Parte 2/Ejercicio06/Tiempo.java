package paquetes_de_fuentes;

/**
 *
 * @author Juan Luis Aranda
 */
public class Tiempo {
    
    //Atributos
    
  private int segundos;
  
  //Constructor
  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }

  public Tiempo(int segundos) {
    this.segundos = segundos;
  }
  
  //Getters

  public int getSegundos() {
    return this.segundos;
  }
  
  //Metodos
  @Override
  public String toString() {
    int seg = this.segundos;
    int horas = seg / 3600;
    seg -= horas * 3600;
    int minutos = seg / 60;
    seg -= minutos * 60;
    
    if (this.segundos < 0) {
      return "-(" + (-horas) + "h " + (-minutos) + "m " + (-seg) + "s)";
    } else {
      return horas + "h " + minutos + "m " + seg + "s";
    }
  }
  
  public Tiempo suma(Tiempo t) {
    return new Tiempo(this.segundos + t.getSegundos());
  }
  
  public Tiempo resta(Tiempo t) {
  return new Tiempo(this.segundos - t.getSegundos());
  }
  
}
