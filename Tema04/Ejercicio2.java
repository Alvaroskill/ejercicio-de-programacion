
public class Ejercicio02 {
  public static void main(String[] args) {
  
    System.out.println("Introduzca la hora que desea: ");
  
    
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora <= 6 && hora >=12){
      System.out.println ("Buenos días"     );
    }
    if (hora >= 13 && hora <=20)
      System.out.println ("Buenas tardes"   );
    }
    if (hora >= 21 && hora <=5){
      System.out.println ("Buenas noches"   );
    }
}
