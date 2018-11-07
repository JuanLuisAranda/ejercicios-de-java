package tema07;

import java.util.Scanner;

/**
 * 
 * Ejercicio 5
 *
 * @author Juan Lusi Aranda
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    //Creo el array
		Scanner s = new Scanner(System.in);
		int[] miArray = new int[10];
		
		//Lee los datos
		
		for(int i = 0; i<=9;i++){
			System.out.println("Introduce el numero: ");
			String linea = (s.nextLine());		
			miArray[i]= Integer.parseInt( linea ); 		
			
		}
		System.out.println("-----------------------");
		
		//Calcular el max y min 
		int maximo = miArray[0];
		int minimo = miArray[0];
		
		for(int elemento : miArray){ //Otra forma para recorrer un array
			if(elemento < minimo){
				minimo = elemento;
			}
			
			if(elemento > maximo){
				maximo = elemento;
			}
		}
		

				
		//Muestro los resultados		
		for(int i = 0; i<=9;i++){
			System.out.print(miArray[i]);
			
			if (miArray[i]==minimo){
				System.out.print(" minimo ");
			}
			
			if (miArray[i]==maximo){
				System.out.print(" maximo ");
			}
			System.out.println("");			
    }
  } 
}
