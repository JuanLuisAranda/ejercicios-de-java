/**
 * Ejercicio 13
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Introduce 10 números enteros y te diré cuales son positivos y cuales negativos: ");

    int negativo = 0;
    int positivo = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) > 0) {
      } else {
        negativo++;
      }
    }
    
    System.out.println("Ha introducido " + positivo + " positivos.");
    System.out.println("Ha introducido " + negativo + " negativos.");
  }
}
