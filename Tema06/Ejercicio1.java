
public class Ejercicio1 {
public static void main(String[] args) {
  System.out.println("Tirada de tres dados:");
  System.out.println("");
  
  int i = 0;
  int tirada = 0;
  int suma = 0;
  
  for (i = 1; i <= 3; i++) {
  tirada = (int)(Math.random()* 6 + 1 );
  System.out.println(tirada + " ");
  suma += tirada;
  
  }
  System.out.println("La suma de los tres dados es de: " + suma);
  }
}
