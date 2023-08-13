package Estructura_Datos_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int Filas = 0, Columnas = 0;
        String Matriz_resultante = " ";
        
        char[][] Matriz;
        String Fila1 = JOptionPane.showInputDialog(null, "Digita la cantidad de filas de la matriz");
        Filas = Integer.parseInt(Fila1);
        
        String Columna1 = JOptionPane.showInputDialog(null, "Digita la cantidad de columnas de la matriz");
        Columnas = Integer.parseInt(Columna1);
        
        Matriz = new char[Filas][Columnas];
        
        // Llenar la matriz con el carácter 'X'
        for (int f = 0; f < Filas; f++) {
            for (int c = 0; c < Columnas; c++) {
                Matriz[f][c] = 'X';
            }
        }
        
        // Crear una representación visual de la matriz en forma de cadena
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz[0].length; c++) {
                Matriz_resultante += Matriz[f][c];
                Matriz_resultante += ' ';
            }
            Matriz_resultante += "\n";
        }
        
        // Mostrar la representación visual de la matriz en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, Matriz_resultante);
    }
}
