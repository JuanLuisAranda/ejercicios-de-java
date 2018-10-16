/**
 * Ejercicio 19
 * 
 * @author Juan Luis Aranda
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
    // Introduce la altura
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
      
    // Introduce el relleno
    System.out.print("Introduce el carácter para rellenar: ");
    String r = System.console().readLine();
    
    int aux = h; // Conservamos el valor de h
    h = 1; // Reseteamos el valor de h
    int l = 1; // Establecemos la longitud en 1
    int e = (aux - 1); //Introduce el valor inicial de espacios
    
    do {
      int j = 1;
      while (j <= e) { // Mientras j sea menor o igual a e añade espacios
        System.out.print(" ");
        j++; // Incrementamos el valor de j en 1
      }
      // Pinta la lineas
      for (int i = 1; i <= l; i++) { // Pinta carácteres hasta llegar a la longitud deseada
        System.out.print(r); // Plasma el carácter
      }
      System.out.println(); // Introduce un salto de linea
      e--; // Disminuimos el valor de e en 1
      h++; // Incrementa el valor de h en 1
      l += 2; // Incrementa el tamaño de las lineas en 2
    } while (h <= aux); //Establece el límite de crecimiento de h
  }
}
