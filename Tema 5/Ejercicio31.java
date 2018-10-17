/**
 * Ejercicio 31
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio31 {

  public static void main(String[] args) {
    System.out.println("Este programa pinta una L de la altura que quieras.");
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ((altura / 2) + 1); i++) {
      System.out.print("* ");
    }

  }
}
