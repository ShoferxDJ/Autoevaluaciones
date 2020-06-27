package Persona;
import java.util.InputMismatchException;
import java.util.Scanner;
import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Rectangulo;
import Modelo.TrianguloEquilatero;
import Modelo.TrianguloEscaleno;
import Modelo.TrianguloIsoseles;
public class AREA_PERIMETRO{
	public static void main (String [] args) { 
        Scanner p = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        int n1 = 0  , n2 = 0;
 
        while (!salir) {
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectangulo");
            System.out.println("4. Triangulo Equilatero");
            System.out.println("5. Triangulo Escaleno");
            System.out.println("6. Triangulo Isoseles");
            System.out.println("7. Salir\n");
            
            try {
            	 
                System.out.println("");
                opcion = p.nextInt();
 
                switch (opcion) {
                    case 1:
                    	Circulo c1 = new Circulo ();
                    	c1.MostraDtos();
                        break;
                    case 2:
                    	Cuadrado cu1 = new Cuadrado ();	
                    	cu1.MostraDtoscuadrado();
                         
                        break;
                    case 3:
                       Rectangulo R1 = new Rectangulo();
                       R1.MostraDtosRect();
                       
                        break;                    
                   case 4:
                      TrianguloEquilatero tri1= new TrianguloEquilatero();
                      tri1.MostrarDatosTEQ();
                   case 5:
                	   TrianguloEscaleno tri2 = new TrianguloEscaleno ();
                	   tri2.MostrarDatosTriaescale();
                   case 6:
                	   TrianguloIsoseles tri3 = new TrianguloIsoseles ();
                	   tri3.MostrarDatosTriaiso();
                   case 7:
                       salir = true;
                       break;
                   default:
                       System.out.println("\\nSolo números entre 1 y 4"+ "\n");
               }
           } catch (InputMismatchException e) {
               System.out.println("Debes insertar un número"+ "\n");
               p.next();
        }
        }
        }
	
}