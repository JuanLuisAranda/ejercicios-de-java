/**
 * Ejercicio 9
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    final double PI = 3.141592654;
   
    System.out.println("Volumen de un cono");
    System.out.print("Por favor, introduzca la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    double v = (1.0/3.0) * PI * r * r * h;
    System.out.println("El volumen del cono es de " +  v + " cm cúbicos");
  }
}
