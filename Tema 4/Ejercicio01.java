/**
 * 4. Sentencia Condicional
 *
 * 1. Ejercicio 1
 *
 * @author Juan Luis Aranda
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase(); 
    
    switch(dia) {
      case "lunes":
        System.out.println("Entornos de Desarrollo");
        break;
      case "martes":
        System.out.println("Sistemas Informáticos");
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Sistemas Informáticos");
        break;
      case "sábado":
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no existe.");
    }
  }
}
