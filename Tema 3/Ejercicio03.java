/**
 * Ejercicio 3.
 *
 * @author Juan Luis Aranda
 */

public class Ejercicio03 {
  public static void main(String[] args) {
	System.out.println("Convertidor de pesetas a euros ");
    System.out.print("Por favor, introduce la cantidad de pesetas que desea convertir en euros: ");
    double pesetas = Double.parseDouble(System.console().readLine());

    int euros = (int) (pesetas / 166);
    
    System.out.print(pesetas + " pesetas son " + euros + " euros.");
  }
}
