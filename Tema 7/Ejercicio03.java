package tema07;

import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda
 *
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int [] miarray = new int[10];
    
    for(int i = 0; i < 10; i++){
      String linea;
      System.out.print("Introduce un número: ");
      linea = (s.nextLine());
      miarray[i] = Integer.parseInt(linea);
    }
    
    for(int j = 9; j >= 0; j--){
      System.out.println("En el hueco "+ j + " tengo el número " + miarray[j]);
    }
  }
  
}
