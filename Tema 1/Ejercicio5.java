/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Luis J. Sánchez
 */

public class Colores { // Clase principal
  public static void main(String[] args) {
    System.out.println("Lunes   Martes   Miércoles   Jueves   Viernes");
    System.out.println("\033[32mEED     \033[34mSINF     \033[35mPRO         \033[35mPRO      \033[34mSINF");
    System.out.println("\033[31mLM      \033[34mSINF     \033[35mPRO         \033[35mPRO      \033[34mSINF");
    System.out.println("\033[31mLM      \033[34mSINF     \033[35mPRO         \033[32mEED      \033[34mSINF");
    System.out.println("\033[33mBBDD    \033[35mPRO      \033[33mBBDD        \033[32mEED      \033[37mFOL");
    System.out.println("\033[33mBBDD    \033[35mPRO      \033[33mBBDD        \033[31mLM       \033[37mFOL");
    System.out.println("\033[33mBBDD    \033[35mPRO      \033[33mBBDD        \033[31mLM       \033[37mFOL");
  }
}
