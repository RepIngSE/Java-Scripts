// Confeccionar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades un método que 
// cargue los datos personales y otro que los imprima.
// Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un atributo sueldo y los métodos de cargar 
// el sueldo e imprimir su sueldo.
// Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto de la clase Empleado y llamar a sus métodos.

package abril4.tarea.grupal;
import java.util.Scanner;

// Se crea la clase personas
public class personas {

  // se definen sus atributos
  private String nombre;
  private int edad;
  private Scanner teclado;
    
  // Se crea el constructor de la clase
  public void cargar(){
    teclado=new Scanner(System.in);
    System.out.print("ingresar nombre: ");
    nombre=teclado.nextLine();
    System.out.print("ingresar edad: ");
    edad=teclado.nextInt();
  }

  // Metodo para imprimir los datos de la persona
  public void imprimir(){
    System.out.println("nombre: "+nombre);
    System.out.println("edad: "+edad);
  }
}


package abril4.tarea.grupal;
import java.util.Scanner;

// Se crea la clase empleado
public class empleado extends personas {

  // Se definen sus atributos
  private int sueldo;
  private Scanner tcl;

  // Metodo para cargar sueldo del empleado
  public void cargarSueldo(){
    tcl=new Scanner(System.in);
    System.out.print("ingresar sueldo: ");
    sueldo=tcl.nextInt();
  }
    
  // Metodo para imprimir el sueldo
  public void imprimirSueldo(){
    System.out.println("sueldo: "+sueldo);
  }
}


package abril4.tarea.grupal;

// Se crea la clase prueba para ejecutar las dos clases anteriormente definidas
public class prueba {
    
  // Se ejecuta el programa
  public static void main(String[] args) {
    
    // Se crea un objeto personas y se accede a sus metodos
    personas persona1=new personas();
    persona1.cargar();
    persona1.imprimir();

    // Se crea un objeto empreado y se accede a sus metodos y a los de personas
    empleado empleado1=new empleado();
    empleado1.cargar();
    empleado1.cargarSueldo();
    empleado1.imprimir();
    empleado1.imprimirSueldo();
  }
}

