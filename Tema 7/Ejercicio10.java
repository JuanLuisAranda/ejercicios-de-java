package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 10
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    for (int i = 0; i < 20; i++) {
      int aleatorio = ((int) (Math.random() * 101));
      numero[i] = aleatorio;
      System.out.print(numero[i] + " ");
    }
    System.out.println();

    int pares = 0;
    int impares = 0;
    for (int i = 0; i < 20; i++) {
      if ((numero [i] % 2) == 0) {
       par[pares] = numero [i];
       pares++;
      } else {
        impar[impares] = numero[i];
        impares++;
      }
    }
   for (int i = 0; i < pares; i++) {
     System.out.print(par[i] + " ");
   }
   for (int i = 0; i < impares; i++) {
     System.out.print(impar[i] + " ");
}
  }
  
}
