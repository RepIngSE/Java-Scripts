// Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc. 

package Primeros_Ejercicios;

// Se crea la clase
public class Ejercicio_23 {

  // Se ejecuta el programa
  public static void main(String[] args) {
        
    int Valores=500, Multiplicadores=1, Resultado=0; 

    // Se inicia el ciclo y se realizan las operaciones correspondientes   
    while(Valores>0){  
      Resultado=8*Multiplicadores;
      Multiplicadores++;
      Valores--;
      System.out.print(Resultado+"-");
    }
  }
}
