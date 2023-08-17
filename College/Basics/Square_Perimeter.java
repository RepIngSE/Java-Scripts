// Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo 
// (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)

package javaapplication2;
import java.util.Scanner;

// Se crea la clase
public class Perimetro {

  // Se ejecuta el programa
  public static void main(String[] args) {
      
    Scanner teclado=new Scanner(System.in);
    int ladocua, perimetro;

    // Se solicita ingresar un lado del cuadrado
    System.out.print("Ingrese el lado del cuadrado:");
    ladocua=teclado.nextInt();

    // Se hace la operacion respectiva y se envía por pantalla el resultado
    perimetro = ladocua * 4; 
    System.out.println("El peimetro del cuadrado es: " + perimetro );
  }
}
