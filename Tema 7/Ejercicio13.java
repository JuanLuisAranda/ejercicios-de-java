package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 13
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[100];
    String respuesta = "";
    int maximo = 0;
    int minimo = 0;
    int menor = 501;
    int mayor = -1;

    for (int i = 0; i < 100; i++) {
      array[i] = ((int) (Math.random() * 501));
      System.out.print(array[i] + " ");
      if (array[i] < menor) {
        menor = array[i];
      }
      if (array[i] > mayor) {
        mayor = array[i];
      }
    }
    System.out.println();
    System.out.print("¿Quieres destacar el máximo o el mínimo? ");
    respuesta = (s.nextLine().toLowerCase());
    switch (respuesta) {
      case "maximo":
      case "máximo":
        maximo = 1;
        break;
      case "minimo":
      case "mínimo":
        minimo = 1;
        break;
      default:
        System.out.println("Lo siento, no te he entendido.");
        break;
    }
    if ((minimo == 0) && (maximo == 0)) {
      System.out.println();
    } else {
        if (maximo == 1) {
          for (int i = 0; i < 100; i++) {
            if (array[i] == mayor) {
              System.out.print("**" + array[i] + "** ");
            } else {
              System.out.print(array[i] + " ");
            }
          }
          System.out.println();
        } else {
          for (int i = 0; i < 100; i++) {
            if (array[i] == menor) {
              System.out.print("**" + array[i] + "** ");
            } else {
              System.out.print(array[i] + " ");
              }
            }
          System.out.println();
                  
        }
      }
  }
}
