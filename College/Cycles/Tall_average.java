// Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.

package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_20 {
    
  // Se ejecuta el programa
  public static void main(String[] args) {

    // Se definen las variables y se solicitan los datos requeridos
    int CantAlturas=0;
    float Altura=0, PromAltura=0, acom=0;
    Scanner Al=new Scanner(System.in);
    System.out.print("Digite la cantidad de alturas que va a digitar: ");
    CantAlturas=Al.nextInt();
    int Divisor=CantAlturas;
    while(CantAlturas>0){      
      System.out.print("Digite la altura: ");
      Altura=Al.nextFloat();
            
      // Se suma las alturas ingresadas      
      acom=acom+Altura;
      CantAlturas--;
    }

    // Se saca el promedio de las alturas y se imprime por consola
    PromAltura=acom/Divisor;
    System.out.println("La altura promedio es de: "+PromAltura);
  }
}
