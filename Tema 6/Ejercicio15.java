package tema06;

/**
 * 
 * Ejercicio 15
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio15 {
  public static void main(String[] args) {
   int notas = (int)(Math.random() * 7 + 1);
    
    for (int cont = 0; cont < notas; cont++) {
      for (int i = 0; i < 4; i++) {
        int tipoNota = (int)(Math.random() * 7 + 1);
        switch (tipoNota) {
          case 1:
            System.out.printf(" Do ");
            break;
          case 2:
            System.out.printf(" Re ");
            break;
          case 3:
            System.out.printf(" Mi ");
            break;
          case 4:
            System.out.printf(" Fa ");
            break;
          case 5:
            System.out.printf(" Sol ");
            break;
          case 6:
            System.out.printf(" La ");
            break;
          case 7:
            System.out.printf(" Si ");
            break;
        }
      }
      System.out.printf("|");
    }
System.out.printf("|");
  } 
}
