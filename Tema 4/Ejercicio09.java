/**
 * Ejercicio 9
 * 
 * @author Juan Luis Aranda
 */


public class Ejercicio09 {
	
  public static void main (String[] args) {
		
	double x1, x2;
	System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo: ");
	System.out.println("ax^2 + bx + c = 0");
		
	System.out.println("Por favor, introduzca los valores correspondientes: ");
		
	System.out.print("a = ");
	double a = Double.parseDouble(System.console().readLine());
	
	System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
    
   
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución real.");
    }
      
    
    if ((a != 0) && (b != 0) && (c == 0)) {
	  System.out.println("Soluciones de x: ");	
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }

    
    if ((a == 0) && (b != 0) && (c != 0)) {
	  System.out.println("Soluciones de x: ");
      System.out.println("x1 = x2 = " + (-c / b));
    }
    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b*b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }
		
  }
}

