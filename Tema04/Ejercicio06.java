
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Vamos a calcular el tiempo que tarda un objeto en caer desde una altura." );
    System.out.print("Porfavor, introduzca lo que vale la altura: " );
    double h = Double.parseDouble(System.console().readLine() );
     
    double numero;
    double Total;
    double g;
    
    g = 9.81;
    numero= (2*h)/g;
    
    Total=Math.sqrt(numero);
    
    if (Total == 0){
    System.out.println ("Esta ecuación no tiene solución real");
  }
    else if (!(Total == 0))
    System.out.printf("El tiempo que tarda en caer es de : " + Total + " segundos");
  }
}
