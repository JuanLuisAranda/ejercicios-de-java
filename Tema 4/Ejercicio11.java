/**
 * Ejercicio 11
 *
 * @author Juan Luis Aranda
 *
 */

public class SentenciaIf03 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduce una hora del día. ");
    System.out.println("En primer lugar, introduce las horas y luego los minutos.  ");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    int segTrans = (hora * 3600) + (minuto * 60);
    int segHastaMedianoche = (24 * 3600) - segTrans;
    
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segHastaMedianoche);
	
  }
}
