// En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos 
// que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además, 
// el programa deberá informar el importe que gasta la empresa en sueldos al personal.

package Primeros_Ejercicios;
import java.util.Scanner;

// Se crea la clase
public class Ejercicio_21 {
    
  // Se ejecuta el programa
  public static void main(String[] args) {

    // Se definen varibles y se solicita la informacion correspondiente
    int CantEmpleados=0, Contador=0, Contador1=0;    
    double Sueldo=0.0, SuelTotal=0.0;
    Scanner Emp= new Scanner(System.in);
    System.out.print("Digite la cantidad de empleados: ");
    CantEmpleados=Emp.nextInt();
    while (CantEmpleados>0){
      System.out.print("Digite el sueldo del empleado: $");
      Sueldo=Emp.nextDouble();

      // Se valida que el sueldo esté dentro de los rangos establecidos
      if(Sueldo>=100 && Sueldo<=500){        
        if(Sueldo>=100 && Sueldo<=300){
          Contador++;
          CantEmpleados--;
        } else if (Sueldo>300 && Sueldo<=500){
          Contador1++;
          CantEmpleados--;
        }
        SuelTotal=SuelTotal+Sueldo;
      } else{        
        System.out.println("Sueldo no valido.");
      }       
    }
    System.out.println("Los empleados que cobran entre $100 y $300 son: "+Contador);
    System.out.println("Los empleados que cobran entre $300 y $500 son: "+Contador1);
    System.out.println("La empresa gasta $"+SuelTotal+" en empleados.");
  }
}
