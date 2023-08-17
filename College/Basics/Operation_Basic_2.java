// Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y 
// el producto del tercero y el cuarto.

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class SumayProducto {

  // Se ejecuta el programa
    public static void main(String[] args) {

      // Se solicita ingresar los números
      Scanner teclado=new Scanner(System.in);
      int n1,n2,n3,n4,suma,producto; 
      System.out.print("Ingrese el primer numero:");
      n1=teclado.nextInt();
      System.out.print("Ingrese el segundo numero:");
      n2=teclado.nextInt();
      System.out.print("Ingrese el tercer numero:");
      n3=teclado.nextInt();
      System.out.print("Ingrese el cuarto numero:");
      n4=teclado.nextInt();

      // Se realiza las operaciones requeridas
      suma = n1 + n2; 
      producto = n3 * n4; 

      // Se muestra el resultado por pantalla
      System.out.println("La suma de el número 1 y número 2 es: " + suma );
      System.out.println("El producto de el múmero 3 y número 4 es: " + producto );
    } 
}
