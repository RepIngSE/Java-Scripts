import java.util.Scanner;

public class Linea {

    double[] puntoA = new double[2];
    double[] puntoB = new double[2];

    // Constructor por defecto para inicializar los puntos a (0, 0)
    public Linea() {
        puntoA[0] = 0;
        puntoA[1] = 0;
        puntoB[0] = 0;
        puntoB[1] = 0;
    }

    // Constructor que permite establecer los puntos iniciales de la línea
    public Linea(double[] punto1, double[] punto2) {
        for (int i = 0; i < 2; i++) {
            puntoA[i] = punto1[i];
            puntoB[i] = punto2[i];
        }
        // Imprimir la línea inicial
        System.out.println("Línea inicial:");
        imprimirPunto(puntoA);
        imprimirPunto(puntoB);
    }

    // Método para imprimir un punto
    public void imprimirPunto(double[] punto) {
        System.out.print("(");
        for (int i = 0; i < 2; i++) {
            System.out.print(punto[i]);
            if (i < 1) {
                System.out.print(", ");
            }
        }
        System.out.print(") ");
    }

    // Métodos para mover la línea
    public void moverDerecha(double x) {
        puntoA[0] += x;
        puntoB[0] += x;
    }

    public void moverIzquierda(double x) {
        puntoA[0] -= x;
        puntoB[0] -= x;
    }

    public void moverAbajo(double x) {
        puntoA[1] -= x;
        puntoB[1] -= x;
    }

    public void moverArriba(double x) {
        puntoA[1] += x;
        puntoB[1] += x;
    }

    // Método para imprimir la línea final
    public void imprimir() {
        System.out.println("Línea final:");
        imprimirPunto(puntoA);
        imprimirPunto(puntoB);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Linea li = new Linea();
        double[] VEC = new double[2];
        double[] VEC1 = new double[2];

        System.out.println("Ingresar valores para el punto A:");
        for (int i = 0; i < 2; i++) {
            VEC[i] = teclado.nextDouble();
        }

        System.out.println("Ingresar valores para el punto B:");
        for (int i = 0; i < 2; i++) {
            VEC1[i] = teclado.nextDouble();
        }

        // Crear una instancia de la clase Linea
        li = new Linea(VEC, VEC1);

        int x;
        System.out.println("Menú:");
        System.out.println("1. Mover a la derecha");
        System.out.println("2. Mover a la izquierda");
        System.out.println("3. Mover arriba");
        System.out.println("4. Mover abajo");
        x = teclado.nextInt();

        switch (x) {
            case 1:
                System.out.println("Ingresar un número para mover a la derecha:");
                double h = teclado.nextDouble();
                li.moverDerecha(h);
                break;
            case 2:
                System.out.println("Ingresar un número para mover a la izquierda:");
                double w = teclado.nextDouble();
                li.moverIzquierda(w);
                break;
            case 3:
                System.out.println("Ingresar un número para mover arriba:");
                double q = teclado.nextDouble();
                li.moverArriba(q);
                break;
            case 4:
                System.out.println("Ingresar un número para mover abajo:");
                double s = teclado.nextDouble();
                li.moverAbajo(s);
                break;
        }
        li.imprimir();
    }
}
