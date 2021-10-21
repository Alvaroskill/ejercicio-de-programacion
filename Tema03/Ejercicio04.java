public class Ejercicio04 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(linea);

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt(linea);

   int suma; 
   suma = primerNumero + segundoNumero;
   
   int resta;
   resta = primerNumero - segundoNumero;

   int multiplicación;
   multiplicación = primerNumero * segundoNumero;

   int división;
   división = primerNumero/segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero           );
    System.out.println(" y el segundo es " + segundoNumero		         );
    System.out.println("La suma de ambos números es " + suma		         );
    System.out.println("La resta de ambos números es " + resta		         );
    System.out.println("La multiplicación de ambos números es " + multiplicación );
    System.out.println("La división de ambos números es " + división	         ); 
  } 
}
