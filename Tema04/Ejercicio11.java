
public class Ejercicio11{
  public static void main(String[] args) {
    
    System.out.print("Introduce la hora que desee, por favor:");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Introduce los minutos, por favor: ");
    int min = Integer.parseInt(System.console().readLine());

    int segundos =((hora * 3600) + (min * 60));
    int segundosRestantes =((24 * 3600) - segundos);
            
    System.out.printf("Desde las " + hora + " y " + min + " minutos hasta la medianoche faltan " + segundosRestantes + " segundos");
 }
}
