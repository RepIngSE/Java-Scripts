// Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cuál de 
// las dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") 
// Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo. 
 
package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_24 {
    
  // Se ejecuta el programa
  public static void main(String[] args) {
        
    // Se solicita los datos respectivos
    int CantVal=15, NumListas=2;
    double Valores=0.0, ResultVal=0.0, Result=0.0;
    Scanner nume=new Scanner(System.in);

    // Se recorren las dos listas
    while (NumListas>0){      
      if(NumListas==2){
        // Se recorre la primer lista y se hacen las operaciones requeridas
        while(CantVal>0){      
          System.out.print("Digite el valor de lista 2: ");
          Valores=nume.nextDouble();      
          ResultVal+=Valores;
          CantVal--;
        }
      } 
      System.out.println("");
      if (NumListas==1) {
        // Se recorre la segunda lista y se hacen las operaciones requeridas
        while(CantVal<15){
          System.out.print("Digite el valor de lista 1: ");
          Valores=nume.nextDouble(); 
                
          Result+=Valores;
          CantVal++;
        }
      }
      NumListas--;
    }

    // Se comparan las listas
    if (Result>ResultVal){
      System.out.println("La lista 1 es mayor.");
    }else if (Result<ResultVal){
      System.out.println("La lista 2 es mayor.");
    }else {
      System.out.println("Las listas son iguales.");
    }
    System.out.println("El valor acumulado por la lista 1 es: "+Result);
    System.out.println("El valor acumulado por la lista 2 es: "+ResultVal);
  }
}
