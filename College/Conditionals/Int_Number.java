// Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.

package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto9 {
    
  // Se ejecuta el aplicativo
  public static void main(String [] ar){
        
    // Se solicita la información requerida
    Scanner teclado=new Scanner(System.in);
    int num;
    System.out.print("ingrese un numero: ");
    num=teclado.nextInt();

    // Se valida si es nulo, positivo o negativo
    if (num>0){
      System.out.println("el numero "+num+" es positivo");
    } else{ 
      if(num==0){
        System.out.println("el numero "+num+" es un valor nulo");
      } else{
        System.out.println("el numero "+num+" es negativo");
      }
    }
  }
}
