/*Cargar un vector de n elementos. Imprimir el menor y un mensaje si se repite dentro del vector.*/

package marzo20.tarea.grupal;
import java.util.Scanner;
public class punto6 {
    private int[] numeros;
    private Scanner teclado;
    private int cantidad;
    public void cargar(){
        System.out.println("cuantos numeros va a ingresar? : ");
        teclado=new Scanner(System.in);
        cantidad=teclado.nextInt();
        numeros=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.print("ingresar numero : ");
            numeros[i]=teclado.nextInt();
        }
    }

    public void numMenor(){
        int menor=numeros[0],cont=0;
        for(int i=0;i<cantidad;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
                cont=0;
            }
            if (menor==numeros[i]){
                cont++;
            }
        }
        System.out.println("el numero "+menor+" es el menor y se repite "+cont+" veces");
    }
    public static void main(String[] args) {
        punto6 pt=new punto6();
        pt.cargar();
        pt.numMenor();
    }
}
