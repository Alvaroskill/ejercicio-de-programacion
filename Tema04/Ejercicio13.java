
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Vamos a ordenar los números que introduzcas de menor a mayor" );
    System.out.print("Porfavor, introduzca el primer número: " );
    int uno=Integer.parseInt(System.console().readLine() );
    System.out.print("Porfavor, introduzca el segundo número: " );
    int dos=Integer.parseInt(System.console().readLine() );
    System.out.print("Porfavor, introduzca el tercer número: " );
    int tres=Integer.parseInt(System.console().readLine() );
    
    
    
    
    if (uno > dos && dos < tres && tres > dos){
    System.out.println("Este es el orden \n" + dos + "\n" + tres + "\n" + uno);
  }
    if (tres > dos && tres > uno && uno > dos){
    System.out.println ("Este es el orden \n" + dos + "\n" + uno + "\n" + tres);
  }
    if (dos > tres && dos > uno && uno > tres){
    System.out.println ("Este es el orden \n" + tres + "\n" + uno + "\n" + dos);
  }
    if (uno > dos && tres > uno && dos > uno){
    System.out.println ("Este es el orden \n" + uno + "\n" + dos + "\n" + tres);
  }
    if (tres > dos && tres > uno && dos > uno){
    System.out.println ("Este es el orden \n" + uno + "\n" + dos + "\n" + tres);
  }
 }
}

