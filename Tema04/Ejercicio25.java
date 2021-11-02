
public class Ejercicio25 {
  public static void main(String[] args) {

    
    
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int cm = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Ahora introduzca la altura en cm: ");
    int altura= Integer.parseInt(System.console().readLine());
    
    int cm2 = cm*altura;
    double PrecioBandera = cm2*0.01;
    
    double Final1 = 0;
    double Final2 = 0;
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String bordado = System.console().readLine();
    switch(bordado){
      case "s":
        Final1 = 2.50;
        break;
      case "n":
        Final2 = 0;
        break;
      }
    System.out.println("Gracias, aqui tiene el desglose de su compra: ");
  
    double GastosDeEnvio = 3.50;
    double Total = Final1+PrecioBandera+GastosDeEnvio;
    double Total2 = Final2+PrecioBandera+GastosDeEnvio;
    
    System.out.println("Bandera de " + cm2 + "cm2: " + PrecioBandera +  "€"  );
    if (bordado.equals("s")){
      System.out.println("Con Escudo: " + Final1 +  "€");
    }
    if (bordado.equals("n")){
      System.out.println("Sin Escudo: " + Final2 +  "€");
    }
    
    System.out.println("Gastos de envio: " + GastosDeEnvio +  "€"  );
    if (bordado.equals("s")){
      System.out.println("El precio total es de: " + Total +  "€"  );
    }
    if (bordado.equals("n")){
      System.out.println ("El precio total es de : " + Total2 + "€");
    }
  
   }
  }

