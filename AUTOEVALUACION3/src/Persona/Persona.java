package Persona;

import java.util.Scanner;


/**
 *
 * 
 */
public class Persona {

    public static void main(String[] args) {
        System.out.println("Ingrese su Nombre: ");
        Scanner nombre=new Scanner(System.in);
        String nom=nombre.nextLine();
        
        System.out.println("Ingrese su Apellido: ");
        Scanner apellido=new Scanner(System.in);
        String ape=apellido.nextLine();
       
       System.out.println("Ingrese direccion: ");
       Scanner direc=new Scanner(System.in);
       String Direc=direc.nextLine();
       
       System.out.println("Ingrese su telefono: ");
       Scanner cel=new Scanner(System.in);
       int tel;
       tel=cel.nextInt();
       
       System.out.println("Ingre su Email: ");
       Scanner ema=new Scanner(System.in);
       String Email=ema.nextLine();
       
       System.out.println("Ingresar el año en que nacio: ");
       Scanner anio=new Scanner(System.in);
       int anio1=anio.nextInt();
       int actual= 2020;
        int res = (anio1-actual);
       
       System.out.println("Ingrese su peso: ");
       Scanner pess=new Scanner(System.in);
       Double peso=pess.nextDouble();
       double respeso=peso*1000;
       
       System.out.println("Ingrese su altura: ");
       Scanner altu=new Scanner(System.in);
       double maxi=altu.nextDouble();
       double resaltu=maxi*100;
      
       
       
       System.out.println("Su nombre es: "+nom);
       System.out.println("Su apellido es: "+ape);
       System.out.println("Su direccion es: "+Direc);
       System.out.println("Su Telefono es: "+tel);
       System.out.println("Su Email es: "+Email);
       System.out.println("Su edad es: "+res + "años");
       System.out.println("Su peso es: "+peso+" KG");
       System.out.println("Su altura es: "+maxi+" Mts.");
       System.out.println("Su edad es: "+res);
       System.out.println("Su estatura en centimetros es: "+resaltu+".cm");
       System.out.println("Su peso en gramos es: "+respeso+".g");
    }      
}
