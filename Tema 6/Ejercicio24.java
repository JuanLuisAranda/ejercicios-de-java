package tema06;

import java.util.Scanner;

/**
 * 
 * Ejercicio 24
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long numero = numeroIntroducido;
    int aux = 0;
    
// calcula la longitud del número
    int longitud = 0;
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    numero = numeroIntroducido;
            
    int posicion = (int) ((Math.random() * longitud) + 1);
    
    for (int i = 1; i < posicion; i++) {
      numero = (numero / 10);
    }
    System.out.println(longitud);
    System.out.println(posicion);
System.out.println((numero % 10));
  }
  
}
