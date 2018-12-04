/**
 * Ejercicio 35
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio35 {

  public static void main(String[] args) {
    System.out.print("Introduce una altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espadelante = 0;
    int espadetras = h - 2;
    int centro = h - 1;
    int espacentro = (h / 2);
    int espadelante2 = (h / 2) - 1;
    int espadetras2 = 1;
    int altura2 = 1;

    if ((h >= 3) && (h % 2 != 0)) {

      while (altura <= (h / 2)) {

        for (int i = 1; i <= espadelante; i++) {
          System.out.print("*");
        }

        System.out.print("*");
        for (int i = 1; i <= espadetras; i++) {
          System.out.print(" ");
        }

        if (altura > 0) {
          System.out.print("*");
        }
        altura++;
        espadelante++;
        espadetras -= 2;
        System.out.println();
      }

      while (centro < h) {

        for (int i = 1; i <= espacentro; i++) {
          System.out.print("*");
        }

        espacentro--;
        centro++;
      }
      System.out.println("*");
      
      

      /*while (altura2 <= (h / 2)) {

        for (int i = 1; i <= espadelante2; i++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        for (int i = 1; i <= espadetras2; i++) {
          System.out.print(" ");
        }

        if (altura > 0) {
          System.out.print("*");
        }
        altura2++;
        espadelante2--;
        espadetras2 += 2;
        System.out.println();
      }*/

    } else {
      System.out.print("Error, el número debe ser mayor o igual a 3 e impar");
    }

  }
}
