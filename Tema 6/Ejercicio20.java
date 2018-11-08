package tema06;

import java.util.Scanner;

/**
 * 
 * Ejercicio 20
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Indique la capacidad en litros de la cuba: ");
    int altura = Integer.parseInt(s.nextLine());
    int agua = (int) (Math.random() * (altura + 1));
    for (int i = 0; i < altura; i ++) {
        System.out.print("\n*");
        for (int espacios = 0; espacios < 4; espacios++) {
          if (altura - i <= agua) {
          System.out.print("=");
          } else {
            System.out.print(" ");
          }
          
        }
        System.out.print("*");
      }
    System.out.println();

    // Línea inferior ////////////////////////////////////////////////////////
    for (int i = 0; i < 6; i++) {
      System.out.print("*");
    }
    
    System.out.print("\nLa cuba tiene una capacidad de " + altura + " litros");
System.out.println(" y contiene " + agua + " litros de agua");
        
  }
  
}
