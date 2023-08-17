// Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado 
// se lo multiplica por el tercero.

package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto13 {
    
  // Se ejecuta el programa
  public static void main(String[] args){
        
    // Se solicita la información correspondiente
    Scanner teclado=new Scanner(System.in);
    int num1,num2,num3, res;
    System.out.print("ingrese el primer numero: ");
    num1=teclado.nextInt();
    System.out.print("ingrese el segundo numero: ");
    num2=teclado.nextInt();
    System.out.print("ingrese el tercer numero: ");
    num3=teclado.nextInt();

    // Se valida que los tres números sean iguales
    if(num1==num2 && num1==num3){
      
      // si es así se operan y luego se envía por consola un mensaje de espuesta      
      res=num1+num2;
      System.out.println("la suma de los dos primeros numeros es: "+res );
      res=res*num3;
      System.out.println("y la multiplicacion con el resultado de la suma es: "+res);
    }
  }
}
