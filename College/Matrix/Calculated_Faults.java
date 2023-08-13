/*Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa. Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han faltado cada empleado (cargar el número de día que faltó) Cada fila de la matriz representan los días de cada empleado. Mostrar los empleados con la cantidad de inasistencias. Cuál empleado faltó menos días.*/

package Tercer_Ejercicios;
import java.util.Scanner;
public class Faltas_Empleados {
    
    private Scanner Tecla;
    private String[] Empleados;
    private int[][] Faltas;
    private int[] TotalFallas;
    private int fallas;
      
    public void CargarMatriz() {
        Tecla=new Scanner(System.in);
        Empleados =new String[3];
        System.out.println("Digite los nombres de los empleados: ");
        for(int v=0;v<3;v++){
            System.out.print("Empleado "+(v+1)+": ");
            Empleados[v]=Tecla.next();
        }
        TotalFallas=new int[3];
        Faltas=new int[3][];
        for(int f=0;f<Faltas.length;f++){
            if(f==0){
                System.out.print("\nDigite la Cantidad de fallas de el empleado "+Empleados[f]+": ");
                fallas=Tecla.nextInt();
                Faltas[f]=new int[fallas];
                for(int c=0;c<Faltas[f].length;c++){
                    System.out.print("Digite el dìa que falto el empleado "+Empleados[f]+": ");
                    Faltas[f][c]=Tecla.nextInt();  
                }
                TotalFallas[f]=fallas;
            }
            if(f==1){
                System.out.print("\nDigite la Cantidad de fallas de el empleado "+Empleados[f]+": ");
                fallas=Tecla.nextInt();
                Faltas[f]=new int[fallas];
                for(int c=0;c<Faltas[f].length;c++){
                    System.out.print("Digite el dìa que falto el empleado "+Empleados[f]+": ");
                    Faltas[f][c]=Tecla.nextInt();      
                }
                TotalFallas[f]=fallas;
            }
            if(f==2){
                System.out.print("\nDigite la Cantidad de fallas de el empleado "+Empleados[f]+": ");
                fallas=Tecla.nextInt();
                Faltas[f]=new int[fallas];
                for(int c=0;c<Faltas[f].length;c++){
                    System.out.print("Digite el dìa que falto el empleado "+Empleados[f]+": ");
                    Faltas[f][c]=Tecla.nextInt();
                }
                TotalFallas[f]=fallas;
            } 
        }    
    }
    public void MostrarTodo(){
        System.out.println("\nEmpleados: ");
        for(int v=0;v<3;v++){
            System.out.println(Empleados[v]+" ");
        }
        System.out.println("\nFallas: ");
        for(int f=0;f<Faltas.length;f++){
            for(int c=0;c<Faltas[f].length;c++){
                System.out.print(Faltas[f][c]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Fallas: ");
        for(int v=0;v<3;v++){
            System.out.println(TotalFallas[v]);
        }
        for(int v=0;v<3;v++){
            System.out.print("\nEl empleado "+Empleados[v]+" tiene "+TotalFallas[v]);
        }
        System.out.println();
    }
    
    public void EmpleadoMenorFallas() {
        int FallaMenor=TotalFallas[0];
        String nombre=Empleados[0];
        for(int f=0;f<TotalFallas.length;f++) {
            if (TotalFallas[f]<FallaMenor) {
                FallaMenor=TotalFallas[f];
                nombre=Empleados[f];
            }
        }
        System.out.println("\nEl empleado "+ nombre + " tiene menor cantidad de fallas que son: "+FallaMenor);
    }
    public static void main(String[] args) {
        Faltas_Empleados op=new Faltas_Empleados();
        op.CargarMatriz();
        op.MostrarTodo();
        op.EmpleadoMenorFallas();
    }   
}
