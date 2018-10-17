/**
 * Ejercicio 34
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio34 {

public static void main(String[] args) {
    System.out.println("Introduce dos números de la misma longitud, como mínimo un número par y otro impar.");
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int vol1 = 0;
    int vol2 = 0;
    int digitos1 = 0;
    int digitos2 = 0;
    int pares = 0;
    int impares = 0;

    while (num1 > 0) {
      vol1 = (vol1 * 10) + (num1 % 10);
      num1 /= 10;
    }

    while (num2 > 0) {
      vol2 = (vol2 * 10) + (num2 % 10);
      num2 /= 10;
    }

    while ((vol1 > 0) && (vol2 > 0)) {

      digitos1 = (vol1 % 10);
      digitos2 = (vol2 % 10);

      if ((digitos1 % 2 == 0)) {
        pares = (pares * 10) + digitos1;
      } else {
        impares = (impares * 10) + digitos1;
      }

      if ((digitos2 % 2 == 0)) {
        pares = (pares * 10) + digitos2;
      } else {
        impares = (impares * 10) + digitos2;
      }

      vol1 /= 10;
      vol2 /= 10;

    }
    System.out.println("Dígitos pares: " + pares);
    System.out.println("Dígitos impares: " + impares);
  }

}
