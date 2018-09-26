/**
 * Ejercicio 2.
 *
 * @author Juan Luis Aranda
 */

public class Ejercicio02 {
  public static void main(String[] args) {
	System.out.println("Convertidor de euros a pesetas ");
    System.out.print("Por favor, introduce la cantidad de euros que desea convertir en pesetas: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
