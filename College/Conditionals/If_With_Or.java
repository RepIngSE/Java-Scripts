// Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla 
// la leyenda "Alguno de los números es menor a diez".
 
package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto15 {
    
  // Se ejecuta el programa
  public static void main(String[] ar){
   
    // Se solicita la información correspondiente
    Scanner teclado=new Scanner(System.in);
    int num1, num2,num3;
    System.out.print("ingrese el primer numero: ");
    num1=teclado.nextInt();
    System.out.print("ingrese el segundo numero: ");
    num2=teclado.nextInt();
    System.out.print("ingrese el tercer numero: ");
    num3=teclado.nextInt();

    // Se valida que alguno de los números sea menor a 10
    if(num1<10 || num2<10 || num3<10){
      System.out.println("alguno de los numeros es menor que 10 ");
    }
  }
}
