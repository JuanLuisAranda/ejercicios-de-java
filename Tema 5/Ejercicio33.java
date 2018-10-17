/**
 * Ejercicio 33
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio33 {

  public static void main(String[] args) {
    System.out.println("Este programa muestra una U con la altura que elijas.");
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());
    int h = altura;
    int espacios = altura - 1;

    for (int i = 1; i < altura; i++) { // Lado izquierdo.
      System.out.print("*");
      for (int j = 0; j < espacios; j++) { // Espacios.
        System.out.print(" ");
      }
      System.out.println("*"); // Lado derecho.
    }
    System.out.print(" ");
    for (int k = 1; k < altura; k++) {
      System.out.print("*");
    }
  }
}
