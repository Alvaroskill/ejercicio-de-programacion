

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double PrimerExamen = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce la nota que quieres sacar en el trimestre: ");
    double Trimestre = Double.parseDouble(System.console().readLine());
    double SegundoExamen;
    
    SegundoExamen = ((Trimestre)-(0.4*PrimerExamen))/0.6;
   
    System.out.println("Para sacar un " + Trimestre + " necesitas un " + SegundoExamen + " en el segundo examen "); 
  }
}
