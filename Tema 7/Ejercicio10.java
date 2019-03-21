package tema07;

import java.util.Scanner;

/**
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
      if ((numero[i] % 2) == 0) {
        par[pares] = numero[i];
        pares++;
      } else {
        impar[impares] = numero[i];
        impares++;
      }
    }
// Se hacen los dos arrays por separado y otro bucle final para unir los dos 
    for (int i = 0; i < pares; i++) { //Empieza desde la posición 0 hasta que meta todos los pares
      numero[i] = par[i];
    }

    for (int i = pares; i < 20; i++) { //Desde donde terminan los pares hasta que se rellenan los 20 numeros
      numero[i] = impar[i - pares]; // Empieza donde se terminan los pares
    }
    
    System.out.print("\nPares: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(par[i] + " ");
    }
    System.out.print("\nImpares: ");
    for (int i = 0; i < 20; i++) {
      System.out.print(impar[i] + " ");
    }
    System.out.println("\n");
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    

  }

}
