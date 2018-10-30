/**
 * Ejercicio 51
 * 
 * @author Juan Luis Aranda Navarro
 */
public class Ejercicio51 {

  public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
    long numIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numIntroducido;
    long volteado = 0;
    int auxiliar = 0;
    int numComido = 0;
    
    // Voltea el número introducido.
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    while (volteado > 0) {
      auxiliar = (int)(volteado % 10);
      volteado /= 10;
      if ((auxiliar !=0) && (auxiliar !=8)) {
        numComido *= 10; // numComido = numComido * 10
        numComido += auxiliar; // numComido = numComido + 10
      }
    }
    if (numComido == numIntroducido) {
      System.out.print("El gusano no se ha comido ningún número.");
    } else {
      System.out.print("El número después de ser comido es " + numComido);
    }
  }
}
