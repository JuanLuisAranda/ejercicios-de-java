package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 9
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero = 1;
    int[] array = new int[8];
    for (int i = 0; i < 8; i++) {
      System.out.print("Dime el numero " + numero + ": ");
      array[i] = Integer.parseInt(s.nextLine());
      numero++;
    }
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      System.out.print(array[i]);
      if ((array[i] % 2) == 0 ) {
        System.out.println("  par");
      } else {
        System.out.println("  impar");
      }
    }
  }
  
}
