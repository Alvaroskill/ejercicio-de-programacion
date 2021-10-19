
public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Introduce el precio de la factura sin Iva: ");
    int PrecioSinIva = Integer.parseInt(System.console().readLine());
    double Total;
    
    Total = (PrecioSinIva*0.21) + PrecioSinIva;
   
    System.out.println(" El precio de la factura incluyendo el IVA sería " + Total + "€"); 
  }
}
