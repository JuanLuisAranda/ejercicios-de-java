package tema06;

/**
 * 
 * Ejercicio 21
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    String nombreMoneda = "";
    String nombreTirada = "";
    int numeroTirada;
    int numeroMoneda = 0;
    
    for (int i = 0; i < 5; i++) {
      numeroTirada = (int) (Math.random() * 2);
      numeroMoneda = (int) (Math.random() * 8);
      switch (numeroTirada) {
        case 0:
          nombreTirada = "cara";
          break;
        case 1:
          nombreTirada = "cruz";
          break;
        default:
      }
      switch (numeroMoneda) {
        case 0:
          nombreMoneda = "1 céntimo";
          break;
        case 1:
          nombreMoneda = "2 céntimos";
          break;
        case 2:
          nombreMoneda = "10 céntimos";
          break;
        case 3:
          nombreMoneda = "20 céntimos";
          break;
        case 4:
          nombreMoneda = "50 céntimos";
          break;
        case 5:
          nombreMoneda = "1 euro";
          break;
        case 6:
          nombreMoneda = "2 euros";
          break;
        case 7:
          nombreMoneda = "5 céntimos";
          break;
        default:
      }
      System.out.println(nombreMoneda + " - " + nombreTirada);
    }
  }
  
}
