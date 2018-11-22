package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 14
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String[] array = new String[8];
    String[] colores = new String[8];
    int color = 0;
    String[] noColores = new String[8];
    int noColor = 0;
    for (int i = 0; i < 8; i++) {
      System.out.print("Dime la palabra nº " + (i + 1) + ": ");
      array[i] = (s.nextLine().toLowerCase());
      switch (array[i]) {
        case "verde":
          colores[color] = array[i];
          color++;
          break;
        case "rojo":
          colores[color] = array[i];
          color++;
          break;
        case "azul":
          colores[color] = array[i];
          color++;
          break;
        case "amarillo":
          colores[color] = array[i];
          color++;
          break;
        case "naranja":
          colores[color] = array[i];
          color++;
          break;
        case "rosa":
          colores[color] = array[i];
          color++;
          break;
        case "negro":
          colores[color] = array[i];
          color++;
          break;
        case "blanco":
          colores[color] = array[i];
          color++;
          break;
        case "morado":
          colores[color] = array[i];
          color++;
          break;
        default:
          noColores[noColor] = array[i];
          noColor++;
          break;
      }
      System.out.println();
    }
    for (int i = 0; i < color; i++) {
      System.out.print(colores[i] + " ");
    }
    for (int i = 0; i < noColor; i++) {
      System.out.print(noColores[i] + " ");
    }
      
  }
  
}
