package tema06;

/**
 * 
 * Ejercicio 10
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio10 {
  public static void main (String[] args) {
    
    int caracter;
    String caracterFin;
    
    for (int cont = 0; cont < 10; cont++) {
      caracter = (int)((Math.random() * 6) + 1);
      switch (caracter) {
        case 1:
          caracterFin = "*";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 2:
          caracterFin = "=";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 3:
          caracterFin = "-";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 4:
          caracterFin = ".";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 5:
          caracterFin = "|";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
        case 6:
          caracterFin = "@";
          for (int i = 0; i < ((Math.random() * 40) + 1); i++) {
            System.out.printf(caracterFin);
          }
          break;
      }
      System.out.println("");
    }
  }
}
