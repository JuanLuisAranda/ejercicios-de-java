/**
 * Ejercicio 14
 * 
 * @author Juan Luis Aranda
 */
 public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Potencias");
    
    System.out.print("Introduce el valor de base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el valor de exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }

    System.out.println("El resultado es: " + potencia);
  }
}
