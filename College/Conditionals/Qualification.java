// Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado"

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class Notasalumno {

  // Se ejecuta el programa  
  public static void main(String[] args) {
        
    // Se solicitan los datos requeridos
    Scanner teclado=new Scanner(System.in);
    double n1,n2,n3, promedio; 
          
    System.out.print("Ingrese la primera nota: ");
    n1=teclado.nextDouble();
    System.out.print("Ingrese la segunda nota: ");
    n2=teclado.nextDouble();
    System.out.print("Ingrese la tercer nota: ");
    n3=teclado.nextDouble();

    // Se realiza la operación requerida y se imprime por consola
    promedio = (n1 + n2 + n3) / 3; 
    System.out.println("Su promedio es: " + promedio);

    // Se valida si el promedio es mayor o igual a 7
    if (promedio >= 7){
      System.out.println("Promocionado");
    }
  }
}
