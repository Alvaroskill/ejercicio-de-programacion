
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Porfavor, introduzca las horas trabajadas durante la semana: ");
    
    int HorasSemanales = Integer.parseInt(System.console().readLine());
    double Total;
    double Total2;
    
    Total = (HorasSemanales * 12);
    Total2= (40*12 + (HorasSemanales - 40)*16);
   
    if (HorasSemanales <=40)
    System.out.println("El sueldo semanal que le corresponde es de " + Total + "€");
    if (HorasSemanales >40)
    System.out.println ("El sueldo semanal que el corresponde es de " + Total2 + "€");
  }
}
