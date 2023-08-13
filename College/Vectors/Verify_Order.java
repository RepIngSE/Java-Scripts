/*Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.*/

package marzo20.tarea.grupal;
import java.util.Scanner;
public class punto4 {
    private int [] elementos;
    private Scanner teclado;

    public void cargar(){
        elementos=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("ingresar numero: ");
            teclado= new Scanner(System.in);
            elementos[i]=teclado.nextInt();
        }
    }

    public void verificar(){
        int h=0;
        for(int i=0;i<9;i++){


            if(elementos[i]<elementos[i+1]){
            }else{h++;}
        }
        if (h>=1){
        System.out.println("el vector no está ordenado");}    
    }
    
    public static void main(String[] args) {
        punto4 pt=new punto4();
        pt.cargar();
        pt.verificar();
    }  
}
