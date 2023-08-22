import javax.swing.JOptionPane;

// Se define la clase
public class listas {

    // Se define la clase nodeo que tiene informacion y el sig que hace referencia al elemento siguiente
    class Nodo{
        int info;
        Nodo sig;
    }

    // Creamos un nodo llamado raiz
    private Nodo raiz;

    // Se define raiz como nulo
    public listas(){
        raiz=null;
    }

    // Metodo para generar la lista
    public void generar(int x){
        int i;
        Nodo nuevo;
        for(i=1;i<=x;i++){ 
            nuevo=new Nodo();
            if(raiz==null){
                nuevo.info=i;
                nuevo.sig=null;
                raiz=nuevo;
            }else{
                nuevo.sig=raiz;
                raiz=nuevo;
                nuevo.info=i;
            }
        }
    }

    // Meotodo para imprimir la lista
    public void imprimir(){
        Nodo reco=new Nodo();
        reco=raiz;
        while(reco!=null){
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }

    // Se ejecuta el programa
    public static void main(String[] args) {

        // Se crea un objeto lista
        listas lis=new listas();

        // Se solicita la cantidad de nodos
        int n= Integer.parseInt(JOptionPane.showInputDialog("digitar cantidad de nodos"));

        // Se accede a los metodos de la lista creada
        lis.generar(n);
        lis.imprimir();
    }    
}
