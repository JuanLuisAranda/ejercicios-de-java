/**
 * Ejercicio 32
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio32 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Le da la vueta al número y calcula la longitud
    long volteado = 0;
    int suma = 0;
    while (numeroIntroducido > 0) {
      volteado = (volteado * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    } 

    System.out.print("Dígitos pares: ");
    while (volteado > 0) {
      long numero = volteado % 10;
      if (numero % 2 == 0) {
      System.out.print(numero + " ");
      suma += numero;
      }
  volteado /= 10;
    }
  
  System.out.println("\nSuma de los dígitos pares: " + suma);
  }
}

