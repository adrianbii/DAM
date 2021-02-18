package T3;

import java.util.Scanner;

public class año_bisiesto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero");
		
		int año;
		año=input.nextInt();
		boolean bisiesto= (año%4==0 && año%100!=0) || (año%400==0);
		System.out.println(bisiesto);
		// Lo mismo pero usando if
		if(año%4==0 && año%100!=0 || año%400==0) {
			System.out.println("Es un año bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}

	}

}
