
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Vamos a calcular la  media de tres notas" );
    System.out.print("Porfavor, introduzca la nota de su primer examen: " );
    double a = Double.parseDouble(System.console().readLine() );
    System.out.print("Porfavor, introduzca la nota de su segundo examen: " );
    double b = Double.parseDouble(System.console().readLine() );
    System.out.print("Porfavor, introduzca la nota de su tercer examen: " );
    double c = Double.parseDouble(System.console().readLine() );
    
    double Total = (a+b+c)/3;
    if (Total < 5){
    
    System.out.println ("Has sacado un "+ Total + ". Deja el Lol y ponte a estudiar. ");
    System.out.println("Esto equivale a un insuficiente en tu boletín.");
    }
    if (Total == 6){
    
    System.out.printf("Has sacado un " + Total + ". Enhorabuena, te has marcado el examen tipo test y te ha salido redondo. ");
    System.out.println("Esto equivale a un bien en tu boletín.");
    }
    if (Total == 5){
    
    System.out.printf("Has sacado un " + Total + ". Estas aprobado pero, la fp dual ni la vas a oler. ");
    System.out.println("Esto equivale a un suficiente en tu boletín.");
    }
    if (Total >= 7 && Total <= 8){
    
    System.out.printf("Has sacado un " + Total + ". Enhorabuena, te has marcado el examen tipo test y te ha salido redondo.  ");
    System.out.println("Esto equivale a un notable en tu boletín.");
    }
    if (Total >= 9 && Total <= 10){
    
    System.out.printf("Has sacado un " + Total + ". Enhorabuena, te has marcado el examen tipo test y te ha salido redondo. ");
    System.out.println("Esto equivale a un sobresaliente en tu boletín.");
    }
    
  }
}
