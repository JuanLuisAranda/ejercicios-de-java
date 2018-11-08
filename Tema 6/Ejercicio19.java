package tema06;

/**
 * 
 * Ejercicio 19
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    int aleatorio;
    int maxPar = -100;
    int minImpar = 199;
    int suma = 0;
    
    for (int i = 1; i <= 50; i++) {
      aleatorio = (int) ((Math.random() * 301) - 100);
      System.out.print(aleatorio + " ");
      if ((aleatorio % 2 != 0) && (aleatorio < minImpar)) {
        minImpar = aleatorio;
      } else if ((aleatorio % 2 == 0) && (aleatorio > maxPar)) {
        maxPar = aleatorio;
        suma += aleatorio;
      }
    }
    System.out.println("\nEl número máximo par es el " + maxPar);
    System.out.println("El número mínimo impar es el " + minImpar);
System.out.println("La media de todos los números es: " + (suma/50));
  }
  
}
