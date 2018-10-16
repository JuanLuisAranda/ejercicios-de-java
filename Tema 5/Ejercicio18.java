/**
 * Ejercicio 18
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    int nInicial;
    int nFinal;
    
    do {
      System.out.print("Introduce un número: ");
      nInicial = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce otro número (Distinto al anterior): ");
      nFinal = Integer.parseInt(System.console().readLine());
      
      if(nInicial == nFinal) {
        System.out.println("Los números deben de ser distintos entre ellos.");
      }
    } while (nInicial == nFinal);
    
    if (nInicial > nFinal) {
      int aux = nFinal;
      nFinal = nInicial;
      nInicial = aux;
    }
    
    for (int i = nInicial; i <= nFinal; i += 7) {
      System.out.print(i + " ");
    }
  }
}
