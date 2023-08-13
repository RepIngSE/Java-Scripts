import java.util.Scanner;
public class Operacioneswhile {
    public static void main(String[] args) {
        String operaciones; 
        operaciones = "suma, resta, multiplicaciones, division, potencia";
        int a,b,c,sw=1,t=0; 
        
        while(sw==1){
        System.out.println("Digite la operacion deseada/ t para terminar");
        Scanner teclado = new Scanner(System.in); 
        operaciones = teclado.next ();
        switch (operaciones){
            case "t": sw=-1;
            break; 
            case "suma": System.out.println("Digitar los 2 numeros que se sumaran");
                         Scanner l = new Scanner(System.in);
                         a = teclado .nextInt();
                         b = teclado .nextInt();
                         c=a+b;
                         System.out.println("La suma es"+ c);
                        break;  
            case "resta": System.out.println("Digitar los 2 numeros que se restaran");
                         Scanner E = new Scanner(System.in);
                         a = teclado .nextInt();
                         b = teclado .nextInt();
                         c=a-b;
                         System.out.println("La resta es"+ c);
                         break; 
            case "multilplicacion": System.out.println("Digitar los 2 numeros que se multiplicaran");
                         Scanner C   = new Scanner(System.in);
                         a = teclado .nextInt();
                         b = teclado .nextInt();
                         c=a*b;
                         System.out.println("La multiplicacion es"+ c);
                         break; 
            case "division":System.out.println("Digitar los 2 numeros que se dividiran");
                         Scanner T = new Scanner(System.in);
                         a = teclado .nextInt();
                         b = teclado .nextInt();
                         c=a/b;
                         System.out.println("La division es"+ c);
                         break; 
            case "potencia": System.out.println("Digitar los 2 numeros que se potenciaran");
                         Scanner O = new Scanner(System.in);
                         a = teclado .nextInt();
                         b = teclado .nextInt();
                         c=(int) Math.pow(a,b);                                                                                                                                                                                                                                                                                                                                                              
                         System.out.println("La potencia es"+ c);
                         break; 
                 default:System.out.println("Operacion invalida");
        }
    }
  }
}
