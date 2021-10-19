
public class Ejercicio11{
  public static void main(String[] args) {
    System.out.println("Conversión de Kb a Mb");
    System.out.print("Introduce los Kb que quieres convertir: ");
    double Kb = Double.parseDouble(System.console().readLine());
    double Mb = Kb/1000;
    System.out.printf("Son "+ Mb + "Mb");
  }
}
