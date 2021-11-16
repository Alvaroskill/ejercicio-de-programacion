
public class Ejercicio15{
  public static void main(String[] args) {

    System.out.print("Por favor, introduce una base: ");
    long base = Long.parseLong(System.console().readLine());

    System.out.print("Por favor, introduce un exponente: ");
    long exponente = Long.parseLong(System.console().readLine());
    System.out.println();

    for (int i = 1; i < exponente; i++) {
      System.out.print(base + "^" + i + ", ");
    }
    System.out.print(base + "^" + exponente + ".");
  }
}
