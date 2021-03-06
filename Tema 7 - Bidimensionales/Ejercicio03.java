package tema07_2;

import java.util.Scanner;

/**
 * 
 * Ejercicio 3
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[4][5];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        array[i][j] =(100 + (int) (Math.random() * 900));
      }
    }
    System.out.println();
    int sumaFila = 0;

    for (int i = 0; i < 4; i++) {
      sumaFila = 0;
      for (int j = 0; j < 5; j++) {
        System.out.printf("%6d ", array[i][j]);
        sumaFila += array[i][j];
      }
      System.out.printf("| %6d ", sumaFila);
      System.out.println();
    }

    int sumaColumna = 0;
    int sumaTotal = 0;

    System.out.println("-------------------------------------------");
    for (int j = 0; j < 5; j++) {
      sumaColumna = 0;
      for (int i = 0; i < 4; i++) {
        sumaColumna += array[i][j];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%6d ", sumaColumna);
    }
      System.out.printf("| %6d ", sumaTotal);
  }
  
}
