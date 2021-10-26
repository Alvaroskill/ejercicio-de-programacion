


public class Ejercicio01 {
  public static void main(String[] args) {
  
    System.out.println("Introduzca un día de la semana: ");
    System.out.println("------------------------------- ");
    System.out.println("1 Lunes"    );
    System.out.println("2 Martes "  );
    System.out.println("3 Miercoles");
    System.out.println("4 Jueves"   );
    System.out.println("5 Viernes " );
    
    int opcion = Integer.parseInt(System.console().readLine());
    


  switch (opcion) {
      case 1:
        System.out.print("Ha primera hora toca Programación");
        break;
    
      case 2:
        System.out.print ("Ha primera hora toca Programación");
        break;
    
      case 3:
        System.out.print ("Ha primera hora toca Sistemas Informáticos");
        break;
        
      case 4:
        System.out.print ("Ha primera hora toca Programación");
        break;
      
      case 5:
        System.out.print ("Ha primera hora toca Sistemas Informáticos");
        break;
        
      default:
        System.out.print("Lo sentimos ese número no esta en la elección.");
    }
  }
}
