/**
* Ejercicio 10
* 
* @author Juan Luis Aranda
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("¿No sabes cuál es tu horóscopo? No importa, ¡este programa te lo dirá!");
    System.out.println("Introduzca los Datos en formato númerico");
    
    System.out.print("Introduce el mes en el que naciste: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el día en el que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String horoscopo = " ";
    
    switch (mes) {
		case 1:
        if (dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        System.out.println("Tu Horóscopo es: " + horoscopo);
        break;
	}
  }
}
