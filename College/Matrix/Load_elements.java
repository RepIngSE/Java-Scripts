/*Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente) Imprimir luego la matriz.*/

package marzo28.tarea.grupal;
import java.util.Scanner;

public class punto1 {

    private int[][] matriz;
    private Scanner teclado;

    public void cargar(){
    
        matriz=new int[2][5];
        teclado=new Scanner(System.in);
        
        for(int c=0;c<5;c++){
            for(int f=0;f<matriz.length;f++){
    
                System.out.print("ingresar numero en la fila "+f+" y columna "+c+":");
                matriz[f][c]=teclado.nextInt();
            }      
        }
    }

    public void imprimir(){

        for(int f=0;f<matriz.length;f++){
            for (int c=0;c<5;c++){
    
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        punto1 p=new punto1();
        p.cargar();
        p.imprimir();
    }
}
