/*Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, cada curso cuenta con 5 alumnos. Realizar un programa que muestre el curso que obtuvo el mayor promedio general*/

package Ejercicios_segundo;

import java.util.Scanner;

public class Cursos_Notas {

    private Scanner teclado;
    private double[] CursoA;
    private double[] CursoB;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        CursoA =new double[5]; 
        System.out.println("Digite las notas del curso A.");
        for(int i=0;i<5;i++){
            System.out.print("Estudiante "+(i+1)+": ");
            CursoA[i]=teclado.nextDouble();
        }
    }
    
    public void cargar2() {
        CursoB =new double[5];
        System.out.println("\nDigite las notas del curso B.");
        for(int n=0;n<5;n++){
            System.out.print("Estudiante "+(n+1)+": ");
            CursoB[n]=teclado.nextDouble(); 
        }  
    }
    
    public void Verificar_Imprimir(){
        double AcumNotasA=0, PromA=0, AcumNotasB=0, PromB=0;
        for(int i=0;i<5;i++){
            AcumNotasA+=CursoA[i];
            AcumNotasB+=CursoB[i];
        }
        PromA=AcumNotasA/5;
        PromB=AcumNotasB/5;
        if (PromA>PromB){
            System.out.println("\nEl promedio mayor lo tiene el curso A y es: "+PromA);
        }
        else if(PromB>PromA){ 
            System.out.println("\nEl promedio mayor lo tiene el curso B y es: "+PromB);
        }else{
            System.out.println("\nLos dos cursos tienen un promedio igual.");
        }    
    }
    
    public static void main(String[] args){
        Cursos_Notas llamar=new Cursos_Notas();
        llamar.cargar();
        llamar.cargar2();
        llamar.Verificar_Imprimir();
    }
    
}
