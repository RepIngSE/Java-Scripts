// Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla
// la leyenda "Todos los números son menores a diez".
 
package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto14 {
    
  // Se ejecuta el programa
  public static void main(String[] args){
        
    // Se solicta la informacion correspondiente
    Scanner teclado=new Scanner(System.in);
    int num1, num2,num3;
    System.out.print("ingrese el primer numero: ");
    num1=teclado.nextInt();
    System.out.print("ingrese el segundo numero: ");
    num2=teclado.nextInt();
    System.out.print("ingrese el tercer numero: ");
    num3=teclado.nextInt();
        
    // Se valida que los tres números sean menores que 10 y se envía un mensaje si es así
    if(num1<10 && num2<10 && num3<10){
      System.out.println("todos los numeros son menores que 10 ");
    }
  }
}
