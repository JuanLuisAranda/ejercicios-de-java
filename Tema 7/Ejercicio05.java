package tema07;

import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    // Creamos el array
    Scanner s = new Scanner(System.in);
    int[] miArray = new int[10];

    //Pide los numeros y los lee
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      String linea = (s.nextLine());
      miArray[i] = Integer.parseInt(linea);

    }

    System.out.println("----------------------------");

    // Calculamos el máximo y el mínimo
    int maximo = miArray[0];
    int minimo = miArray[0];

    for (int elemento : miArray) { // Esto es otra forma de recorrer un array
      if (elemento < minimo) {
        minimo = elemento;
      }

      if (elemento > maximo) {
        maximo = elemento;
      }
    }

    // Mostramos los resultados
    for (int i = 0; i < 10; i++) {

      if (miArray[i] == minimo) {
        System.out.println(miArray[i] + " (mínimo) ");
      
      }else if (miArray[i] == maximo){
      System.out.println(miArray[i] + " (máximo) ");
      } else{
        System.out.println(miArray[i]);
      }
    }

  }
}
