// Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y 
// cuántos impares. Emplear el operador % en la condición de la estructura condicional: 

package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_25 {
    
  // Se ejecuta el programa
  public static void main(String[] args) {

    // Se ingresan los datos requeridos
    int Num=0, CantNum=0, ContPar=0, ContImp=0;
    Scanner Numeros=new Scanner(System.in);
    System.out.print("¿Què cantidad de números va a ingresar?\nRTA:Son ");
    CantNum=Numeros.nextInt();

    // Se inicia el ciclo
    while (CantNum>0){
      System.out.print("Digite el número: ");
      Num=Numeros.nextInt();

      // Se valida si es par
      if (Num%2==0){
        ContPar++;
      }else{
        ContImp++;
      }
      CantNum--;
    }
    System.out.println("La cantidad de números pares son: "+ContPar);
    System.out.println("La cantidad de números impares son: "+ContImp);
  }
}
