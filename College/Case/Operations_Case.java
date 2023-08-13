
import javax.swing.JOptionPane;
 
public class metodovacio {
   //atributos
 int numero1,numero2,suma,multiplicacion,resta,division,potencia,result,sw=1; 
 String operaciones;
 
 
       public void obtenernum(){
        while(sw==1){
         operaciones = JOptionPane.showInputDialog("Digite operacion/t para terminar");

          switch (operaciones){
            case "t": sw=-1;
            break;
            
            case "sumar": ;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite Número1"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite Número2"));
            suma();
            break;  
            
            case "restar": ;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite Número1"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite Número2"));
            resta();
            break;
            
            case "multiplicar": ;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite Número1"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite Número2"));
            multiplicacion();
            break;
            
            case "dividir": ;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite Número1"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite Número2"));
            division();
            break;
            
            case "potenciar": ;
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite Número1"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite Número2"));
            potencia();
            break;
            
            default:System.out.println("Operacion invalida");
       }           
      } 
     }
    
      public void suma(){ 
          result=(numero1+numero2 );
          mostrar();
        }
      public void resta(){
            result=(numero1-numero2 );
            mostrar();
        }
      public void multiplicacion(){
            result=(numero1*numero2 );
            mostrar();
        }
      public void division(){
            result=(numero1/numero2 );
            mostrar();
        }
       public void potencia(){
            result=(numero1^numero2 );
            result=(int) Math.pow(numero1,numero2);
            mostrar();
        }
      public void mostrar(){
          JOptionPane.showMessageDialog(null,"El resultado es: "+result);
      }
    public static void main(String[] args) {
      metodovacio op=new metodovacio();
       op.obtenernum();  
      
    }
}
