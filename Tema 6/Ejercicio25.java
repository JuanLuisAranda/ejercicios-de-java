package tema06;

/**
 * 
 * Ejercicio 25
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio25 {
  public static void main(String[] args) {
    int aleatorio;
    boolean esPrimo = true;
    
    
    for (int i = 1; i <=100; i++) {
      aleatorio = (int) (Math.random() * 191) + 10;
      
      for (int j = 2; j < aleatorio; j++) {
        if (aleatorio % j == 0) {
          esPrimo = false;
        }
      }
      
      if ((esPrimo) && (aleatorio != 5)) {
      System.out.print("#" + aleatorio + "# ");
      } else if (aleatorio % 5 == 0 && aleatorio != 5) {
        System.out.print("[" + aleatorio + "] ");
      } else {
        System.out.print(aleatorio + " ");
      }
}
  }
  
}
