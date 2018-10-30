package tema06;

/**
 * 
 * Ejercicio 3
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    int numeroPalo = (int) ((Math.random() * 4) + 1);
    int numeroFigura = (int) ((Math.random() * 10) + 1);
      String nombrePalo = "";
      String nombreFigura;
                
      switch (numeroPalo) {
        case 1:
          nombrePalo = "espadas.";
          break;
        case 2:
          nombrePalo = "bastos.";
          break;
        case 3:
          nombrePalo = "oro.";
          break;
        case 4:
          nombrePalo = "copas.";
          break;
              }
        
        switch (numeroFigura) {
          case 1:
            nombreFigura = "As";
            break;
          case 8:
            nombreFigura = "sota";
            break;
          case 9:
            nombreFigura = "caballo";
            break;
          case 10:
            nombreFigura = "rey";
            break;
          default:
            nombreFigura = String.valueOf(numeroFigura);
        }
        
        System.out.println("Su carta generada es " + nombreFigura + " de " + nombrePalo);
    }
}
