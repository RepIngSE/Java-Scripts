import java.util.Scanner;

public class Reto1 {
    // Declaración de variables de instancia
    int a, b;
    private float suma, multiplicacion = 0;
    private double results, resultm = 0;
    private Scanner teclado;

    // Constructor de la clase
    public Reto1() {
        teclado = new Scanner(System.in);
    }

    // Método para leer dos números desde el teclado
    public String read() {
        System.out.print("Ingrese dos números separados por un espacio: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        return null;
    }

    // Método para realizar la suma y multiplicación y mostrar los resultados
    public void run() {
        suma = a + b;
        multiplicacion = a * b;
        System.out.print(suma + " ");
        System.out.println(multiplicacion);
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        // Crear una instancia de la clase Reto1
        Reto1 reto1 = new Reto1();
        
        // Llamar al método read() para leer los números
        reto1.read();
        
        // Llamar al método run() para realizar los cálculos y mostrar los resultados
        reto1.run();
    }
}
