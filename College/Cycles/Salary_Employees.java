
import java.util.Scanner;
 
public class ciclowhile {
 
    public static void main(String[] args) {
        double presup=0,salario,saldo=0,totalsal=0;
        int sw=0,cont=0;
         System.out.println("Digite presupuesto ");
         Scanner teclado = new Scanner(System.in);
         presup= teclado.nextDouble();
         saldo=presup;

         while(sw==0){//while (saldo >=salario)
                System.out.println("Digite salario ");
                Scanner teclado1 = new Scanner(System.in);
                salario= teclado.nextDouble();
                 if(salario>saldo){
                  sw=1;
                } 
                if(salario<=saldo){//11000000,10500000,7500000,2500000,500000
                  cont =cont+1;//se cuenta
                  saldo=saldo-salario;
                }
         }
        System.out.println("El No de empleados a los q se les cancelo "+cont);
         System.out.println("El saldo que queda es de  "+saldo);
 

    }

}
