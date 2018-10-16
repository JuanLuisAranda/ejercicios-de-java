/**
 * Ejercicio 17
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
    int n = 0;
    int cuenta = 0;
    
    do {
      System.out.print("Introduce un número positivo: ");
      n = Integer.parseInt(System.console().readLine());
      
      if (n < 0) {
        System.out.println("El número no cumple las características solicitadas");
      }
    } while (n < 0);
    
    
    for (int i = n; i < (n + 100); i++){
      cuenta += i;
    }
    
    System.out.println("La suma de " + n + " más los 100 siguientes números es: " + cuenta);
  }
}
