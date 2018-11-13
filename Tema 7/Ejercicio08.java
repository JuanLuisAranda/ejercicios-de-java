package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 8
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra en pantalla la media de las");
    System.out.println("temperaturas a lo largo de un año.");
    int mes = 1;
    float[] temperatura = new float[12];
    for (int i = 0; i < 12; i++) {

      System.out.print("Dime la temperatura del mes " + mes + ": ");
      temperatura[i] = Float.parseFloat(s.nextLine());
      mes++;
    }
    System.out.println();
    for (int i = 0; i < 12; i++) {
      if (i < 9) {
        System.out.print(i + 1 + ":  ");
      } else {
        System.out.print(i + 1 + ": ");
      }
      for (int j = 0; j < temperatura[i] / 2; j++) {
        System.out.print("█");
      }
      System.out.println();
    }
  }
  
}
