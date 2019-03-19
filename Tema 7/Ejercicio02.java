package tema07;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    char[] simbolo = new char[10];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    System.out.println("El array simbolo contiene los siguientes elementos: ");
    for (int i = 0; i < 10; i++) {
      System.out.println(simbolo[i]);
    }
  }

}
