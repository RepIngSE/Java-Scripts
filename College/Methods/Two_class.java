// Plantear una clase Club y otra clase Socio.
// La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años). 
// En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 objetos de la clase Socio. 
// Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club

package abril4.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class socio {

  // Se definen sus atributos
  private String nombre;
  private int antiguedad;
  private Scanner teclado;

  // Se crea el constructor de la clase
  public socio(){
    teclado=new Scanner(System.in);
    System.out.println("ingresar nombre del socio");
    nombre=teclado.nextLine();
    System.out.println("ingresar tiempo del socio en años");
    antiguedad=teclado.nextInt();
  }

  // Metodo para imprimir si el usuario tiene más años de antiguedad
  public void imprimir(){      
    System.out.println("el socio "+nombre+" tiene "+antiguedad+" años y es el que tiene mas tiempo asociado");
  }

  // Metodo para retornar el tiempo
  public int tiempo(){
    return antiguedad;
  } 
}

package abril4.tarea.grupal;

// Se crea la clase
public class club {

  // Se definen sus atributos
  private socio socio1, socio2, socio3;
  
  // Se define el constructor de la clase
  public club (){
    socio1=new socio();
    socio2=new socio();
    socio3=new socio();
  }
  
  // Metodo para validar que socio tiene más tiempo
  public void mayor(){
    if (socio1.tiempo()>socio2.tiempo() && socio2.tiempo()>socio3.tiempo()){
      socio1.imprimir();
    } else if(socio2.tiempo()>socio3.tiempo()){
      socio2.imprimir();
    }else{
      socio3.imprimir();
    }
  }
    
  // Se ejecuta el programa
  public static void main(String[] args) {

    // se crea un objeto club y se acceden a sus metodos
    club cl=new club();
    cl.mayor();
  }    
}
