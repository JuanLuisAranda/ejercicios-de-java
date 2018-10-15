/**
 * Ejercicio 10
 * 
 * @Juan Luis Aranda 
 */
public class Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.println("Este programa calcula la media de un conjunto de numeros introducidos.");
    System.out.println("Introduzca un número negativo para indicar que ha terminado de introducir números.");
    System.out.println("Por favor, introduzca su conjunto de números: ");
    
      int numeroIntroducido = 0;
      int contador = 0;
      int suma = 0;
      
      while  (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      contador++;
      suma = suma + numeroIntroducido;
      }
      
      System.out.println ("La media de los números " + (suma - numeroIntroducido) / (contador -1));
    }
}
