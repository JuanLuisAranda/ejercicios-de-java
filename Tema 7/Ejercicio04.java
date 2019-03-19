package tema07;

/**
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    // Creamos los 3 arrays
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    // Creamos un bucle que genere números aleatorio para el primer array
    for(int i = 0; i < 20; i++){
      numero[i] = (int)(Math.random()* 100 ) + 1; // Math.random es como si fuera 0.9999 sin llegar a ser uno, por lo que hay que sumarle 1, así lo genera del 1 al 100 ambos incluidos
      System.out.println("El numero generado en el hueco " + i + " es: " + numero[i]);
    }
    
    System.out.println("--------------------------------------------------------");
    
    
    //Para el array cuadrado cojo el array numero
    for(int j = 0; j < 20; j++){
      cuadrado[j] = numero[j] * numero[j];
      System.out.println("El número generado en el hueco " + j + " es: " + cuadrado[j]);
    }
    
    System.out.println("--------------------------------------------------------");
    
    
    // De nuevo, vuelvo a coger el array numero multiplicado por 3 para que sea el cubo
    for(int k = 0; k < 20; k++){
      cubo[k] = numero[k] * numero[k] * numero[k];
      System.out.println("El número generado en el hueco " + k + " es: " + cubo[k]);
    }
  }
  
}
