package tema06;

import java.util.Scanner;

/**
 * 
 * Ejercicio 17
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Introduzca la altura y la anchura (mínimo 4)");
    Scanner s = new Scanner(System.in);
    System.out.print("Altura: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Anchura: ");
    int anchura = Integer.parseInt(s.nextLine());
    int xPez = (int) (Math.random() * (anchura - 2)) + 2;
    int yPez = (int) (Math.random() * (altura - 2)) + 2;
    System.out.println(xPez);
    System.out.println(yPez);
    
    // Línea superior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      
      // Parte intermedia //////////////////////////////////////////////////////
      for (int i = 2; i < altura; i ++) {
        System.out.print("\n*");
        if (i == yPez) {
          for (int espacios = 2; espacios < anchura; espacios++) {
            if (espacios == xPez) {
              System.out.print("&");
              xPez = 0;
            } else {
              System.out.print(" ");
            }
            yPez = 0;
          }
        } else {
          for (int espacios = 2; espacios < anchura; espacios++) {
              System.out.print(" ");
          }
        }
        System.out.print("*");
      }
      System.out.println();
      
      // Línea inferior ////////////////////////////////////////////////////////
      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      System.out.println("");
  }
  
}
