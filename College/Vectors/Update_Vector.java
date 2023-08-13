import java.util.Scanner;
import javax.swing.JOptionPane;
public class Vectores {
private Scanner teclado;
public int num; 
public int i, f; 
public int suma = 0; 
public int[] vector;
public void cargar()
{
teclado=new Scanner(System.in);
System.out.print("Cuantos numeros cargara:");
int cant;
cant=teclado.nextInt();
vector=new int[cant];
for(int f=0;f<vector.length;f++) {
System.out.print("Ingrese numero:");
vector[f]=teclado.nextInt();
   }
}
    public void Numperfecto(){
        for (int f = 1; f < vector[f];f++){
            if (vector[f]% f == 0){
                suma = suma + f;
            }
        }
        if (suma == f){
                System.out.println("El número es perfecto");
            }
            else{
                System.out.println("El número no es perfecto");
            }
    }
public static void main(String[] args) {
Vectores pv=new Vectores();
pv.cargar(); 
pv.Numperfecto();
  }
}
