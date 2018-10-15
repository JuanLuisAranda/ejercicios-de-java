/**
 * Ejercicio 11
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio11 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un número y a continuación te mostraré en tres columnas, el cuadrado y el cubo: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int contador = numero; contador < numero + 5; contador++) {
    
      System.out.printf("%4d %6d %8d\n", contador, contador * contador, contador * contador * contador);
    }
  }
}
