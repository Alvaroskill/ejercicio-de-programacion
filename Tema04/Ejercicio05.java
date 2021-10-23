

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Porfavor, introduzca lo que vale a: " );
    double a = Integer.parseInt(System.console().readLine() );
     System.out.print("Porfavor, introduzca lo que vale b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    double Total;
    
    Total = (-b/a);
    
    if (Total == 0){
    System.out.println ("Esta ecuación no tiene solución real");
  }
    else if (!(Total == 0))
    System.out.println("El resultado de la ecuacíon es: " + Total);
  }
}
