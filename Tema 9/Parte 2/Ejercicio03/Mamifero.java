package Ejercicios.Ejercicio03;

/**
 * Subclase de 'Animal'
 *
 * @author Juan Luis Aranda
 */
public abstract class Mamifero extends Animal {
  
  //Metodos
  void corre() {
    System.out.println("Mira como corre.");
  }
  
  void salta() {
    System.out.println("Mira como salta.");
  }
  
  void muerde() {
    System.out.println("OUCH!!!");
  }
}
