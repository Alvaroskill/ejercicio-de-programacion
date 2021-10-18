
public class Ejercicio5 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la altura del rectángulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);

    System.out.print("Lo mismo, con la base del rectángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);

   int área; 
   área = altura*base;
    System.out.print("El área de este rectángulo es de " + área +" metros cuadrados"); 
  } 
}
