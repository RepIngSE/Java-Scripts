// Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.

package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto12 {
    
  // Se ejecuta el programa
  public static void main(String[] args){
        
    // Se solicita la información requerida
    Scanner teclado=new Scanner(System.in);
    int dia, mes,año;
    System.out.print("ingrese el dia: ");
    dia=teclado.nextInt();
    System.out.print("ingrese el mes: ");
    mes=teclado.nextInt();
    System.out.print("ingrese el año: ");
    año=teclado.nextInt();
        
    // Se valida los datos ingresados para ver si corresponde a navidad
    if(dia==25 && mes==12){      
      System.out.println("la fecha "+dia+"/"+mes+"/"+año+" corresponde a navidad");
    }
  }
}
