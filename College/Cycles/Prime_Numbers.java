public class Primos {
 
    public static void main(String[] args) {
        int i,j,cont=0;
        for(i=1;i<=100;i++){//numeros
             for(j=1;j<=i;j++){//divi
                if(i%j==0){
                   cont=cont+1; 
                } 

             }
             if(cont==2){
                 System.out.println("el numero es primo "+i);
             }
             cont=0;

        }
    }
}
