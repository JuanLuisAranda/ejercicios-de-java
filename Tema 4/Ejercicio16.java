/*
 * Ejercicio 16
 * 
 * @author Juan Luis Aranda
 * 
 */

public class Ejercicio16 {
  public static void main(String[] args) {

    System.out.println("A continuación se le van a realizar 10 preguntas sobre ");
    System.out.println("su pareja a las que deberá contestar verdadero o falso");
    System.out.println();
    
    int puntos = 0;

    System.out.println("Pregunta 1:");
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún");
    System.out.println("motivo aparente.");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta1 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta1 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 2:");
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta2 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 3:");
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta3 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta3 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 4:");
    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre)");
    System.out.println("o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta4 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta4 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 5:");
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta5 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta5 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 6:");
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando");
    System.out.println("estás tu delante");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta6 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta6 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 7:");
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar");
    System.out.println("bronceado/a");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta7 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta7 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 8:");
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener");
    System.out.println("mucho más trabajo");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta8 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta8 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 9:");
    System.out.println("Has notado que últimamente se perfuma más");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta9 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if (respuesta9 == 1) {
      
      puntos += 3;
    }
    
    System.out.println("Pregunta 10:");
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("1. Verdadero");
    System.out.println("2. Falso");
    System.out.println();
    System.out.print("Introduce tu respuesta: ");
    int respuesta10 = Integer.parseInt(System.console().readLine());
    System.out.println();
    
   if (respuesta10 == 1) {
      
      puntos += 3;
    }
    
    if (puntos >= 0 && puntos <= 10) {
      
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel");
      
    } else if (puntos >= 11 && puntos <= 22) {
      
      System.out.println("Quizás exsta el peligro de otra persona en su vida o en su");
      System.out.print("mente, aunque seguramente será algo sin importancia. No bajes la guardia");
      
    } else if (puntos >= 23 && puntos <= 30) {
      
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un");
      System.out.println("romance con otra persona. Te aconsejamos que indagues un poco");
      System.out.println("más y averigües que es lo que está pasando por su cabeza");
    }
  }
}

