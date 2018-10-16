/**
 * Ejercicio 16
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número para comprobar si es primo o no: ");
    int n = Integer.parseInt(System.console().readLine());

    boolean primo = true;
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }
}
