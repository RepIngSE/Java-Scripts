package javaApplication; 

import java.util.Scanner;

public class Matriz3 {
       private int[][] matriz3; 
       private Scanner teclado; 
       
    public void cargarmatriz()
    {
    teclado = new Scanner(System.in); 
    System.out.print("Digite la cantidad de filas: "); 
    int fil = teclado.nextInt(); 
    System.out.print("Digite la cantidad de columnas: "); 
    int col = teclado.nextInt(); 
    matriz3 = new int [fil][col]; 
    for(int f=0;f<matriz3.length;f++){
        for(int c=0;c<matriz3[f].length;c++){
            System.out.print("Ingrese el elemento: "); 
            matriz3[f][c] = teclado.nextInt();   
        }
      }
    }
    
    public void mostrar()
    {
    System.out.println("Esquina superior izquierda: "); 
    System.out.println(matriz3[0][0]); 
    System.out.println("Esquina superior derecha: "); 
    System.out.println(matriz3[0][matriz3[0].length-1]); 
    System.out.println("Esquina inferior izquierda: "); 
    System.out.println(matriz3[matriz3.length-1][0]); 
    System.out.println("Esquina inferior derecha: "); 
    System.out.println(matriz3[matriz3.length-1][matriz3[matriz3.length-1].length-1]); 
    }
     public static void main(String[] ar)
    {
        Matriz3 pm = new Matriz3(); 
        pm.cargarmatriz(); 
        pm.mostrar(); 
    }
  }

