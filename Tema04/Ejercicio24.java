
public class Ejercicio24 {
  public static void main(String[] args) {

    
    int sueldoBase = 0;
    System.out.print("Introduzca el cargo del empleado (Prog.Junior, Prog. Senior, Jefe de proyecto): ");
    String cargoEmpleado = System.console().readLine();
    switch(cargoEmpleado) {
      case "Prog.Junior":
        sueldoBase = 950;
        break;
      case "Prog.Senior":
        sueldoBase = 1200;
        break;
      case "Jefe de proyecto":
        sueldoBase = 1600;
        break;
      default:
        System.out.println("El cargo introducido no es correcto.");}
    
    System.out.print("Inserte los días de viaje visitando clientes: ");
    int dias= Integer.parseInt(System.console().readLine());
    
    int dietas = dias*30;
    int sueldoBruto = sueldoBase + dietas;
    double IRPF = 0;
    System.out.print("Introduzca estado civil (soltero o casado): ");
    String EstadoCivil = System.console().readLine();
    switch(EstadoCivil){
      case "casado":
        IRPF = sueldoBruto*0.20;
        break;
      case "soltero":
        IRPF = sueldoBruto*0.25;
        break;
      }
  
    double sueldoNeto = sueldoBruto - IRPF;

    
    System.out.println("Sueldo base       " + sueldoBase  +  "€"  );
    System.out.println("Dietas            " + dietas      +  "€"  );
    System.out.println("Sueldo Bruto      " + sueldoBruto +  "€"  );
    System.out.println("Retención IRPF    " + IRPF        +  "€"  );
    System.out.println("Sueldo neto       " + sueldoNeto  +  "€"  );
  
  }
}

