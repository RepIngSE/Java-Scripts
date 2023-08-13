//Realice una aplicación que le solicite al usurio cuantos estudiantes va a agregar y esta deberá solicitar al usuario la información utilizando ventanas de diálogo. Posteriormente deberá mostrar la lista de objetos.
package estudiantes_curso;
 import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    
public class Estudiantes_Curso {
    
    public static void main(String[] args) {
      int cant =Integer.parseInt(JOptionPane.showInputDialog("Por favor,ingrese la cantidad de estudiantes: "));
        
        List <Estudiante> CanEstudiantes = new ArrayList<Estudiante>();
        
        for (int i=0; i<cant;i++){
         Estudiante object1 = new Estudiante();
         object1.nombre = (JOptionPane.showInputDialog("Ingrese el nombre del estudiante: "));
         object1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
         object1.curso = (JOptionPane.showInputDialog("Ingrese el curso: "));
         object1.nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
         CanEstudiantes.add(object1);
        }
        String resultado = "";
        for (int i = 0;i<CanEstudiantes.size();i++){
            resultado=resultado + "[nombre:="+CanEstudiantes.get(i).nombre + "\nedad:="+CanEstudiantes.get(i).edad 
                    + "\ncurso:="+CanEstudiantes.get(i).curso + "\nnota:="+CanEstudiantes.get(i).nota+ "]\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
