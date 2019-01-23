package Ejercicios.Ejercicio02;
import java.util.Scanner;

/**
 * Archivo para probar las clases del ejercicio 02
 *
 * @author Juan Luis Aranda
 */
public class PruebaVehiculo {
  public static void main(String[] args) {
    boolean salir = false;
    int opcion = 0;
    int distancia = 0;
    Scanner s = new Scanner(System.in);
    Bicicleta Bici = new Bicicleta("Carretera");
    Coche Furgoneta = new Coche("Renault");
    do{
      //Menú
      System.out.println("==========Vehículos==========");
      System.out.println();
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println();
      System.out.print("Elige una opción (1-8):");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();
      
      //Opciones
      switch (opcion) {
        case 1:
          System.out.print("¿Cuantos Kms vas a pasear? ");
          distancia = Integer.parseInt(s.nextLine());
          Bici.recorre(distancia);
          System.out.println();
          break;
        case 2:
          Bici.caballitoBici();
          System.out.println();
          break;
        case 3:
          System.out.print("¿Cuantos Kms vas a pasear? ");
          distancia = Integer.parseInt(s.nextLine());
          Furgoneta.recorre(distancia);
          System.out.println();
          break;
        case 4:
          Furgoneta.quemarRueda();
          System.out.println();
          break;
        case 5:
          System.out.println("Con la bicicleta has recorrido " +
                  Bici.getKilometrosRecorridos()+ " Kms");
          System.out.println();
          break;
        case 6:
          System.out.println("Con el coche has recorrido " + 
                  Furgoneta.getKilometrosRecorridos()+ " Kms");
          System.out.println();
          break;
        case 7:
          System.out.println("En total has recorrido " + 
                   Vehiculo.getKilometrosTotales() + " Kms");
          System.out.println();
          break;
        case 8:
          System.out.println("Saliendo.");
          salir = true;
          break;
        default:
          System.out.println("La opcion seleccionada no es válida.");
          System.out.println();
      }
    } while (!salir);
  }
}
