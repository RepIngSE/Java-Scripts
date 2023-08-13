/*Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.*/

package marzo28.tarea.grupal;
import java.util.Scanner;
public class punto2 {
    private int[][] matriz;
    private Scanner teclado;
    private int filas, columnas;
    public void cargar(){
        teclado=new Scanner(System.in);
        System.out.print("ingresar la cantidad de filas: ");
        filas=teclado.nextInt();
        System.out.print("ingresar la cantidad de columnas: ");
        columnas=teclado.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                System.out.print("ingresar valor en la fila "+f+" y columna "+c+": ");
                matriz[f][c]=teclado.nextInt();
            }
        }
    }
    public void imprimir(){
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }

    public void cambiarFilas(){
        int dato;
        for(int f=0;f<columnas;f++){
            dato=matriz[0][f];
            matriz[0][f]=matriz[1][f];
            matriz[1][f]=dato;
        }
        System.out.println("las filas 1 y 2 fueron intercambiadas entre si");
    }

    public static void main(String[] args) {
        punto2 p=new punto2();
        p.cargar();
        p.imprimir();
        p.cambiarFilas();
        p.imprimir();
    }  
}
