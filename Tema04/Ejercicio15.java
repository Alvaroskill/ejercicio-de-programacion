
public class Ejercicio15 {
  public static void main(String[] args) {
  
    System.out.println("Decide el lado de la piramide");
    System.out.println(" ---------------------------------------");
    System.out.println(" 1. Arriba");
    System.out.println(" 2. Abajo");
    System.out.println(" 3. Derecha");
    System.out.println(" 4. Izquierda");
    System.out.print("\n Elije una opción (1-4): ");
  
    int numero = Integer.parseInt(System.console().readLine());

    switch (numero) {
      case 1:
        System.out.println("     +       ");
        System.out.println("    +++      ");
        System.out.println("   +++++     ");
        System.out.println("  +++++++    ");
        System.out.println(" +++++++++   ");
        System.out.println("+++++++++++  ");
        
        break;
    
      case 2:
        System.out.println("+++++++++++ ");
        System.out.println(" +++++++++  ");
        System.out.println("  +++++++   ");
        System.out.println("   +++++    ");
        System.out.println("    +++     ");
        System.out.println("     +      ");
      
        break;
    
      case 3:
        System.out.println("+            ");
        System.out.println("+ +          ");
        System.out.println("+ + +        ");
        System.out.println("+ + + +      ");
        System.out.println("+ + + + +    ");
        System.out.println("+ + + +      ");
        System.out.println("+ + +        ");
        System.out.println("+ +          ");
        System.out.println("+            ");
        break;
        
      case 4:
        System.out.println("        +     ");
        System.out.println("      + +     ");
        System.out.println("    + + +     ");
        System.out.println("  + + + +     ");
        System.out.println("+ + + + +     ");
        System.out.println("  + + + +     ");
        System.out.println("    + + +     ");
        System.out.println("      + +     ");
        System.out.println("        +     ");
        break;
    }
  }
}
