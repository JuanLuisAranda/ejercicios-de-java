package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 15
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int mesa[] = new int[10];
    int mesasOcupadas = 0;
    int mesasLlenas = 0;
    int numClientes = 0;

    for (int i = 0; i < 10; i++) {
      mesa[i] = ((int) (Math.random() * 5));
      if (mesa[i] != 0) {
        mesasOcupadas++;
      }
      if (mesa[i] == 4) {
        mesasLlenas++;
      }
    }

    System.out.print("  Mesa nº   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %6d ", (i + 1));
    }
    System.out.println();
    System.out.print("  Ocupación ");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %6d ", mesa[i]);
    }
    System.out.println();

    do {
      System.out.print("¿Cuántos son? Pulse -1 para terminar: ");
      numClientes = Integer.parseInt(s.nextLine());
      if (numClientes == 4) {
        mesasLlenas++;
      }
      if ((numClientes < 1) || numClientes > 4) {
        System.out.println("Lo siento, sólo aceptamos grupos de 1 a 4 personas.");
      } else if (mesasLlenas == 10) {
        System.out.println("Lo siento, estamos llenos.");
      } else {
        for (int j = 0; j < 10; j++) {
          if (mesa[j] == 0) {
            mesa[j] = numClientes;
            System.out.println("Pase a la mesa " + (j + 1));
            mesasOcupadas++;
            break;
          }
          if (mesasOcupadas == 10) {
            if ((mesa[j] + numClientes) <= 4) {
              System.out.println("Pase a la mesa " + (j + 1));
              mesa[j] += numClientes;
              if (mesa[j] == 4) {
              mesasLlenas++;
              break;
              }
              break;
            }
            if (numClientes == 4) {
              System.out.println("Lo siento, estamos llenos.");
              break;
            }
          }
        }
      }
      System.out.println();
      System.out.print("  Mesa nº   ");
      for (int j = 0; j < 10; j++) {
        System.out.printf(" %6d ", (j + 1));
      }
      System.out.println();
      System.out.print("  Ocupación ");
      for (int j = 0; j < 10; j++) {
        System.out.printf(" %6d ", mesa[j]);
      }
      System.out.println();
} while (numClientes != -1);
  }
  
}
