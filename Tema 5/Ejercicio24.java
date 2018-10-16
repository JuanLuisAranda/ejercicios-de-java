/**
 * Ejercicio 24
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.println("Introduciendo una altura por teclado, crearé una pirámide de números.");
    System.out.println("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    
    int aux = h; // Conservamos el valor de h
    h = 1; // Reseteamos el valor de h
    int e = (aux - 1); //Introduce el valor inicial de espacios
    
    do {
      for (int i = 1; i <= e; i++) { // Mientras i sea menor o igual a e añade espacios, al mismo tiempo incrementa en 1 i
        System.out.print(" ");
      }
      for (int i = 1; i < h; i++) { // Mientras i sea menor a h añade i, al mismo tiempo incrementa en 1 i
        System.out.print(i);
      }
      for (int i = h; i > 0; i--) { // i adquiere el valor de h, y mientras i sea mayor a 0 se irá disminuyendo i en 1
        System.out.print(i);
      }
      System.out.println();
      h++; // Incrementamos en 1 el valor de h
      e--; // Disminuimos en 1 el valor de e
    } while (h <= aux); // Establece el límite de crecimiento de h
  }
}
