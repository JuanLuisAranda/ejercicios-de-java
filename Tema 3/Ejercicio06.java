/**
 *Ejercicio 5
 *
 * @author Juan Luis Aranda
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    
	System.out.println("Calculadora de áreas de triángulos.");
    System.out.print("Por favor, introduzca la longitud de la base en centímetros: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("El área del triángulo es de " + (base * altura) /2 + " centímetros cuadrados."); 
  }
}
