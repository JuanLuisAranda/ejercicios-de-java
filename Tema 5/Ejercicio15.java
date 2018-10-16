/**
 * Ejercicio 15
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce un número entero(+) como exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente2;
        
    for (int i = 1; i <= exponente; i++) {
        
      potencia = 1;
      exponente2 = i;
      
      for (int j = 0; j < exponente2; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
