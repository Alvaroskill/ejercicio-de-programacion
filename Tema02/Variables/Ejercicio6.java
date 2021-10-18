public class Ejercicio6 {
  public static void main(String[] args) {
    int PrecioSinIva;
    double Total;

    PrecioSinIva = 45;
    Total = (PrecioSinIva*0.21) + PrecioSinIva;
   
    System.out.println(" El precio del producto sin IVA sería " + PrecioSinIva + "€" );
    System.out.println(" El precio del producto con IVA sería " + Total + "€"  	     ); 
  }
}
