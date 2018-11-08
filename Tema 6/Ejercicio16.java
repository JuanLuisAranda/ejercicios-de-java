package tema06;

/**
 * 
 * Ejercicio 16
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    String nombreFigura = "";
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for (int i = 1; i <= 3; i++) {
      int numeroFigura = (int) (Math.random() * 5) + 1;
      switch (i) {
        case 1:
          figura1 = numeroFigura;
          break;
        case 2:
          figura2 = numeroFigura;
          break;
        case 3:
          figura3 = numeroFigura;
          break;
        default:
      }
      switch (numeroFigura) {
        case 1:
          nombreFigura = "corazón";
          break;
        case 2:
          nombreFigura = "diamante";
          break;
        case 3:
          nombreFigura = "herradura";
          break;
        case 4:
          nombreFigura = "limón";
          break;
        case 5:
          nombreFigura = "campana";
          break;
        default:
      }
      System.out.print(nombreFigura + " ");
    }
    if (figura1 == figura2 && figura1 == figura3) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas");
    } else if (figura1 == figura2 || figura1 == figura3 || figura2 == figura3) {
      System.out.println("\nBien, ha recuperado su moneda");
    } else {
      System.out.println("\nLo siento, ha perdido");
    }
  }
  
}
