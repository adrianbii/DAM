package T3;

import java.util.Scanner;

public class a�o_bisiesto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero");
		
		int a�o;
		a�o=input.nextInt();
		boolean bisiesto= (a�o%4==0 && a�o%100!=0) || (a�o%400==0);
		System.out.println(bisiesto);
		// Lo mismo pero usando if
		if(a�o%4==0 && a�o%100!=0 || a�o%400==0) {
			System.out.println("Es un a�o bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}

	}

}
