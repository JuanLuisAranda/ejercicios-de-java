/*
 * Ejercicio 12
 * 
 * "author Juan Luis Aranda
 * 
 */


public class Ejercicio12 {
	
	public static void main (String[] args) {
		int puntos = 0;
    String respuesta;
    
    System.out.println("TEST DE PROGRAMACIÓN 1º DAM");
    
    System.out.println("1. ¿Cuál es la nomenclatura correcta?");
    System.out.println("a) Sistem\nb) SYSTEM\nc) System"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("2. Indica el rotulador que al escribir en la pizzara se ve menos en clase.");
    System.out.println("a) Negro\nb) Verde\nc) Azul"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. ¿A qué hora se marchan los alumnos de transporte escolar?");
    System.out.println("a) 15:15\nb) 14:20\nc) 14:15"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("4. ¿Cuántas chicas hay en 1º DAM?");
    System.out.println("a) 2\nb) 1\nc) Ninguna"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál es la mayor RAM que tienen los ordenadores en 1º DAM?");
    System.out.println("a) 8\nb) 2\nc) 4"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
	

