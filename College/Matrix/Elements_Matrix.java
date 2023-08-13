/*Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes y luego imprimirlas.*/

package javaapplication4;
import java.util.Scanner;
public class Matriz1 {
  private Scanner teclado;
  private int[][] mat;
  public void cargar() {
  teclado=new Scanner(System.in);
  mat=new int[3][5];
  for(int f=0;f<3;f++) {
    for(int c=0;c<5;c++) {
      System.out.print("Ingrese componente:");
      mat[f][c]=teclado.nextInt();
    }
  }
}
public void imprimir() {
  for(int f=0;f<3;f++) {
    for(int c=0;c<5;c++) {
      System.out.print(mat[f][c]+" ");
    }
System.out.println();
  }
}
public static void main(String[] ar) {
  Matriz1 ma=new Matriz1();
  ma.cargar();
  ma.imprimir();
  }
}
