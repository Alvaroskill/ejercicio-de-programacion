

public class Ejercicio8 {
  public static void main(String[] args) {
    char letra1 = 'a';
    char letra2 = 'b';
    char letra3 = 'c';
    char letra4 = 'd';
    char letra5 = 'e';
    String Cadena = letra1 + "" + letra2 + "" + letra3 + "" + letra4 + "" + letra5;

    System.out.println(Cadena); //puedo observar que al ser una variable int la cadena de los chars me de un número en vez de las cadenas de letras 
    
      /**Para arreglar el problema de que me saliera un número en vez de  las letras juntas he cambiado la variable int por una String y entre la suma de los chars
       he puesto una celda vacía para que se almacenasen las letras **/
  }
}

