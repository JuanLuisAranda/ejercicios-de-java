package tema06;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio05 {
  public static void main(String[] args) {
  int suma = 0;
    int minimo = 199;
    int maximo = 100;
    for (int contador = 0; contador < 50; contador++) {
      int numero = (int) (Math.random() * 100) + 100;
      suma += numero;
      System.out.print(numero + " ");
      if (numero < minimo) {
        minimo = numero;
      } else if (numero > maximo) {
        maximo = numero;
      }
    }
    int media = suma / 50;
    System.out.println("\nEl número máximo es " + maximo);
    System.out.println("El número mínimo es " + minimo);
    System.out.println("La media de todos los números es " + media);
  }
  
}
