public class Ejercicio18 {

  public static void main(String[] args) {
    
    int numero, numeroInicial = 0;
    
    System.out.print("Por favor, introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      numeroInicial = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      numeroInicial = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      numeroInicial = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      numeroInicial = numero / 1000;
    }
    
    if ( numero >= 10000 ) {
      numeroInicial = numero / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + numeroInicial);
  }
}
