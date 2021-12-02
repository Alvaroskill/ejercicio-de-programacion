
public class Ejercicio22 {

  public static void main(String[] args) {
            
  System.out.print("Números primos comprendidos entre 2 y 100: ");

    boolean Primo = true;

    for (int n = 2; n <= 100; n++) {

      Primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          Primo = false;
        }
      }

      if (Primo) {
        System.out.print(n + ", ");
      }
    }
    System.out.println();
  }
}
