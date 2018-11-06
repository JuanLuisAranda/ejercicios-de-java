package tema06;

/**
 * 
 * Ejercicio 9
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    int cont = 0;
    int num;
    
    do {
      num = (int)(Math.random() * 101);
      if (num % 2 == 0) {
        System.out.printf(num + " ");
        cont ++;
      }
    } while (num != 24);
    
    System.out.println("\n\nCantidad de números = " + cont);
	}
}