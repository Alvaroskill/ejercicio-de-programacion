
public class Ejercicio21 {

  public static void main(String[] args) {
    
    
    
    int numero = 0;
    int numerosImpares = 0;
    int suma = 0;
    int division = 0;
  
  do {
    
    System.out.println("Por favor, vaya introduciendo números.");
    numero = Integer.parseInt(System.console().readLine());

  } while (numero > 0);
    
    if (numero % 2 == 0){
    numero += 2;
    System.out.println("El mayor de los pares es: " + numero);
  } else {
    suma += numero;
    numerosImpares++;
    division = suma/numerosImpares;
    System.out.println (" La media de los impares es " + division);
  
    
  
 
}
}
}
