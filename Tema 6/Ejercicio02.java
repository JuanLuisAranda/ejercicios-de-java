package tema06;

/**
 * 
 * Ejercicio 2
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    int numeroPalo = (int) ((Math.random() * 4) + 1);
    int numeroFigura = (int) ((Math.random() * 12) + 1);
      String nombrePalo = "";
      String nombreFigura;
                
      switch (numeroPalo) {
        case 1:
          nombrePalo = "corazones.";
          break;
        case 2:
          nombrePalo = "picas.";
          break;
        case 3:
          nombrePalo = "tréboles.";
          break;
        case 4:
          nombrePalo = "diamantes.";
          break;
              }
        
        switch (numeroFigura) {
          case 1:
            nombreFigura = "As";
            break;
          case 11:
            nombreFigura = "J";
            break;
          case 12:
            nombreFigura = "Q";
            break;
          case 13:
            nombreFigura = "K";
            break;
          default:
            nombreFigura = String.valueOf(numeroFigura);
        }
        
        System.out.println("Su carta generada es el " + nombreFigura + " de " + nombrePalo);
    }
}
