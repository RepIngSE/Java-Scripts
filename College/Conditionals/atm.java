// Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. 
// Mostrar lo que debe abonar el comprador
 
import java.util.Scanner;

// Se crea la clase
public class Articulo {

  // Se ejecuta el programa
    public static void main(String[] args) {
          
      // Se solicita la información requerida
      Scanner teclado=new Scanner(System.in);
      int precioart,cant_per,resta1,resta2 = 0; 
      System.out.print("Ingrese el precio de su articulo:");
      precioart=teclado.nextInt();
      System.out.print("Ingrese la cantidad de dinero que tiene:");
      cant_per=teclado.nextInt();

      // Se valida si el precio del articlo supera el dinero que tiene el cliente
      if (precioart > cant_per){
        
        // si es así entonces se realiza una operacion para determminar cuanto debe
        resta1 = precioart - cant_per; 
        System.out.println("Su abono fue de: " + cant_per); 
        System.out.println("Queda debiendo por el articulo: " + resta1);
      } else {

        // de lo contrario, se muestra cuanto le deben devolver
        resta2 = cant_per - precioart; 
        System.out.println("La tienda le debe devolver: " + resta2);
      }
   }
}
