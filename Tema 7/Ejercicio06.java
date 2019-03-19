package tema07;

import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    // Creamos el array
    Scanner s = new Scanner(System.in);
    int[] miArray = new int[15];

    //Pide los numeros y los lee
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduce un número: ");
      String linea = (s.nextLine());
      miArray[i] = Integer.parseInt(linea);
    }

    for (int elemento : miArray) {
      System.out.print(elemento + " ");
    }
    System.out.println("");

    //Creamos el nuevo array con la nueva posición
    int[] miArray2 = new int[15];

    int nuevoPrimero = miArray[14];

    for (int i = 1; i < 15; i++) {
      miArray2[i] = miArray[i - 1];
    }

    miArray2[0] = nuevoPrimero;

    for (int i = 0; i < 15; i++) {
      miArray[i] = miArray2[i];
    }

    System.out.println("");
    for (int elemento : miArray) {
      System.out.print(elemento + " ");
    }

  }

}
