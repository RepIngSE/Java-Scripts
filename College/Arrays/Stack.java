import javax.swing.JOptionPane;

// Se define la clase
public class pilas {

    // Se define el tope que inicia en -1 así se suma uno y empieza en 0 para recorrer el array y el maximo dela pila
    int tope=-1, maximo;

    // Se genera la lista de numeros aleatorios de acuerdo a lo definido por el usuario
    public void generar(int f, int tot, int[]p){
        maximo=tot;
        for (int i=0;i<f;i++){
            tope++;
            p[tope]=(int)Math.floor(Math.random()*100);
        }
    }

    // Metodo para imprimir la pila
    public void imprimir(int[]a){
        System.out.println("elementos de la pila");
        for(int i=0;i<=tope;i++){
            System.out.print(" "+a[i]+", ");
        }
        System.out.println("tope de la pila "+tope+" maximo de la pila "+maximo);
    }

    // Se ejecuta el programa
    public static void main(String[] args) {

        // Se crea un objeto pila
        pilas p1=new pilas();

        // Se solicitan los valores correspondientes
        int max=Integer.parseInt(JOptionPane.showInputDialog("digite maximo de elementos"));
        int m=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de elementos"));

        // se valida que el tope no sea superior al maximo de elementos
        if(m<=max){
            
            // Se llaman a los metodos del objeto pila
            int []vec;
            vec=new int[max];
            p1.generar(m, max, vec);
            p1.imprimir(vec);
        }else{
            System.out.println("el maximo no puede ser menor al numero de elementos");
        }
    }    
}
