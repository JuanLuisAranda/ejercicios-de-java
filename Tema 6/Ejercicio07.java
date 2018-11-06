package tema06;

/**
 * 
 * Ejercicio 7
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    int columnas = 3;
    int resultado;
    int filas = 1;

    while (filas <= 15) {
      System.out.printf("%4d. |", filas);

      if (filas == 15) {
        columnas = 1;
      }
      int apuesta = 1;
      while (apuesta <= columnas) {
        resultado = (int) (Math.random() * 3) + 1;
        switch (resultado) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
            break;
          default:
        }
        apuesta++;
      }
      System.out.println();
      filas++;
}   
  }
}
