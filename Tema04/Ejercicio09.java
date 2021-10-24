
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.print("Porfavor, introduzca lo que vale a: " );
    double a = Integer.parseInt(System.console().readLine() );
    System.out.print("Porfavor, introduzca lo que vale b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Porfavor, introduzca lo que vale c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double Total;
    double potencia;
    double Total2;
    double raiz;
    double numero;
    double division;
    
    potencia = b*b;
    numero = 4*a*c;
    raiz = Math.sqrt(potencia-numero);
    division= 2*a;
    Total = ((-b+raiz)/division);
    Total2 = ((-b-raiz)/division);
    if (Total == 0 && Total2 == 0){
    System.out.println ("Esta ecuación no tiene solución real");
  }
    else if (Total > 0 && Total2 > 0);{
    System.out.println("El resultado de la ecuacíon es: " + Total);
    System.out.println("El otro resultado de la ecuacíon es: " + Total2);
  }
    if (Total == 0 && Total2 == 0){
    System.out.println ("Esta ecuación no tiene solucion real");
  }
    else if (Total < 0 && Total2 < 0);{
    System.out.println("La ecuacion no se puede resolver");
  }
}
}
