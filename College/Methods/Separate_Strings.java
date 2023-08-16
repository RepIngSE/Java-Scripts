// Codifique un programa que permita cargar una oración por teclado, luego mostrar cada palabra ingresada en una línea distinta.

package abril4.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto7 {

  // Se definen los atributos de la clase
  String oracion;
  Scanner teclado;
    
  // Metodo para ingresar la oracion
  public void cargar (){
    teclado=new Scanner(System.in);
    System.out.println("ingresar oracion");
    oracion=teclado.nextLine();
  }
    
  // Metodo para separar las palabras
  public void separar (){
    for (int i=0; i<oracion.length();i++){
      if (oracion.charAt(i)==' '){
        System.out.println(" ");
      }else{         
        System.out.print(oracion.charAt(i));
      }
    }
    System.out.println(" ");
  }

  // Se ejecuta el programa
  public static void main(String[] args) {

    // se crea un objeto punto7 y se accede a sus metodos
    punto7 f =new punto7();
    f.cargar();
    f.separar();
  }
}
