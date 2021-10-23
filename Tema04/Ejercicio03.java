public class Ejercicio03{
  public static void main(String[] args) {

    System.out.print("Indique un número del 1-7 y yo te diré el día de la semana: " );
    int dia = Integer.parseInt(System.console().readLine());
  
   
    if (dia == 1){
      System.out.println("Lunes");
    }
      
    if (dia == 2){
      System.out.println("Martes");
    }
    
    if (dia == 3){
      System.out.println("Miércoles");
    }
      
    if (dia == 4){
      System.out.println("Jueves");
 
    }
    
    if (dia == 5){
      System.out.println("Viernes");
 
    }
    if (dia == 6){
      System.out.println("Sábado");
 
    }
    if (dia == 7){
      System.out.println("Domingo");
 
    }
 
     
  }     
}
