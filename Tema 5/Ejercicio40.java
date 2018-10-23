public class Ejercicio40 {

  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura del rombo: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int espaciosIzquierda = altura / 2;
    int espaciosCentro = -1;
    
    if ((altura >= 3) && (altura % 2 == 1)) {
      for (int h = 0; h < altura; h++) {
        // Espacios de la izquierda
        for (int e = 0; e < espaciosIzquierda; e++) {
          System.out.print(" ");
        }
        
      // Lado izquierdo  
      System.out.print("*");
      
      //Espacios centro
      for (int e = 0; e < espaciosCentro; e++) {
      System.out.print(" ");
      }
      
      // Lado derecho
      if ((h > 0) && (h < altura - 1)) {
        System.out.println("*");  
        } else {
        System.out.println(" ");
        }
        
        if (h < altura /2) {
          espaciosIzquierda--;
          espaciosCentro += 2;
        } else {
          espaciosIzquierda++;
          espaciosCentro -= 2;
        }
      }
    } else {
      System.out.println("La altura introducida no es válida, debe ser un número impar mayor o igual que 3");
      }
  }    
}
