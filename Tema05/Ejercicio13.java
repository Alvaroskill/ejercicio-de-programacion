

public class Ejercicio13 {
public static void main(String[] args) {
  
  int x = 0;
  int contadorNegativo = 0;
  int contadorPositivo = 0;
  
  for (int i = 10; i > 0;){
    System.out.println("Introduce el número: ");
    x = Integer.parseInt(System.console().readLine());
    i--;
    if (x > 0){
    contadorPositivo++;
  } else 
    contadorNegativo++;
  
 }
 
  
  System.out.println ("Hay " + contadorPositivo + " numeros positivos");
  System.out.println ("Hay " + contadorNegativo + " numeros negativos");
    
    
}



}
  
