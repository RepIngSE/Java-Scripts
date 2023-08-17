// De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que lea los datos de entrada e informe: 
// a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar. 
// b) Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %. 
// c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios. 
 
package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_17 {

  // Se ejecuta el programa
  public static void main(String[] args) {
        
    // se definen las variables requeridas
    int Años=0;
    double Sueldo=0, SuelResultante=0;

    // Se solicita la información correspondiente
    Scanner teclado=new Scanner(System.in);
    
    System.out.print("Digite el sueldo del empleado: ");
    Sueldo=teclado.nextInt();
    System.out.print("Digite su antigüedad en años: ");
    Años=teclado.nextInt();
        
    // Se calida los años y el sueldo para realizar el aumento respectivo    
    if (Años>=10 && Sueldo<500){
      SuelResultante=(Sueldo+(Sueldo*0.20));      
      System.out.println("El sueldo a pagar es: "+SuelResultante);
    }    
    if(Sueldo<500 && Años<10){
      SuelResultante=(Sueldo+(Sueldo*0.05));
      System.out.println("El sueldo a pagar es: "+SuelResultante);
    }    
    if(Sueldo>=500){
      System.out.println("El sueldo a pagar es: "+Sueldo);
    }     
  }
}
