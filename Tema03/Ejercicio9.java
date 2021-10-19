
public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura del cono en cm: ");
    double altura = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce el radio de la base en cm: ");
    double radio = Double.parseDouble(System.console().readLine());
    
    double Volumen;
    
    Volumen= (1.0/3.0*3.14*(radio*radio))*altura;
   
    System.out.println("El volumen del cono es de " + Volumen + "metros cubicos"); 
  }
}
