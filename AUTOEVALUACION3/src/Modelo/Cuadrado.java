package Modelo;
import java.util.Scanner;
public class Cuadrado{
	    Scanner p = new Scanner(System.in);
	    private int cuadradoresultado;
	    private int lado1, lado2;

		public int getCuadradoresultado() {
			return cuadradoresultado;
		}
		public void setCuadradoresultado(int cuadradoresultado) {
			this.cuadradoresultado = cuadradoresultado;
		}
	    
		public void MostraDtoscuadrado () {
			System.out.println("\nCuadrado");
			 System.out.println("\nArea");
		    System.out.println("\nIngrese el primer numero del lado: ");
		    lado1= p.nextInt();
		    System.out.println("\nIngrese el segundo numero del lado: ");
		    lado2= p.nextInt();
		   cuadradoresultado = (lado1*lado2);
		    System.out.println("\nEl Area del cuadrado es: "+ cuadradoresultado +"\n");
		    System.out.println("\nPerimetro ");
		    System.out.println("\nIngrese el primer del circulo: ");
		    lado1 = p.nextInt();
		    System.out.println("\nIngrese el segundo numero del lado: ");
		    lado2= p.nextInt();
		    double cuadradoresultados=  (lado1+lado1+lado2+lado2);
		    System.out.println("\nEl Perimetro del circulo es: "+ cuadradoresultados +"\n");
		}
}
