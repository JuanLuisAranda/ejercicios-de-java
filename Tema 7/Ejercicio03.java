package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 3
 *
 * @author Juan Luis Aranda
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    //Creo los tres arrays
	
	
	Scanner s = new Scanner(System.in);
	int[] miarray = new int[10];
	
	for(int i = 0; i<=9;i++) {
		String linea;
		System.out.println("Introduce el número ");
		linea = (s.nextLine());
		miarray[i]= Integer.parseInt( linea ); 		
		}
	System.out.println("-----------------------");
	
	for(int j = 9; j>=0;j--){
		System.out.println("En el hueco "+j+" tengo el número "+miarray[j]);
    }
    /////////////////
  }
  
}
