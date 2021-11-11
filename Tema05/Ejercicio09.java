public class Ejercicio09 {

  public static void main(String[] args) {
  
  int numero = 0;
  int digito = 0;
    
    System.out.print("Por favor, introduzca un número entero: ");
    numero =  Integer.parseInt(System.console().readLine());
  
  do {
    numero = numero/10;
    digito++;
    
  } while (numero > 0);
    System.out.println ("El número tiene " + digito + " cifras");
 }
}
