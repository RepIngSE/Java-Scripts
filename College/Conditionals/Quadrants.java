// Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros 
// x e y (distintos a cero). Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. 
// (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 
package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto16 {
    
  // Se ejecuta el programa
  public static void main(String[] args){

    // Se solicita la información requerida
    Scanner teclado=new Scanner(System.in);
    int x,y;
    System.out.print("valor en x: ");
    x=teclado.nextInt();
    System.out.print("valor en y: ");
    y=teclado.nextInt();

    // Se valida los datos para identificar en que cuadrante se encuentra ubicado    
    if(x>0 && y>0){
      System.out.println("la coordenada x = "+x+" , y = "+y+" esta en el primer cuadrante");
    }else{      
      if(x<0 && y>0){            
        System.out.println("la coordenada x = "+x+" , y = "+y+" esta en el segundo cuadrante");      
      }else{        
        if(x<0 && y<0){          
          System.out.println("la coordenada x = "+x+" , y = "+y+" esta en el tercer cuadrante");        
        }else{          
          if(x>0 && y<0){            
            System.out.println("la coordenada x = "+x+" , y = "+y+" esta en el cuarto cuadrante");           
          }else{            
            if(x==0 && y==0){              
              System.out.println("coordenada no valida ");
            }
          }
        }
      }
    }
  }
}
