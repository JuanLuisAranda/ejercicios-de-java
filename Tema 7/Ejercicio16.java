package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 15
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[20];
    int multiplo5 = 0;
    int multiplo7 = 0;

    for (int i = 0; i < 20; i++) {
      array[i] = ((int) (Math.random() * 401));
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.print("¿Quieres destacar los mútliplos de 5 o los de 7?(5/7) ");
   int respuesta = Integer.parseInt(s.nextLine());
    switch (respuesta) {
      case 5:  
        multiplo5 = 1;
        break;
      case 7:
        multiplo7 = 1;
        break;
      default:
        System.out.println("Lo siento, no te he entendido.");
        break;
    }
    if ((multiplo5 == 0) && (multiplo7 == 0)) {
      System.out.println();
    } else {
      if (multiplo5 == 1) {
        for (int i = 0; i < 20; i++) {
          if ((array[i] % 5) == 0) {
            System.out.print("**" + array[i] + "** ");
          } else {
            System.out.print(array[i] + " ");
          }
        }
        System.out.println();
      } else {
        for (int i = 0; i < 20; i++) {
          if ((array[i] % 7 ) == 0) {
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
