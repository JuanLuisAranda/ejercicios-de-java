/**
 * Ejercicio 28
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio28 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula factoriales.");
    System.out.print("Introduzca el número a 'factorializar': ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = numero;
    if (numero <= 0) {
      System.out.println("¡Tiene que ser un número entero positivo!");
    } else {
      for (int i = 1; i < numero; i++) {
        factorial = factorial * i;
      }
    }
    System.out.println("El factorial de " + numero + " es: " + factorial);
  }
}
