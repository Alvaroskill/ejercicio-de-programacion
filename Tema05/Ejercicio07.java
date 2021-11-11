public class Ejercicio07 {
  public static void main(String[] args) {
    int intentos = 4;
    int codigo = 8679;
    int numero = 0;
    System.out.println("Control de acceso a la caja fuerte.");
    
    while((numero != codigo) && (intentos > 0)){
    System.out.print("Introduzca el código: ");
    numero = Integer.parseInt(System.console().readLine());
    System.out.println("");
      if((intentos > 0) && (numero != codigo)){
        System.out.println("Lo siento, esa no es la combinación para abrirla.");
        intentos--;
        
        
        if (intentos == 0) {
        System.out.println ("Se han acabado los intentos. La caja se ha bloqueado. Póngase en contacto con la empresa");
      } else {
        System.out.println("Te quedan " + intentos + " intentos");
        System.out.println("");
      } if((intentos == 0) && (numero != codigo))
        System.out.println("");
      } else if(numero == codigo){
        System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente.");
    }
    }
 
}
}
