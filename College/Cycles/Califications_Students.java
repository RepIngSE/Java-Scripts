import java.util.Scanner;
 
public class tres {
 
    public static void main(String[] args) {
        double suma=0, prom=0, notas;
        int nota, alumnos;
        for(alumnos=1;alumnos<=5;alumnos++){
            for(nota=1;nota<=3;nota++){
                System.out.println("Digite las notas del alumno "+alumnos);
                Scanner teclado1 = new Scanner(System.in);
                notas= teclado1.nextDouble();
                suma=suma+notas;
                prom=suma/3;
            }
            suma=0;
            System.out.println("El promedio del alumno "+alumnos+" es "+prom);
        }
      }
    }
