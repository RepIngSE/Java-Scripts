/*Crea una clase Fecha con atributos para el día, el mes y el año de la fecha. Incluye, al menos, los siguientes métodos:
✓Constructor predeterminado con el 1-1-1900 como fecha por defecto.
✓Constructor parametrizado con día, mes y año. 
✓leer(): pedirá al usuario el día (1a31), el mes (1a12) y el año (1900a2050).
✓bisiesto(): indicará si el año de la fecha es bisiesto o no. 
✓diasMes(int): devolverá el número de días del mes que se le indique (para el año de la fecha). 
✓valida():comprobará si la fecha es correcta (entreel1-1-1900yel31-12-2050); si el día no es correcto, lo pondrá a1; si el mes no es correcto, lo pondrá a1; y si el año no es correcto, lo pondrá a1900. Será un método auxiliar(privado). Este método se llamará en el constructor parametrizado y en leer().
✓corta(): mostrará la fecha en formato corto(02-09-2003). 
✓diasTranscurridos(): devolverá el número de días transcurridos desde el 1-1-1900 hasta la fecha. 
✓diaSemana():devolverá el día de la semana de la fecha (0paradomingo,...,6parasábado).El1-1-1900 fue domingo. 
✓larga(): mostrará la fecha en formato largo, empezando por el día de la semana (martes 2 de septiembre de 2003). 
✓fechaTras(long): hará que la fechas e a la correspondiente a haber transcurrido los días que se indiquen desde el 1-1-1900. 
✓diasEntre(Fecha): devolverá el número de días entre la fecha y la proporcionada. ✓siguiente():pasará al día siguiente. 
✓anterior():pasará al día anterior. 
✓copia(): devolverá un clon de la fecha. 
✓igualQue(Fecha): indica si la fecha es la misma que la proporcionada. ✓menorQue(Fecha): indica si la fecha es anterior a la proporcionada. 
✓mayorQue(Fecha): indica si la fecha es posterior a la proporcionada.
*/

package parcial2;
import java.util.Scanner;
import java.util.*;
public class fecha {
    private int dia, mes, año;
    private boolean bis= false;
    public fecha(){
        dia=1;
        mes=1;
        año=1900;
    }
    public void fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    public void leer(){
        Scanner teclado=new Scanner(System.in);
        System.out.print("ingresar el dia (1-31): ");
        int d=teclado.nextInt();
        System.out.print("ingresar el mes (1-12): ");
        int m=teclado.nextInt();
        System.out.print("ingresar el año (1900-2050): ");
        int a=teclado.nextInt();
        fecha(d,m,a);
        validar();
    }
    public void bisiesto(){
        if((año %4==0) && (año % 100 !=0) && (año %400 ==0)){
            System.out.println("el año "+año+" es bisiesto");
            bis=true;
        }else{
            System.out.println("el año "+año+" no es bisiesto");
        }
    }
    public void diaMes(int x){
        if(x==2){
            if(bis){
                System.out.println("el mes tiene 29 dias");
            }else{
                System.out.println("el mes tiene 28 dias");
            }
        } else if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==31){
            System.out.println("el mes tiene 31 dias");
        }else{
            System.out.println("el mes tiene 30 dias");
        }
    }
    public void validar(){
        if(dia<1 || dia>31){
            dia=1;
        }
        if(mes<1 || mes>12){
            mes=1;
        }
        if(año<1900 || año>2050){
            año=1900;
        }
    }
    public void corta(){
        System.out.println("fecha ingresada: "+dia+"-"+mes+"-"+año);
    }

    public void diasTranscurridos(){
        int cont1=1900,cont2=1,cont3=1,conta=0,contm=0,contd=0, dias;
        while(cont1<año){
            conta++;
            cont1++;
        }
        while(cont2<mes){
            contm++;
            cont2++;
        }
        while(cont3<dia){
            contd++;
            cont3++;
        }
        dias=(conta*365)+(contm*30)+contd;
        System.out.println("desde el 1-1-1900 hasta la fecha ingresada han pasado aproximadamente "+dias+" dias");
    }
    public String diaSemana(){
        int x=0;
  String[]semana={"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        for(int i=1;i<dia;i++){
            x++;
            if(x==7){
                x=0;
            }
        }
        return semana[x];
    } 
    public String nombreMes(){
        String[]mes={" ","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        return mes[this.mes];
    }
    public void larga(){
        String x= diaSemana();
        String y=nombreMes();
        System.out.println("fecha ingresada: "+x+" "+dia+" de "+y+" del "+año);
    }
    public void fechatras(){
        int cont=0;
        Scanner tec=new Scanner(System.in);
        System.out.print("ingresar dias dias transcurridos: ");
        int c= tec.nextInt();
        for(int i=1900;i<=2050;i++){
            for(int e=1;e<=12;e++){
                for(int r=1;r<=31;r++){
                    cont++;
                    if(cont==c){
                        System.out.println("la fecha quedo en: "+r+"-"+e+"-"+i);
                        r=32;e=13;i=2051;
                    }
                }
            }
        }
    }
    public void diaEntre(){
        int año1, mes1,dia1,diaTotal;
        Calendar fecha = new GregorianCalendar();                                       
        int año2 = fecha.get(Calendar.YEAR);
        int mes2 = fecha.get(Calendar.MONTH);
        int dia2 = fecha.get(Calendar.DAY_OF_MONTH);
        if(año>año2){
            año1=año-año2;
        }else{
            año1=año2-año;
        }
        if(mes>mes2){
            mes1=mes-mes2;
        }else{
            mes1=mes2-mes;
        }
        if(dia>dia2){
            dia1=dia-dia2;
        }else{
            dia1=dia2-dia;
        }
        diaTotal=(año1*365)+(mes1*30)+dia1;
        System.out.println("los dias que han pasado o pasaran desde la fecha actual hasta la ingresada es: "+diaTotal+" dias");
    }
    public void siguiente(){
        int dia=1,mes=this.mes,año=this.año;
        if(this.dia==31 && this.mes==12){
            año=this.año+1;
            dia=1;
            mes=1;
        }else if(this.dia==31){
            mes=this.mes+1;
            dia=1;
        }else{
            dia=this.dia+1;
        }
        System.out.println("el siguiente dia de la fecha ingresada es "+dia+"-"+mes+"-"+año);
    }

        public void anterior(){
        int dia=1,mes=this.mes,año=this.año;
        if(this.dia==1 && this.mes==1){
            año=this.año-1;
            dia=31;
            mes=12;
        }else if(this.dia==1){
            mes=this.mes-1;
            dia=31;
        }else{
            dia=this.dia-1;
        }
        System.out.println("el dia anterior de la fecha ingresada es "+dia+"-"+mes+"-"+año);
    }
    public void copia(){
        System.out.println("clon de la fecha ingresa: "+dia+"-"+mes+"-"+año);
    }
    public void igualque(){
        Calendar fecha = new GregorianCalendar();                                       
        int año2 = fecha.get(Calendar.YEAR);
        int mes2 = fecha.get(Calendar.MONTH);
        int dia2 = fecha.get(Calendar.DAY_OF_MONTH);
        if (año==año2 && mes==mes2 && dia==dia2){
            System.out.println("la fecha ingresada coincide con la fecha actual");
        }else{
            System.out.println("la fecha ingresada no coincide con la fecha atual");
        }
    }
    public void menorque(){
        Calendar fecha = new GregorianCalendar();                                       
        int año2 = fecha.get(Calendar.YEAR);
        int mes2 = fecha.get(Calendar.MONTH);
        int dia2 = fecha.get(Calendar.DAY_OF_MONTH);
        if(año<=año2 && mes<=mes2 && dia<=dia2){
            System.out.println("la fecha ingresada es menor a la fecha actual");
        }else{
            System.out.println("la fecha ingresada no es menor a la fecha actual");
        }
    }
    public void mayorque(){
        Calendar fecha = new GregorianCalendar();                                       
        int año2 = fecha.get(Calendar.YEAR);
        int mes2 = fecha.get(Calendar.MONTH);
        int dia2 = fecha.get(Calendar.DAY_OF_MONTH);
        if(año>=año2 && mes>=mes2 && dia>=dia2){
            System.out.println("la fecha ingresada es mayor a la fecha actual");
        }else{
            System.out.println("la fecha ingresada no es mayor a la fecha actual");
        }
    }
    public static void main(String[] args) {
        fecha fx=new fecha();
        fx.leer();
        fx.bisiesto();
        System.out.print("ingresar mes en el que se quieren saber los dias");
        Scanner tecl=new Scanner(System.in);
        int x= tecl.nextInt();
        fx.diaMes(x);
        fx.corta();        
        fx.diasTranscurridos();
        fx.diaSemana();
        fx.larga();
        fx.fechatras();
        fx.diaEntre();
        fx.siguiente();
        fx.anterior();
        fx.copia();
        fx.igualque();
        fx.menorque();
        fx.mayorque();
    }
