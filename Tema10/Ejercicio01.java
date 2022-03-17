 import java.util.ArrayList;
 /*Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 todo el ArrayList sin usar ningún índice.*/
 public class Ejercicio01 {
	 
	 public static void main (String[] args){
		 
		 ArrayList<String> a = new ArrayList<String>();
		 
		 a.add("Pedro");
		 a.add("Alberto");
		 a.add("Carmén");
		 a.add("Pepito");
		 a.add("Sofia");
		 a.add("Álvaro");
		 
		 System.out.println("Aquí estan los 6 nombres: ");
		 
		 for(String nombre : a){
			 System.out.println(nombre);
			 }
	 }
	 
	 
 }
 
