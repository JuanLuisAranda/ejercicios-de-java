/**
 * Ejercicio 9
 * 
 * @author Juan Luis Aranda
 */
 public class Ejercicio09 {
  public static void main(String[] args) {
  
    System.out.println("Introduce un número aleatoriamente y te diré cuantos dígitos tiene tu número.");
    System.out.println("Por favor, introduce tu número: ");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    int numDigito = 1;
    
    int numeroOriginal = numero;
    
    while (numero > 10) {
      
    
      numero /= 10;
      
      numDigito++;
    }
    System.out.println ("El numero " + numeroOriginal + " introducido tiene " + numDigito + " cifras ");
    }
}
