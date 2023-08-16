// Cargar un String por teclado e implementar los siguientes métodos:
// a) Imprimir la primera mitad de los caracteres de la cadena.
// b) Imprimir el último caracter.
// c) Imprimirlo en forma inversa.
// d) Imprimir cada caracter del String separado con un guión.
// e) Imprimir la cantidad de vocales almacenadas.
// f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha 
// tanto como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)

import java.util.Scanner;

// Se crea la clase
public class Poo4 {

  // Se definen los atributos
  private String cadena; 
  private Scanner teclado; 
    
  // Se crea el constructor de la clase  
  public Poo4(){
    teclado = new Scanner(System.in); 
    System.out.print("Ingrese la cadena: "); 
    cadena = teclado.nextLine();  
  }

  // Metodo para imprimir la mitad de la cadena
  public void Mitad(){
    String Mitad = cadena.substring(0,cadena.length()/2); 
    System.out.println("La mitad de la cadena es: "+Mitad); 
  }

  // Metodo para imprimir el ultimo caracter de la cadena
  public void Ultimo(){
    char Car = cadena.charAt(cadena.length()-1); 
    System.out.println("El ultimo caracter de la cadena es: "+Car); 
  }
    
  // Metodo para imprimir la cadena inversa
  public void Inversa(){
    System.out.print("La cadena de forma inversa es: ");
    for(int i = cadena.length()-1; i>=0; i--){
      System.out.print(cadena.charAt(i)); 
    }
    System.out.println();
  }
    
  // Metodo para separar los caracteres de un string con giones
  public void Separado(){
    System.out.print("La cadena separada por medio de guiones es: ");
    for(int i = 0; i<cadena.length(); i++){
      System.out.print(cadena.charAt(i)+"-"); 
    }
    System.out.println();
  }
    
  // Metodo para contar la conatidad de vocales en una cadena
  public void Vocales(){
    int cant = 0; 
    for(int i = 0; i<cadena.length(); i++) {
      if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u') || (cadena.charAt(i)=='A') || (cadena.charAt(i)=='E') || (cadena.charAt(i)=='I') || (cadena.charAt(i)=='O') || (cadena.charAt(i)=='U')){ 
        cant++;
      }
    }
    System.out.println("La cantidad de vocales de la cadena es: "+cant);
  }
    
  // Metodo para validad si la cadena se lee igual de forma inversa
  public void Metodo(){
    int cant = 0; 
    for(int i = 0; i<cadena.length()/2; i++) {
      if(cadena.charAt(i)== cadena.charAt(cadena.length()-1-i))   {
        cant++; 
      }
    }
    if(cant==cadena.length()/2){
      System.out.println("La cadena se lee igual de izquiera a derecha y de derecha a izquierda: "+cadena);
    } else {
      System.out.println("La cadena no se lee igual de izquiera a derecha ni de derecha a izquierda: "+cadena);
    }
  }

  // se ejecuta el programa
  public static void main(String[] args){
    
    // Se crea un objeto Poo4 y se accede a sus metodos
    Poo4 string= new Poo4(); 
    string.Mitad();
    string.Ultimo();
    string.Inversa(); 
    string.Separado();
    string.Vocales();
    string.Metodo();
  }
}
