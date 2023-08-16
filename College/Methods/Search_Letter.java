// Realizar una clase, que permita cargar una dirección de mail en el constructor, luego en otro método mostrar 
// un mensaje si contiene el caracter '@'.

package Cuartos_Ejercicios;
import java.util.Scanner;

// Se crea la clase buscar
public class Buscar {

  //se definen sus atributos
  private Scanner tecla;
  private String Email;
  private int r;
  
  // Se crea el constructor de la clase
  public Buscar(){
    tecla=new Scanner(System.in);
    System.out.println("Ingrese su email: ");
    Email=tecla.next();
  }
    
  // Se compara cada caracter de la cadena ingresada para validar si tiene el valor buscado  
  public void CompararImprimir(){ 
    System.out.println("Su correo es: "+Email);
    for(int f=0;f<Email.length();f++){
      if(Email.charAt(f)=='@'){
        r=1;
      }
    }
    if(r==1){
      System.out.println("El email tiene el caracter: @"); 
    }else{
      System.out.println("El email no tiene el caracter: @");
    }
  }

  // Se ejecuta el programa  
  public static void main(String[] args) {

    // Se crea un objeto buscar y se accede a sus metodos
    Buscar op=new Buscar();
    op.CompararImprimir();
  }
}
