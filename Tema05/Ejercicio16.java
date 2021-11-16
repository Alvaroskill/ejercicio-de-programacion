
public class Ejercicio16 {

  public static void main(String[] args) {
            
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numero = Integer.parseInt(System.console().readLine());

    boolean Primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        Primo = false;
      }
    }
        
    if (Primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

  }
}



