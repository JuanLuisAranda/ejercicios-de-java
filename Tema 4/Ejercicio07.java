/**
 * Ejercicio 7
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio07 {

  public static void main(String[] args) {

    System.out.println("Calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último introduzca la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
  }
}
