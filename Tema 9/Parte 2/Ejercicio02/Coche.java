package Ejercicios.Ejercicio02;

/**
 * Subclase de 'Vehículo'
 *
 * @author Juan Luis Aranda
 */
public class Coche extends Vehiculo {
  
  //Atributos
  private String Marca; //Marca del coche
  
  //Constructor
  public Coche(String Marca) {
    this.Marca = Marca;
  }
  
  //Getters
  public String getMarca() {
    return Marca;
  }
  
  //Métodos
  public void quemarRueda() {
    if ((Math.random() * 2) < 1) {
      System.out.println("Has quemado rueda a la perfección.");
    } else {
      System.out.println("Has quemado rueda pero has reventado una goma..");
    }
  }
}
