// Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o 
// iguales a 7 y cuántos menores.
 
package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_19 {

  // Se ejecuta el programa
  public static void main(String[] args) {
        
    // Se definen las variables iniciales
    int Alumnos=10, Notas=0, cont=0, conta=0;
    Scanner numeros =new Scanner(System.in);
        
    // se inicia el ciclo    
    while (Alumnos>0){
            
      // Se solicita la información requerida      
      System.out.print("Digite las notas de cada estudiante: ");
      Notas=numeros.nextInt();
            
      // Si la nota es mayor o igual a 7 y menor o igual a 10 entonces se agrega uno al contador      
      if(Notas>=7 && Notas<=10){        
        cont++;
        Alumnos--;
      } 
      
      // si es menor a siente y mayor a cero entonces se suma 1 al otro contador
      else if(Notas<7 && Notas>0){
        conta++;
        Alumnos--;
      }else{        
        Alumnos=Alumnos;
        System.out.println("Nota no valida.\n");
      }
    }    
    System.out.println("\n"+cont+" tienen notas mayores o iguales a 7.\n");
    System.out.println(conta+" tienen notas menores a 7.");
  }
}
