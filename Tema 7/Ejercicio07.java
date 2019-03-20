package tema07;

import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] aleatorio = new int[100];
    int valor1;
    int valor2;
    
    for(int i = 0; i < 100; i++) {
      aleatorio[i] = (int)(Math.random()* 21);
      System.out.println(aleatorio[i] + " ");
    }
    
    System.out.print("Introduzca el valor que quiera sustituir en la lista: ");
    valor1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduza el valor por el que quiere ser sustituido: ");
    valor2 = Integer.parseInt(s.nextLine());
    
    for(int i = 0; i < 100; i++) {
      if(aleatorio[i] == valor1) {
        aleatorio[i] = valor2;
        System.out.println( " '" + aleatorio[i] + "' ");
      }else{
        System.out.println(aleatorio[i] + " ");
      }
      
    }
    
  }
  
}
