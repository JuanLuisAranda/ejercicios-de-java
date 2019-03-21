package tema07;

import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int [10];
    int[] primo = new int [10];
    int[] noPrimo = new int [10];
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    int contador = 1;
    
    for (int i = 0; i < 10;i++) {
      System.out.print("Introduzca el número " + contador + ": ");
      array[i] = Integer.parseInt(s.nextLine());
      contador++;
      
    }
    
    
    
  }
  
}
