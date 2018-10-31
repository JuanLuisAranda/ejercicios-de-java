package tema06;

import java.util.Scanner;

/**
 * 
 * Ejercicio 6
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio06 {
  public static void main(String[] args) {
  System.out.println("Acabo de pensar en un número del 0 al 100");
    int numeroPensado = (int) (Math.random() * 101);
    Scanner s = new Scanner(System.in);
    for (int oportunidades = 1; oportunidades < 6; oportunidades++) {
      System.out.println("Intento " + oportunidades + "/5");
      System.out.print("Adivina el número que estoy pensado: ");
      int numeroIntroducido = Integer.parseInt(s.nextLine());
      if (numeroIntroducido == numeroPensado) {
        System.out.println("¡Enhorabuena, lo has adivinado!");
        oportunidades += 10;
      }
      if (numeroIntroducido > numeroPensado) {
        System.out.println("El número que estoy pensando es MENOR que el introducido.");
      } else if (numeroIntroducido < numeroPensado) {
        System.out.println("El número que estoy pensando es MAYOR que el introducido.");
      }
      if (oportunidades == 5) {
        System.out.println("Te has quedado sin oportunidades");
        System.out.println("El número que había pensado era el " + numeroPensado);
      }
    }
  } 
}
