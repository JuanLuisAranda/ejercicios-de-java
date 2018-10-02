/**
 * Ejercicio 2
 *
 * @author Juan Luis Aranda
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos días!");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
      
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("¡Buenas noches!");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("Esa hora no existe.");
    }
  }
}
