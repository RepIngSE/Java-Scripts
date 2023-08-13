package Estructura_Datos_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Matriz_resultante = " ";
        String[][] Matriz;

        Matriz = new String[6][2];

        Matriz[0][0] = "Nombre";
        Matriz[0][1] = "Apellido";

        // Solicitar al usuario ingresar datos para cada fila y columna de la matriz
        for (int f = 1; f <= 5; f++) {
            for (int c = 0; c < Matriz[f].length; c++) {
                Matriz[f][c] = JOptionPane.showInputDialog(null, "Ingresar dato en la fila " + f + " y columna " + c + ":");
            }
        }

        // Crear una representación visual de la matriz en forma de cadena
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz[f].length; c++) {
                Matriz_resultante += Matriz[f][c];
                Matriz_resultante += ' ';
            }
            Matriz_resultante += "\n";
        }

        // Mostrar la representación visual de la matriz en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, Matriz_resultante);
    }

}
