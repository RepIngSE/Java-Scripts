/*Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. Sumar componente a componente*/

package Ejercicios_segundo;
import java.util.Scanner;
public class Suma_Vectores {
    
    private Scanner teclado; 
    private int [] Vector1;
    private int [] Vector2;
    private int [] Vector3;
    
    public void cargar(){
        teclado=new Scanner(System.in);
        Vector1=new int [4];
        Vector2=new int [4];
        Vector3=new int [4];
        System.out.println("Digite los campos del primer vector. ");        
        for(int n=0;n<4;n++){
            System.out.print("Posiciòn "+(n+1)+": ");
            Vector1[n]=teclado.nextInt();                        
        }
        System.out.println("\nDigite los campos del segundo vector.");
        for(int m=0;m<4;m++){
            System.out.print("Posiciòn "+(m+1)+": ");
            Vector2[m]=teclado.nextInt();
        }
    }    
    public void Sumar(){
        System.out.println("\nEl vector resultante es: ");
        for(int n=0;n<4;n++){
            Vector3[n]=Vector1[n]+Vector2[n];
            System.out.println("Posiciòn "+(n+1)+": "+Vector3[n]);
        }
    }

    public static void main(String[] args) {
        Suma_Vectores op=new Suma_Vectores();
        op.cargar();
        op.Sumar();
    }
}
