public class Ejercicio10 {

  public static void main(String[] args) {
    
    
    
    int numero = 0;
    int cuentaNumeros = 0;
    int division = 0;
    int suma = 0;
  
  do {
    
    System.out.println("Por favor, vaya introduciendo números.");
    numero = Integer.parseInt(System.console().readLine());
      
    if (numero < 0){
    break;
  }
    cuentaNumeros++;
    suma += numero ;
    
  } while (numero > 0);
    division = suma/cuentaNumeros;
  
    System.out.println ("La media es " + division);
  
 
}
}

