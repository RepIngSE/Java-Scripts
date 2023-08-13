/*Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5 columnas la última fila (crearla sin la intervención del operador) Realizar la carga por teclado e imprimir posteriormente.*/

package Tercer_Ejercicios;
import java.util.Scanner;

    public class MatrizFormaEscalera {   
    
       private Scanner tecla;
       private int[][] Forma;
       private int Filas=5, Col1=1, Col2=2, Col3=3, Col4=4, Col5=5;
    
       public void cargar(){
           tecla=new Scanner(System.in);
           Forma=new int[Filas][];
           for(int f=0;f<Forma.length;f++){
               if(f==0){
                   Forma[f]=new int[Col1];
                   for(int c=0;c<Forma[f].length;c++) {
                       System.out.print("Ingrese componente de la "+(f+1)+": ");
                       Forma[f][c]=tecla.nextInt();
                    }
               }
               if(f==1){
                   Forma[f]=new int[Col2];
                   for(int c=0;c<Forma[f].length;c++) {
                       System.out.print("Ingrese componente de la "+(f+1)+": ");
                       Forma[f][c]=tecla.nextInt();
                    }
               }
               if(f==2){
                   Forma[f]=new int[Col3];
                   for(int c=0;c<Forma[f].length;c++) {
                       System.out.print("Ingrese componente de la "+(f+1)+": ");
                       Forma[f][c]=tecla.nextInt();
                    }
               }
               if(f==3){
                   Forma[f]=new int[Col4];
                   for(int c=0;c<Forma[f].length;c++) {
                       System.out.print("Ingrese componente de la "+(f+1)+": ");
                       Forma[f][c]=tecla.nextInt();
                    }
               }
               if(f==4){
                   Forma[f]=new int[Col5];
                   for(int c=0;c<Forma[f].length;c++) {
                       System.out.print("Ingrese componente de la "+(f+1)+": ");
                       Forma[f][c]=tecla.nextInt();
                   }
               }  
           }
       }
       
       public void imprimir() {
            for(int f=0;f<Forma.length;f++) {
                for(int c=0;c<Forma[f].length;c++) {
                    System.out.print(Forma[f][c]+" ");
                }
                System.out.println();
            }
        }
       public static void main(String[] ar) {
            MatrizFormaEscalera ma=new MatrizFormaEscalera();
            ma.cargar();
            ma.imprimir();
        }     
    }
