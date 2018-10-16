/**
 * Ejercicio 25
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio25 {
 
  public static void main(String[] args) {
    System.out.println("Este programa muestra números al revés.");
    System.out.print("Introduzca el número a girar: ");
    int numero = Integer.parseInt(System.console().readLine());
    if (numero < 0) {
      System.out.println("¡Usa números positivos!");
    } else {

    int aux = numero;
    int girado = 0;

    while (aux > 0) {
      girado = (girado * 10) + (aux % 10);
      aux /= 10;
    }

    System.out.println("Al girar el " + numero + " obtiene " + girado + ".");
    }
  }
}
