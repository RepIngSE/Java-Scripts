import java.util.Scanner;
 
public class Promedioestudiantil {
 
    public static void main(String[] args) {
        int i,j,n;
        double notas,prom,suma=0;
        for(i=1;i<=10;i++){//numeros
            System.out.println("Digite el numero de calificaciones estudiante "+i);
            Scanner teclado = new Scanner(System.in);
            n= teclado.nextInt();
           for(j=1;j<=n;j++){//divi
                System.out.println("Digite materia "+j);
                Scanner teclado1 = new Scanner(System.in);
                notas= teclado1.nextDouble();
                suma=suma+notas;

             } 
           prom=suma/n;
            System.out.println("el prom es "+prom);
            suma=0;
        }
    }
}
