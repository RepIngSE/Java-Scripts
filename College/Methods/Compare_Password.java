// Desarrollar un programa que solicite la carga de una clave. La clase debe tener dos métodos uno para la carga y otro que muestre 
// si la clave es la correcta (la clave a comparar es "123abc").

import java.util.Scanner;

// Se crea la clase
public class Poo5 {

  // Se definen los atributos
  private String contraseña; 
  private Scanner teclado; 

  // Se crea el constructor de la clase
  public Poo5(){
    teclado = new Scanner(System.in); 
    System.out.print("Ingrese la contraseña: "); 
    contraseña = teclado.nextLine(); 
  }
    
  // Se crea el metodo para comparar la contraseña
  public void Contraseña(){    
    if(contraseña.equals("123abc")){
      System.out.println("La contraseña es correcta");   
    } else {
      System.out.println("La contraseña no es correcta"); 
    }
  }

  // Se ejecuta el programa
  public static void main(String[] args){

    // Se crea un objeto Poo5 y se accede a sus metodos
    Poo5 poo5 = new Poo5(); 
    poo5.Contraseña();
  }
}
