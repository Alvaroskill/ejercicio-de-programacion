public class Ejercicio02 {
  public static void main(String[] args) {

    int[][] n = new int[4][6];
    
    int fila;
    int columna;
    
    System.out.println("Introduzca un número: ");
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }

    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int Total = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }

      Total += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", Total);
  }
}
