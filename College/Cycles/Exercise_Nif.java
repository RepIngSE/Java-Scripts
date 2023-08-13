/* Crea una clase NIF que se usará para mantener DNIs con su correspondiente letra. Los atributos serán el número de DNI (entero largo) y la letra que le corresponde. La clase dispondrá de los siguientes métodos:
✓Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en blanco (será un NIF no válido). 
✓Constructor que reciba el DNI y establezca la letra que le corresponde. 
✓Accedentes y mutador para el número de DNI (que ajuste automáticamente la letra). 
✓leer(): que pida el número de DNI (ajustando automáticamente la letra)
✓Método que nos permitamos traer lNIF (ocho dígitos, un guión y la letra en mayúscula; por ejemplo: 00395469-F) La letra se calculará con un método auxiliar (privado) de la siguiente forma: se obtiene el resto de la división entera del número de DNI entre 23 y se usa la siguiente tabla para obtener la letra que corresponde:
0-T1 -R2 -W3 -A4 -G5 -M6 –Y7-F8 -P9 -D10 -X11 -B12-N13 –J14-Z15 -S16 -Q17 -V18-H19 -L20 –C21-K22 –E
*/
package parcial2;
import java.util.Scanner;
public class NIF {
    public int DNI;
    public String letra;
    public NIF(){

        DNI=0;
        letra=" ";
    }
    public void asignarLetra(int DNI){
        this.DNI=DNI;
        letra=calcularLetra();
    }
    private String calcularLetra(){

        String[] letras={" ","T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","Z","S","Q","V","H","L","C","K","E"};
        int x=DNI%23;    
        return letras[x];
    }
    public void leer (){
        Scanner le=new Scanner(System.in);
        while(DNI>=0){
            System.out.print("introducir DNI: ");
            int x=le.nextInt();
            asignarLetra(x);



            imprimir();
            if(DNI==0){
                DNI=-1;
            }
        }
}
    public void imprimir(){
        System.out.println("el NIF es: "+DNI+"-"+letra);
    }
    public static void main(String[] args) {
        NIF ni=new NIF();
        ni.leer();
    }
}
