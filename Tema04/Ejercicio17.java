
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Te voy a decir cual es la ultima cifra del número que vas a introducir");
    System.out.print("Porfavor, introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
  int numerofinal= numero%10;
    System.out.print("La ultima cifra de tu número es " + numerofinal);
    
  }
}
    
  
