// Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class Mayor {
    
  // Se ejecuta el programa
  public static void main(String[] args) {
        
    // Se solicita la información requerida
    Scanner teclado=new Scanner(System.in);
    int n1,n2,n3; 
    System.out.print("Ingrese el primer número: ");
    n1=teclado.nextInt();
    System.out.print("Ingrese el segundo número: ");
    n2=teclado.nextInt(); 
    System.out.print("Ingrese el tercer número: ");
    n3=teclado.nextInt();

    // Se valida que número es mayor y se imprime por consola
    if (n1>n2 && n1>n3){
      System.out.println("El número mayor es el número: " + n1);
    }
    if (n2>n1 && n2>n3){
      System.out.println("El número mayor es el número: " + n2);
    }
    if (n3>n1 && n3>n2){
      System.out.println("El número mayor es el número: " + n3);
    }
  }
}
