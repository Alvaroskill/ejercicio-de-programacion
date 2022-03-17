 import java.util.ArrayList;
 
/*Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.*/

 public class Ejercicio02 {
	 
	 public static void main (String[] args){
		 
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 
		     int minimo = 100;
			 int maximo = 0;
			 int suma = 0;
		     int tamano = (int)(Math.random() * 11 + 10);
		 
		for (int i = 0; i < tamano; i++) {
        a.add((int)(Math.random()*101));
    }
		for (int n: a) {
			
			suma+=n;
		
		if (n < minimo){
			
			minimo = n;
			
			}
		if (n > maximo){
			
			maximo = n;
			
			}
			
        
    }
    System.out.println("Los numeros aleatorios son: " + a);
    System.out.println("La suma total de los números es: " + suma);
    System.out.println("La media es: " + suma/tamano);
    System.out.println("El minimo es: " + minimo);
    System.out.println("El maximo es:" + maximo);
  }
}
 
