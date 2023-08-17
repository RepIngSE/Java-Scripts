// Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene
// uno o dos dígitos. (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class Uno_Dos_digitos {

  // Se ejecuta el programa  
  public static void main(String[] args) {
  
    // Se solicitan los datos requeridos
    Scanner teclado=new Scanner(System.in);
    double n1; 
          
    System.out.print("Ingrese un número de 0 a 99: ");
    n1=teclado.nextDouble();
        
    // Se valida si el numero tiene uno o dos dígitos y se envía por consola un mensaje
    if (n1 >= 0 && n1<=9){
      System.out.println("Este número solo tiene un digito");
    } else {
      System.out.println("Este número tiene dos digitos");
    }
  }
}
