/**
 * Ejercicio 12
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio12 {
  public static void main(String[] args) {
  
    System.out.println("'Número Fibonacci'");
    System.out.println("Introduzca un número por teclado y te mostraré los primeros números de la serie de Fibonacci.");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    switch (numero) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(numero > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            numero--;
        }
    }    
    System.out.println();
  }
}
