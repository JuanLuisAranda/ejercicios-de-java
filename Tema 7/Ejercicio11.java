package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 11
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    int contador = 1;
    

    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca el numero " + contador + ": ");
      array[i] = Integer.parseInt(s.nextLine());

      contador++;
      esPrimo = true;
      for (j = 2; j < array[i] - 1; j++) {
        if (array[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        primo[primos++] = array[i];
      } else {
        noPrimo[noPrimos++] = array[i];
      }
    }
    System.out.print("  Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf(" %6d ", i);
    }
    System.out.println();
    System.out.print("  Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf(" %6d ", array[i]);
    }
    System.out.println();
    for (i = 0; i < primos; i++) {
      array[i] = primo[i];
    }

    for (i = primos; i < primos + noPrimos; i++) {
      array[i] = noPrimo[i - primos];
    }

    System.out.print("  Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf(" %6d ", i);
    }
    System.out.println();
    System.out.print("  Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf(" %6d ", array[i]);
    }
  }
  
}
