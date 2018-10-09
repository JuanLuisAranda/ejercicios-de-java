/*
 * Ejercicio 15
 * 
 * @author Juan Luis Aranda
 * 
 */


public class Ejercicio15 {
	
	public static void main (String[] args) {
		System.out.println("Programa constructor de pirámides.");
    System.out.println();
    System.out.println("Elige a qué dirección apuntará el vértice:");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecha");
    System.out.println();
    System.out.print("Introduce un número: ");
    int seleccion = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce un carácter para rellenar la pirámide: ");
    String c = System.console().readLine();
    System.out.println();
    
    if (c.length() > 1) {
      
      System.out.println("Introduce solo UN CARÁCTER por favor");
      
    } else {
      
        if (seleccion == 1) {
          
          System.out.println(" " + " " + " " + c);
          System.out.println(" " + " " + c + c + c);
          System.out.println(" " + c + c + c + c + c + c);
          System.out.print(c + c + c + c + c + c + c + c);
          
        } else if (seleccion == 2) {
          
          System.out.println(c + c + c + c + c + c + c + c);
          System.out.println(" " + c + c + c + c + c + c);
          System.out.println(" " + " " + c + c + c);
          System.out.print(" " + " " + " " + c);
          
        } else if (seleccion == 3) {
          
          System.out.println(" " + " " + " " + c);
          System.out.println(" " + " " + c + c);
          System.out.println(" " + c + c + c);
          System.out.println(c + c + c + c);
          System.out.println(" " + c + c + c);
          System.out.println(" " + " " + c + c);
          System.out.print(" " + " " + " " + c);
          
        } else if (seleccion == 4) {
          
          System.out.println(c + " " + " " + " ");
          System.out.println(c + c + " " + " ");
          System.out.println(c + c + c + " ");
          System.out.println(c + c + c + c);
          System.out.println(c + c + c + " ");
          System.out.println(c + c + " " + " ");
          System.out.print(c + " " + " " + " ");
          
        } else {
          
          System.out.print("Introduce una opción válida por favor");
        }
    }
  }
}
