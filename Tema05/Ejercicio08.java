public class Ejercicio08{
 public static void main(String[] args) {

      System.out.print("Introduzca el número para obtener su tabla: ");
      int n = Integer.parseInt(System.console().readLine());
      int s = 0;
      for (int i = 1; i<=11; s=n*(i++)) {
      System.out.println(s);
    }
  }
}

