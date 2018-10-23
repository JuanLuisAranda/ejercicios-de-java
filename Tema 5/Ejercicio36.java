public class Ejercicio36 {

  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un número entero: ");
    long numero = Long.parseLong(System.console().readLine());
    
    long auxiliar = numero;
    
    // Le damos la vuelta al numero
    long numeroVolteado = 0;
    
    while (auxiliar > 0) {
      int digito = (int)(auxiliar % 10);
      auxiliar = auxiliar / 10;
      numeroVolteado = numeroVolteado * 10 + digito;
    }
    
    
    if (numero == numeroVolteado) {
      
    System.out.println("El " + numero + " es capicúa.");
    }
    else { 
      System.out.println("El " + numero + " no es capicúa.");
    
    }
  }
}
      
