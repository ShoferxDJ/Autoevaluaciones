package Persona;

import java.util.Scanner;

public class Promedio{
	double exa1,exa2,exa3,calf;
	public static void main(String[] args) {
	
			System.out.println("Ingrese la calificacion del primer examen ");
	        Scanner exa1=new Scanner(System.in);
	        double examen1=exa1.nextDouble();
	        
	        System.out.println("Ingrese la calificacion del segundo examen ");
	        Scanner exa2=new Scanner(System.in);
	        double examen2=exa2.nextDouble();
	        
	        System.out.println("Ingrese la calificacion del tercero examen ");
	        Scanner exa3=new Scanner(System.in);
	        double examen3=exa3.nextDouble();
	        
	        double promedio =(examen1+examen2+examen3)/3;
	        double promediofin = promedio*10;
	       
	        System.out.println("El promedio es "+promediofin);
	        


	        double dias = 180;
	       
	        
	        		if (promediofin>=95) {
	        	        System.out.println("Cuantos dias asististe ala escuela ");
	        	        Scanner asis=new Scanner(System.in);
	        	        double asistencia=asis.nextDouble();
	        	        if(asistencia>=127) {
	        	        	  System.out.println("excentasete");
	        	        	  System.out.println("tu califiacion final "+ promedio);
	        	        }else {
	        	        	System.out.println("Te vas a extraordinario");
	        	        	System.out.println("Cuanto sacaste en el extraordinario ");
		        	        Scanner extra=new Scanner(System.in);
		        	        double extraordinario=extra.nextDouble();
		        	        System.out.println("tu califiacion final "+ extraordinario);
	        	        			        	        }
	        		}else {	
	        			if(promediofin<95) {
		        	        System.out.println("Cuantos dias asististe ala escuela ");
		        	        Scanner asis=new Scanner(System.in);
		        	        double asistencia=asis.nextDouble();
		        	        if(asistencia>=127)
	        			System.out.println("Ingrese la calificacion del examen general");
		        
	        			Scanner calfe=new Scanner(System.in);
	        			double calg=calfe.nextDouble();
	    	   
	        			double calfge = (calg/3)*10;
		       
	        			double calf =(promediofin + calfge);
	        			System.out.println("Tu calificacion final del ordinario es "+ calf);
	        			
	    	  
	        			}else {
	        				System.out.println("Te vas a extraordinario");
	        	        	System.out.println("Cuanto sacaste en el extraordinario ");
		        	        Scanner extra=new Scanner(System.in);
		        	        double extraordinario=extra.nextDouble();
		        	        System.out.println("tu califiacion final "+ extraordinario);
	        			
	        			}
	        		}
	       }
	}
	

