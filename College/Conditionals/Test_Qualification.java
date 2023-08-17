// Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas 
// que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese 
// los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
// 5. Nivel máximo: Porcentaje>=90%.
// 6. Nivel medio: Porcentaje>=75% y <90%.
// 7. Nivel regular: Porcentaje>=50% y <75%.
// Fuera de nivel: Porcentaje<50%.
 
package marzo6.tarea.grupal;
import java.util.Scanner;

// Se crea la clase
public class punto11 {
    
  // Se ejecuta el programa
  public static void main(String[] ar){

    // Se solicita la información requerida    
    Scanner numero=new Scanner(System.in);
    int pre, res, total;
    System.out.print("ingresar la cantidad de preguntas realizadas: ");
    pre=numero.nextInt();

    // Se valida que se hallan realizado preguntas
    if(pre>0){

      // Se ingresa la contidad de preguntas correctas
      System.out.print("ingresar la cantidad de respuestas correctas: ");
      res=numero.nextInt();
            
      // Se valida que el número de respuestas sea valido
      if (res>=0 && res<=pre){
        
        // se saca el porcentaje a las respuestas        
        total=(res*100)/pre;
                
        // Se valida el porcentaje para enviar un mensaje por consola
        if(total>=90){
          System.out.println("nivel: maximo");
          System.out.println("porcentaje: "+total+"%");
        }else{
          if(total>=75){
            System.out.println("nivel: medio");
            System.out.println("porcentaje: "+total+"%");
          }else{
            if(total>=50){
              System.out.println("nivel: regular");
              System.out.println("porcentaje: "+total+"%");
            }else{
              System.out.println("fuera de nivel");
              System.out.println("porcentaje: "+total+"%");
            }
          }
        }
      }else{
        System.out.println("numero de respuestas no valido");
      }
    }else{
      System.out.println("numero de preguntas no valido");
    }
  }
}
