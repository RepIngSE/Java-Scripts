// Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, 
// en caso contrario informar el producto y la división del primero respecto al segundo.

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class SumayDiferencia {

  // Se ejecuta el programa  
  public static void main(String[] args) {
        
    // Se solicita la informacion requerida
    Scanner teclado=new Scanner(System.in);
    double n1,n2,suma,resta,producto,division = 0; 
          
    System.out.print("Ingrese el primer número:");
    n1=teclado.nextDouble();
    System.out.print("Ingrese el segundo número:");
    n2=teclado.nextDouble();

    // Se valida que número es mayor y así mismo se ejecuta una operación
    if (n1 > n2){
      suma = n1 + n2; 
      resta = n1 - n2; 

      // Se imprime por consola el resultado
      System.out.println("La suma del número 1 y número 2, es: " + suma); 
      System.out.println("La diferencia del número 1 y número 2 es: " + resta);
    }
    if (n1 < n2){
      division = n1 / n2; 
      producto = n1 * n2; 

      // Se imprime por consola el resultado
      System.out.println("La divisíón de los números es: " + division);
      System.out.println("El producto de los números es: " + producto);
    }
  }
}
