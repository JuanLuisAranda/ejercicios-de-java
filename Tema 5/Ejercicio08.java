/**
 * Ejercicio 8
 * 
 * @author Juan Luis Aranda 
 */
public class Ejercicio08 {
    
  public static void main(String[] args) {
  
    System.out.println ("Introduce un número para mostrar su tabla de multiplicar");
    
    int numero = Integer.parseInt(System.console().readLine());
    int multiplo = 0;
    
    for (int i = 0; i <= 10; i++) {
    
      multiplo = numero * i;
      
      System.out.println (numero + " x " + i + " = " + multiplo);
      
      }
    }
}
