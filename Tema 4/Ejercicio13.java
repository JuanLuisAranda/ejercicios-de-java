/*
 * Ejercicio 13
 * 
 * "author Juan Luis Aranda
 * 
 */


public class Ejercicio13 {
	
	public static void main (String[] args) {
		
	int aux;	
		
	System.out.println("Este programa ordena tres números que introduzcas de menor a mayor.");
	System.out.println("Introduzca los números de forma aleatoria y pulsa INTRO: ");
	  
	int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    
    if (a > b) {
	  aux = a;
	  a = b;
	  b = aux;
    }
    if ( b > c) {
		aux = b;
		b = c;
		c = aux;
	}
	if (a > b) {
	  aux = a;
	  a = b;
	  b = aux;
	}
	
	System.out.println("Los números introducidos ordenados de menor a mayor son " + a + " < " + b + " < " + c);
	  
	}
}

