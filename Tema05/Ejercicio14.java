
public class Ejercicio14 {
public static void main(String[] args) {
  
  int base = 0;
  int exponente = 0;
  
  for (int i = 10; i > 0;){
    System.out.print("Introduce la base: ");
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el exponente: ");
    exponente = Integer.parseInt(System.console().readLine());
    double resultado = Math.pow (base, exponente);
    if ((base < 0) && (exponente < 0)){
    System.out.println ("No se puede ya que, el programa no admite números negativos");
  } else 
    System.out.println ("El resultado es " + resultado );
  
 }
}
}
  
