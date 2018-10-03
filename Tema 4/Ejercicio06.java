/**
 * Ejercicio 6
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio06 {

  final static double g = 9.81;

  public static void main(String[] args) {

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
