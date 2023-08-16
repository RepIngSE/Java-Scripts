//Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes métodos:
// a) Mostrar por pantalla los datos.
// b) Consulta del mail ingresando su nombre.
// c) Mostrar los mail que no tienen el carácter @.

import java.util.Scanner;

// Se crea la clase
public class Poo6 {

  // Se definen los atributos de la clase
  private Scanner teclado; 
  private String[] nombres; 
  private String[] email; 

  // Se crea el constructor de la clase
  public Poo6(){
    teclado = new Scanner(System.in); 
    nombres = new String[5]; 
    email = new String[5]; 
    for(int i = 0; i<nombres.length; i++){
      System.out.print("Digite el nombre del usuario: "); 
      nombres[i]=teclado.nextLine(); 
      System.out.print("Digite el email del usuario: "); 
      email[i]=teclado.nextLine(); 
    }
  }
    
  // Metodo para imprimir la información de usuario y correo
  public void Mostrar(){
        for(int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]+" - " +email[i]); 
        }
    }

  // Metodo consultar la informacion del usuario
  public void Email(){
    String aux; 
    System.out.print("Digite el nombre de la persona a consultar: "); 
    aux = teclado.nextLine(); 
    boolean existe = false; 
    for(int i=0; i<nombres.length; i++){
      if(aux.equals(nombres[i])){
        System.out.println("El email del usuario es:"+email[i]); 
        existe = true; 
      }
    }
    if(existe==false){
      System.out.println("No existe una persona con ese nombre");  
    }
  }
  
  // Metodo para imprimir los correos que no tengan @  
  public void Sinarroba(){
    System.out.println("Los email sin @ son: "); 
    for(int i=0; i<email.length; i++){
      if(email[i].indexOf("@") == -1){
        System.out.println("El email no contiene la @ "+email[i]);
      }
    }
  }
  
  // Ejecucion del programa  
  public static void main(String[] args) {
    
    // Se crea el objeto Poo6  
    Poo6 poo6 = new Poo6 (); 
    poo6.Mostrar();
    poo6.Email();
    poo6.Sinarroba();
  }
}
