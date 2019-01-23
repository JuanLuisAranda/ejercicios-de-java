package Ejercicios.Ejercicio04;

/**
 * Pruebas de la clase Fraccion
 * 
 * @author Juan Luis Aranda
 */
public class PruebaFraccion {
  public static void main(String[] args) {
    //Definir las fracciones
    Fraccion f1 = new Fraccion(3,5);
    Fraccion f2 = new Fraccion(4,8);
    
    System.out.println("Fraccion 1: " + f1.toString());
    System.out.println("Fraccion 2: " + f2.toString());
    System.out.println();
    
    System.out.println("Fraccion 1 invertida: " + f1.invierte());
    System.out.println();
    System.out.println("Fraccion 2 simplificada: " + f2.simplifica());
    System.out.println();
    System.out.println("Multiplicacion: (" + f1.toString() + ") * (" + f2.toString() 
            + ") = " + f1.multiplica(f2) + " = " + f1.multiplica(f2).simplifica());
    System.out.println();
    System.out.println("División: (" + f1.toString() + ") / (" + f2.toString() 
            + ") = " + f1.divide(f2) + " = " + f1.divide(f2).simplifica());
    
  }  
}
