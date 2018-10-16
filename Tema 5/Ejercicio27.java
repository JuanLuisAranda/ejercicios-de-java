/**
 * Ejercicio 27
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio27 {

  public static void main(String[] args) {
    System.out.println("Este programa muestra los múltiplos de 3 que hay entre 1 y el número que elijas.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Los múltiplos de tres entre 1 y " + numero + " son: ");
    for (int i = 1; i <= numero; i++) {
      if (i % 3 == 0) {
        System.out.print(i + ",");
      }
    }
  }
}
