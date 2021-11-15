public class Ejercicio12 {

  public static void main(String[] args) {
    
    int sumatorio = 0;
    int PrimerDigito = 0;
    int SegundoDigito = 1;
    
    System.out.print("Introduzca la cantidad de números que quiere: ");
    int repeticiones = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i < repeticiones; i++){
    if (i == 2){
    System.out.print("1, ");
  }
    System.out.print(sumatorio + ", ");
    sumatorio = PrimerDigito + SegundoDigito;
    PrimerDigito = SegundoDigito;
    SegundoDigito = sumatorio;
  
    }
  }
}
