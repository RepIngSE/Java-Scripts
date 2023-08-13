import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        // Declaración de variables
        int cont = 0; // Contador para almacenar la cantidad de divisores
        int res = 0; // Variable para almacenar el resultado de la división
        int num = 0; // Número ingresado por el usuario

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Digite un numero");
        num = teclado.nextInt();
        
        // Cerrar el objeto Scanner
        teclado.close();

        // Mostrar los divisores del número ingresado
        System.out.println("Los divisores de " + num + " son:");
        for (int i = 1; i <= num; i++) {
            res = num % i;
            if (res == 0) {
                cont++; // Incrementar el contador de divisores encontrados
                System.out.println(i);
            }
        }
        
        // Mostrar la cantidad de divisores encontrados
        System.out.println("Los divisores encontrados son: " + cont);
    }
}
