// Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
 
package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class SumayPromedio {

  // Se ejecuta el programa
  public static void main(String[] args) {
       
    // se solicita la información requerida   
    Scanner teclado=new Scanner(System.in);
    double n1,n2,n3,n4,suma,promedio; 
       
    System.out.print("Ingrese el primer numero:");
    n1=teclado.nextDouble();
    System.out.print("Ingrese el segundo numero:");
    n2=teclado.nextDouble();
    System.out.print("Ingrese el tercer numero:");
    n3=teclado.nextDouble();
    System.out.print("Ingrese el cuarto numero:");
    n4=teclado.nextDouble();
       
    // Se realiza las operaciones correspondientes   
    suma = n1 + n2 + n3 + n4; 
    promedio = (n1 + n2 + n3 + n4) / 4; 
       
    // Se envía por consola el resultado solicitado    
    System.out.println("La suma de los números es: " + suma );
    System.out.println("El promedio de los números es: " + promedio );
  }
}
