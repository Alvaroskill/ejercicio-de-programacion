public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {
    

    int[][] n = new int[4][6];
    
    int fila;
    int columna;
    
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        
        n[fila][columna] = (int)(Math.random() * 999 + 100);
        
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
      Thread.sleep(1000);
    }
    System.out.printf("|%7d   ", Total);
   }
  }


