public class Ejercicio19 {

  public static void main(String[] args) {
    
    int numero, numeroEntero = 0;
    
    System.out.print("Por favor, introduzca un número entero: ");
    numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( numero < 10 ) {
      numeroEntero = 1;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      numeroEntero = 2;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      numeroEntero = 3;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      numeroEntero = 4;
    }
    
    if ( numero >= 10000 ) {
      numeroEntero = 5;
    }
    
    System.out.println("El numero introducido tiene " + numeroEntero + " digitos");
  }
}
