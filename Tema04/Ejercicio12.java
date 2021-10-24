
public class Ejercicio12 {
  public static void main(String[] args) {
  
    System.out.println("Bienvenido al cuestionario de las asignaturas: ");
 int puntos = 0;
    String respuesta;
    
    System.out.print("1.- La ventilación focalizada es una medida de \n ");
    System.out.println("a) prevención\n b) protección individual\n c) protección colectiva");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("2.- Cual de estas opciones establece una variable: \n ");
    System.out.println("a) if\n b) switch\n c) int");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("3.- ¿Que es la APU? \n ");
    System.out.println("a) Un procesador\n b) Una gráfica\n c) Un dispositivo de alamacenamiento");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("4.- ¿Un compilador es lo mismo que un interprete?: \n ");
    System.out.println("a) No\n b) Si ");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("5.- ¿Qué signo de logica indica y?: \n ");
    System.out.println("a) !\n b) ||\n c) &&");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("6.- ¿Que significa que en el terminal de tu equipo aparezca un $ en tu usuario?: \n ");
    System.out.println("a) Eres administrador\n b) Eres usuario\n c) Solo indica el tipo de terminal");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.print("7.- ¿Que entiendes por PK?: \n ");
    System.out.println("a) Indentificador de objeto\n b) Caracteristica del objeto\n c) Establecer relaciones entre objetos");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("8.- Que se entiende por informatica: \n ");
    System.out.println("a) Información y Práctica\n b) Información y Automática\n c) Solo información");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.print("9.- El primer lenguaje de alto nivel fue: \n ");
    System.out.println("a) ensamblador\n b) Phyton\n c) Fortran ");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("10.- ¿Una placa base puede tener mas de un microprocesador?: \n ");
    System.out.println("a) No\n b) Si");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("\nEn total has conseguido " + puntos + " puntos.");
  }
}
