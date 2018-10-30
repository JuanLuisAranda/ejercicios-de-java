package tema06;

/**
 * 
 * Ejercicio 1
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int dado1 = (int) (Math.random()*6 + 1);
    int dado2 = (int) (Math.random()*6 +1 );
    int dado3 = (int) (Math.random()*6 +1 );

    System.out.println("En el primer dado ha salido el número " + dado1);
    System.out.println("En el primer dado ha salido el número " + dado2);
    System.out.println("En el primer dado ha salido el número " + dado3);
    System.out.println("La suma total de los tres dados es: " + (dado1 + dado2 + dado3));
  }
}
