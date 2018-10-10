/**
 * Ejercicio 7
 * 
 * @author Juan luis Aranda
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int intentos = 0;
    int numIntroducido;
    
    System.out.println("Comprobaremos si usted conoce la combinación correcta de la caja fuerte. ");
    System.out.println("Tiene 4 intentos.");
    
    while (intentos < 4) {
      
      System.out.println ("Por favor, introduzca el número de la combinación de la caja fuerte: ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numIntroducido == 7813) {
        
        System.out.println ("La caja fuerte se ha abierto satisfactoriamente.");
        intentos = 4;
      } else {
        
        System.out.println ("Lo siento, esa no es la combinación.");
      }
      
      intentos++;
    }
    
  }
}  
