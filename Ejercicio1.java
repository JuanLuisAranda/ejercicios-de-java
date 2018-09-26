/**
* Ejercicio 1.
*
* @author Juan Luis Aranda
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    int x;
    int y;
    String multiplicacion;
    
    System.out.print("Por favor, introduce un número: ");
    multiplicacion = System.console().readLine();
    x = Integer.parseInt( multiplicacion );
    System.out.print("Por favor, introduce otro número: ");
    multiplicacion = System.console().readLine();
    y = Integer.parseInt( multiplicacion );
    System.out.println("La multiplicación de los dos números es " + (x * y));
  }
}
