public class Ejercicio11 {

  public static void main(String[] args) {
    
    double numero = 0.0;
    
    System.out.print("Introduzca el número: ");
    numero = Double.parseDouble(System.console().readLine());
    
    for(int i = 0; i <= 5; i++){
    double cuadrado = Math.pow((numero + i), 2);
    double cubo = Math.pow ((numero + i), 3);
    System.out.printf("|    %.2f     | %.2f     ||  %.2f  |\n",numero + i, cuadrado, cubo);
    }
    
  
 
    }
  }

