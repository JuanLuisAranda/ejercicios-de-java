/**
 * Ejercicio 23
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio23 {

  public static void main(String[] args) {
    
    System.out.println("Este programa suma, hace la media y cuenta los números");
    System.out.println("que introduzcas hasta llegar a mil.");
    int i = 0;
    int suma = 0;
    int numero = 0;
    do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      suma = suma + numero;
      i++;
      
    } while (suma <= 10000);
    System.out.println(" ");
    System.out.println("Has introducido " + i + " números.");
    System.out.println("La media de los números es de " + suma / i + ".");
    System.out.println("El total acumulado es de " + suma + ".");
  }
}
