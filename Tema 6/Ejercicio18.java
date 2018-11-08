package tema06;

/**
 * 
 * Ejercicio 18
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    String nombreColor = "";
    int color1 = 0;
    int color2 = 20;
    int color3 = 13;
    int color = 0;
    String nombreColor1 = "";
    String nombreColor2 = "";
    String nombreColor3 = "";
    
    do {
      color1 = (int) ((Math.random() * 6) + 1);
      color2 = (int) ((Math.random() * 6) + 1);
      color3 = (int) ((Math.random() * 6) + 1);
    }
    while (color1 == color2 || color2 == color3 || color1 == color3);
    
    for (int i = 1; i <= 3; i++) {
      switch (i) {
        case 1:
          color = color1;
          break;
        case 2:
          color = color2;
          break;
        case 3:
          color = color3;
          break;
        default:
      }
      switch(color) {
        case 1:
          nombreColor = "rojo";
          break;
        case 2:
          nombreColor = "azul";
          break;
        case 3:
          nombreColor = "verde";
          break;
        case 4:
          nombreColor = "amarillo";
          break;
        case 5:
          nombreColor = "violeta";
          break;
        case 6:
          nombreColor = "naranja";
          break;
        default:
      }
      switch (i) {
        case 1:
          nombreColor1 = nombreColor;
          break;
        case 2:
          nombreColor2 = nombreColor;
          break;
        case 3:
          nombreColor3 = nombreColor;
          break;
        default:
      }
    }
    
    System.out.println("El primer cuarto será pintado de " + nombreColor1);
    System.out.println("El segundo cuarto será pintado de " + nombreColor2);
    System.out.println("El tercer cuarto será pintado de " + nombreColor3);
  }
}
