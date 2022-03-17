import java.util.ArrayList;
import java.util.Collections;

 
/*Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.*/

 public class Ejercicio03{
	 
	 public static void main (String[] args){
		 
		 ArrayList<Integer> n = new ArrayList<Integer>();
		 
		 System.out.println("Introduzca 10 números: ");
		 
		  for (int i = 0; i < 10; i++) {
			
			n.add(Integer.parseInt(System.console().readLine()));
    }
		
		Collections.sort(n);
			
		System.out.println("Los 10 números almacenados, ordenados son: " + n);
	
  }
}
