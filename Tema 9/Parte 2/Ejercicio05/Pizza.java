package paquetes_de_fuentes;

/**
 *
 * @author Juan Luis Aranda
 */
public class Pizza {
  
  //Atributos 
  
  private final String tamano, tipo;
  private String estado;
  private static int totalPedidas = 0, totalServidas = 0;
  
  //Constructor
  
  public Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.totalPedidas++;
    
  }
  
  //Getters

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }
  
  //Métodos



  @Override
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ",  " + this.estado;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("Esa pizza está servida.");
}
  
  }
  
}
