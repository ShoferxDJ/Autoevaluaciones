package Modelo;
import java.util.Scanner;
public class TrianguloEscaleno {
	Scanner p = new Scanner(System.in);
	  private int base;
	    private int altura;
	    private int area;
	    private int area2;
	    private int area3;
	    private int perimetro;
	    
		public Scanner getP() {
			return p;
		}
		public void setP(Scanner p) {
			this.p = p;
		}
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public int getArea() {
			return area;
		}
		public void setArea(int area) {
			this.area = area;
		}
		public int getArea2() {
			return area2;
		}
		public void setArea2(int area2) {
			this.area2 = area2;
		}
		public int getArea3() {
			return area3;
		}
		public void setArea3(int area3) {
			this.area3 = area3;
		}
		public int getPerimetro() {
			return perimetro;
		}
		public void setPerimetro(int perimetro) {
			this.perimetro = perimetro;
		}

		public void MostrarDatosTriaescale (){
	    	System.out.println("trinagulo escaleno");
	    	System.out.println("area");
	    	System.out.println("ingrese el numero del primer lado");
	    	area = p.nextInt();
	    	System.out.println("ingrese el numero del segundo lado");
	    	area2 = p.nextInt();
	    	double resultadoEs = (area*area2)%2;
	    	System.out.println("el area del triangulo escaleno es: "+ resultadoEs);
	    	System.out.println("perimetro");
	    	System.out.println("ingrese el primer lado");
	    	perimetro = p.nextInt();
	    	double resultadoPe = (perimetro+perimetro+perimetro);
	    	System.out.println("el perimetro del triangulo escaleno es: "+ resultadoPe );

	    }
}