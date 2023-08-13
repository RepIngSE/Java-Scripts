import java.util.Scanner; 
public class Cuenta {

    private int cuenta=1001, DNI, interes;
    private double saldo;
   
    
    public void cuenta(){
        
    }
    public void cuenta(int DNI,double saldo,int interes){
       this.DNI=DNI;
       this.saldo=saldo;
       this.interes=interes;
    }
    public void actualizarSaldo(){
        double f;    
        f=interes/365;
        saldo=saldo-f;
        System.out.println("Su saldo con en el intereses de: "+saldo);
    }    
    public void ingressar(double i){
        saldo=saldo+i; 
        System.out.println("Su saldo es: "+saldo);
    }
    public void retirar(double i){
        if(i<saldo){
            saldo=saldo-i; 
        } else {
            System.out.println("Saldo insufiiente");
        }
        System.out.println("Su saldo actual es: "+saldo);
    }
    public void datos(){ 
        System.out.println(" ");
        System.out.println("Su numero de cuenta es: "+cuenta);
        System.out.println("Su DNI es: "+DNI);
        System.out.println("Su saldo final es: "+saldo);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        Cuenta cu= new Cuenta();
        int x; 
        System.out.println("Ingresar DNI: ");
        x = teclado.nextInt(); 
        double y,k,s; 
        System.out.println("Ingresar saldo: ");
        y = teclado.nextDouble(); 
        int i; 
        System.out.println("Ingresar interes anual: ");
        i= teclado.nextInt(); 
        cu.cuenta(x, y, i);
        cu.actualizarSaldo();
        System.out.println("Digite el valor que quiere ingresar a su cuenta: ");
        k=teclado.nextDouble(); 
        cu.ingressar(k);
        System.out.println("Digite el valor que quiere retirar de su cuenta: ");
        s=teclado.nextDouble(); 
        cu.retirar(s);
        cu.datos();
    }
    
}
