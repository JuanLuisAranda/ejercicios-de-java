/**
 * Ejercicio 20
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio20 {

  public static void main(String[] args) {

    System.out.println("Este programa imprime una pirámide hueca por pantalla.");
    System.out.print("Dime qué carácter quieres utilizar en la pirámide: ");
    String a = System.console().readLine();
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaDada = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int espaciosFuera = alturaDada - 1;
    int espaciosDentro = 0;

    while (altura < alturaDada) {
      for (int i = 1; i <= espaciosFuera; i++) {
        System.out.print(" ");
      }

      System.out.print(a);
      for (int i = 1; i < espaciosDentro; i++) {
        System.out.print(" ");
      }

      if (altura > 1) {
        System.out.print(a);
      }

      System.out.println();
      altura++;
      espaciosFuera--;
      espaciosDentro += 2;
    }

    for (int i = 1; i < altura * 2; i++) {
      System.out.print(a);
    }

  }
}
