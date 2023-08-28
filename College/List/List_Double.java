import javax.swing.JOptionPane;

// Se define la clase
public class listaDobleEnlazada {

    // Se crea la clase nodo que contiene informacion ademas de siguiente y anterior
    class Nodo{

        int info;
        Nodo ant,sig;
    }

    // Se crean dos objetos nodo
    private Nodo raiz;
    private Nodo a1;

    // Se inicia la raiz en null
    public listaDobleEnlazada(){

        raiz=null;
    }

    // Metodo para insertar la información
    void insertar (int pos, int x){

        if (pos==1){

            Nodo nuevo=new Nodo();
            nuevo.info=x;
            nuevo.sig=raiz;
            raiz=nuevo;
            a1=raiz;
        }
        if(pos>1){

            Nodo nuevo= new Nodo();
            nuevo.info=x;
            nuevo.ant=a1;
            a1.sig=nuevo;
            a1=nuevo;
            nuevo.sig=null;
        }
    }

    // Metodo para imprirmir por consola la información de la lista
    public void imprimir(){

        Nodo reco=new Nodo();
        reco=raiz;
        while(reco != null){
    
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }


    // Se ejecuta el programa
    public static void main(String[] args) {

        // Se crea un objeto y se acceden a sus aributos
        listaDobleEnlazada li=new listaDobleEnlazada();
        int n,i,ele;
        n=Integer.parseInt(JOptionPane.showInputDialog("digite numero de nodos"));
        for(i=1;i<=n;i++){

            ele=(int)(Math.random()*100);
            li.insertar(i, ele);
        }
        li.imprimir();
    }    
}
