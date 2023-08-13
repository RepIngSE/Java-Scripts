/*Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos*/

package marzo20.tarea.grupal;
import java.util.Scanner;
public class punto5 {
    private int[] numeros;
    private int cantidad;
    private Scanner teclado;
    public void cargar(){
        System.out.print("cuantos numeros va a registrar? : ");
        teclado=new Scanner(System.in);
        cantidad=teclado.nextInt();
        numeros=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.print("ingresar numero : ");
            numeros[i]=teclado.nextInt();
        }
    }




    public void sumatoria(){
        int suma=0;
        for(int i=0;i<cantidad;i++){
            suma=suma+numeros[i];
        }
        System.out.println("la suma de todos los datos ingresados es igual a: "+suma);
    }
    public static void main(String[] args) {
        punto5 pt=new punto5();
        pt.cargar();
        pt.sumatoria();
    }
}
