package Estructura_Datos_2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// Clase para representar un estudiante
class Estudiante {
    int id;
    String nombre;
    int edad;
    String genero;
}

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear objetos Estudiante predefinidos
        Estudiante obj1 = new Estudiante();
        obj1.id = 56264;
        obj1.nombre = "Juan Francisco Arevalo";
        obj1.edad = 20;
        obj1.genero = "Masculino";

        Estudiante obj2 = new Estudiante();
        obj2.id = 2315;
        obj2.nombre = "Natalia Valderrama";
        obj2.edad = 19;
        obj2.genero = "Femenino";

        Estudiante obj3 = new Estudiante();
        obj3.id = 8988;
        obj3.nombre = "Yesica Ramirez";
        obj3.edad = 23;
        obj3.genero = "Femenino";

        // Solicitar al usuario ingresar información para un nuevo estudiante
        Estudiante obj4 = new Estudiante();
        obj4.id = Integer.parseInt(JOptionPane.showInputDialog("Indique el id"));
        obj4.nombre = JOptionPane.showInputDialog("Indique el nombre");
        obj4.edad = Integer.parseInt(JOptionPane.showInputDialog("Indique la edad"));
        obj4.genero = JOptionPane.showInputDialog("Indique el genero");

        // Crear una lista de estudiantes y agregar los objetos a la lista
        List<Estudiante> lstEstudiantes = new ArrayList<Estudiante>();
        lstEstudiantes.add(obj1);
        lstEstudiantes.add(obj2);
        lstEstudiantes.add(obj3);
        lstEstudiantes.add(obj4);

        // Crear una cadena para mostrar los detalles de los estudiantes
        String salida = "";
        for (int i = 0; i < lstEstudiantes.size(); i++) {
            salida = salida + "[id:=" + lstEstudiantes.get(i).id
                    + "\nnombre:=" + lstEstudiantes.get(i).nombre
                    + "\nedad:=" + lstEstudiantes.get(i).edad
                    + "\ngenero:=" + lstEstudiantes.get(i).genero
                    + "]\n\n";

        }
        
        // Mostrar los detalles de los estudiantes en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, salida);
    }

}
