
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("¡Vamos a hacer un test para saber si tu pareja te es infiel!");
    System.out.println("Escribe v para verdadero y f para falso");
    
    String respuesta = "";
    int puntos = 0;
    
    
    System.out.print("\n1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n2. Ha aumentado sus gastos de vestuario: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n3. Ha perdido el interés que mostraba anteriormente por ti: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n4ª. Ahora se afeita y se asea con más frecuencia (");
    System.out.print("si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n5. No te deja que mires la agenda de su teléfono móvil: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n9. Has notado que últimamente se perfuma más: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }
    
    System.out.print("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("v")){
      puntos+=3;
    }

    if(puntos >= 0 && puntos <= 10){
      System.out.println("Has sacado " + puntos + "puntos, ¡enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if(puntos >= 11 && puntos <= 22){
      System.out.print("Has sacado " + puntos + "puntos, ¡ Quizás exista el peligro de otra persona en su vida");
      System.out.print(" o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if(puntos >= 22 && puntos <= 30){
      System.out.print("\nHas sacado " + puntos + " puntos, ¡ Tu pareja tiene todos los ingredientes para estar ");
      System.out.print("viviendo un romance con otra persona. Te aconsejamos que indagues un ");
      System.out.print("poco más y averigües que es lo que está pasando por su cabeza.");
    } else{
      System.out.println("\nTu puntuación es imposible, te aconsejamos que intentes ingresar las respuestas de nuevo");
    }
  }
}
