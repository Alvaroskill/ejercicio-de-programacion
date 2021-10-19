
public class Ejercicio10{
  public static void main(String[] args) {
    System.out.println("Conversión de Mb a Kb");
    System.out.print("Introduce los Mb que quieres convertir: ");
    float Mb = Float.parseFloat(System.console().readLine());
    double Kb;
    Kb = Mb*1000;
    System.out.printf("%.2fKb", Kb);
  }
}
