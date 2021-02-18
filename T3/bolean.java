package T3;

import java.util.Scanner;

public class bolean {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero");
		
		double n;
		n=input.nextDouble();
		System.out.println("Es divisible por 2 y 3 "+((n%2==0) && (n%3==0)));
		System.out.println("Es divisible por 2 o 3 "+((n%2==0)||(n%3==0)));
		System.out.println("Es divisible por 2 o 3 pero no ambos "+((n%2==0)^(n%3==0)));
	}

}
