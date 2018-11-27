package tema07_2;

import java.util.Scanner;

/**
 * 
 * Ejercicio 01
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [][] array = new int [6][3];
    array[0][0] = 0;
    array[1][0] = 30;
    array[2][0] = 2;
    array[5][0] = 5;
    array[0][1] = 75;
    array[4][1] = 0;
    array[2][2] = -2;
    array[3][2] = 9;
    array[5][2] = 11;
    for (int i = 0; i < 3;i++) {
      for (int j = 0; j < 6; j++) {
        System.out.printf("%2d ",array[j][i]);
      }
      System.out.println();
    }
  }
  
}
