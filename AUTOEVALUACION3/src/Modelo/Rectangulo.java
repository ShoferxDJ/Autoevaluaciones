package Modelo;
import java.util.Scanner;
public class Rectangulo {
	Scanner p = new Scanner(System.in);
	private int l1, l2;

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}
	public void MostraDtosRect () {
		System.out.println("\nRectangulo");
		 System.out.println("\nArea");
	    System.out.println("\nIngrese el numero del un lado: ");
	    l1 = p.nextInt();
	    System.out.println("\nIngrese el numero del otro lado: ");
	    l2 = p.nextInt();
	    double resultadorec = (l1*l2);
	    System.out.println("\nEl Area del circulo es: "+ resultadorec +"\n");
	    System.out.println("\nPerimetro ");
	    System.out.println("\nIngrese el radio del circulo: ");
	    l1 = p.nextInt();
	    System.out.println("\nIngrese el numero del otro lado: ");
	    l2 = p.nextInt();
	    double resulrec = (l1*2)+ (l2*2);
	    System.out.println("\nEl Perimetro del circulo es: "+ resulrec +"\n");
	}
}
