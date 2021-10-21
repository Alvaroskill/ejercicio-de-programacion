public class Ejercicio03{
  public static void main(String[] args) {
    System.out.println("Conversión de pesetas a euros");
    System.out.println("Introduce el número de pesetas que quieres convertir:");
    float Puesto = Float.parseFloat(System.console().readLine());
    double euros;
    euros = Puesto/166.386;
    System.out.printf("%.6f€", euros);
  }
}

