
public class Ejercicio26 {
 public static void main(String[] args) {
    
    System.out.print("Introduzca el numero de entradas, por favor: ");
    int numeroDeEntradas = Integer.parseInt(System.console().readLine());
    
    double Total = 0;
    System.out.print("Introduzca el dia : ");
    String diaSemana = System.console().readLine();;
    switch(diaSemana){
        case "lunes":
        Total = 8*numeroDeEntradas;
        break;
        case "martes":
        Total = 8*numeroDeEntradas;
        break;
        case "miercoles":
        Total = 5*numeroDeEntradas;
        case "jueves":
        double par = numeroDeEntradas+2;
        if (numeroDeEntradas== par){
        Total = (8*0.11)*numeroDeEntradas;
        } else if (numeroDeEntradas == par+1){
        Total = (8*0.11)*par+8*1;
        }
        case "viernes":
        Total = 8*numeroDeEntradas;
        break;
        case "sábado":
        Total = 8*numeroDeEntradas;
        break;
        case "domingo":
        Total = 8*numeroDeEntradas;
        break;
    }
    
    double descuento = 0;
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    String Tarjeta = System.console().readLine();
    switch(Tarjeta){
      case "s":
        descuento = Total*0.1;
        break;
      case "n":
        descuento = 0;
        break;
      }
      double pagar = Total - descuento;
      System.out.printf(" Número de entradas: %d\n ", numeroDeEntradas);
      System.out.printf("Descuento: %.2f€\n ", descuento);
      System.out.printf("Precio total es de: %.2f€\n ", Total);
      System.out.printf("A pagar: %.2f€\n ", pagar);
    }
  }
  
