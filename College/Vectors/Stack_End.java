import javax.swing.JOptionPane;

// Se define la clase
public class pilaCola {

    // Metodo para generar la pila, y esta almacena números aleatorios de acuerdo a los parametros establecidos
    public void generar(int f, int tot, int[]p){
        int maximo=tot, tope1=-1;
        for(int i=0;i<f;i++){
            tope1++;
            p[tope1]=(int)Math.floor(Math.random()*100);
        }
    }

    // Metodo para imprimir la pila
    public void imprimir(int f, int tot, int[]a){
        System.out.println("elementos de la pila");
        int tope1=f-1;
        for(int i=0;i<=tope1;i++){
            System.out.println(" "+a[i]+", ");
        }
        System.out.println("tope de la pila "+tot);
    }

    // metodo para pasar los datos de la pila a la cola
    public void pasar(int f, int[]a, int b2, int[]b, int m2){
        int cont=1, tope2=b2, tope1=f-1;
        while(cont<=f){
            tope2++;
            if(tope2>m2-1){
                tope2=0;
            }
            b[tope2]=a[tope1];
            tope1--;
            cont++;
        }
    }

    // Metodo para imprimir la cola
    public void imprimir2(int b, int tot, int m, int[]c){
        int cont=0, ele=b;
        while(cont<m){
            ele++;
            if(ele>tot-1){
                ele=0;
            }
            cont++;
            System.out.println("elem "+c[ele]+" posicion "+ ele);
        }
        System.out.println("tope de la cola "+ele);
    }

    // Ejecucion del programa
    public static void main(String[] args) {

        // Se crea un objeto pilaCola
        pilaCola p1= new pilaCola();

        // Se solicitan los datos requeridos
        int max1=Integer.parseInt(JOptionPane.showInputDialog("digite maximo de elementos en la pila"));
        int n=Integer.parseInt(JOptionPane.showInputDialog("digite n elementos de la pila"));

        // Se valida que la cantidad de elementos sea menor o igual al maximo
        if(n<=max1){

            // Se acceden a los metodos del objeto y se realizan las debidas operaciones 
            int[]vec=new int[max1];
            p1.generar(n, max1, vec);
            p1.imprimir(n, max1, vec);
            int max2=Integer.parseInt(JOptionPane.showInputDialog("digite maximo de elementos de la cola"));

            if(n<=max2){

                int[]vec1=new int[max2];
                int base2=(int)Math.floor(Math.random()*max2);
                int tope2=base2;
                p1.pasar(n, vec, base2, vec1, max2);
                p1.imprimir2(base2, max2, n, vec1);
            }
        }else{

            System.out.println("el maximo no puede ser menor al n elementos");
        }
    }
}
