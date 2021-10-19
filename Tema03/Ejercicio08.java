
public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Introduce las horas semanales: ");
    int HorasSemanales = Integer.parseInt(System.console().readLine());
    double Total;
    
    Total = (HorasSemanales*12);
   
    System.out.println("El empleado cobra " + Total + "€"); 
  }
}
