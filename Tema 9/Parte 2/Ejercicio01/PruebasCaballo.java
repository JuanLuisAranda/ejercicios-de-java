package Ejercicios.Ejercicio01;

/**
 * Fichero para probar la clase caballo.
 * 
 *
 * @author Juan Luis Aranda
 */
public class PruebasCaballo {
  public static void main(String[] args) {
    //Crear el caballo
    Caballo Bellota = new Caballo("Bellota", "Marrón", "Pitbull", "Indefinido");
    
    //Mostrar varios datos del caballo
    System.out.println("Genero: " + Bellota.genero);
    System.out.println("Nombre: " + Bellota.nombre);
    
    //Acciones del caballo
    Bellota.correr();
    Bellota.relinchar();
    Bellota.saltar();
  }
}
