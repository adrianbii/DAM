package t9_objetos;

import java.util.Scanner;

public class ControllerIMC {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("altura");
		double height=in.nextDouble();
		System.out.println("peso");
		double weight=in.nextDouble();
		IMC adrian = new IMC("adrian", 23, 67, 170);
		
		adrian.getIMC(height, weight);
		adrian.Status(67, 173);

	}
	
	

}
