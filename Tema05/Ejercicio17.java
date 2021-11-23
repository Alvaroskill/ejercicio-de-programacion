
public class Ejercicio17 {

  public static void main(String[] args) {
            
    System.out.print("Introduzca un número entero y le dire la suma de sus 100 siguientes numeros: ");
    int numero = Integer.parseInt(System.console().readLine());
    int suma = 0;
    
    for (int i = 1; i <= numero + 99; i++) {
    
    suma += i;
    
    }
    if (numero < 0){
    System.out.println("Lo siento, el número introducido debe ser positivo");
    } else if (numero >=0){
    System.out.println ("La suma de los 100 siguientes numeros al introducido es de: " + suma);
  }
}
}
