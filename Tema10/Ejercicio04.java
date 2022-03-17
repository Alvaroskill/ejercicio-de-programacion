import java.util.ArrayList;
import java.util.Collections;

 
/*Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números.*/


 public class Ejercicio04{
	 
	 public static void main (String[] args){
		 
		 ArrayList<String> p = new ArrayList<String>();
		 
		 System.out.println("Introduzca 10 palabras: ");
		 
		  for (int i = 0; i < 10; i++) {
			
			p.add(System.console().readLine());
    }
		
		Collections.sort(p);
			
		System.out.println("Las 10 palabras almacenadas, ordenadas son: " + p);
	
  }
}
