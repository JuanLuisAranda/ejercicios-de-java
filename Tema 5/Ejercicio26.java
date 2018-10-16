/**
 * Ejercicio 26
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio26 {
 
  public static void main(String[] args) {
    System.out.println("Este programa te dice la posición del dígito que elijas de un número que des.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el dígito a saber (de izquierda a derecha): ");
    int digito = Integer.parseInt(System.console().readLine());
    System.out.println("El dígito " + digito + " está en la(s) siguiente(s) posición(es): ");
    
    int aux = numero;
    int girado = 0;
    int posicion = 1;
    int longitud = 0;
    
    if (aux == 0) {
      longitud = 1;
    }
    
    while (aux > 0) {
      girado = (girado * 10) + (aux % 10);
      aux /= 10;
      longitud++;
    }
    
    while (girado > 0) {
      if ((girado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      girado /= 10;
      posicion++;
    }

  }
}
