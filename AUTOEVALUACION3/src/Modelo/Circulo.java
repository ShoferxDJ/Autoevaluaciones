package Modelo;
import java.util.Scanner;
public class Circulo {
    Scanner p = new Scanner(System.in);
	private double pi = 3.1416;
	   int n1 = 0  , n2 = 0;

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
public void MostraDtos () {
	System.out.println("\nCirculo");
	 System.out.println("\nArea");
    System.out.println("\nIngrese el radio del circulo: ");
    n1 = p.nextInt();
    double resultado = pi *(n1*n1); 
    System.out.println("\nEl Area del circulo es: "+ resultado +"\n");
    System.out.println("\nPerimetro ");
    System.out.println("\nIngrese el radio del circulo: ");
    n1 = p.nextInt();
    double resul = (n1 * pi *  n1);
    System.out.println("\nEl Perimetro del circulo es: "+ resul +"\n");
}

}
