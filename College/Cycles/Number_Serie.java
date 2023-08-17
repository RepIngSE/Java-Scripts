// Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado). 

package Primeros_Ejercicios;

// Se crea la clase
public class Ejercicio_22 {
    
  // Se ejecuta el programa
  public static void main(String[] args) {
      
    int Terminos=25, Result=0, num=1;
    
    // Se inica el ciclo donde se suma 11 por ciclo y se imprime el resultado por cada ciclo
    while(Terminos>0){    
      Result=num*11;
      num++;
      Terminos--;
      System.out.print(Result+"-");
    }
  }
}
