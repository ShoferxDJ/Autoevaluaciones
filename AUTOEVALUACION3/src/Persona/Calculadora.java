package Persona;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora{
	public static void main (String [] args) { 
        Scanner n = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        int n1 = 0  , n2 = 0;
 
        while (!salir) {
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir\n");
            
            try {
            	 
                System.out.println("");
                opcion = n.nextInt();
 
                switch (opcion) {
                    case 1:
                       System.out.println("\nIngrese un numero: ");
                       n1 = n.nextInt();
                       System.out.println("\nIngrese un numero: ");
                       n2 = n.nextInt();
                       System.out.println("\nEl resultado es: "+ (n1+n2)+ "\n");
                        break;
                    case 2:
                        System.out.println("\nIngrese un numero: ");
                        n1 = n.nextInt();
                        System.out.println("\nIngrese un numero: ");
                        n2 = n.nextInt();
                        System.out.println("\nEl resultado es: "+ (n1-n2)+ "\n");
                         
                        break;
                    case 3:
                        System.out.println("\nIngrese un numero: ");
                        n1 = n.nextInt();
                        System.out.println("\nIngrese un numero: ");
                        n2 = n.nextInt();
                        System.out.println("\nEl resultado es: "+ (n1*n2)+ "\n");
                       
                        break;                    
                   case 4:
                       System.out.println("\nIngrese un numero: ");
                       n1 = n.nextInt();
                       System.out.println("\nIngrese un numero: ");
                       n2 = n.nextInt();
                       System.out.println("\nEl resultado es: "+ (n1/n2) + "\n");
                        break;
                   case 5:
                       salir = true;
                       break;
                   default:
                       System.out.println("\\nSolo números entre 1 y 4"+ "\n");
               }
           } catch (InputMismatchException e) {
               System.out.println("Debes insertar un número"+ "\n");
               n.next();
        }
        }
        }
	
}

            
        
