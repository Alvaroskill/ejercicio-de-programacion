
public class Ejercicio5 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la altura del triángulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);

    System.out.print("Lo mismo, con la base del triangulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);

   int área; 
   área = (altura*base)/2;
    System.out.print("El área de este triángulo es de " + área +" metros cuadrados"); 
  } 
}
