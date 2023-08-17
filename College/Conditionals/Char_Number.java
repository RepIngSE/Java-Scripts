// Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un 
// mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto10 {
    
  // Se ejecuta el programa
  public static void main(String[] ar){
        
    // Se solicita los datos requeridos
    Scanner teclado=new Scanner(System.in);
    int num;
    System.out.print("ingrese un numero entero : ");
    num=teclado.nextInt();
        
    // Se valida cuantas cifras tiene y si tiene más de 3 entonces muestra un error
    if(num<0){
      System.out.println("numero no valido");
    }else{
      if(num>=0 && num<10){
        System.out.println("el numero "+num+" tiene una cifra");
      }else{
        if(num>=10 && num<100){
          System.out.println("el numero "+num+" tiene dos cifras");
        }else{
          if(num>=100 && num<1000){
            System.out.println("el numero "+num+" tiene tres cifras");
          }else{
            System.out.println("error");
          }
        }
      }
    }
  }
}
