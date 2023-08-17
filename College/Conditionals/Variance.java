// Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e 
// informe su rango de variación (debe mostrar el mayor y el menor de ellos) 
 
package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_18 {
    
  // Se ejecuta el programa
  public static void main(String[] args){

    // Se solicita la información requerida
    int num1=0, num2=0, num3=0, Variacion=0;
    Scanner teclas=new Scanner(System.in);
            
    System.out.println("Digite tres números. ");
    num1=teclas.nextInt();
    num2=teclas.nextInt();
    num3=teclas.nextInt();

    // Se realizan las validaciones y operaciones respectivas y se imprime por pantalla el resultado
    if(num1>num2 && num1>num3){      
      System.out.println("El número mayor es "+num1);      
      if(num2>num3){        
        Variacion=num1-num3;                
        System.out.println("El número menor es "+num3);                
        System.out.println("El rango de variación es: "+Variacion);  
      }else{
        Variacion=num1-num2;
        System.out.println("El número menor es "+num2);
        System.out.println("El rango de variación es: "+Variacion);
      }
    } else if(num2>num1 && num2>num3){
      System.out.println("El número mayor es "+num2);
      if(num1>num3){
        Variacion=num2-num3;
        System.out.println("El número menor es "+num3);
        System.out.println("El rango de variación es: "+Variacion);
      }else{
        Variacion=num2-num1;
        System.out.println("El número menor es "+num1);
        System.out.println("El rango de variación es: "+Variacion);
      }
    }else {      
      System.out.println("El número mayor es "+num3);
      if(num1>num2){        
        Variacion=num3-num2;
        System.out.println("El número menor es "+num2);
        System.out.println("El rango de variación es: "+Variacion);      
      }else{
        Variacion=num3-num1;
        System.out.println("El número menor es "+num1);
        System.out.println("El rango de variación es: "+Variacion);
      }
    }
  }
}
