// Implementar la clase operaciones. Se deben cargar dos valores enteros en el constructor, calcular su suma, resta, multiplicación 
// y división, cada una en un método, imprimir dichos resultados.

package Cuartos_Ejercicios;
import java.util.Scanner;

// Se crea la clase operaciones
public class Operaciones {

  // Se definen los atributos
  private Scanner Tecla;
  private int Num1, Num2, Sum, Rest, Multi;
  private double Divi;

  // se crea el constructor de la clase
  public Operaciones(){
    Tecla=new Scanner(System.in); 
    System.out.println("Digite dos números enteros: ");
    Num1=Tecla.nextInt();
    Num2=Tecla.nextInt();
  }

  // Se define el metodo para sumar
  public void Suma(){
    Sum=Num1+Num2;
  }

  // Se define el metodo para restar
  public void Resta(){
    Rest=Num1-Num2;
  }

  // Se define el metodo para multiplicar
  public void Multiplicacion(){
    Multi=Num1*Num2;
  }

  // Se define el metodo para dividir
  public void Division(){
    if(Num2!=0){
      Divi=Num1/Num2;
    }
  }

  // Se define el meto para imprimir los valores de cada operación 
  public void Imprimir(){
    System.out.println("Los números operados son: "+Num1+" y "+Num2);
    System.out.println("La suma es: "+Sum);
    System.out.println("La resta es: "+Rest);
    System.out.println("La multiplicación es: "+Multi);
    if(Num2!=0){
      Divi=Num1/Num2;
      System.out.println("La división es: "+Divi);
    }else{
      System.out.println("La división no es posible. ");
    }
  }
    
  // Se ejecuta el programa
  public static void main(String[] args) {
    
    // Se crea un objeto operaciones
    Operaciones ba=new Operaciones();

    // Se llaman los metodos de la clase
    ba.Suma();
    ba.Resta();
    ba.Multiplicacion();
    ba.Division();
    ba.Imprimir();
  }
}
