

public class Ejercicio18 {

  public static void main(String[] args) {
  
    int numero = 0;
    int numero2 = 0;
    
    do {
      System.out.print("Introduzca un número entero: ");
      numero = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      numero2 = Integer.parseInt(System.console().readLine());
      
      if(numero == numero2) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (numero == numero2);
    
    if (numero > numero2) {
      int aux = numero;
      numero = numero2;
      numero2 = aux;
    }
    
    for(int i = numero; i <= numero2; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
