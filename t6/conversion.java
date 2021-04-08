package t6;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce los Grados fahrenheit");
        int k;
		 k=input.nextInt();

		 double result= (k-32)*5/9;
		 
		 System.out.println("Resultado en grados Celsius"+result);
		 System.out.println("---------------------------------------------------------");
		 System.out.println("Introduce los Grados kelvin ");
	        int c;
			 c=input.nextInt();
			 
			 double res=(c-273.15)*9/5+32;
			 System.out.println("Resultado en grados fahrenheit"+res);
		 
		 
	}

}
