// Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. En el constructor cargar los 
// atributos y luego en otro método imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos 
// (si el sueldo supera a 3000)

package Cuartos_Ejercicios;
import java.util.Scanner;
// Se crea la clase empleado
public class Empleado {

  // Se definen sus atributos
  private Scanner tecla;
  private String Nombre;
  private int Sueldo; 

  // Se define el constructor de la clase
  public Empleado(){
    tecla=new Scanner (System.in); 
    System.out.print("Digite el nombre del empleado: ");
    Nombre=tecla.next();
    System.out.print("Digite el sueldo: ");
    Sueldo=tecla.nextInt();  
  }

  // Se crea un metodo para imprimir la informacion del empleado
  public void Imprimir() {
    System.out.println("Nombre: "+Nombre);
    System.out.println("Sueldo: "+Sueldo);
  }

  // Se valida si el empleado debe pagar impuestos
  public void PagoImpuestos() {
    if (Sueldo>3000) {
      System.out.println(Nombre+" debe pagar impuestos. ");
    } else {
      System.out.println(Nombre+" no debe pagar impuestos. ");
    }
  }

  // Se inicia la ejecución del programa
  public static void main(String[] args) {
    // Se crea un objeto empleado y se acceden a sus metodos correspondientes
    Empleado op=new Empleado();
    op.Imprimir();
    op.PagoImpuestos();
  }
}
