import java.util.Scanner;

public class ciclofor2 {
 
    public static void main(String[] args) {
        int i, n;     
        System.out.println("Digite el límite del ciclo ");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        
        // Ciclo for que itera desde 1 hasta 100
        for (i = 1; i <= 100; i++) {
            // Si el número es par (divisible entre 2), se imprime
            if (i % 2 == 0) {
                System.out.println(" " + i);
            }
        }
    }
}
