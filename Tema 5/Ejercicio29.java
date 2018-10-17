/**
 * Ejercicio 29
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio29 {

  public static void main(String[] args) {

    System.out.println("Este programa te dice qué enteros menores a un número que introduzcas no son ");
    System.out.println("divisibles por otro que también introduzcas.");
    System.out.print("Introduzca el número del que salen los enteros menores a él: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    if (numero1 < 0) {
      System.out.println("¡Introduce un número positivo!");
    } else {
      System.out.print("Introduzca el número del que quieres saber qué enteros no son divisibles: ");
      int numero2 = Integer.parseInt(System.console().readLine());
      System.out.println("Los números enteros positivos menores a " + numero1 + "no divisibles por " + numero2 + " son:");
      for (int i = 1; i <= numero1; i++) {
        if ((numero2 % i) != 0) {
          System.out.print(i + ", ");
        }
      }
    }
  }
}
