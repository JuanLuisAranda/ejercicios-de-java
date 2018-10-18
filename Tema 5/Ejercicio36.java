/** 
 * Ejercicio 35
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio36 {

  public static void main(String[] args) {

    System.out.print("Introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int num = numero;
    int volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    if (num == volteado) {
      System.out.print("El número " + num + " es capicúa.");
    } else {
      System.out.print("El número " + num + " no es capicúa.");
    }
  }
}
