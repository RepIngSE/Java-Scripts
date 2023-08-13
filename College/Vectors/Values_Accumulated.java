/*Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe: El valor acumulado de todos los elementos del vector. El valor acumulado de los elementos del vector que sean mayores a 36. Cantidad de valores mayores a 50*/

package Ejercicios_segundo;
import java.util.Scanner;
public class Vector_8 {
    private Scanner teclado;
    private int[] VectorNum;
  
    public void cargar() {
        teclado=new Scanner(System.in);
        VectorNum =new int[8];
        int AcumTotal=0;
        System.out.println("Digite los valores del vector: ");
        for(int i=0;i<8;i++){
            System.out.print("Posiciòn "+(i+1)+":  ");
            VectorNum[i]=teclado.nextInt();
            AcumTotal+=VectorNum[i]; 
        }
        System.out.println("\nEl valor acomulado total es: "+ AcumTotal);
    }
    public void MayorMenor(){
        int AcumMayores36=0, AcumMayores50=0, Acum=0, ContM36=0, ContM50=0, Cont=0;
        for(int i=0;i<8;i++){
            if(VectorNum[i]>=36 && VectorNum[i]<50){
                AcumMayores36+=VectorNum[i];
                ContM36++;
            }
            else if(VectorNum[i]>=50){
                AcumMayores50+=VectorNum[i];
                ContM50++;
            }
            else{
                Acum+=VectorNum[i];
                Cont++;
            }
        }
        System.out.println("\nEl valor acomulado mayor de 36 es: "+AcumMayores36+" y hay una cantidad de: "+ContM36);
        System.out.println("El valor acomulado mayor de 50 es: "+AcumMayores50+" y hay una cantidad de: "+ContM50);
        System.out.println("El valor acomulado normal es: "+ Acum+" y hay una cantidad de: "+Cont);
    }
    
    public static void main(String[] args) {
        Vector_8 op=new Vector_8();
        op.cargar();
        op.MayorMenor();
    }
    
}
