/**
 * Ejercicio 21
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    
    double valorIntroducido = 0;
    int numeros = 0;
    int numerosImpares = 0;
    double media = 0;
    double aux = 0;

    System.out.println("Calcula la media de los números (+) introducidos.");
    System.out.println("Puedes finalizar la cuenta introduciendoun valor negativo:");

    while (valorIntroducido >= 0) {
      valorIntroducido = Double.parseDouble(System.console().readLine());
      numeros++;
      if ((valorIntroducido % 2 != 0) && (valorIntroducido >= 0)) {
        numerosImpares++;
        media += valorIntroducido;
      }
      if (valorIntroducido % 2 == 0) {
        if (valorIntroducido >= aux) {
          aux = valorIntroducido;
        }
      }
    }
    System.out.println("Has introducido " + (numeros - 1) + " números.");
    System.out.println("La media de los números impares introducidos es: " + media / numerosImpares);
    System.out.println("El mayor de los pares es: " + aux);

  }
}
