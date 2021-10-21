public class Ejercicio02{
  public static void main(String[] args) {
    System.out.println("Conversión de euros a pesetas");
    System.out.println("Introduce el número de euros que quieres convertir:");
    float Puesto = Float.parseFloat(System.console().readLine());
    double euros;
    euros = Puesto*166.386;
    System.out.printf("%.2f pesetas", euros);
  }
}
