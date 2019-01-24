package paquetes_de_fuentes;

/**
 *
 * @author Juan Luis Aranda
 */
public class Zona {
  //Atributos
  private int entradasPorVender;

  
  //Constructor
  public Zona(int n) {
    entradasPorVender = n;
  }

  
  //Getter
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  
  //Métodos
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
              + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}
