package t4;

import java.util.Scanner;

public class Bwhile {

	public static void main(String[] args) {
		
		 int inc = 0 ;
		 double tasa=10000;

	        do {   System.out.println ("Aumentando matr�cula... " );

	                   inc += 1;
	                   tasa=tasa*1.07;

	        } while (tasa<=20000);    	System.out.println("Se iguala en "+inc+"a�os"+tasa);
		
		

	}
	
	public static void ej2(String[] args) {
		
		 int inc = 0 ;
		 double tasa=10000;

	      

	                  

	        while (tasa<=20000);   
	        inc += 1;
            tasa=tasa*1.07;
            System.out.println("Se iguala en "+inc+"a�os"+tasa);
		
		

	}
	
	public static void ej3(String[] args) {
		
		 int inc = 0 ;
		 double tasa=10000;

	      

	                  

	       for (;tasa<20000;inc++,tasa*=1.07);   
	        inc += 1;
           tasa=tasa*1.07;
           System.out.println("Se iguala en "+inc+"a�os"+tasa);
		
		

	}

}
