/**
 * Ejercicio 22
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio22 {
  public static void main(String[] args) {
  
    System.out.println("Números primos entre el 2 y el 100.");
    boolean primo = true;
    for (int n = 2; n <= 100; n++) {

      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print(n + ", ");
      }
    }
  }
}
