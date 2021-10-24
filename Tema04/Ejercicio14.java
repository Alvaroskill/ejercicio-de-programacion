
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Te vamos a decir si un número es par y divisible entre 5" );
    System.out.print("Porfavor, introduzca el número: " );
    int uno=Integer.parseInt(System.console().readLine() );
    
    if ((uno % 2) == 0){
    System.out.println("El numero que has elegido es par");
  } else {
    System.out.println("El numero que has elegido no es par");
  }
    if (( uno % 5) == 0 )  {
    System.out.printf("El número es divisible entre 5");
    } else {
    System.out.println("El numero que has elegido no es divisible entre 5");
  }
 }
}
