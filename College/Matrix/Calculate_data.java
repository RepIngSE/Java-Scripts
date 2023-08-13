
package javaApplication;

import java.util.Scanner;

public class Matriz4 {
private Scanner teclado; 
private String[] paises; 
private int [][] temperaturamed; 
private int [] temperaturatri; 

public void cargarmatriz(){
    teclado=new Scanner(System.in); 
    paises = new String[4]; 
    temperaturamed = new int [4][3]; 
    for(int f=0; f<paises.length; f++)
  {
    System.out.print("Digite el nombre del pais: "); 
    paises[f]=teclado.next(); 
     for(int c=0; c<temperaturamed[f].length; c++)
    {
        System.out.print("Ingrese la temperatura media mensual: "); 
        temperaturamed[f][c]=teclado.nextInt(); 
    }
  }  
}
public void mostrartemperaturasmed()
{
    int f; 
    for(f=0; f<paises.length; f++)
 {
    System.out.print(paises[f]+ " :"); 
    for(int c=0; c<temperaturamed[f].length; c++)
    {
          System.out.print(temperaturamed[f][c]+ " "); 
    }
    System.out.println();
 }
}

public void caltemperaturastri()
{
    temperaturatri = new int[4]; 
     for(int f=0; f<temperaturamed.length; f++)
   {
     int sum=0; 
     for(int c=0; c<temperaturamed[f].length; c++)
     {
         sum = sum+temperaturamed[f][c]; 
     }
     temperaturatri[f] = sum/3; 
   }
 }
public void mostrartemperaturatri()
{
    System.out.println("Temperaturas trimestrales: "); 
     for(int f=0; f<paises.length; f++)
    {
       System.out.println(paises[f]+" " + temperaturatri[f]);
    }
 }
public void paismayortemp()
{
    int mayor = temperaturatri[0]; 
    String nombre = paises[0]; 
    for(int f=0; f<paises.length; f++)
    {
        if (temperaturatri[f]>mayor)
        {
            mayor = temperaturatri[f]; 
            nombre = paises[f]; 
        }
    }
    System.out.println("El pais " +nombre+ " tiene la mayor temperatura la cual es: "+ mayor); 
}
 public static void main(String[] args) 
    {
      Matriz4 pm =new Matriz4(); 
      pm.cargarmatriz();
      pm.mostrartemperaturasmed(); 
      pm.caltemperaturastri();
      pm.mostrartemperaturatri(); 
      pm.paismayortemp(); 
    }
}
