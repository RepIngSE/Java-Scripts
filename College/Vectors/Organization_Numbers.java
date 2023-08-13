/*Cargar en un vector los nombres de 5 países y en otro vector paralelo la cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.*/

package javaapplication2;
import java.util.Scanner;
public class Vector8 {
private Scanner teclado; 
private String [] paises; 
private int[] habitantes; 
    public void cargar() {
      teclado = new Scanner(System.in); 
      paises = new String [5]; 
      habitantes = new int [5]; 
      
      for(int f=0; f<paises.length;f++){
          System.out.print("Ingrese pais: "); 
          paises [f] = teclado.next(); 
          System.out.print("Ingrese cantidad de habitantes: "); 
          habitantes[f] = teclado.nextInt(); 
      }
    }
    public void ordenarpaises (){
        for (int k=0; k<4; k++){
            for (int f=0; f<4-k; f++){
                if (paises[f].compareTo (paises [f+1])>0){
                    String auxp; 
                    auxp = paises[f]; 
                    paises[f]=paises[f+1]; 
                    paises[f+1]=auxp; 
                    int auxh; 
                    auxh = habitantes[f]; 
                    habitantes[f]=habitantes[f+1]; 
                    habitantes[f+1]=auxh; 
                }
            }
        }
    }
    public void ordenarmayamen (){
        for (int k=0; k<4; k++){
            for (int f=0; f<4-k; f++){
                if (habitantes[f]<habitantes[f+1]){
                    String auxp; 
                    auxp = paises[f]; 
                    paises[f]=paises[f+1]; 
                    paises[f+1]=auxp; 
                    int auxh; 
                    auxh = habitantes[f]; 
                    habitantes[f]=habitantes[f+1]; 
                    habitantes[f+1]=auxh; 
                }
            }
        }
    }
    public void imprimir(){
        for (int f=0; f<paises.length; f++){
            System.out.println(paises[f]+" "+habitantes[f]);
        }
    }
    public static void main (String[] ar){
        Vector8 pv=new Vector8(); 
        pv.cargar(); 
          System.out.println("paises ordenados en forma alfabética: "); 
        pv.ordenarpaises(); 
          pv.imprimir();
          System.out.println("paises ordenados de mayor a menor cantidad de habitantes: "); 
        pv.ordenarmayamen();
          pv.imprimir();
    }
}
