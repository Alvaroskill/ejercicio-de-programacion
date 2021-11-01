public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un día de la semana: ");
    String dia = System.console().readLine();

    int dia2 = 0;

    switch(dia) {
      case "lunes":
        dia2 = 0;
        break;
      case "martes":
        dia2 = 1;
        break;
      case "miércoles":
      case "miercoles":
        dia2 = 2;
        break;
      case "jueves":
        dia2 = 3;
        break;
      case "viernes":
        dia2 = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (dia2 * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
