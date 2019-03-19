package tema07;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    // Definimos el Array
    int[] num;
    
    // Se reservan los huecos del Array
    num = new int [12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    // Muestro por pantalla el Array con un bucle for por ejemplo
    
    for(int i = 0; i < 12; i++){
      System.out.println(num[i] + "  ");
    }
  }
  
}
